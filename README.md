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
  <br>

## Nome da Aplicação
Easy Toy