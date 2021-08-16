//FUNÇÕES- serve pra armazenar um bloco de code q pode ser usado e reutilizado qntas vzs a gnt quiser

//soma() - usa-se () pq estamos ensinando como fazemos a soma
function soma(operadorA, operadorB) {
    var resultadoC = operadorA + operadorB;
    return resultadoC;
}
function olaGama(nome) {
    console.log('olá Gama" Você é o ' + nome)
}
var resultadoDaSoma = soma(1, 2)
var resultadoNovoDaSoma = soma(10, 66);

console.log(resultadoDaSoma);
console.log(resultadoNovoDaSoma);

olaGama('JC');