# Projeto Palindromos

## Para executar o projeto

Após baixar o projeto, entrar dentro do diretório do projeto e executar no terminal: _mvn spring-boot:run_


# Sobre o Projeto 

O projeto foi criado com base no modelo de [arquitetura hexagonal](https://alistair.cockburn.us/hexagonal-architecture/) onde, de acordo com o criador da abordagem,
seria mais interessante ter um modelo mais genérico(flexível), onde não precisaríamos pensar na arquitetura, obrigando o software a ter camada de View e separar Application e Domain.

A explicação para este novo pensamento é que, na visão dele, não haveria muita diferença de se ter na aplicação uma comunicação com banco de dados e troca de dados via redes, com a interface do usuário, por exemplo.
Estas duas interações poderiam ser substituídas no sistema por qualquer outra forma de interação.

A seguir temos uma imagem da aplicação Palindromos no modelo hexagonal

<img width="698" alt="schema-ports-and-adapters" src="https://github.com/macindex/palindromos-claudioholanda/assets/7672997/a1736570-d39b-4f80-85b5-e298d52c8f37">



A partir do sistema proposto, temos uma forma de pensar onde percebemos que a arquitetura cria uma flexibilidade no uso de tecnologias para entrada e saída de informações
(onde toda esta interação está fora do sistema), sem deixar o software refém da tecnologia e que possíveis substituições, destas tecnologias, não impactem o Application e o Domain.

