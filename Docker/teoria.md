## Docker 

- Ferramenta para criar e manter containers, ou seja, ele é responsável por armazenar vários serviços de forma isolada do DO host, como: web server, banco de dados, aplicação, memcached etc. 
- O seu back-end é baseado em LXC (LinuX Containers) <br>
Ex: Em um projeto há várias dependências, e as vezes ter esse projeto rodando em várias máquinas diferentes pode ter um problema grande de infraestrutura e processamento, o que pode ser resolvido com o Docker.

- LXC funciona isolando processos do sistema operacional host. É uma espécie de virtualização basante leve, pois não faz uso de emulação ou suporte a hardware, apenas proporciona a execução de vários sistemas Linux de forma isolada - daí vem a palavra container. 

- Em 2008 nascia uma empresa cujo objetivo era desenvolver soluções de PaaS (Platform as a Service). Essa empresa na época chamada dotCloud, posteriormente passaria a chamar-se Docker, Inc e seria responsável por popularizar os chamados containers.

---
***CONTAINERS***

- No mundo real containers são aquelas caixas enormes que carregam  cargas de todos os tipos.
- A ideia dos containers no mundo de tecnologia parte da mesma ideia e utilidade dos containers de carga no mundo real: Padronizar, isolar e transportar.
<br>

**Containers vs Máquina Virtual**
- Containers são utilizados para encapsular e isolar aplicações bem como todas as dependências que sejam necessárias para essa aplicação funcionar.
- E talvez você pense "Ué mas não é o que uma Máquina Virtual faz?"
- VM's e containers possuem similaridades, mas não são a mesma coisa.
- Uma VM é o que chamamos de full blown guest, ou seja, ela consome todos os recursos disponíveis para ela consumir.
- Os containers por outro lado consomem apenas a quantidade necessária de recursos, sendo dessa forma muito mais leves em comparação com as VM's.
- Os containers não substituiem as máquinas virtuais e uma tecnologia não anula a outra. Em realizade ambas as tecnologias tem sido usadas em conjunto para aproveitar o melhor dos dois mundos. 
<br>

**Por que usar containers?** <br>
Portabilidade, padronização e leveza. Essas são as três vantagens de utilizar os containers.
- *Portabilidade* pois os ambientes criados podem ser executados em qualquer outra máquina uma vez compartilhados através dos chamados Registries, que nada mais são do que "bancos" qu armazenam e distribuem imagens. O registry padrão é o Docker Hub.
- A *padranização* se refere a possibilidade de ser uma ambiente única e estável para a aplicação livre de erros causados por configurações específicas de um host.
- Por fim a *leveza* tem a ver com o já citado consumo de recursos de container, que compartilha recursos com o host  e assim é apenas um processo sendo  executado ao invés de uma máquina virtual rodando a todo vapor.

---
***IMAGENS***
- Outro conceito importante ao tratar de containers são as imagens.
- Sendo o container um processo isolado, a imagem é o que dá a esse processo seu sistema de arquivos.
- POr exemplo, comparando com uma máquina virtual, nós temos a iso do SO que desejamos e usamos ela no VirtualBox ou VMware para subir nosso SO.
- No caso dp Docker utilizamos as imagens.

---
***PREPARANDO O AMBIENTE***

**Download e instalação**
https://www.docker.com/products/docker-desktop

- Caso de erro na instalação, seguir os passos do site abaixo:
https://docs.microsoft.com/en-us/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package

- A virtualização tem que estar habilitada. Verificar em: <br>
Gerenciador de tarefas -> Desempenho -> CPU: Virtualização

**Arquivos necessários**
- Dockerfile
```
FROM openjdk:11

ARG PROFILE=${PROFILE}
ARG ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/api_spring

COPY /target/api-spring*.jar api_spring_docker.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8000

CMD java ${ADDITIONAL_OPTS} -jar api_spring_docker.jar --spring.profiles.active=${PROFILE}
```

- docker-compose.yaml
```
version: '3'
services:
  api_spring_docker:
    build:
      context: ./
      dockerfile: ./Dockerfile
    image: api_spring_docker/api
    ports:
      - '8080:8080'
      - '5005:5005'
    environment:
      - ADDITIONAL_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 -Xmx1G -Xms128m -XX:MaxMetaspaceSize=128m
      - PROFILE=dev
    links:
      - db
  db:
    image: mysql:5.6
    ports:
      - '3307:3307'
    environment:
      - MYSQL_ROOT_HOST=%
      - MYSQL_DATABASE=spring_boot_mysql
#      - MYSQL_USER=root
      - MYSQL_ROOT_PASSWORD=123456789
#      - MYSQL_ALLOW_EMPTY_PASSWORD=yes
    volumes:
      - ./docker/volume_mysql:/var/lib/mysql
```

