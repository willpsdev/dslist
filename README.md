# Game List


# Sobre o projeto

Game List é uma aplicação backend construida durante o **Intensivão Java Spring** (#dslist-backend). O evento foi organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior"). 

AA aplicação envolve a criação de uma lista de jogos dentro de uma plataforma web, com a implementação completa do backend. O objetivo é permitir que a API possa acessar e gerenciar dados do banco de dados. As funcionalidades incluem: obtenção de toda a lista de jogos, busca de jogos por ID, busca de jogos por ID de lista (categorias de jogos), e obtenção de listas por ID. Além disso, foi desenvolvida uma funcionalidade que permite mover os jogos dentro da lista, alterando seus IDs de forma correspondente. Para testes, foi utilizado o banco de dados H2, enquanto o PostgreSQL foi adotado para homologação.


## Modelo de Domínio

Este é o modelo de domínio utilizado para o projeto.

![Modelo Conceitual](![dslist-model](https://github.com/user-attachments/assets/6e1d654e-17b6-4db6-959b-dfb62a99bdf8)
)

## Get Games

Captura dos jogos cadastrados no banco de dados.

![Get Games](![postman-get-games](https://github.com/user-attachments/assets/355965ea-b618-439b-a059-55a448a753f7)
)

## Get Games By Id

Captura do jogo identificado pelo id dentro do banco de dados.

![Get Games By Id](![postman-get-by-id](https://github.com/user-attachments/assets/944e058e-840d-41d1-b542-7277639934b3)
)

## Get List

Captura das listas(categorias de jogos) salvas no banco de dados.

![Get List](![postman-get-list](https://github.com/user-attachments/assets/4849af16-ae59-4cb8-8a4b-b2b0928789dd)
)

## Get List By Id

Captura dos jogos referente ao id da lista(categoria) em que eles pertencem.

![Get List By Id](![postman-get-list-by-id](https://github.com/user-attachments/assets/a1ed9be4-8d32-4c6d-9293-3ec7a0d62011)
)

## Movendo os jogos dentro da lista

Movendo os jogos dentro da lista modificando o id.

![Move Game 1](![h1-2](https://github.com/user-attachments/assets/7b4cf108-dcf1-496f-84b5-1ed8649e53b9)
)![Move Game 2](![h2-2](https://github.com/user-attachments/assets/fce2ab63-5472-4837-8ba4-92147dec9232)
)

## Homologação PostgreSQL

Após a relização dos testes no banco H2 os dados foram homologados para o Banco Postgres.

![Homolog Postgres](![image](https://github.com/user-attachments/assets/a9b8a197-2c24-487e-9aa0-db684a422bad)
)


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
