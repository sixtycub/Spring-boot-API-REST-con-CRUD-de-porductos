# API REST de Productos - Spring Boot

API REST completa para gestión de productos usando Spring Boot y MySQL.

## Tecnologías
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate

## Endpoints
| Método | URL | Descripción |
|--------|-----|-------------|
| GET | /productos | Obtener todos los productos |
| POST | /productos | Crear un producto |
| PUT | /productos/{id} | Actualizar un producto |
| DELETE | /productos/{id} | Eliminar un producto |

## Cómo correr el proyecto
1. Clonar el repositorio
2. Crear base de datos MySQL llamada `springdemo`
3. Configurar credenciales en `application.properties`
4. Correr con `.\gradlew.bat bootRun`
