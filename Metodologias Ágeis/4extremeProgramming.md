# EXTREME PROGRAMING (XP) 
Ideia muito simular ao Scrum, mas mais voltado para software

Ponto negativos: Foi desenvolvido por programadores, mais focado em código em si. Pouco flexível
</br>

**Processo:**
- Features "não prontas" -> Features mais importantes -> Planejamento iterativo ->
- Planos honestos -> Comunicação diária -> Empoderamento da equipe -> Ritmo do projeto -> Software em funcionamento -> Planejamento iterativo

**Técnicas na Engenharia de software:**
- Don Wells
- Ron Seffries
- Kent Beak

**Práticas:**
- Padrão de Código
- TDD
- Integração Contínua
- "Cebola" do XP

---
***Padrão de Código:***
- Formatação: Uso de espaços em branco, endentações, colocação e chaves;
- Estrutura do código: Estrutura do projeto, classes, recursos, pacotes, entre outros tipos de arquivo;
- Convenções de nomenclatura: Define como nomear métodos, classes, variáveis, eventos, parâmetros;
- Tratamento de erros: Define como tratar, reportar e fazer log de erros;
- Comentários: Comentários na língua definida usando um possível formato pré-definido.
*O que usar para seguirem os padrões:*
- Ferramenta: Checkstyle

---
***TDD*** </br>
Escreva os testes antes de desenvolver, e após refatore(corrigir, organizar e otimizar o código).

  - Ex 1: Validador de senha. A senha deve ter entre 5 e 10 caracteres.
  - Passo 1: Escrever teste
  - Passo 2: Escrever código
  - Passo 3: Rodar teste e verificar resultado

**Pontos:**
- Positivo: Melhoria da qualidade interna(código fácil de entender) e externa do código(interface do cliente)
- Negativo: Redução na produtividade
- Desafios para adoção de prática: Aumento no esforço; Código legado; Falta de habilidades para escrita dos testes; Problemas específicos de domínio ou ferramenta.

---
***Integração Contínua*** </br>
Check-in -> Source Repository(ex: git) -> CI Server: Buid,Test, Result -> Result -> Check-in
A equipe sobre o código para o repositório, essa ferramenta do repositorio está conectado com servidor de integração contínua, e esse servidor fica monitorando o código, faz contruçao, testa, reporta, se paçou nos testes, lança.
- Benefícios: Garantia e controle continua de qualidade; Habilita releases rápidas e frequentes.
- Desafios para adoção de prática: Escalabilidade; Infraestrutura apropriada; Habilidades específicas; Domínios de aplicação.

---
***"Cebola" do XP***
- Code
- Release Plan: Dura meses; Quais os objetivos deste lançamento? Quais funcionalidades (descrição de alto nível) vamos entregar neste lançamento? 
- Interation Plan: Semanas
- Acceptance Teste: Dias; Em aluns dias será finalizado algumas funcionalidades(use history); TDD.
- Stand Up Meeting: Igual ao Daily Scrum, porém tem q ser realizada em pé.
- Pair Negotiation: Horas; Programação em pares
- Unit Test: TDD
- Pair Programming: Segundos; Programação em pares
</br>

**Programação em Pares:** 2 pessoas, Driver e Navigator, trabalhando no mesmo código. O Driver digita o código e o Navigator vai fazendo perguntas e validando.
</br>

*Realidade*
- Tarefa complexa
  - Maior qualidade
  - Maior esforço
- Tarefa simples
  - Menor esforço
  - Menor qualidade
- Par de júnior pode alcançar performance de um sênior
- Fatores que podem influenciar
  - Aspectos sociais
  - Tipo de tarefa
</br>

*Quando usar?* </br>
|   Expertise   |  Complexidade  |    Usar PP?   |
| :---          | :---           | :---          |
| Júnior        | Baixa          | Sim, se maior qualidade for o alvo    |
| Júnior        | Alta           | Sim, se maior qualidade for o alvo    |
| Intermediário | Baixa          | Não                                   |
| Intermediário | Alta           | Sim, se maior qualidade for o alvo    |
| Sênior        | Baixa          | Não                                   |
| Sênior        | Alta           | Não, a não ser que a tarefa seja muito complexa para um sênior sozinho    |
