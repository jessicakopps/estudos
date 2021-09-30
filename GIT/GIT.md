## GIT

Sistema de controle de versão distribuido. Projetado com desempenho, segurança e flexibilidade.

- Principais ferramentas: Github, Bitbucket, Gitlab

***GERAL***
```
git status
git remote -v (conferir)
git config
git log: mostra todos commits e infos
git show SHA1 (inspeciona o commit)
git show (inspeciona o último commit)
fork: fazer uma cópia para seu GitHub
```

---
***INICIALIZAR REPOSITÓRIO LOCAL | INIT, ADD, RESET, COMMIT, BRANCH***
```
git init
git add nome do aquivo || git add . (todos os arquivos)
git reset: reverte o git add
git commit -m "nome commit"
git commit -am "nome commit" (atalho para adicionar e commitar juntos)
git branch -m "novo nome da branch"
```
Sempre mude a branch de MASTER para MAIN para não dar erro com o repositório remoto

---
***BRANCH FEATURE (CAMINHO ALTERNATIVO) | BRANCH, CHECKOUT, MERGE***

- Branch: ramificação de uma linha temporal
- feature: categorização
```
git branch feature/nome-da-branch (criar)
git checkout feature/nome-da-branch (vai para ela)
git checkout -b nome-nova-branch (criar e já migra para nova branch)
git checkout master (volta para a principal)
git merge feature/nome-da-branch (une a feature a master)

git branch (mostra todas a branchs criadas)
git branch -D feature/nome-da-branch (deleta branch)
```

---
***ENVIAR REPOSITÓRIO PARA O GITHUB | REMOTE, PUSH***

- Criar repositório vazio no GitHub
```
git remote add origin URLrepositorio
git push -u origin nomeDaBranch
```

---
***PEGAR REPOSITÓRIO DO GITHUB | CLONE***
```
git clone URL
```

---
***ATUALIZAR REPOSITORIO LOCAL | PULL***
```
git pull 
```

---
***VOLTAR PARA UM COMMIT***
```
git checkout SHA1 
git status
faça outro commit e push
```

---
***GIT IGNORE***
```
.gitignore 
```
- Arquivo onde ficará os nome de arquivos e pastas que não serão compartilhadas


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
git clone URLrepositorio --recurse-submodules (baixa os outros submodulos do rep.)
git checkout -b 
git commit -am "Contribuição do projeto"
git push
set-up (resolve conflitos e cria no origin)
```

---
***FERRAMENTAS INTEGRADAS***

- Automatização para encontrar o bug. Para identificar se você enviou um código bugado, impedindo de realizar o build. Quanto o codigo n tem bugs, o software ja manda para produção
  - Ferramenta: Jenkings
