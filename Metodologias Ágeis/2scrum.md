***SCRUM*** <br>
Voltado para equipe <br>

**Product Backlog:** demandas do produto
**Sprint:** intervalo(no máx. 1 mês) para produção 
**Inicio:**  Plan: sprint backlog 
- Incremento: Resultado tangível, usável - chave do Scrum 
- Sprint Review: apresentar o resultado, avaliar e receber o feedback - inspecionar o produto e adaptar o plano
- Retrospectiva: discussão da equipe sobre melhorias - inspecionar o trabalho da equipe, autoanálise
**Fim:** 

**P.O (Product Owner):** Organiza e delega prioridades
**Dev's:** Parte técnica
**Scrum Master:** Garante a equipe esteja produtiva e entregando valor
**Daily Scrum:** Reunião diária para discutir o andamento do projeto e realinhar quando necessário.

**Scrum Board:** Itens, To do, WIP, Revisão, Teste, Done

**O Scrum não é um processo a ser executado**
É mentalidade
É um mecanismo, ou melhor, um arcabouço para otimizar o sistema de entrega de valor, em ambientes complexos

---
***A EQUIPE SCRUM (Scrum Team)***

**Crossfuncional:**
- Product Owner (PO): Gerencia (maximiza) a entrega de valor (e.g., retorno do investimento) - Negócio ➡ PO: Ordenar as ideias da equipe ➡ Desenvolver. Prioriza e gerencia o Backlog do Produto
- Scrum Master: Garantir que o ciclo todo funcione. Faz o meio de campo entre a Organização e a Equipe  Scrum. Causa remoção de impedimentos, de uma forma que deixe a equipe idependente. Lidera e facilita a adoção do Scrum.
- Desenvolvedores: Transformam itens de backlog em funcionalidades de valor para o negócio. Desenvolvedor é qualquer pessoa que iá trabalhar em qualquer aspecto do produto que irá ser entregue (Testador, Escritor técnico, Analista, Especialista, Designer). Auto-gerenciavel - A equipe que define suas tarefas e o tempo.

**Auto-gerenciavel:**
- Conhecimento botton-up (de baixo para cima)
- A equipe pensa em uma solução do problema informado - Alinhamento e autonomia em equilíbrio;

**No máximo 10 membros (recomendado)**

**Uma equipe ágil deve ser formada de Generalistas ou Especialistas**
- Ideal é pessoas de modelo em T: Especialista em algo, mas com conhecimento em outras áreas, flexíveis.

---
***PRODUCT GOAL*** *(template:romanpichler)* </br>
Product Strategy & Product Backlog </br>
Foco em pelo menos, uma meta de produto que a equipe esteja buscando </br>
Product Goal#1➡ Product Goal#2 ➡ ... Product Goal#5 ➡ Product Vision (ROADMAP)

**Tipos**
- Data 
- Meta - Risco
- Funcionalidades - Resto do Product Backlog 
- Métricas - Resto do Product Backlog

**Visão do Produto:**
Target Group, Needs, Product, Business Goal

**Cebola da Gestão de Produto**
1. Daily Plan: *Scrum*
2. Sprint Plan: *Scrum* - Sprint goal
3. Product Backlog: *Scrum*
4. Product Strategy
5. Product Vision: Product goal
6. Business Strategy: Executive & CEO
7. Company Vision : Executive & CEO

---
***PRODUCT BACKLOG*** </br>
Detalha tudo que (se pode modificar e melhorar que) será necessário no produto, no nível certo:
- Funcionalidade, Defeito(bug), Defeito Técnico, Requisito Não-Funcional, Caso de Uso, Requisitos de Négocio, Experimento, Capacidade e Spike Investigativo.

**Ciclo de vida de um item de backlog**
- JIT: Just in Time
- Epic➡ User Story ➡ Tarefa(Sprint BAcklog - Compacto)
- User Story(Product Backlog): Funcionalidade de escrita pela perspectiva do usuário. Ator + desejo e motivo

  
É ordenado levando em consideração tamanho, risco, valor(TCO - Total Cost of Ownership) e dependência

*Produt Backlog Item | Estimate | Value*
*Value:*
**M:** Mandatório - obrigatório 
**L:** Linear - quanto mais tiver, mais vale. Ex funcionalidades extras
**E:** Excitement - o cliente não espera, mas quando o cliente ao ver se apaixona pelo produto

---
***ESTIMATIVAS***

**Acurácia x Esforço:**
Um pouco de esforço ajuda muito
Muito esforço ajuda pouco

- Story point - Abordadem em pontos e não em horas: Cmplexidade, Tamanho, Risco,
Usa-se a Sequencia de Fibonacci, porém problemas menores =  mais preciso; problemas maiores = menos precisos: 
1, 2, 3, 5, 8, 13, 20, 40, 100
Spike: Se o risco é muito grande, separa alguns integrantes do time para pesquisar sobre o item de risco.
Epic - entre 13 e 20, User story - 13
Não se usa para comparar equipes.

- Planning Poker - Membros da equipe pontuam os itens. Caso tenha divergência, a pessoa explica o por quê daquela pontuação. Caso não chegue em um acordo, pegue outro item para referência, ou escolha (otimização de tempo).

---
***MODELO KANO*** </br>
Vai dar o valor, não em termos numéricos, mas quanto o cliente deseja aquilo.

**Categorização de funcionalidades em três categorias:** </br>
- Obrigatórios
  - É básico. Sua presença não agrega tanto valor, mas a sua ausência tem impacto negativo imenso.
- Lineares
  - Quanto mais, melhor. Ou melhor, quanto mais funcionalidades lineares, mais o cliente pagará.
- Excitadores ou alegradores
  - Necessidades desconhecidas.

**Como classificar se um item do backlog ta em uma das categorias acima:** </br>
- Forma funcional: Se o usuário é capaz de alterar a foto de perfil, como você se sente?
- Forma disfuncional: Se o usuário não é capaz de alterar a foto de perfil, como você se sente?
- Peguntas em ambas as formas: 
  - Eu gosto disso.
  - Eu espero que seja assim.
  - Sou neutro.
  - Posso viver com isso.
  - Eu não gosto disso.

  - Ná prática:
  [![FBsIUcJ.png](https://i.imgur.com/FBsIUcJ.png)](https://imgur.com/FBsIUcJ)
    - Questionável: é quando não fica claro a resposta
    - Reverso: ex: Espera que tenha, mas se não tiver tmb vai gostar

### Quanto mais tarde entrar no mercado, mais itens se tornam obrigatórios por causa da concorrência.

---
***DEFINITION OF DONE*** </br>
Parte do *incremento*. Questão de transparência: Expectativa/Definição de qualidade/pronto do produto.

**Conjunto de critérios(gates):**
- Garantia de qualidade:  ser responsivo a mudanças, boas práticas, rodar testes para validação.
- Arquitetura: Dicumentação, o quao flexivel ela ta, otimizada.
- Requisitos Não-Funcionais: Ex Termos de uso
- Gerenciamento do Processo: Documentação para comprovar que passa nos requisitos x.
- Gerenciamento da Configuração: Manter os branches limbos, nomeados etc.

*Exemplo: DoD for KonyuJP*
Criteria x Target
Build passando localmente e no servidor x OK
Testes de unidade x 100% OK
Testes funcionais x 100% OK
Critérios de aceitação x 100% OK
NOtas de release criadas x 100% OK
Defeitos major ou críticos x 0

---
***SPRINT PLANNING***

**Entrada**
- PO: Precisa planejar antes quem serão os convidados; Explorar as oportunidades de aumentar valor
- Product Backlog: Quais serão entregues? Negociação entre a equipe de valor
- Capacidade: Quantas pessoas estarão disponíveis na sprint? Influência nem quanto de trabalho poderá ser entregue.
- Performance passada: Caso a equipe tenha trabalho junto antes. *Meta de velocidade:* usado como referência de quantos products backlogs foram entregues em outras performances e usar a mesma estimativa.
- Definition of Done

**Quem?**
- Equipe Scrum
- Convidados:  Stakeholder, especialistas em um assunto como legislação...

**Como?**
- Planning 1
- Planning 2: Separados alguns tarefas para serem concluídas. Equipe se reune para planejar tempo e tarefas de cada das tarefas do backlogs.

**Saída | SPRINT BACKLOG**
- Sprint Goal: Motivo do sprint planning. *Único que não muda*
- PBI + Plano: Caso seja constatado no planning 2 que n será possível entrar x tarefas, rever com o PO.

**Scrum Board**
- Após os Sprint Planning, adicionar essas informações ao Scrum board

---
***SPRINT EXECUTION*** </br>
Spring Backlog já está definido. Transformar as ideias do Sprint Backlog em incrementos.

- Criar entregáveis: Na Sprint é entregue tudo e refinado o backlog. Usar o Scrum Board para ajudar no gerenciamento do dia a dia durante uma Sprit.
- Realizar Daily Scrums: Os desenvolvedores realizam uma reunião que dura em torno de 15min, geralmente em frente ao Board, para veridicarem o andamento das tarefas. Perguntas respondidas: 
  - O que eu fiz desde a última reunião?
  - O que irei fazer até a próxima reunião?
  - Há impedimentos na realização das tarefas? Se sim depois serão levadas ao PO
  - SPRING BURNDOWN: Gráfico usado como referência para entregas de tarefas, para baixo  
  - Refinar o Product Backlog (BACKLOG REFINEMENT): Quebrar as tarefas em tarefas menores
</br>

**Coisas que você NÃO precisa fazer:**
- Você NÃO precisa lançar ao final de cada Sprint;
- A Sprint NÃO é um gate; Um lançamento pode ser realizado durante a Spring
</br>

*A sprint está terminada e nem todas as tarefas foram finalizadas. A equipe quer jogar algumas para a próxima sprint. O que fazer?*
- Volta pro Product Backlog e vai ser analizado se as tarefas entrarão ou não no próximo Planning.
</br>

*Surgiu um bug crítico em Produção. Estamos na metade da Sprint. Temos que esperar para a próxima Sprint para corrigi-lo?*
- O único que não muda é a meta/Product Goal, o resto é flexível. Tire alguma demanda da Sprint e acrescente o bug.
- Se o bug for crítigo a ponto de não ter como atingir a meta, termine a Sprint e começa outra.

---
***SPRINT REVIEW vs SPRING RETROSPECTIVE***
</br>

**Spring Review** </br>
Geralmente uma reunião e duração máxima de 4H, para adaptar o Product Backlog ou mesmo alterar o Product Goal. </br>
*Objetivo:* Diminuir a distância entre os clientes e a Scrum Team.

- Product Backlog: Emerge e muda
- Incremento: Implementa itens de maior ordem do Product Backlog. Mostrar o que foi feito, dar o produto na mão do usuário e deixar ele usar
- Convidados: de usuários, clientes(reais, não o representante) e stakeholders internos; Pessoas que realmente tem algo a contribuir. Ex: Login de usuário, é importante chamar o pessoal de Marketing que irá opnar sobre suas campanhas direcionadas.
- Feedback e dados serão analisados pela Scrum Team, que irá atualizar o Product Backlog

- BURNUP CHART: Gráfico usado como referência para entregas de tarefas, para cima. Fica claro a diferença de pontas adicionados nas springs.
</br>

**Spring Retrospective** </br>
Após a Spring Review. Duração de 3H. Discussão da equipe sobre melhorias - inspecionar o trabalho da equipe, autoanálise

- Normalmente o Scrum Master que lidera a reunião. Todos tem que estar presentes.
- Preparar o cenário:
  - Dar as boas vindas e reiterar a importância da reunião; Pode também ja definir os tópicos que serão abordados.
  - Dica: Faça todos falarem durante o início da reunião:
    - O que você espera dessa reunião? - Resposta de no máximo uma sentença
    - O que você achou da Spring?
- Apresentar a estrutura a estrutura da reunião
- Colete dados. 
  - Revise dados disponíveis
  - Use técnicas de coletas de dados:
    - Happy, Sad, Ideas, Thanks: Dividide o quadro em 4 partes. Cada membro da equipe deve colocar no quadro coisas felizes, coisas que as deixaram bravas, ideias boa durante a Sprint e coisas que foram muito boas que ela agradece.
    - Hapiness radar: Tópicos a serem avaliados e se a pessoa esta feliz, neutro ou triste. Ex: Em relação ao tópico do sistema, a pessoa marca triste? Por quê? Porque tudo que eu mexia caia, quebrava. O Scrum Master vai anotando e colocando em - O que foi bem , O que não foi bem, Como melhorar
  - Técnicas para a parte *Como melhorar*, resolver a causa e não apenas mascarar:
    - Gerar ideias: Por que isso aconteceu? Como podemos melhorar? Causa-efeito. Riscos  
    - Diagrama de Ishikawa: Grupo de Causas A, Subcausa, Causa, Causa, Subcausa.
    - 5 Por quês: Isso pode causar irritação na equipe, avise antes! 1.Por que o código está ruim? Os testes não estão com uma cobertura boa. 2.Por quê? Porque não estamos automatizando os testes. 3.Por quê? Por que a gente ta escrevendo os testes. 4.Por quê? resposta 5.Por quê? Até chegar na causa raiz.
    - Muitas vezes a causa raiz é mais soft skills do que hard skills. Ex: O time chegava atrasado na reunião na 1a hora do dia, mude para 11h30, que tmb tem o motivador da fome, então era a reunião mais objetiva.
  - Decidir o que fazer: Normalmente o PO ajuda. Tratar itens de melhoria como itens de backlog. Técnicas:
    - Retrospective Planning Game; Planning Poker
    - Dot Voting: Bem efetiva!
- Fechar Retrospectiva: 
  - Agradecer à equipe pelo trabalho duro. 
  - Coletar feedback sobre a dinâmica da Sprint Retrospective

**Não fique repedindo muito a dinâmica para não ficar entediante**
  