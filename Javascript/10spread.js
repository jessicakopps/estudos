let lista = [1, 2, 5];
let listaIncluir = [3, 4];

console.log(lista);
console.log(listaIncluir);

//Diferença Índice e Array. Indice: através do tamanho, se sabe o limite máximo dessa lista [1, 2, 5].
//Array: se for 10 posições, vai do 0 até o 9.

//listIncluir.lengh = tamanho total da lista
//vai ser percorrido a listaIncluir, e pra cada elemento, será percorrido toda a lista principal
for (let i = 0; i < listaIncluir.length; i++) {
    for(let j = 0; j < lista.length; j++) {
        if(lista[j] >= listaIncluir[i]) {
            lista.splice(j, 0, listaIncluir[i]); //splice = permite inserir novos valores em posições estratégicas
            j++;
        }
    }
}

console.log(lista);

// Spread Operator - o JS tem tendencia a criar referências (substituir), com o Spread é criado cópias independentes
const listResult = [1, 2, ...listaIncluir, 5]; //...nomeVariavel = spled operator - pega valores de um objeto ou lista, e se adapta onde está sendo aplicado

console.log(listResult);

//------------------------------
let arr = ['a', 'b', 'c'];

let arr2 = [...arr];

arr2.push('d'); //push = adicionar itens (listas ou um unico valor)

console.log(`Arr = ${arr}`);
console.log(`Arr2 = ${arr2}`);
