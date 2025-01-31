# Bienvenido a Softtek

## template-java
Plantilla para crear un namespace preparado para Java Springboot.

## Descripción
Este proyecto es una plantilla básica para aplicaciones Spring Boot, diseñada para facilitar el desarrollo de aplicaciones Java con Spring Boot. Incluye configuraciones iniciales y dependencias comunes para empezar rápidamente.

## Estructura del Proyecto
- **src/main/java**: Contiene el código fuente de la aplicación.
  - **com.softtek.demo**: Paquete principal de la aplicación.
    - [`DemoApplication`](src/main/java/com/softtek/demo/DemoApplication.java): Clase principal que inicia la aplicación Spring Boot.
- **src/main/resources**: Contiene recursos estáticos y archivos de configuración.
  - [`application.properties`](src/main/resources/application.properties): Archivo de configuración de Spring Boot.
- **src/test/java**: Contiene las pruebas unitarias.
  - **com.softtek.demo**: Paquete de pruebas.
    - [`DemoApplicationTests`](src/test/java/com/softtek/demo/DemoApplicationTests.java): Pruebas unitarias para la aplicación.
- **src/test/resources**: Contiene recursos de prueba.
  - [`application-test.properties`](src/test/resources/config/application-test.properties): Archivo de configuración para pruebas.

## Dependencias Principales
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Web
- H2 Database
- Lombok
- JUnit 5
- Mockito

## Requisitos
- Java 21
- Maven

## Ejecutar los tests
```sh
mvn test
```

## Cómo Ejecutar
Para construir y ejecutar la aplicación, usa los siguientes comandos:

```sh
mvn clean install
mvn spring-boot:run
```
## Abrir navegador
Accede al plugin Spring Boot Dashboard (El que tiene un icono exagonal)
En APPS/demo al situar el ratón por encima aparecerá un link (bola del mundo) lo pulsas y te abre el navegador. Añades a la url swagger-ui.html.
https://nombreNamespace-8080.app.githubdev/swagger-ui.html
https://redesigned-system-v5rwvp495q4fw56-8080.app.github.dev/swagger-ui.html
