var elementos = [];
var topo = -1; 
// 0 é o 1o elemento da prateleira, por isso o -1
const MAX = 10;
function push(num){
    if (topo < MAX){
        topo = topo + 1;
        elementos[topo] = num;
    }
    else{
        console.log("Pilha esta cheia")
    }
    function estaVazia(){
        return topo == -1;    
    }
}
function pop(){
    if (topo != -1){
        num = elementos[topo];
        topo = topo -1;
        return num;
    }
    else{
        console.log("Pilha esta vazia")
    }
}
// Parte q usa pilha
push(10);
push(20);
push(30);

console.log(elementos);

console.log(pop());
console.log(pop());

var numDecimal = 10;
var resto;

console.log("Hora de empilhar...");

while(numDecimal != 0){
    resto = parsenInt(numDecimal %2);
    // parsenInt forçar q o numero permaneça inteiro
    push(resto);
    console.log(resto);
    numDecimal = parseInt(numDecimal / 2);
}
// ! = not
console.log("Desempilhando tudo!")
while (!estaVazia()){
    conseole.log(pop());
}