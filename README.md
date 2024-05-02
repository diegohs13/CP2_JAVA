# CP2 - JAVA
## Descrição

Projeto de desenvolvimento de uma API RESTful com Java e Spring Boot para gerenciamento de um sistema de CRUD de brinquedos da loja Easy Toy.

## Integrantes

- MATHEUS MATOS - RM:99792
- KAREN VITORIA JESUS DA SILVA - RM:99468
- JULIANNY ARAUJO PEREIRA - RM:99554
- DIEGO HENRIQUE SANTOS DE OLIVEIRA - RM:550269
- JULIA DE FATIMA QUEIROZ - RM:551130

## Instruções para uso
O usuario pode cadastrar um brinquedo no sistema, inserindo os seguintes dados:
- ID
- Nome do Brinquedo
- Preço
- Tamanho
- Classificação Etária
- Tipo
- Descrição


O usuario pode visualizar os dados de um brinquedo especifico, inserindo o ID do brinquedo.


## Endpoints
BRINQUEDOS
- GET `/brinquedos` - Retorna a lista de brinquedos cadastrados no sistema.
- POST `/brinquedos` - Cadastra um novo brinquedo no sistema.
- GET `/brinquedos/{id}` - Retorna os dados de um brinquedo específico.

## Modelo de Dados

**TB_CP2_BRINQUEDOS**
- id (chave primária)
- nome_brinquedo
- preco
- tamanho
- classificacao
- tipo
- descricao<br>

## How to use
- Configure o arquivo `application.properties` com as configurações do seu banco de dados.
![properties](https://github.com/diegohs13/CP2_JAVA/blob/main/post.png)

- Execute a classe `Cp2JavaApplication.java` para iniciar a aplicação.
![application](https://github.com/diegohs13/CP2_JAVA/blob/main/javaApplication.png)

- Utilize o Postman ou Insomnia para testar os endpoints.
- Utilize o método GET para visualizar os brinquedos cadastrados.
![get1](https://github.com/diegohs13/CP2_JAVA/blob/main/get1.png)

- Utilize o método POST para cadastrar um novo brinquedo.
![post](https://github.com/diegohs13/CP2_JAVA/blob/main/post.png)

- Utilize o método GET com o id do brinquedo para visualizar os dados de um brinquedo específico.
![get2](https://github.com/diegohs13/CP2_JAVA/blob/main/get2.png)

## Nome da Aplicação
Easy Toy