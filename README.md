<p align="center">
  <img src="https://img.shields.io/badge/language-java-orange">
  <img src="https://img.shields.io/badge/framework-spring-brightgreen">
  <img src="https://img.shields.io/badge/license-MIT-blue">
</p>


## BackEnd Portafoly
Este es un proyecto backend de mi portafolio que utiliza las siguientes librerías:

-> Lifeway 1.0.0: una librería para manejar la gestión de usuarios y permisos en una aplicación web.
-> JPA 2.2.0: una librería para mapear objetos Java a una base de datos relacional.
-> MySQL Connector/J 8.0.26: un driver para conectarse a una base de datos MySQL.
-> Validation API 2.0.1.Final: una librería para validar datos de entrada en una aplicación.
-> Spring Security 5.5.0: un framework de seguridad para aplicaciones web.
-> JSON Web Token (JWT) 0.11.2: una librería para generar y validar tokens JWT.

## Requerimientos
Para poder ejecutar este proyecto, es necesario tener instalado lo siguiente:

-> Java 17 o superior
-> MySQL Server 8.0 o superior

## Configuración
Antes de ejecutar el proyecto, se deben realizar las siguientes configuraciones:

Crear una base de datos en MySQL con el nombre YOUR_DATABASE.
Configurar la conexión a la base de datos en el archivo application.properties que se encuentra en la carpeta src/main/resources:
application.propierties


> spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
> spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE
> spring.datasource.username=root
> spring.datasource.password=YOUR_PASSWORD

Ejecutar el archivo Main.java que se encuentra en la carpeta src/main/java. Esto hará que se corran las migraciones y se creen las tablas necesarias en la base de datos.
No es necesario crear ningún usuario manualmente, ya que el proyecto creará un usuario administrador por defecto (admin/admin) y se conectará a la base de datos configurada en el paso 2.

## Ejecución
Para ejecutar el proyecto, se debe correr el archivo Main.java que se encuentra en la carpeta src/main/java.

El proyecto utiliza migraciones para crear y actualizar las tablas en la base de datos. Al ejecutar la aplicación, las migraciones se corren automáticamente y se crean las tablas necesarias en la base de datos. Si hay alguna actualización en las migraciones, estas se correrán automáticamente en la siguiente ejecución de la aplicación.

## Notas adicionales
En el archivo application.properties se puede configurar la información de la base de datos, así como otras opciones de la aplicación.
La opción server.error.include-stacktrace está configurada en never para evitar mostrar información sensible en caso de errores. Se recomienda cambiar esta opción a always en entornos de desarrollo.
¡Listo! Con estas instrucciones deberías poder ejecutar el proyecto y realizar las migraciones sin problemas.



