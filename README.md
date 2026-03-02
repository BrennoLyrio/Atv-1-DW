# AutoManager — Atividade I: CRUDs com Spring Boot

Sistema de gerenciamento automotivo desenvolvido com **Java + Spring Boot**, implementando operações CRUD completas para as entidades principais do domínio.

## 📋 Sobre o Projeto

Primeira atividade da série AutoManager (disciplina de Desenvolvimento Web — FATEC São José dos Campos). O objetivo foi estruturar uma API REST com Spring Boot, separando responsabilidades em controllers e repositórios, com persistência em banco de dados relacional.

## 🛠 Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Web (REST)
- Maven
- MySQL / H2

## 📦 Estrutura do Projeto

```
src/main/java/com/autobots/automanager/
├── controles/         # Controllers REST (endpoints da API)
│   ├── ClienteControle.java
│   ├── DocumentoControle.java
│   ├── EnderecoControle.java
│   └── TelefoneControle.java
├── entidades/         # Entidades JPA (mapeamento do banco)
├── modelo/            # Classes auxiliares e utilitários
├── repositorios/      # Interfaces Spring Data JPA
└── AutomanagerApplication.java
```

## 🔗 Endpoints Implementados

### Cliente
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/clientes` | Lista todos os clientes |
| GET | `/clientes/{id}` | Busca cliente por ID |
| POST | `/clientes` | Cadastra novo cliente |
| PUT | `/clientes/{id}` | Atualiza cliente |
| DELETE | `/clientes/{id}` | Remove cliente |

### Documento
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/documentos` | Lista todos os documentos |
| POST | `/documentos` | Cadastra documento |
| PUT | `/documentos/{id}` | Atualiza documento |
| DELETE | `/documentos/{id}` | Remove documento |

### Endereço
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/enderecos` | Lista todos os endereços |
| POST | `/enderecos` | Cadastra endereço |
| PUT | `/enderecos/{id}` | Atualiza endereço |
| DELETE | `/enderecos/{id}` | Remove endereço |

### Telefone
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/telefones` | Lista todos os telefones |
| POST | `/telefones` | Cadastra telefone |
| PUT | `/telefones/{id}` | Atualiza telefone |
| DELETE | `/telefones/{id}` | Remove telefone |

## ▶️ Como Executar

```bash
# Clonar o repositório
git clone https://github.com/BrennoLyrio/Atv-1-DW.git

# Entrar na pasta do projeto
cd Atv-1-DW/automanager

# Executar com Maven Wrapper
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`

## 🧪 Testando com Postman

Importe os endpoints no Postman e utilize o body abaixo como exemplo para criação de cliente:

```json
{
  "nome": "João Silva",
  "nomeSocial": "João"
}
```

## 👤 Autor

**Brenno Rosa Lyrio de Oliveira**  
[GitHub](https://github.com/BrennoLyrio) · [LinkedIn](https://linkedin.com/in/brennolyrio)  
FATEC — Desenvolvimento de Software Multiplataforma · 2024–2026
