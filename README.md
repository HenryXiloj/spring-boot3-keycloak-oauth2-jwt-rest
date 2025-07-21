# Spring Boot 3 + Keycloak OAuth2 JWT Authentication

A comprehensive example demonstrating OAuth2 Resource Server implementation with Spring Boot 3, Spring Security 6.1, Keycloak 22, supporting both GraphQL and REST APIs with Angular 16 frontend.

📘 Blog Post: [Securing GraphQL / REST APIs with OAuth2 Resource Server Spring Security 6.1 & Keycloak 22 & Angular 16](https://jarmx.blogspot.com/2023/07/securing-graphql-rest-apis-with-oauth2.html)

## 📋 Table of Contents
- [Overview](#overview)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Quick Start](#quick-start)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Security Features](#security-features)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [Resources](#resources)

## 🎯 Overview

This project demonstrates how to secure both GraphQL and REST APIs using OAuth2 Resource Server with Spring Security 6.1 and Keycloak 22 as the authorization server. The implementation includes role-based access control and JWT token validation.

### Key Features
- **Dual API Support**: Both GraphQL and REST endpoints in separate services
- **OAuth2 Resource Server**: JWT-based authentication and authorization
- **Role-Based Access Control**: ADMIN and USER roles with method-level security
- **Angular Frontend**: Complete web application with authentication flow
- **Keycloak Integration**: OpenID Connect provider for identity management
- **CORS Configuration**: Proper cross-origin resource sharing setup

## 🏗️ Architecture

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Angular 16    │    │  Keycloak 22    │    │  Spring Boot    │
│   Frontend      │◄──►│  Auth Server    │◄──►│  GraphQL API    │
│   (Port 4200)   │    │  (Port 8080)    │    │  (Port 8081)    │
└─────────────────┘    └─────────────────┘    └─────────────────┘
                                ▲                       │
                                │                       │
                                └───────────────────────┼──────┐
                                                        │      │
                                              ┌─────────▼──────▼─┐
                                              │  Spring Boot    │
                                              │   REST API      │
                                              │  (Port 8082)    │
                                              └─────────────────┘
```

## 🛠️ Technologies Used

### Backend
- **Spring Boot**: 3.1.1
- **Spring Security**: 6.1
- **Java**: 17
- **Maven**: Build tool
- **OAuth2 Resource Server**: JWT validation
- **GraphQL**: API query language
- **Spring Boot Starter Web**: REST API

### Frontend
- **Angular**: 16
- **Angular Material**: UI components
- **TypeScript**: Programming language
- **Node.js**: 18
- **NPM**: 9

### Infrastructure
- **Keycloak**: 22.0.0 (Identity and Access Management)
- **Docker**: Containerization
- **CORS**: Cross-origin resource sharing

## 📁 Project Structure

```
spring-boot3-keycloak-oauth2-jwt-rest/
├── spring-boot-graphql-api/          # GraphQL API Service (Port 8081)
│   ├── src/main/java/
│   │   ├── configuration/            # Security & CORS configuration
│   │   ├── controller/               # GraphQL controllers
│   │   ├── dto/                      # Data Transfer Objects
│   │   └── resolver/                 # GraphQL resolvers
│   └── src/main/resources/
│       ├── application.yml           # Application configuration
│       └── graphql/schema.graphqls   # GraphQL schema
├── spring-boot-rest-api/             # REST API Service (Port 8082)
│   ├── src/main/java/
│   │   ├── configuration/            # Security configuration
│   │   ├── controller/               # REST controllers
│   │   ├── dto/                      # Data Transfer Objects
│   │   └── services/                 # Business logic
│   └── src/main/resources/
│       └── application.yml           # Application configuration
├── angular-frontend/                 # Angular 16 Frontend
│   ├── src/app/
│   │   ├── components/               # UI components
│   │   ├── services/                 # HTTP services
│   │   ├── guards/                   # Route guards
│   │   └── interceptors/             # HTTP interceptors
│   └── src/environments/             # Environment configs
└── keycloak/
    └── realm.json                    # Keycloak realm configuration
```

## 📋 Prerequisites

- **Java 17** or higher
- **Maven 3.6+**
- **Node.js 18+** and **NPM 9+**
- **Docker** (for Keycloak)
- **Git**

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone <repository-url>
cd spring-boot3-keycloak-oauth2-jwt-rest
```

### 2. Start Keycloak Server
```bash
docker run -p 8080:8080 \
  -e KEYCLOAK_ADMIN=admin \
  -e KEYCLOAK_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:22.0.0 start-dev
```

### 3. Configure Keycloak
1. Access Keycloak Admin Console: http://localhost:8080
2. Login with `admin/admin`
3. Create a new realm named `demo`
4. Create client `spring-boot-keycloak` with OpenID Connect
5. Create roles: `ADMIN`, `USER`
6. Create users: `admin` (ADMIN role), `henry` (USER role)

> **Quick Setup**: Import the provided `realm.json` file for automatic configuration

### 4. Start Backend Services

**GraphQL API (Port 8081):**
```bash
cd spring-boot-graphql-api
mvn spring-boot:run
```

**REST API (Port 8082):**
```bash
cd spring-boot-rest-api
mvn spring-boot:run
```

### 5. Start Angular Frontend
```bash
cd angular-frontend
npm install
ng serve
```

Access the application at http://localhost:4200

## ⚙️ Configuration

### Backend Configuration
Both services use similar OAuth2 Resource Server configuration:

```yaml
spring:
  security:
    oauth2:
      resource-server:
        jwt:
          issuer-uri: http://localhost:8080/realms/demo
          jwk-set-uri: http://localhost:8080/realms/demo/protocol/openid-connect/certs
```

### Frontend Configuration
Update `environment.ts` with your Keycloak client secret:

```typescript
export const environment = {
  production: false,
  client_ID: "spring-boot-keycloak",
  client_secret: "YOUR_CLIENT_SECRET", // Replace with actual secret
  grant_type: "password",
  keycloakEndpoint: "http://localhost:8080/realms/demo/protocol/openid-connect/token",
  graphql_api: "http://localhost:8081/graphql",
  rest_api: "http://localhost:8082/"
};
```

## 🔗 API Endpoints

### GraphQL API (Port 8081)
- **Endpoint**: `http://localhost:8081/graphql`
- **GraphiQL**: `http://localhost:8081/graphiql` (enabled in development)

**Available Queries:**
```graphql
query {
  getName          # Requires USER or ADMIN role
  getJWTByUser {   # Requires ADMIN role only
    sub
    name
    email
    realmAccess {
      roles
    }
    # ... other JWT claims
  }
}
```

### REST API (Port 8082)
- **GET** `/api/name` - Get user name (USER/ADMIN)
- **GET** `/api/principal` - Get JWT user details (USER/ADMIN)
- **GET** `/admin/**` - Admin endpoints (ADMIN only)

## 🧪 Testing

### Using Postman
1. **Get Access Token:**
   - URL: `http://localhost:8080/realms/demo/protocol/openid-connect/token`
   - Method: POST
   - Auth Type: OAuth 2.0
   - Grant Type: Password Credentials
   - Client ID: `spring-boot-keycloak`
   - Client Secret: `your_client_secret`
   - Username: `admin` / `henry`
   - Password: `admin` / `henry`

2. **Test GraphQL:**
   - URL: `http://localhost:8081/graphql`
   - Headers: `Authorization: Bearer <access_token>`
   - Body: GraphQL query

3. **Test REST API:**
   - URL: `http://localhost:8082/api/name`
   - Headers: `Authorization: Bearer <access_token>`

### Using Angular Frontend
1. Navigate to http://localhost:4200
2. Login with `admin/admin` or `henry/henry`
3. Test both GraphQL and REST API integrations

## 🔐 Security Features

- **JWT Token Validation**: Automatic token verification against Keycloak
- **Role-Based Access Control**: Method-level security with `@PreAuthorize`
- **CORS Configuration**: Proper cross-origin resource sharing
- **Token Interceptors**: Automatic token attachment to requests
- **Route Guards**: Frontend route protection
- **Error Handling**: Proper 401/403 error management

### Security Configuration Highlights
```java
@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
public String getName(JwtAuthenticationToken jwt) { ... }

@PreAuthorize("hasAnyRole('ADMIN')")
public JWTTokenDto getJWTByUser(JwtAuthenticationToken jwt) { ... }
```

## 🚢 Deployment

### Docker Deployment
```bash
# Build and run with Docker Compose
docker-compose up -d
```

### Production Considerations
- Configure proper CORS origins (remove wildcards)
- Use HTTPS for all communications
- Set up proper Keycloak realm for production
- Configure appropriate JWT expiration times
- Implement refresh token rotation

## 📚 Resources

### Documentation
- [Spring Security OAuth2 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html)
- [Keycloak Documentation](https://www.keycloak.org/documentation)
- [GraphQL Java Documentation](https://www.graphql-java.com/)
- [Angular Security Guide](https://angular.io/guide/security)

### Related Articles
- [Securing GraphQL / REST APIs with OAuth2 Resource Server Spring Security 6.1 & Keycloak 22 & Angular 16](https://jarmx.blogspot.com/2023/07/securing-graphql-rest-apis-with-oauth2.html)

### JWT Tools
- [JWT.io](https://jwt.io) - JWT token decoder and validator

---

**Note**: This is a demonstration project for educational purposes. For production use, ensure proper security configurations and follow best practices.
