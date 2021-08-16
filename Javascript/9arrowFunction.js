function soma (x, y) {
    return x + y;
};
console.log(soma(3, 4));

//variavel guardando uma função.
const multiplicacao = function (x, y) {
    return x * y;
};

console.log(multiplicacao(5, 5))
//pode acontecer se sua variável ser sobrescrita, por isso a const é importante

//Arrow Function
//função de forma anônima:
const dividir = (x, y) => {    // => Operador de Arrow
    return x / y;
};
//para objetos, é preciso encapsular entre parenteses: ({ objeto});
const objeto = () => ({ nome: 'JC', sobrenome: 'Bombardelli'});