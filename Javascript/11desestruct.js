const pessoa = {
    nome : 'JC',
    sobrenome: 'Bombardelli',
    idade: 28,
    profissao: 'Reporter'
}

// console.log(pessoa);

// Sem destructer
// let nome = pessoa.nome;
// let sobrenome = pessoa.sobrenome;
// let idade = pessoa.idade;
// let profissao = pessoa.profissao;

// Destructer
let { nome, sobrenome, idade, profissao, endereço } = pessoa;

console.log(nome, sobrenome, idade, profissao, endereço); 
//endereço n é definido, mas a variavel foi criada e colocada na memoria | undefined = nulo
