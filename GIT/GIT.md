## GIT
https://git-scm.com/book/en/v2/
Sistema de controle de versão distribuido. Projetado com desempenho, segurança e flexibilidade.

- Principais ferramentas: Github, Bitbucket, Gitlab

---
***AJUDA***
```
git help
git help add
git help commit
git help <qualquer_comando_git>
```

---
***CONFIGURAR USUÁRIO***
```
git config --global user.name "Seu Nome"
git config --global user.email seu.email@example.com
```

---
***GERAL***

- Listar configurações
```
git config --list
```
- Verificar estado dos arquivos/diretórios
```
git status
```
- Visualizar histórico
```
git log
git log -p -2 (com diff das duas últimas alterações)
git log --stat (resumo do histórico (hash completa, autor, data, comentário e qtde de alterações (+/-)))
git log --pretty=oneline (informações resumidas em uma linha (hash completa e comentário))
git log --pretty=format:"%h - %an, %ar : %s" (formatação específica (hash abreviada, autor, data e comentário))
  - %h: Abreviação do hash;
  - %an: Nome do autor;
  - %ar: Data;
  - %s: Comentário.
git log -- <caminho_do_arquivo> (arquivo específico)
it log --summary -S<palavra> [<caminho_do_arquivo>] (arquivo específico que contêm uma determinada palavra)
git log --diff-filter=M -- <caminho_do_arquivo> (modificação de um arquivo)
  - Filtro: Adicionado (A), Copiado (C), Apagado (D), Modificado (M), Renomeado (R), entre outros.
git log --author=usuario (um determinado autor)
git blame -L 12,22 meu_arquivo (revisão e autor da última modificação de uma bloco de linhas)

```
```
git remote -v (conferir)
git config
git show SHA1 (inspeciona o commit)
git show (inspeciona o último commit)
fork: fazer uma cópia para seu GitHub
```
---
***GIT IGNORE***
```
.gitignore 
```
- Arquivo onde ficará os nome de arquivos e pastas que não serão adicionados em um repositório.

--
***INICIALIZAR REPOSITÓRIO LOCAL | INIT, ADD, RESET, COMMIT, BRANCH***
```
git init
git add nome_do_aquivo 
git add . (adiciona todos os arquivos/diretórios)
it add -f arquivo_no_gitignore.txt
git reset (reverte o git add)
git commit meu_arquivo.txt meu_outro_arquivo
git commit -m "nome commit"
git commit -am "nome commit" (atalho para adicionar e commitar ao mesmo tempo)
```
Sempre mude a branch de MASTER para MAIN para não dar erro com o repositório remoto

---
***REMOVER | RM***
```
git rm meu_arquivo.txt
git rm -r diretorio
```

---
***BRANCH FEATURE (CAMINHO ALTERNATIVO) | BRANCH, CHECKOUT, MERGE***
- O master é o branch principal do GIT.
- Branch: ramificação de uma linha temporal
- feature: categorização
```
git branch feature/nome-da-branch (criar a ramificação)
git checkout feature/nome-da-branch (vai para o diretório)
git checkout -b nome-nova-branch (cria e já migra para nova branch)
git checkout master (volta para a principal)
git push -u origin nomeDaBranch 
git merge feature/nome-da-branch (une a feature a master)

git branch (mostra todas a branchs criadas)
git branch -D feature/nome-da-branch (deleta branch)
```
- Apagando Branch
```
git branch -d nome-da-branch
git push origin:nome-da-branch (Apagar branch remoto)
```
- Informações
```
git branch (listar)
git branch -v (últimos commits)
git branch --merged (Listar branches que já foram fundidos (merged) com o master)
git branch --no-merged (Listar branches que não foram fundidos (merged) com o master)
```
- Criando branches no repositório remoto
```
git push origin nome-da-branch
git push origin nome-da-branch:new-branch (Criando um branch remoto com nome diferente)
git checkout -b nome-da-branch origin/nome-da-branch (Baixar um branch remoto para edição)
```

---
***REPOSITÓRIO REMOTO | REMOTE, PUSH***

- Criar repositório vazio no GitHub
```
git remote add origin URLrepositorio (vincular repositório local com um repositório)
git push -u origin master (enviar arquivos/diretórios)
```
- Informações
```
git remote show origin
```
- Renomear
```
git remote rename origin curso-git
```
- Desvincular
```
git remote rm curso-git
```

---
***CLONAR REPOSITÓRIO REMOTO PARA LOCAL | CLONE***
```
git clone URL
git clone URLrepositorio --recurse-submodules (baixa os outros submodulos do rep.)
```

---
***ATUALIZAR REPOSITORIO LOCAL | PULL***
```
git pull 
git fetch (Buscar alterações, mas não aplica-las no branch atual)
```

---
***GITFLOW***

- Separar a master pra não quebrarem o código

[![C1qD7yM.png](https://i.imgur.com/C1qD7yM.png)](https://imgur.com/C1qD7yM)

---
***CONTRIBUINDO COM OUTROS PROJETOS | PULL REQUEST***

- Clique em Fork no GitHub(direita em cima). Vai ser criado uma copia do repositorio
- Sempre crie outra branch
```
git clone OU
git checkout -b 
git commit -am "Contribuição do projeto"
git push
set-up (resolve conflitos e cria no origin)
```

---
***BUGS | BISECT***
- Útil para encontrar um commit que esta gerando um bug ou uma inconsistência entre uma sequência de commits.
```
git bisect start (Iniciar pequinsa binária)
git bisect bad (Marcar o commit atual como ruim)
  - Se o commit estiver com o problema, então ele deverá ser marcado como ruim.
git bisect good vs-1.1 (Marcar o commit de uma tag que esta sem o bug/inconsistência)
git bisect good (Marcar o commit como bom)
  - O GIT irá navegar entre os commits para ajudar a indentificar o commit que esta com o problema. Se o commit atual não estiver quebrado, então é necessário marca-lo como bom.
  - git bisect reset (Finalizar a pesquisa binária)
    - Depois de encontrar o commit com problema, para retornar para o HEAD utilize:
```

---
***FERRAMENTAS INTEGRADAS***

- Automatização para encontrar o bug. Para identificar se você enviou um código bugado, impedindo de realizar o build. Quanto o codigo n tem bugs, o software ja manda para produção
  - Ferramenta: Jenkings
