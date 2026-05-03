# 🌤️ Aplicação Clima

Aplicação web que exibe as condições climáticas atuais de qualquer cidade, com suporte a busca por nome ou detecção automática por geolocalização. O acesso é protegido por autenticação OAuth2. 

Link da aplicação web: https://weather-foreacast.onrender.com

---

## ✨ Funcionalidades

- 🔍 Busca de clima por nome de cidade
- 📍 Detecção automática de localização via geolocalização do navegador
- 🔐 Autenticação e autorização com OAuth2 + Spring Security
- 🌡️ Exibição de temperatura, umidade e condições do tempo
- 🐳 Containerização com Docker

---

## 🛠️ Tecnologias

**Back-End**<br/>
<img src="https://skillicons.dev/icons?i=java,spring&theme=dark" alt="Java e Spring"/>

**Front-End**<br/>
<img src="https://skillicons.dev/icons?i=html&theme=dark" alt="HTML"/>

**DevOps & Ferramentas**<br/>
<img src="https://skillicons.dev/icons?i=docker,git&theme=dark" alt="Docker e Git"/>

| Tecnologia | Versão |
|---|---|
| Java | 17 |
| Spring Boot | 3.1.3 |
| Spring MVC | — |
| Spring Security | — |
| OAuth2 Client | — |
| Thymeleaf | — |
| Lombok | 1.18.28 |
| Docker | — |

**API Externa:** [OpenWeatherMap](https://openweathermap.org/api)

---

## 🚀 Como rodar o projeto

### Pré-requisitos

- Java 17+
- Maven
- Docker (opcional)
- Chave de API do [OpenWeatherMap](https://openweathermap.org/api)

### 1. Clone o repositório

```bash
git clone https://github.com/Allan-de-Andrade/Aplicacao-Clima.git
cd Aplicacao-Clima
```

### 2. Configure as variáveis de ambiente

Crie ou edite o arquivo `src/main/resources/application.properties`:

```properties
openweather.api.key=SUA_CHAVE_AQUI

spring.security.oauth2.client.registration.google.client-id=SEU_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=SEU_CLIENT_SECRET
```

### 3. Execute com Maven

```bash
./mvnw spring-boot:run
```

### 4. Ou execute com Docker

```bash
docker build -t aplicacao-clima .
docker run -p 8080:8080 aplicacao-clima
```

Acesse em: `http://localhost:8080`

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── com/allan/
    │       ├── controller/   # Controllers Spring MVC
    │       ├── service/      # Regras de negócio e chamadas à API
    │       └── model/        # DTOs e modelos de dados
    └── resources/
        ├── templates/        # Views Thymeleaf
        └── application.properties
```

---

## 👤 Autor

Feito por **Allan Victor** · [GitHub](https://github.com/Allan-de-Andrade) · [Email](mailto:allanvictorsilvaandrade@gmail.com)
