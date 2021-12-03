***LAMBDA E API GATEWAY***

- Primeiramente vc deve instalar o AWS-cli Link: https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html
- Depois devemos configurar o AWS_ACCESS_KEY_ID e o AWS_SECRET_ACCESS_KEY (para isso devemos gerar essas credenciais no próprio IAM, irei mostrar, mas esse Link mostra mais detalhadamente esse processo.)
- Vou mostrar uma forma de se fazer, via código. Mas pode ser feito pelo próprio console da AWS uma função Lambda, mas é muito mais comum (e mais bem visto) se criar via linha de comando.

1. Pegue sua API, empacote ela (Vc deve empacotar (buildar, gerar o arquivo .jar atualizado) ela a cada alteração no código que vc fizer). Comando:
```mvn clean package```
ou
```mvn clean install -DskipTests```

2. Depois crie sua função Lambda na própria AWS com o comando: (É um comando só, deve ser copiado e colado o trecho de código todo. No terminal do seu computador)
```
aws lambda create-function --function-name <NOME_DA_FUNÇÃO> \
    --zip-file fileb://target/<NOME_DO_ARQUIVO_JAR> \
    --handler <CAMINHO PARA A SUA CLASSE/FUNÇÃO COM A NOTAÇÃO DE LAMBDA NO JAVA CHAMANDO A FUNÇÃO> \
    --runtime java11 \
    --role <LINK ARN PARA ESSA ROLE>
```
  - EXEMPLO (Criei uma role pra isso: ```arn:aws:iam::965934840569:role/lambdaRole```)
  ```
  aws lambda create-function --function-name Funcao1 \
    --zip-file fileb://target/simple-spring-app-0.0.1-SNAPSHOT.jar \
    --handler br/mso/simplespringapp/service/lambda/Funcao1::handleRequest \
    --runtime java11 \
    --role arn:aws:iam::965934840569:role/lambdaRole
  ```

- Caso vcs tiverem modificado seu código e querem atualizar a função lá na AWS, rode esse comando:
```
aws lambda update-function-code --function-name <NOME_DA_FUNÇÃO> --zip-file fileb://target/<NOME_DO_ARQUIVO_JAR>
```
  - EXEMPLO: ```aws lambda update-function-code --function-name Funcao1 --zip-file fileb://target/simple-spring-app-0.0.1-SNAPSHOT.jar```

3. Para executar sua função:
```
aws lambda invoke --function-name <NOME_DA_FUNÇÃO> --invocation-type RequestResponse <CAMINHO E NOME DA PASTA TEMPORÁRIA>
```
  - EXEMPLO: ```aws lambda invoke --function-name Funcao1 --invocation-type RequestResponse /tmp/resposta.txt```