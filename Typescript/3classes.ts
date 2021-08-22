// Classes

class Data {
   // public dia: number;
   // private mes: number;
   // ano: number;

   //ao definirmos se o modificador da classe é public ou private abaixo, não precisamos atribuir (elementos comentados)
    construtor(public dia: number, public mes:number, public ano:number = 1970) {
      // this.dia = dia;
      // this.mes = mes;
      // this.ano = ano;
   }
}
const data = new Data(1, 1, 2020);
console.log(data.dia);
console.log(data.mes);

const data2 = new Data(1, 1);


// Modificadores de Acesso - modificador private, só é acessível/alterável de dentro da própria classe 
class Carro {
   private velocidadeAtual: number = 0;

   constructor(
      public marca: string,
      public modelo: string,
      private velocidadeMaxima: number = 220
   ) { }
   
   private alterarVelocidade(delta: number) {
      //validações de aceleração e frenagem
      const novaVelocidade = this.velocidadeAtual + delta;
      
      if (novaVelocidade >= 0 && novaVelocidade <= this.velocidadeMaxima) {
      this.velocidadeAtual = novaVelocidade;
     }else {
      this.velocidadeAtual = delta > 0 ? this.velocidadeMaxima : 0
     }
   }

   acelerar() {
      this.alterarVelocidade(5);
   }

   frear() {
   this.alterarVelocidade(-5);
   }
}

const carro = new Carro('Chevrolet', 'Prisma', 250);
carro.acelerar();


// Herança - conceito de orientação a objeto
class Camaro extends Carro { 
   // extends - tudo que tem em carro será herdado em Camaro
   private turbo = false;

   constructor() {
      super('Chevrolet', 'Camaro', 500);
      //super - chama a classe pai(Carro)
   }

   ligarTurbo() {
      this.turbo = true;
   }
}
   const camaro = new Camaro();
   camaro.acelerar();
   camaro.frear();
   camaro.ligarTurbo();