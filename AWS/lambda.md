***LAMBDA***

**No site da AWS**
- Lambda
- Functions
- Create a function
- Author from scratch
- Basic information
  - Preencher o function name
  - Runtime: Java 11
  - Architecture: x86_64
- Create function

- Na função:
  - Configurações de tempo de execução
  - Manipulador: colar o caminho (package) da sua aplicação + nome da classe(Config). Ex: com.javatechie.aws.lambda.NomeClasse

- Configuração
  - Variáveis de ambiente
  - Editar  - Adicionar variáveis de ambiente
  - Chave: FUNCTION_NAME | Valor: NomeClasseQueSeráRetornado
  - Exemplo: Lambdas.
  ```
  public class AwsLambdaConfig {

    @Autowired
    private AwsLambdaRepository awslambdarepository;

    @Bean
    public Supplier<List<AwsLambda>> Lambdas() {
        return () -> awslambdarepository.buildLambdas();
    }
  ```
  
- Código
  - Fazer upload de ... arq. .zip ou .jar
  - FAzer upload do arquivo SNAPSHOT.jar, dentro da parta target

- Testar
  - Evento salvo
  - No terminal, coloque "" para testar toda a função.
  - Salvar alterações
  - Testar
  - Em detalhes (logs) estará a função

---
***LAMBDA POR LINHA DE COMANDO***

- Primeiramente deve-se instalar o AWS-cli: https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html
- Depois devemos configurar o AWS_ACCESS_KEY_ID e o AWS_SECRET_ACCESS_KEY (para isso devemos gerar essas credenciais no próprio IAM)

1. Gere o arquivo .jat da aplicação.

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