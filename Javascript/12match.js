// Match - Buscar conteúdos especificos de uma massa de dados que vc n tem ctz que está lá, ou como está estruturada
const textoNaoEstruturado = 'Meu CPF é 123.456.789-22';

const regex = new RegExp('[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}'); //Expressão regular

console.log(textoNaoEstruturado.match(regex));