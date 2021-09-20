# Exemplo de encapsulamento com Java

Este é um exemplo básico de como aplicar um encapsulamento com Java, retirado das aulas disponíveis no canal do YouTube do professor Gustavo Guanabara.

### :bookmark_tabs: Resumo sobre Encapsulamento

Quando se fala em `encapsulamento` deve-se entender como o ato de estabelecer uma cápsula sobre alguma coisa. 
> Encapsular é o ato de ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior. 

A cápsula protege tanto o código do usuário, como o usuário do código. 

Além de prover proteção, também serve para estabelecer um _padrão externo_, apesar de seu funcionamento interno. Ou seja, a forma como o objeto se comporta dentro da cápsula não importa, contanto que a cápsula siga o padrão. 

Um código encapsulado usa __interface__ para realizar a sua comunicação com o mundo externo. 
A interface é o canal de comunicação externa do objeto.  A comunicação do mundo externo com o objeto é chamada de mensagem. A mensagem é enviada para a interface, que solicita à cápsula do objeto a informação requerida na mensagem. 

Um bom objeto encapsulado possui uma interface bem definida. Interface é uma lista de serviços fornecidos por um componente. É o contato com o mundo exterior que define o que pode ser feito com um objeto de uma classe. 

>Não é obrigatório encapsular, mas é uma boa prática para produzir classes mais eficientes.

:dart: __Vantagens do encapsulamento:__
 - Tornar mudanças invisíveis;
 - Facilitar a reutilização de código;
 - Reduzir efeitos colaterais. 
