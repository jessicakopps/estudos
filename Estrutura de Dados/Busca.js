// BUSCA SEQUENCIAL - quando são menos numeros
// var valores = [5, 8, 10, 22, 45, 38];

// function busca(num){
//     for(i=0; i < 6; i++){
//         if (num == valores [i]){
//             return i;
//         }
//     }
//     return -1;  
// }


// Usando a ferramenta de busca
// console.log(busca(10));
// console.log(busca(50));

// BUSCA ORDENADA - BUSCA BINÁRIA (usa base logarítima - ex- em 1024 elementos, até 10 passos p/ percorrer tds os elementos)
var valores = [5, 8, 10, 22, 38, 45, 60, 90, 100, 120];

function buscaBin(num){
    let inicio, fim;
    let meio;
    inicio = 0;
    fim = 9;
    let passos = 0;
    while (inicio <= fim){
        meio = parseInt((inicio + fim) / 2);
        passos = passos +1;
        if (num == valores[meio]){
            console.log("achei em " +passos+ " passos");
            return meio;
        } else {
            if (num > valores[meio]){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
    }    
    console.log("Não achei em " +passos+ " passos");
    return -1;     
}
console.log(buscaBin(10));
console.log(buscaBin(60));
console.log(buscaBin(120));