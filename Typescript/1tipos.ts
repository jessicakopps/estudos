// Se o type não for definido, por padrão, o compilador do TypeScript utilizará o type inference, que define o tipo da variável como o do valor recebido por ela.

// Boolean
const contaPaga: boolean = false;

// Number
const idade: number = 23;
const avaliacao: number = 4.5;

// String
const nome: string = 'Vitor Farias';

// Array
const idades: number[] = [23, 28, 45, 35, 45];
const idades2: Array<number> = [23, 28, 45, 35, 45];

// Tuple - Semelhante a um array, mas você delimita qual tipo e onde estará os valores
let jogadores: [string, number, boolean];
jogadores = ['Vitor', 3, true];

// Enum
enum statusAprovacao {
    Aprovado = '001',
    Pendente = '002',
    Rejeitado = '003'
}
const statusDaAprovacao: statusAprovacao = statusAprovacao.Aprovado;

// Any - Equivale a uma variável padrão do JS. Anula a tipagem do Typescript
const retornoDaApi: any = [123, 'Vitor', false];
const retornoDaApi2: any = {};

// Void - utilizado em funções que não retornam nada
function printarNaTela(msg: string) {
    console.log(msg);
}

// Null e Undefined - Precisa ser declarado para ser aceito
const u: undefined = undefined;
const n: null = null;

// Object - não é primitivo, como string ou number
function criar(objecto: object) {
    //...
}
criar({
    propriedade: 1, // criar ('Victor') dá erro
});
let pessoa: { nome: string, idade: number, estudante?: boolean } = {
    nome: 'Jessica Kopps',
    idade: 20,
}
let endereço: { [chave: string]: any } = {
    rua: 'nome da rua';
    número: 666
}

// Never - Usado quando você tem certeza que o evento nunca ocorrerá
function loopInfinito(): never {
    while (true) {}
}
function erro(mensagem: string) {
    while (true) {}
}
function falha() {
    return erro('Algo falhou');
}

// Union Types - Possibilidade de uso de mais de um tipo na variável , parâmetro ou função. Use | (ou)
const nota: string | number = 5;
function exibirNota(nota: number | string) {
    console.log(`A nota é ${nota}`);
}
exibirNota('10');
exibirNota(10);

// Alias - Cria types customizados para usar ao longo do código
type funcionario = {
    nome: string;
    idade: number;
    matricula: boolean;
    }
let alunos: pessoa[] = [{
        nome: 'JK',
        idade: 20,
        matricula: true
}, { 
        nome: 'DM',
        idade: 21,
        matricula: false
}]

// Operador ? - torna opcional a atribuição de um valor
type Contato = {
    nome: string;
    telefone1: string;
    telefone2?: string;
}
const contato: Contato = {
    nome: 'Vitor';
    telefone1: '12345646'
}
// Type Assertion - quando usado o any, não há auto complete, o assertion é uma forma de evitar eventuais erros.
const minhaIdade: any = 23;
(minhaIdade as number).toString();
// ou:
(<number>minhaIdade).toString();

//afirmando para typescript que é do tipo input, para n dar erro:
const input = document.getElementById("numero1") as HTMLInputElement; 
console.log(input.value);

