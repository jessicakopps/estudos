//Classe - comum em programação orientada a objetos - n precisa declarar função, já identifica.
//Em JS provem uma maneira mais simples e clara de criar objetos e lidar com herançares.

class Matematica {
    soma(valorA, valorB) {
        return valorA + valorB;
    }
    subtração(valorA, valorB) {
        return valorA - valorB;
    }    
}
//new nomeClasse - cri objeto em memoria, agregado de funçoes e propriedades
var instanciaMatematica = new matematica