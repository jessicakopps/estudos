# Estrutura de Dados 

- Estrutura de dados é uma estrutura orrganizada de dados na memória de um computador ou em qualquer dispositivo de armazenamento, de forma que os dados possam ser utilizados de forma correta.
- Essas estruturas encontram muitas aplicações no desenvolvimento de sistemas, sendo que algumas são altamente especializadas e utilizadas em tarefas específicas
- Usando as estruturas adequadas através de algoritmos, podemos trabalhar com uma grande quantidade de dados, como aplicações em bancos de dados ou serviços de busca.

---
***ALGORITMO***
- É um conjunto de instruções estruturadas e ordenadas, seu objetivo é realizar uma tarefa ou operação 
específica.
- São utilizados para manipular dados nas estruturas de várias formas, como por exemplo: inserir, excluir, 
procurar e ordenar dados.

---
***Principais estruturas de dados***
- Vetores e matrizes; Registro. Lista; Pilha; Fila; Árvore; Tabela Hash; Grafos.

---
***Vetores e matrizes***
- Vetores e Matrizes ou Arrays são estruturas de dados simples que podem auxiliar quando há muitas variáveis 
do mesmo tipo em um algoritmo.
- Matriz ou array multi-dimensional é um vetor de vetores.
- Uma matriz é um vetor que possui duas ou mais dimensões.

---
***Registros***
- Uma estrutura que fornece um formato especializado para armazenar informações em memória.
Enquanto arrays nos permitem armazenar vários dados de um único tipo de dados, o recurso de Registro nos 
permite armazenar mais de um tipo de dado.
- É composto por campos que especifiqueam cada uma das informações que o compõem
Toda estrutura de registro tem um nome (ex:livro), e seus campos podem ser acessados por meio do uso do 
operador ponto (.). Por exemplo, para acessar o preço de um livro, poderíamos utilizas a seguinte declaração:
livro.preco

---
***LISTAS***
Estrutura de dados do tipo Lista, armazena dados de um determinado tipo em uma ordem específica.
A diferença entre listas e arrays é a de que as listas possuem tamanho ajustável, enquanto arrays possuem tamanho fixo

**Lista Ligada**
Na estrutura do tipo lista existem os nós onde cada um dos nós conhece o valor que está sendo armazenado em seu interior além de conhecer o elemento posterior a ele: por isso ela é chamada de "lista ligada", pois os nós são amarrados com essa indicação de qual é o proximo nó.

**Lista Duplamente Ligada**
A grande diferença das listas duplamente ligadas para as listas ligadas é que elas são bidirecionais. Vimos 
que naturalmente, não conseguimos "andar para trás" em listas ligadas, pois os nós de uma lista ligada 
sabem somente quem é o próximo elemento. Nas listas duplamente ligadas, os nós sabem quem é o proximo 
elemento e quem é o elemnto anterior, o que permite a navegação reversa.
As listas duplamente ligadas costituem uma variação das listas ligadas.

---
***PILHAS | STACK***
Uma pilha é uma estrutura de dados que serve como uma coleção de elementos, e permite o acesso a somente um item de dados armazenados.
- O acesso aos itens de uma pilha é restrito - somente um item pode ser lido ou removido por vez.
- Tipos de pilhas: LIFO OU UEPS; FIFO OU PEPS

**LIFO OU UEPS**
A estrutura do tipo PILHA LIFO (Last in First Out) ou UEPS (Último que Entra Primeiro que sai), apresenta o 
seguinte critério: o primeiro elemento a ser retirado é o último que tiver sido inserdo.

**FIFO OU PEPS**
A estrutura do tipo PILHA LIFO (Fist in First Out) ou UEPS (Primiro que Entra Primeiro que sai), apresenta o 
seguinte critério: o primeiro elemento a ser retirado é o primeiro que tiver sido inserido.

---
***FILAS***
A estrutura do tipo Fila admite remoção de elementos e inserção de novos sujeitaà seguinte regra de operação:
o elemento removido é o que está na estrutura há mais tempo, ou seja, o primeiro inserido na fila é também o 
primeiro a ser removido seuindo o conceito FIFO.

---
***ALGORÍTMOS DE ORDENAÇÃO DE DADOS***
**- Bubble Sort:** troca posição adjacentes, até ordenar como a codição pede
**- Seletion Sort:** troca com o primeiro número a sua direita que for menor que ele
**- Insertion Sort:** troca quando on anteriores são maiores (carta de baralho)
**- Quick Sort:** um número pivô se organizando, procurando os maiores e menores que ele e tomando seus lugares
**- Hashing:** Pesquisa por chave e valor (cpf)

---
***OBJETOS***

**Árvores**
É uma estrutura de dados que organiza seus elementos de forma hierárquica, onde existe um elemento que fica 
no topo da árvore, chamado de raiz e existem os elementos subordinados a ele, e que são chamados de nós ou 
folhas.

**Tabelas Hash | Espalhamento | Dispersão**
É uma estrutura de dados especial, que associa chaves de pesquisa a valores.

**Hashing** 
Uma tabela hash é uma generalização da idéia de array, porém utiliza uma função, fazendo com que os mesmos 
fiquem de forma não ordenada, dentro do "array" que define a tabela.

*Porque espalhar?*
A tabela hash permite a associação de "valores" a chaves.
- Valores: é a posição ou índice onde o elemento se encontra
- Chave: parte da informação que compõe o elemnto a ser manipulado.
- Espalhar facilita a busca na estrutura de dados, pois a partir de uma chave podemos acessar de forma rápida 
uma posição do "array".

**Grafos** 
São estruturas qie permitem programar a relação entre objetos.
- Os objetos são vertices ou "nós" do grafo.
- Os relacionamentos são arestas.




