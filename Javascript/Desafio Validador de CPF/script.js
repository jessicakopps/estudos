console.log('Javascipt carregado');

function validaCPF(cpf) {
    console.log(cpf.length);
    if(cpf.length != 11) { //se for diferente de 11 caracteres
       return false;
   } else {       
       var numeros = cpf.substring(0,9); //substring(a partir do 9, vou percorrer 9 numeros)
       var digitos = cpf.substring(9); //conta 9, e pega o restante de caracteres  
       
       var soma = 0;
       for (var i = 10; i > 1; i--) {            //laço de repetição - percorrer de tras pra frente - conisderar q texto digitado é uma lista de caracteres exclusivos - string = lista =- pode ser manipulado
           soma += numeros.charAt(10 - i) * i;  //charIt - retorna a posição da string na lista
       }
       console.log(soma);       
       var resultado = (soma % 11) < 2 ? 0 : 11 - (soma % 11);  //(% = mode - resto de divisão) é < q 2? true 0, se n, fazer o q está após os 2 pontos : 
       
       //Validação Primeiro Dígito
       if (resultado != digitos.charAt(0)) {    //é diferente do charAt posição zero? se for diferente:
            return false;   //valor da operação de 11 - (soma % 11), seja igual da  posição 0 do meu digito    
       }       
       console.log(
           digitos.toString().charAt(0) + ' primeira posição da variável soma');


        //Validação Segundo Dígito
        soma = 0;
        numeros = cpf.substring(0, 10);
        
        for(var k = 11; k > 1; k--){
            soma += numeros.charAt(11 - k) * k;
        }
        resultado = (soma % 11) < 2 ? 0 : 11 - (soma % 11);

        if (resultado != digitos.charAt(1)) 
            return false;

       return true;
   }
}

function validacao() {
    console.log('Iniciando validação CPF')
    document.getElementById('success').style.display = 'none'; // limpar a mensagem 
    document.getElementById('success').style.display = 'none';

    var cpf = document.getElementById('cpf_digitado').value;   //capturar elementos de dentro do HTML
    var resultadoValidacao = validaCPF(cpf);
   // if (resultadoValidacao == true) { - se, o resultadValidação for verdadeiro
   // Condicionais ou Repetição: Se vc sabe qual o valor da sua função (se true ou false):
   if (resultadoValidacao) {
       document.getElementById('success').style.display = 'block';
   } else {
       document.getElementById('error').style.display = 'block'
   }
}