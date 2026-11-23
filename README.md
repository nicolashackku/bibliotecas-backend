# bibliotecas-backend

API REST con Spring Boot, JPA y H2.

## Requisitos
- Java 21
- Maven 3.9+

## Ejecución

```
mvn spring-boot:run
```

Disponible en http://localhost:8081

## Endpoints
- `POST /bibliotecas` registra una biblioteca. Body: `{"nombre":"","direccion":"","ciudad":""}`
- `GET /bibliotecas` consulta las bibliotecas con sus libros.
