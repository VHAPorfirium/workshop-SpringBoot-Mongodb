# Projeto MongoDB com Spring Boot

![Java](https://img.shields.io/badge/Java-21-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-green) ![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-brightgreen)

## 📌 Descrição
Este projeto é uma aplicação web baseada em **Spring Boot** e **MongoDB**, utilizando o paradigma de banco de dados orientado a documentos para armazenar e manipular dados. O objetivo é explorar o uso de **Spring Data MongoDB** para operações CRUD, consultas personalizadas e associações entre documentos.

## 🎯 Objetivos do Projeto
- Compreender a diferença entre bancos relacionais e NoSQL
- Implementar operações CRUD em um banco MongoDB
- Trabalhar com associações entre documentos (objetos aninhados e referências)
- Implementar consultas personalizadas com **Spring Data MongoDB**

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.4.2**
- **MongoDB**
- **Spring Data MongoDB**
- **Maven**
- **MongoDB Compass** (para visualização dos dados)

## 📂 Estrutura do Projeto
O projeto segue a arquitetura MVC e está organizado da seguinte forma:

```
/src/main/java/com/seuusuario/seuprojeto
├── domain         # Entidades do sistema
├── dto            # Data Transfer Objects (DTO)
├── repositories   # Interfaces para acesso ao banco de dados
├── services       # Regras de negócio
├── resources      # Controladores REST
├── config         # Configuração inicial do banco de dados
└── exceptions     # Classes para tratamento de exceções
```

## 🏗️ Modelagem do Domínio
As principais entidades implementadas no projeto são:
- **Usuário (`User`)**
- **Post (`Post`)**
- **Comentário (`CommentDTO`)**

## 🔧 Configuração do Banco de Dados
### Configuração no `application.properties`
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
```

### Configuração do MongoDB Localmente
1. Instale o MongoDB e inicie o servidor com:
```bash
mongod
```
2. Crie o banco de dados **workshop_mongo** e a coleção **users** utilizando o **MongoDB Compass** ou via terminal:
```javascript
db.createCollection("users")
```

## 🚀 Como Executar o Projeto
### 🔹 Clonar o Repositório
```bash
git clone https://github.com/seuusuario/seuprojeto.git
cd seuprojeto
```

### 🔹 Construir e Executar o Projeto
```bash
./mvnw spring-boot:run
```

O projeto será iniciado na porta **8080**.

## 📌 Testes
Para testar a API, utilize **Postman** ou **cURL**.
Exemplo de requisição para criar um usuário:
```json
POST /users
{
    "name": "Bob Brown",
    "email": "bob@gmail.com"
}
```

## 📜 Licença
Este projeto foi desenvolvido com fins educacionais, baseado no curso do professor **Nélio Alves** no [DevSuperior](https://devsuperior.com.br).

---
Desenvolvido por [Victor Hugo Aguiar Porfiro](https://github.com/VHAPorfirium). ✨

