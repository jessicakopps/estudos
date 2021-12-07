***GATAWAY***

**No site da AWS**

- Elastic Beanstalk
- Create environment
  - Web server environment
  - Select
  - Application name
  - Platform
    - Java
  - Application code
    - Upload your code
- Create environment
- Clique no link embaixo do nome do ambiente
  - Acrescente o caminho especificado em controller
  - EX: http://sq6t2gataway-env.eba-uzskeud8.us-east-1.elasticbeanstalk.com/gateway

- API Gateway
- Criar API
 - API Rest
 - Importar
 - Nome da API*
 - Criar api
 - Ações
 - Criar recursos
   - Nome do recurso* - ex: nome-service
   - Criar recurso
 - Ações
 - Criar método
   - GET (v)
     - Tipo de integração: HTTP
     - URL do endpoint - Usar o link do ambiente + caminho controller
     - Salvar
  - POST
    - Mesma conf. do GET
  - Ações
    - Implantar API
    -  Estágio de implantação: [Novo estágio]
    - Nome do estágio - Ex: Prod-nome
    - Implantar

- No Postman
  - Cole o link do API gateway/CaminhoMétodo