***CONCEITOS***

Estilo em cascata, CSS pega o **ÚLTIMO** valor
Mobile First (68% da pop.)

---
***SELETORES***
*Encapsulamento*

    seletor {
        propriedade: valor
    }

    .class li a {}: vai seguir esse caminho
    .class, li , a {}: vai alterar esses três seletores.
    .class > p {} filhos diretos
    * {} : Todos os elementos

---
***LINKS***

    :link : não visitado
    :visited : visitado
    :hover : passar o mouse
    :active : clicar 

    :focus : durante o foco
    transition: ms

---
***RESPONSIVIDADE***
- evitar repetir código
- evitar estilo inline (são absolutos)
- use grids e flexbox
- evite estilos absolutos e relativos
- use media querys

---
***DISPLAY***
**none:** esconde
**block:** bloco
**inline:** linha
**flex**
**grid**

**!important:** forçar um estilo

---
***SASS (Syntactically Awesome Style Sheets)***
Em vez de escrever input:focus ou input:hover fora, use o &:input dentro https://sass-lang.com/
Ex no React
:    
   export const Input = styled.input`
      border: 1px solid #ddd;
      height: 2rem;
      padding: 0 .5rem;
      border-radius: .25rem 0 0 .25rem;
      
      &:focus,
      &:active {
         outline:none;
         border-shadow: none;
      }
    `;