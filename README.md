# Api Java Domínio Bancario
## 📖 Introdução

O projeto "Api Java Domínio Bancário" é uma aplicação que se concentra na manipulação de requisições HTTP por meio de uma API Rest. Ele oferece a funcionalidade de realizar operações Get (obter informações) e Create (criar) para contas bancárias, que incluem dados como nome, número da conta, informações do cartão, funcionalidades e atualizações. A arquitetura desse projeto segue um modelo de três camadas: Controller (ponto de entrada da API), Service (onde ocorre a validação de dados e lógica de negócios) e Repository (responsável pelo armazenamento no banco de dados), garantindo o tratamento adequado dos dados desde a entrada até o banco de dados.

Além disso, essa aplicação oferece uma interface web acessível por meio do Spring Web, permitindo a realização de requisições HTTP sem a necessidade de um aplicativo externo.

Os conteúdos principais a serem explorados são:

- Programa Orientado a Objeto (POO);
- Pilares de POO;
- Springboot Framework (spring Data JPA, spring Security, outras bibliotecas);
- API Rest;

## 🔗Link de Acesso

- Documentação: Em Processo...

## Diagrama de Classes:

```mermaid
classDiagram
  class User {
    -name: String
    -account: Account
    -features: List<Feature>
    -card: Card
    -news: List<News>
  }

  class Account {
    -number: String
    -agency: String
    -balance: Float
    -limit: Float
  }

  class Feature {
    -icon: String
    -description: String
  }

  class Card {
    -number: String
    -limit: Float
  }

  class News {
    -icon: String
    -description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## Funcionalidades

```bash
. Crud de clintes:
  - POST: Criar um domínio bancário informando seu nome, conta, cartão, features e novidades.
  - GET: Podendo acessar a contas existentes via email.
  - PUT: Atualizar os valores por meio de um ID existente. -> EM PROCESSO...
  - DELETE: Deletar contas. -> EM PROCESSO...
```

## 💡Programas utilizados:

- VSCode

## 💻Tecnologias

![java](https://img.shields.io/badge/java-4F5B93?style=for-the-badge&logo=Java&logoColor=white)
![Springboot](https://img.shields.io/badge/springboot-white?style=for-the-badge&logo=Springboot&logoColor=green)
![Gradle](https://img.shields.io/badge/Gradle-white?style=for-the-badge&logo=Gradle&logoColor=000080)
![Swagger](https://img.shields.io/badge/swagger-green?style=for-the-badge&logo=Swagger&logoColor=white)
![SpringSecurity](https://img.shields.io/badge/SpringSecurity-green?style=for-the-badge&logo=SpringSecurity&logoColor=white)
![PostgresSQL](https://img.shields.io/badge/swagger-blue?style=for-the-badge&logo=Postgresql&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

## 📫 Contato

<p>Email: italo.rocha.de.oliveira@gmail.com</p>

<a href = "mailto:italo.rocha.de.oliveira@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" alvo ="_blank"></a>
<a href="https://www.linkedin.com/in/italorochaoliveira/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
