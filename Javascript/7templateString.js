let meuNome = 'JC';
let meuSobrenome = 'Bombardelli';
let minhaProfissao = 'Blockchain Developer';

// Sem Template String
console.log('Olá, meu nome é' + meuNome + ' ' + meuSobrenome + ' e minha profissão é' + minhaProfissao);

// Com Template String
console.log(`Olá, meu nome é ${meuNome} ${meuSobrenome} e minha profissão é ${minhaProfissao}`);

//Para objetos
console.log(`O objeto json ${{ chave: 'valor'}}`);
let meuObjeto = {
    chave: 'novo valor'
}