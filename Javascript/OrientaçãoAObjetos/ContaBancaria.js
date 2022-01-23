class ContaBancaria {
  constructor(agencia, numero, tipo) {
    this.agencia = agencia; //this se refere a classe
    this.numero = numero;
    this.tipo = tipo;
    this._saldo = 0; //colocar o _ para o getter e setters, para q a nossa função get set tenha o nome saldo, mas a nossa função não
  }

  get saldo() {
    return this._saldo;
  }

  set saldo(valor) {
    this._saldo = valor;
  }

  sacar(valor) {
    if (valor > this._saldo) {
      return "Operação negada";
    }  
    this._saldo = this._saldo - valor;

    return this._saldo;
  }

  depositar(valor) {
    this._saldo = this._saldo + valor;

    return this._saldo;
  }
}

class ContaCorrente extends ContaBancaria{
  constructor(agencia, numero, cartaoCredito) {
    super(agencia, numero);
    this.tipo = 'corrente';
    this._cartaoCredito = cartaoCredito;
  }
  
  get cartaoCredito() {
    return this._cartaoCredito;
  }

  set cartaoCredito(valor) {
    return this._cartaoCredito = valor;
  }
}

class ContaPoupanca extends ContaBancaria{
  constructor(agencia, numero) {
    super(agencia, numero);
    this.tipo = 'poupanca';
  }  
}

class ContaUniversitaria extends ContaBancaria{
  constructor(agencia, numero) {
    super(agencia, numero);
    this.tipo = 'universitaria';
  } 
  
  sacar(valor) {
    if(valor > 500) {
      return "Operação negada";
    }

    this._saldo = this._saldo - valor;
  }
}

// const minhaConta = new ContaCorrente(1, 234, true)
// minhaConta.saldo
// minhaConta.depositar(1000)
// minhaConta.sacar(500)
// minhaConta.saldo
// minhaConta.sacar(600)

// const contaPoup = new ContaPoupanca(1, 22)
// const contaUni = new ContaUniversitaria(1, 22)
// contaUni.depositar(1000)
// contaUni.sacar(550)  