// Interfaces - se comparado com os typos, as interfaces são mais recomendadas e usadas
interface Usuario {
    nome: string;
    email: string;
    address?: string;
}

function getUser(): Usuario {
    return {
        nome: 'Vitor',
        email: 'vitor@vitor.com'
    }
}

funcion setUser(usuario: Usuario){
    //...
}