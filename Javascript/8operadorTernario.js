let isValid = true;

// Sem Ternário
function verify(isValid) {
    if(isValid) {
        return true;
    } else {
        return false;
    }
}
console.log(verify(isValid));

// Com Ternário - se aquela pergunta resulta apenas em true ou false, não é necessário usar if else
const result = isValid ? true : false;

let zero = 0;

const numeroResultado = zero == 0 ? 0 : -1;

console.log(numeroResultado);