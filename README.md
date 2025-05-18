# Agenda Telefônica

Este é um projeto de back-end construído com **Java + Spring Boot** que simula uma agenda telefônica. Ele inclui desde o desenho do banco de dados até a criação de entidades, migrations, rotas da API e toda a infraestrutura necessária para um back-end funcional e escalável.

O projeto ainda está em desenvolvimento. Atualmente o projeto consta com o banco de dados, as rotas da api, entidades, controllers, services, migrations.

## Tecnologias utilizadas

- **Java 17**
- **Spring Boot**
- **JPA / Hibernate**
- **Flyway**
- **PostgreSQL**
- **Docker + Docker Compose**
- **Maven**

---

## Como rodar o projeto

### Passo a passo

1. **Clone o repositório**

```bash
git clone https://github.com/seu-usuario/AgendaTelefonica.git
cd AgendaTelefonica
```

2. **Instale as dependências com o Maven**

```bash
mvn clean install
```

3. **Suba os containers com Docker Compose**

```bash
docker-compose up
```

> Isso irá iniciar um container com o PostgreSQL configurado, e você poderá rodar a aplicação com as migrations gerenciadas automaticamente via Flyway.

---

## Testes

_Em desenvolvimento._

---

## Observações

- Todas as migrations são executadas automaticamente via Flyway ao subir a aplicação.
- O projeto segue o padrão MVC com separação clara de responsabilidades entre camada de dados, serviço e controle.
