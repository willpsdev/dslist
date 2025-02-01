# Game List


# Sobre o projeto

Game List é uma aplicação backend construida durante o **Intensivão Java Spring** (#dslist-backend). O evento foi organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior"). 

AA aplicação envolve a criação de uma lista de jogos dentro de uma plataforma web, com a implementação completa do backend. O objetivo é permitir que a API possa acessar e gerenciar dados do banco de dados. As funcionalidades incluem: obtenção de toda a lista de jogos, busca de jogos por ID, busca de jogos por ID de lista (categorias de jogos), e obtenção de listas por ID. Além disso, foi desenvolvida uma funcionalidade que permite mover os jogos dentro da lista, alterando seus IDs de forma correspondente. Para testes, foi utilizado o banco de dados H2, enquanto o PostgreSQL foi adotado para homologação.


## Modelo de Domínio

Este é o modelo de domínio utilizado para o projeto.

![Modelo Conceitual](https://github.com/DeivinsonPereira/dslist/blob/main/assets/dslist-model.png)

## Get Games

Captura dos jogos cadastrados no banco de dados.

![Get Games](https://github.com/DeivinsonPereira/dslist/blob/main/assets/postman-get-games.png)

## Get Games By Id

Captura do jogo identificado pelo id dentro do banco de dados.

![Get Games By Id](https://github.com/DeivinsonPereira/dslist/blob/main/assets/postman-get-by-id.png)

## Get List

Captura das listas(categorias de jogos) salvas no banco de dados.

![Get List](https://github.com/DeivinsonPereira/dslist/blob/main/assets/postman-get-list.png)

## Get List By Id

Captura dos jogos referente ao id da lista(categoria) em que eles pertencem.

![Get List By Id](https://github.com/DeivinsonPereira/dslist/blob/main/assets/postman-get-list-by-id.png)

## Movendo os jogos dentro da lista

Movendo os jogos dentro da lista modificando o id.

![Move Game 1](https://github.com/DeivinsonPereira/dslist/blob/main/assets/h1-2.png)![Move Game 2](https://github.com/DeivinsonPereira/dslist/blob/main/assets/h2-2.png)

## Homologação PostgreSQL

Após a relização dos testes no banco H2 os dados foram homologados para o Banco Postgres.

![Homolog Postgres](https://github.com/DeivinsonPereira/dslist/blob/main/assets/postgres.png)


# Tecnologias utilizadas

## Técnologias Backend

- Java
- Spring Boot
- Spring Data JPA / Hibernate
- Maven
- Postman
- H2 Database
- Postgres

## Técnicas utilizadas

- Padrão camadas
- Padrão Rest


# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/DeivinsonPereira/dslist.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

William Paixão Dos Santos

https://www.linkedin.com/in/william-santos-427117217/
