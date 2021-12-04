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
