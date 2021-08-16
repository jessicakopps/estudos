// IF - Tomar uma decisão sobre um pergunta ou um tipo de informação que acabou de chegar

var nome = 'JC';
//= : atribuição | === : questiona se a var é aquela.
// if ( nome === "JC") {
//     console.log('O nome é este mesmo');
// } else if (nome === 'Bombardelli') {
//     console.log('Você tmb serve');
// } else {
//     console.log('Seu nome não é JC');
// }
//else if - caso o 1o IF for negativo, verifica se a 2a condição é verdadeira

//Modo Compacto - case: caso for vdd| break: finalização| default: executada se os casos anteriores forem falsos

switch (nome) {
    case 'JC':
        console.log('O nome é este mesmo');
        break;
        case 'Bombardelli':
            console.log('O nome é este mesmo');
            break;
            default: 
                console.log('Você não é quem estou procurando');
                break;
}

