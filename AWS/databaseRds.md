***DATABASE AWS***

**No site da AWS:**
- Vá em RDS
- Create database
- MySQL
<br>

- Template Free tier
<br>

- Setting
- Name e password da DB
<br>

- Connectivity
- Public access: yes
<br>

- Adicional configuration
- Backup: yes para o projeto
<br>

- Elastic Beanstalk (pesquisar)
- Clica no nome Elastic Beanstalk
- Create application
<br>

- Plataform: Java
<br>

- Application Code: Upload your code
<br>

- Source code origin: Escolher o arq. jar ATUALIZADO
  - # Faça build novamente sempre que alterar algo
<br>

- Configure more actions
- Propriedades de ambiente

| Nome |  Valor                    
| :---   | :---                         
| GRADLE_HOME   | /usr/local/gradle  
| M2            | /usr/local/apache-maven/bin    
| M2_HOME       | /usr/local/apache-maven/    
| JAVA_HOME     | /usr/lib/jvm/java ou /usr/lib/jvm/jre
| PORT          | 5000


- Banco de dados
- User e password do DB
- Criar snapshoot