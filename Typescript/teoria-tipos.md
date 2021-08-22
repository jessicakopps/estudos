
**TIPOS**<br>

Declarar variável:

    let nomeVariável: tipo = atribuição;

    ex:
    let idade: number = 10;
    const nome: string = 'Camila Lacerda';

**Boolean**<br>
    const contaPaga: boolean = false;

**Number**<br>
Todos os números são definidos como números reais.<br>

    const idade: number = 23;
    const avaliacao: number = 4.5;

**String**<br>
    const nome: string = 'Vitor Farias';

**Array**<br>
Há duas formas:

    const idades: number[] = [23, 28, 45, 35, 45];
    const idades2: Array<number> = [23, 28, 45, 35, 45];

**Tuple**<br>
Semelhante a um array, mas você delimita qual tipo e onde estará os valores.<br>

    let jogadores: [string, number, boolean];
    jogadores = ['Vitor', 3, true];


**Enum**<br>

    enum Level { Estagiário = 1, Junior = 1, Pleno = 5, Senior = 10} ;

    if(user.level < Leve.Senior) {
        return 'Acesso Negado';
    }

**Any**<br>
Equivale a uma variável padrão do JS. Anula a tipagem do Typescript.<br>
    
    const retornoDaApi: any = [123, 'Vitor', false];
    const retornoDaApi2: any = {};

**Void**<br>
Para explicitar que a função não tem retorno.<br>
    function printarNaTela(msg: string) {
        console.log(msg);
    }

**Null e Undefined**<br>
Precisa ser declarado para ser ser aceito.<br>

    const u: undefined = undefined;
    const n: null = null;

**Object**<br>
Temos dois tipos.<br>

O primeiro devemos seguir exatamente a estrutura:

    let pessoa: { nome: string, idade: number, estudante?: boolean } = {
    nome: 'Jessica Kopps',
    idade: 20,
    }

O segundo é flexível e pode receber qualquer conjunto de chave/valor.
    
    let endereço: { [chave: string]: any } = {
    rua: 'nome da rua';
    número: 666
}

**Never**<br>
É usado quando você tem certeza que o evento nunca ocorrerá.<br>

function loopInfinito(): never {
    while (true) {}
}
function erro(mensagem: string) {
    while (true) {}
}
function falha() {
    return erro('Algo falhou');
}

**Operador Elvis**<br>
Ele indica que uma propriedade é opcional.<br>

**Union Types**<br>
Possibilidade de uso de mais de um tipo na variável, parâmetro ou função.<br>
Utilize o operador | (ou)<br>

    let numero: number | string = 3;

**Type Alias**<br>
Cria types customizados para usar ao longo do código.<br>

    type funcionario = {
    nome: string;
    idade: number;
    matricula: boolean;
    }
    let alunos: pessoa[] = [{
        nome: 'JK',
        idade: 20,
        matricula: true
    }, { 
        nome: 'DM',
        idade: 21,
        matricula: false
    }]

**Operador ?** 
Torna opcional a atribuição de um valor

    type Contato = {
        nome: string;
        telefone1: string;
        telefone2?: string;
    }
    const contato: Contato = {
        nome: 'Vitor';
        telefone1: '12345646'
    }

**Assertion**<br>
Realiza uma afirmação para a linguagem, evitando eventuais erros.<br>

Redefinir uma variável, que inicialmente era any.<br>

    const minhaIdade: any = 23;
    (minhaIdade as number).toString();
ou:
    (<number>minhaIdade).toString();

    const input = document.getElementById("numero1") as HTMLInputElement; 
    console.log(input.value);

**E se eu não definir o tipo?**<br>
Por padrão, o compilador do TypeScript vai utilizar o type inference, que define o tipo da variável como o do valor recebido por ela.<br>

---
