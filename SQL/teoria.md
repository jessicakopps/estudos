# SQL (Structed Query Language)
- Lê-se Sequel </br>

Guia de Consulta Rápida: https://www.cobgiro.com/arquivos/mysql2.pdf </br>
Documentação: https://www.w3schools.com/sql/ 
</br>
</br>
- SGDB (Sistemas Gerenciadores de Banco de Dados) 
Para armezanar muitos GB de dados: MySql, PostgreeSql...
Os big data precisam ser armasenadas em NoSql, pois os Sql não dão conta. 
</br>

- 2 Principais tipos de BD:
  1. Relacionais (Sql)
  2. Não Relacionais (NoSql) 
</br>

---
***ALGUMAS INFORMAÇÕES INTERESSANTES***
- O artefato mais comum para armazenamento de Dados é o arquivo
- 2 Tipos de memoria no PC: RAM e ROM
  - RAM: Memoria de processamento, Curto prazo - Precisa de energia. Mais rápida
  - ROM: Memória não-volátil, Longo prazo, disco rígido. Não precisa de energia. Mais lento
  - Se não tivesse a RAM, inviabilizaria o uso do PC, tamanha lentidão
- SSD = chip 7 - Velocidade de leitura e escrita de dados muito rápido, se comparado com o disco de platina

- Arquivos de rede: Quando mais de um usuário tenta abrir o arq, e aparece para abrir somente leitura. Semente 1 pessoa por vez pode acessar o arq. Imagina se tds os sistemas dependessem de arq.
O BD foi inventado para que mais usuários pudessem acessar as info aos mesmo tempo.
Surgiu a mais ou menos há 40 anos atrás. 
</br>

---
***3 PRINCIPAIS FORMAS*** </br>
Todo BD relacional obrigatoriamente deve seguir as 3 formas normal de criação de Tabela. </br>

*Motivo*
- Evitar redundância de info - ideal 0 de redudância
- Evitar lentidão
</br>

- 1ª Forma Normal:
  - Tabela precisa ter PK(primary key); 
  - Todo campo deve ser atômico (referencia ao átomo info que não pode ser dividida)
  - Não-atômico: endereço - Há o CEP, Bairro, Rua...; nome - nome e sobrenome.
- 2ª Forma Normal:
  - Tabela deve estar de acordo com a 1ªFN
  - Toda coluna deve ser diretamente dependente do contexto da tabela
  - ex: colocar uma tabela de endereço em uma tabela de pessoa infringe a regra, pois a pessoa é pessoa idependente so endereço.
- 3ª Forma Normal:
  - Tabela deve estar de acordo com a 2ªFN
  - Nome das colunas precisa ter um sentido independente
  - ex errado: Carro (placa, modelo, km_rodados, cod_fabricante, nome_fabricante)
  - ex certo: Carro (placa, modelo, kmRodados, cod_fabricante), Fabricante (cod_fabricante, nome_fabricante) 
</br>

---
***PREPARANDO O AMBIENTE*** 
</br>

**Download Servidor** 
MySQL MSI Installer: https://dev.mysql.com/downloads/windows/installer/8.0.html
- Intalação: Choosing a Setup Type: Server Only
- Authentication Method: Use legacy Authetincation Method
- Password: Salve em algum lugar

**Download Client** 
Download Client: DBeaver (Pode ser usado para vários outros DB): https://dbeaver.io/download/
- Choose Users: For anyone
- Não mudamos os Componentes habilitados 
</br>

***NO DBEAVER*** 
</br>

**Shortcuits** 
- CTRL + ENTER = EXECUTAR
- F5 = Atualizar (No campo com as DB) 
</br>

**Passo a passo** 
- Clicar no + para add uma BD
- Escolha MySQL
- Server Host: localhost
- username: root
- password: o que foi colocado no MySQL
- Test Connection
- SQL Editor - Open SQL script 
</br>

---
***TIPOS***
- int: numero | calculos aritméticos
- varchar: texto
- integer: hold numbers that are whole, or without a decimal point
- blob: para armezanar arquivo, convertido em binário(por meio de outra linguagem, ou programando no DB), ex: imagens 
</br>

- Texto: dentro de aspas simples 
</br>

**Infos**
- A linguagem SQL NÃO é case-sensitive
- Após executar os comandos, comente eles para não serem repetidos na execução 
</br>

---
***SCRIPT***

**CRIAR DB | CREATE TABLE**
```
create database meuprimeirodb;
```
</br>

**Para que o comando create table seja executado na db criada | USE**
```
use meuprimeirodb;
```
</br>

**CRIAR TABELA | CREATE TABLE**

```
CREATE TABLE tablename(column1 datatype, column2,... );
```

```
create table pessoa
(
  codpessoa int not null auto_increment,
  nome varchar(20) not null,
  sobrenome varchar(30) null,
  dtnascimento date     null,
  constraint pk_pessoa primary key (codpessoa)
);
```
- auto_increment: vai automaticamente colocar o código(numeral crescente) ao cadastrar codpessoa
- se não especificar, por default será null.
- constraint pk_ ... funciona em outros SGDBs

```
create table documentos
(
  coddocumento int not null auto_increment,
  codpessoa int not null,
  tipodocumento varchar(20) not null,
  ndocumento varchar(30) not null,
  constraint pk_documentos primary key (coddocumento),
  constraint fk_documentos_pessoa foreign key (codpessoa)
  references pessoa(codpessoa)
);
```
</br>

**KEYS**
- Primary Key(PK): chave única de uma coluna em uma tabela. Não pode ser NULL.
- Foreign keys (FK): referencia para a primary key em outra tabela para lincar as duas tabelas.Define o relacionamento entre 2 tabelas.
- references: Referencia qual tabela e a coluna da tabela.
</br>

**CRIAR FILEIRA | INSERT INTO**

```
INSERT INTO tablename (column1, column2) values 
('second guest', 'Me too!');
```
- Para adicionar mais fileiras em um mesmo comando:
```
INSERT INTO tablename (book_id, title) values 
('first guest', 'I got here!'), 
('second guest', 'I got here too!');
```
```
insert into pessoa (nome, sobrenome, dtnascimento) 
values ('Maria', 'Silva', '1990-02-28');

insert into pessoa (nome, sobrenome, dtnascimento) values 
('Izabelle', 'Lopes', '1995-12-25'),
('Aline', 'Carvalho', '1995-10-12'),
('Mirella', 'Duarte', '1995-08-01');
```

```
insert into documentos (codpessoa, tipodocumento, ndocumento) values 
(2, 'rg', '123456'),
(2, 'cpf', '054321'),
(3, 'cnh', '753159');
```
</br>

**DELETAR | DELETE | DROP**
### Usar a condicional WHERE, se não deleta toda a tabela.
- Indices | Transaction: se o delete for executado dentro da transaction, há como dar o rollback - RECOMENDADO

```
DROP TABLE tablename
DROP TABLE IF EXISTS tablename;
DELETE FROM tablename WHERE condition
```
```
delete from pessoa where codpessoa = 1;
```
- Se for apagado alguma fileira de pessoa, e a pessoa tiver registro em documentos, vai gerar um erro informando que as inf. em documentos devem ser apagados antes.
</br>

**VER TABELA ou COLUNA | SELECT**

```
SELECT * FROM tablename;
SELECT column 1, column2 from tablename;
```
</br>

**ADICIONAR COLUNA | ALTER**

```
ALTER TABLE tablename ADD columnname TEXT;
```
</br>

**ÍNDICE | TRANSACTION**

```
BEGIN TRANSACTION;
DELETE FROM tablename WHERE condition
ROLLBACK;
```
- Rollback: desfaz a transaction antes do COMMIT
```
END TRANSACTION; | COMMIT;
```