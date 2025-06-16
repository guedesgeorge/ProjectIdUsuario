# 🧪 testeProject – API REST com Spring Boot + MongoDB

Este é um projeto simples de uma API REST desenvolvida com **Spring Boot** e banco de dados **MongoDB Atlas**, permitindo cadastrar, listar, atualizar e deletar usuários via HTTP.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.5
- Spring Web
- Spring Data MongoDB
- MongoDB Atlas (nuvem)
- Maven

---

## 📁 Estrutura do Projeto

src/ 

├── main/

│ ├── java/httpprotocolo/demo/

│ │ ├── DemoApplication.java

│ │ ├── Usuario.java

│ │ ├── UsuarioController.java

│ │ └── UsuarioRepository.java

│ └── resources/

│ └── application.properties

yaml
Copiar
Editar

---

## 🔧 Configuração do `application.properties`

```properties
spring.data.mongodb.uri=mongodb+srv://<USUARIO>:<SENHA>@cluster0.pqi5uqx.mongodb.net/testeProject?retryWrites=true&w=majority&appName=Cluster0
server.port=8080
📮 Endpoints da API
▶️ GET /usuarios
Lista todos os usuários cadastrados.

📥 POST /usuarios
Adiciona um novo usuário.

Body (JSON):

json
Copiar
Editar
{
  "nome": "Maria Teste",
  "email": "maria@email.com"
}
✏️ PUT /usuarios/{id}
Atualiza um usuário existente com base no ID.

Body (JSON):

json
Copiar
Editar
{
  "nome": "Novo Nome",
  "email": "novo@email.com"
}
❌ DELETE /usuarios/{id}
Remove um usuário pelo ID.

 ## 🧪 Testando com Postman
Abra o Postman.

Escolha o método (GET, POST, PUT, DELETE).

Use a URL base: http://localhost:8080/usuarios

Envie o corpo da requisição no formato JSON (para POST/PUT).

Veja o resultado e confirme no MongoDB Atlas em Collections.

## 🗃️ Acessando os dados no MongoDB Atlas
Acesse https://cloud.mongodb.com

Vá até seu projeto testeProject.

Clique em Clusters > Collections

Escolha o banco e depois a coleção usuarios.

## 🧠 Autor
George Emannuel Guedes de Carvalho
Ciência da Computação – UCDB
Desenvolvido após o curso de Bootcamp Rocketseat ( Java )

