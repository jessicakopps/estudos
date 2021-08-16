//FOR - a gnt sabe quando vai parar - (var controladora; pergunta; instrução de incremento - quando vai sair do laço)

// var tabuada = 7;
// for (var i = 0; i <= 10; i++) {
//     console.log('Valor de ' + tabuada + ' x ' + i + ' = ' + tabuada * i);
// }
//enquanto i for menor ou igual a 10, executa. i++ : adiciona um valor a i cada vez q é executado para que n vire um loop eterno

//Numero Sorteado

// var numeroSorteado = 10;
// for (var i = 0; i < 100; i++) {
//     if (numeroSorteado === i) {
//         console.log('Seu numero foi encontrado');
//     }
// }

//WHILE - a gnt n sabe quando vai parar - while(flag): condição de parada do loop.

var achou = false;
var numeroSorteado = 10;
var possivelValor = 0;
//! : inverte, negação
while (!achou) {
   // possivelValor = possivelValor + 1; Forma mais curta abaixo:
    possivelValor += 1;
    if (numeroSorteado === possivelValor) {
        achou = true;
    } else {
        console.log('Possivel valor não corresponde ao numero sorteado ' + possivelValor);
    }    
}
