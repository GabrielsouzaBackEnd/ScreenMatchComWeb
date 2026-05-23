# ScreenMatch - Aplicação Full Stack 🎬

Este repositório contém o ecossistema completo do **ScreenMatch**, uma aplicação robusta desenvolvida para catalogar, buscar e exibir informações detalhadas sobre séries de TV. 

O projeto evoluiu de uma ferramenta de linha de comando para uma aplicação **Full Stack**, integrando uma API REST em Java à uma interface web dinâmica e interativa em JavaScript.

---

## 🏗️ Arquitetura do Projeto

A aplicação segue o modelo de responsabilidade única e desacoplamento, organizada em dois módulos principais dentro deste repositório:

* **`ScreenMatchBack-end/`**: API REST responsável pelas regras de negócio, persistência de dados, consumo da API externa da OMDb e fornecimento dos endpoints em formato JSON.
* **`ScreenMatchFront-end/`**: Interface do usuário responsável por consumir os endpoints da API local, manipular o DOM de forma assíncrona e exibir as séries na tela.

---

## 🛠️ Tecnologias e Ferramentas

### Backend (Camada de Dados e API)
* **Java 17** & **Spring Boot 3** (Spring Data JPA, Spring Web)
* **Banco de Dados:** PostgreSQL (Persistência relacional)
* **Gerenciador de Dependências:** Maven
* **Integração Externa:** HttpClient para consumo da API do OMDb e biblioteca Jackson para desserialização de JSON.

### Frontend (Camada de Interface)
* **HTML5** & **CSS3** (Layout moderno com foco na experiência do usuário)
* **JavaScript (ES6+)** (Requisições assíncronas com `Fetch API` e funções `async/await`)

---

## 🚀 Funcionalidades Principais

1. **Busca e Cache Automático:** Ao pesquisar uma série na interface, o backend verifica se ela já existe no banco de dados. Caso não exista, busca na API do OMDb, trata os dados, salva no PostgreSQL e envia para a tela.
2. **Navegação Dinâmica por Temporadas:** O front-end carrega os episódios de forma reativa conforme o usuário altera o filtro de temporadas na tela.
3. **Organização Arquitetural:** Separação estrita de responsabilidades entre Controllers, Services, Repositories e DTOs (Data Transfer Objects) no Java.

---

## 🔧 Como Executar a Aplicação Localmente

Para rodar o ecossistema Full Stack na sua máquina, siga a ordem abaixo:

### 1. Pré-requisitos
* Ter o **Java 17+** instalado.
* Ter o **PostgreSQL** instalado e rodando localmente.
* Criar um banco de dados vazio chamado `screenmatch` (ou o nome configurado no seu `application.properties`).

### 2. Rodando o Backend
1. Abra a pasta `ScreenMatchBack-end` na sua IDE de preferência (como IntelliJ).
2. Configure suas credenciais do PostgreSQL no arquivo `src/main/resources/application.properties`.
3. Adicione sua chave da API do OMDb nas variáveis de ambiente, se necessário.
4. Execute o método `main` da classe principal do Spring Boot para iniciar o servidor local na porta `8080`.

### 3. Rodando o Frontend
1. Abra a pasta `ScreenMatchFront-end` no VS Code.
2. Certifique-se de que o backend já está rodando em `http://localhost:8080`.
3. Abra o arquivo `index.html` diretamente no seu navegador ou utilize a extensão **Live Server** do VS Code para rodar a interface.

---
