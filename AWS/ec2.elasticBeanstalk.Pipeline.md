# AWS

***PASSOS EC2 E ELASTIC BEANSTALK***

1. Login no console da AWS;
2. Configurar MySQL na AWS Cloud usando AWS RDS;
3. Conectar MySQL database com MySQL Workbench para verificar a conexão;
4. Faça um projeto ou clone um que já está feito;
5. Atualize seu application.properties mudando a URL de conexão do Banco;
6. Faça o build desse projeto com o comando ```mvn clean install``` e ache o arquivo .jar que está na pasta target;
7. Deploy a aplicação passando esse arquivo .jar na AWS, criando uma instância EC2 e usando o serviço Elastic Beanstalk;
8. Teste tudo pegando a URL pública e consuma no POSTMAN.

---
***GITHUB PARA A AWS*** <br>

Precisaremos disso para ter um pipeline em AWS Build.

1. Configurar senha HTTPS no IAM (Pode escolher SSH também);
2. Depois abra um terminal shell na AWS;
3. Após isso rode os comandos:
```
migration_dir="./_trash"
git_url="URL_REPOSITORIO_GITHUB"
aws_region="REGIÃO"
codecommit_repo_name="NOME_DO_REPOSITÓRIO_NA_AWS"
```

4. Depois rode esses comandos:
```
aws codecommit create-repository \
--repository-name ${codecommit_repo_name} \
--repository-description "Meu repositorio"
```

5. Depois:
```
git clone --mirror ${git_url} ${migration_dir}
```

6. Depois entre na pasta da migração, com o comando:
```
cd ${migration_dir}/
```

7. E finalmente:
```
git push https://git-codecommit.${aws_region}.amazonaws.com/v1/repos/${codecommit_repo_name} --all
```

---
***PAPELINE NO AWS BUILD***

1. Ir no IAM -> Usuários -> Credenciais HTTPS -> Gerar Credenciais HTTPS;
2. Depois fazer migrar o repositório Git para o CodeCommit da AWS (feito nos passos acima);
3. Depois para simplificação, clone o repositório da AWS no seu computador e mexa no código a partir daí;
4. Depois criar o arquivo ```buildspec.yml``` na raiz do projeto e enviar esse arquivo pro repositório da AWS (```git push``` normal);
5. Depois ir no CodePipeline da AWS e criar um Pipeline;
6. Conferir se deu tudo certo na esteira de produção (o Pipeline).

---
***BUILDSPECT.YML EXEMPLO***

- buildspec.yml
```
version: 0.2
phases:
  install:
    runtime-versions:
      java: corretto11
  build:
    commands:
      - echo "Build started"
      - mvn clean install -DskipTests
  post_build:
    commands:
      - echo "Pipeline success"
```

- CloudShell
```
rm -r ./_trash
```

---
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



