## GIT

VCS (Version Control System) - Sistemas de controle de versões e para que servem:
  - Manter um histórico de alterações;
  - Ter controle sobre cada alteração no código;
  - Para que uma alteração de determinada pessoa não influencie na alteração realizada por outra;

- Documentação: https://git-scm.com/book/en/v2/
- Teste comandos e veja o resultado: https://git-school.github.io/visualizing-git/#free
- Principais ferramentas: Github, Bitbucket, Gitlab

---
***INSTALAÇÃO***

***Windows:*** http://git-scm.com/download/win
***Linux:*** https://git-scm.com/download/linux
***MacOS:*** https://git-scm.com/download/mac

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
  - HEAD: Estado atual do nosso código, ou seja, onde o Git os colocou
  - Working tree: Local onde os arquivos realmente estão sendo armazenados e editados
  -index: Local onde o Git armazena o que será commitado, ou seja, o local entre a working tree e o repositório Git em si.
  - https://git-scm.com/book/pt-br/v2/Fundamentos-de-Git-Gravando-Altera%C3%A7%C3%B5es-em-Seu-Reposit%C3%B3rio
```
git status
```
- Visualizar histórico
```
git log (histórico de alterações)
git log --oneline
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
- diff
```
git diff
git diff <branch1>..<branch2> (comparar as alterações entre duas branches)
git diff <commit1>..<commit2> (comparar as alterações feitas entre um commit e outro)
git diff {hash do commit de merge com lista}..{hash do último commit realizado} (mudanças realizadas em determinado código)


+ linha adcionada
- linha removida
- linha modificada (versão antiga)
+ linha modificada (nova versão)
```

```
git remote -v (conferir)
git config
git show SHA1 (inspeciona o commit)
git show (inspeciona o último commit)
fork: fazer uma cópia para seu GitHub
```
---
***IGNORAR ARQUIVOS | GIT IGNORE***
```
.gitignore 
```
- Arquivo onde ficará os nome de arquivos e pastas que não serão adicionados a um repositório.

--
***INICIALIZAR REPOSITÓRIO LOCAL | INIT, ADD, COMMIT, STASH***
```
git init
git add nome_do_aquivo 
git add . (adiciona todos os arquivos/diretórios)
it add -f arquivo_no_gitignore.txt

git commit meu_arquivo.txt meu_outro_arquivo
git commit -m "nome commit"
git commit -am "nome commit" (atalho para adicionar e commitar ao mesmo tempo)
```
Sempre mude a branch de MASTER para MAIN para não dar erro com o repositório remoto

- Criar repositório "servidor"(todos os membros da equipe o acessarão para compartilhar suas mudanças)
  - bare: repositório Git sem uma cópia dos arquivos
```
git init --bare
```
- Salvar temporariamente (quando precisamos parar de codar para trabalhar em outra coisa)
```
git stash 
git stash list (mostra a lista de stash)
git stash apply <numeroStash> (aplicar as modificações)
git drop <numeroStash> (remove a stash da lista)
git stash pop (atalho que aplica e remove a última alteração que foi adicionada na stash)
```

---
***REMOVER E DESFAZER AÇÕES| RM, RESET, CHECKOUT***
- Remover
```
git rm meu_arquivo.txt
git rm -r diretorio
```
- Desfazer (CTR + Z)
```
git reset (reverte o git add)
git checkout --<file> (desfazer git add do arq. x)
git reset HEAD <file> (desfazer o commit)
git log (para verificar o hash)
git reset <hash> (para reverter commits)
```

---
***REPOSITÓRIO REMOTO | REMOTE, PUSH***

- Informações
```
git remote (verificar repositórios)
git remote show origin
git remote - v (mostra os endereços locais dos repositórios)
```

- Criar/vincular repositório
```
git remote add nomeRepositorio urlLocal (cria repositório local)
git remote add origin URLrepositorio (vincular repositório local com um repositório)
git push -u origin master (enviar arquivos/diretórios)
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
***RAMIFICAÇÔES | BRANCH, CHECKOUT, MERGE***
- O master é o branch principal/padrão.
- Branch: ramificação de uma linha temporal
- feature: categorização

```
git checkout -b nome-nova-branch (cria e já migra para nova branch)
git branch feature/nome-da-branch (criar a ramificação)
git checkout feature/nome-da-branch (vai para o diretório)
git checkout master (volta para a principal)
git checkout <hash> (deixa o código no estado do commit com o hash)

git push -u origin nomeDaBranch 
git merge feature/nome-da-branch (dentro da master, une a feature a master)

git branch (mostra todas a branchs criadas)
git branch -D feature/nome-da-branch (deleta branch)
```
  - merge: junta os trabalhos e gera um merge commit. 
  - rebase: aplica os commits de outra branch na branch atual

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
***TAGS E RELEASES***
- Marcos interessantes em nosso sistema de controle de versões.
```
git tag -a v0.1.0 - m "Lançando a primeir versão (BETA) da aplicação"
git push local v0.1.0
git push origin v0.1.0
```

---
***BUGS | BISECT***
- Útil para encontrar um commit que esta gerando um bug ou uma inconsistência entre uma sequência de commits.
```
git bisect start (Iniciar pequisa binária)
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
