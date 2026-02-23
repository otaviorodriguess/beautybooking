# 💇‍♀️ BeautyBooking

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9-orange)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

> Sistema de **agendamento de serviços de beleza**, construído com **Java, Spring Boot e JPA**, para gerenciar clientes, profissionais e agendamentos de forma prática e organizada.

---

## 🔥 Funcionalidades Principais

- ✅ Cadastro e gerenciamento de **clientes**  
- ✅ Cadastro e gerenciamento de **profissionais**  
- ✅ Criação, edição e cancelamento de **agendamentos**  
- ✅ Persistência de dados com **JPA/Hibernate**  
- ✅ Estrutura modular e expansível para novos recursos  

---

## 🛠 Tecnologias Utilizadas

| Camada        | Tecnologias                  |
|---------------|-----------------------------|
| Backend       | Java 17, Spring Boot 3      |
| Persistência  | Spring Data JPA, Hibernate  |
| Banco de Dados| H2 (desenvolvimento) / PostgreSQL (produção) |
| Build         | Maven                        |
| Testes        | JUnit 5                      |

---

## 📂 Estrutura do Projeto


beautybooking/
├─ src/
│ ├─ main/
│ │ ├─ java/com/otavio/beautybooking/
│ │ │ ├─ controller/ # Controllers REST
│ │ │ ├─ model/ # Entidades JPA
│ │ │ ├─ repository/ # Repositórios JPA
│ │ │ └─ service/ # Serviços e regras de negócio
│ │ └─ resources/
│ │ └─ application.properties
├─ pom.xml
├─ .gitignore
└─ README.md


---

## 🚀 Como Rodar Localmente

1. Clone o projeto:

```bash
git clone https://github.com/otaviorodriguess/beautybooking.git
cd beautybooking

Instale dependências e execute:

mvn clean install
mvn spring-boot:run

A API estará disponível em:

http://localhost:8080
🔗 Exemplos de Requisições
Criar Cliente
POST /clientes
Content-Type: application/json

{
  "nome": "Maria Silva",
  "email": "maria@email.com",
  "telefone": "11999999999"
}

Resposta:

{
  "id": 1,
  "nome": "Maria Silva",
  "email": "maria@email.com",
  "telefone": "11999999999"
}
Criar Agendamento
POST /agendamentos
Content-Type: application/json

{
  "clienteId": 1,
  "profissionalId": 2,
  "servico": "Corte de cabelo",
  "data": "2026-03-01T14:30:00"
}
📌 Próximos Passos / Roadmap

🎨 Criar frontend com React + Vite

🔐 Implementar autenticação JWT

📊 Dashboards para agendamentos e relatórios

📱 Disponibilizar app mobile

🤝 Contribuição

Faça um fork do projeto

Crie uma branch (git checkout -b feature/nova-funcionalidade)

Faça o commit das alterações (git commit -m "Adicionar nova funcionalidade")

Faça push para sua branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request

Desenvolvedor:

Otavio Rodrigues 
