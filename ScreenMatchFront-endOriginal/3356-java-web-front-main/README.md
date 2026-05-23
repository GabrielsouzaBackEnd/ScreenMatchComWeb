
# ScreenMatch - Front-end 🎬

Esta é a camada de interface do usuário (Front-end) do projeto **ScreenMatch**, desenvolvida para consumir e exibir de forma dinâmica os dados fornecidos pela API do back-end em Java Spring Boot.

O principal objetivo desta aplicação é listar séries, carregar detalhes de temporadas/episódios e gerenciar a exibição dos dados vindos de um banco de dados PostgreSQL.

---

## 🛠️ Tecnologias Utilizadas

* **HTML5:** Estruturação semântica da página.
* **CSS3:** Estilização, layout responsivo e design moderno para exibição dos cards de séries.
* **JavaScript (ES6+):** Lógica de programação para consumo da API (usando `fetch`), manipulação assíncrona (`async/await`) e atualização dinâmica do DOM.

---

## 🚀 Funcionalidades Implementadas

* **Consumo de API:** Comunicação assíncrona com o servidor Java local (`http://localhost:8080`).
* **Listagem Dinâmica:** Renderização automática dos cards das séries cadastradas no banco de dados.
* **Filtros e Detalhes:** Navegação dinâmica para carregar episódios específicos de cada temporada sem recarregar a página.

---

## 📁 Estrutura do Projeto

A organização dos arquivos desta camada segue a seguinte estrutura:

```text
├── css/             # Arquivos de estilização da interface (styles.css, etc)
├── scripts/         # Lógica em JavaScript (chamadas da API e manipulação do HTML)
├── index.html       # Página principal da aplicação
└── detalhe.html     # Página de detalhes da série/temporadas
