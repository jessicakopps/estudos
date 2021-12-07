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