# ⚙️ Banco de Imagens – Back-end

Este é o repositório do **back-end** do projeto *Banco de Imagens*, uma API RESTful criada com **Spring Boot** e conectada a um banco de dados **MySQL**. Ela oferece operações CRUD para gerenciar uma galeria de imagens.

## 📌 Funcionalidades da API

- `GET /api/imagens` – Retorna todas as imagens cadastradas
- `POST /api/imagens` – Adiciona uma nova imagem
- `PUT /api/imagens/{id}` – Atualiza uma imagem existente
- `DELETE /api/imagens/{id}` – Remove uma imagem pelo ID

## 🧱 Estrutura do Projeto

- **Model:** `ImagemModel.java`
- **Repository:** `ImagemRepository.java`
- **Service:** `ImagemService.java`
- **Controller:** `ImagemController.java`

## 📦 Dependências

- Spring Web
- Spring Data JPA
- MySQL Driver

## 📌 Pré-requisitos

- Java 17+
- Maven
- MySQL Server com banco `banco_imagens` já criado (o script está incluído no repositório)

## 🚀 Como Executar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/backend-banco-imagens.git
cd backend-banco-imagens

# Configure o application.properties (src/main/resources)
# Exemplo de configuração:
# spring.datasource.url=jdbc:mysql://localhost:3306/banco_imagens
# spring.datasource.username=root
# spring.datasource.password=SUASENHA
# spring.jpa.hibernate.ddl-auto=update

# Rode o projeto
./mvnw spring-boot:run
