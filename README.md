# Smart Inventory & Billing Management System

A backend system for small shops and vendors to manage product stock, get low-stock alerts, and generate customer bills.

## Tech Stack
Java 17, Spring Boot 3, Spring Data JPA, PostgreSQL (Neon), Spring Security (JWT), Maven

## Status
In development. Building one feature per day.

## Progress
- [x] Project setup (Spring Boot, Maven)
- [x] Cloud PostgreSQL connection (Neon)
- [x] Product CRUD
- [ ] Low-stock alerts
- [ ] Billing with automatic stock deduction
- [ ] JWT authentication with Admin and Staff roles
- [ ] Dashboard summary
- [ ] Web UI
- [ ] Deployment

## Configuration
The app reads database settings from environment variables, so no credentials are stored in the code:

| Variable | Description |
|----------|-------------|
| `DB_URL` | JDBC URL of the PostgreSQL database |
| `DB_USERNAME` | Database username |
| `DB_PASSWORD` | Database password |

## Run locally
```bash
./mvnw spring-boot:run
```