# Web App para CRUD de la entidad Producto con Jakarta EE

## Descripción

Este es un proyecto de aplicación web que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando implementaciones de **Jakarta Enterprise Edition (Jakarta EE)**: **Jakarta Faces** (con bibliotecas **PrimeFaces** y **PrimeFlex**), **Jakarta Enterprise Beans (EJB)**, **Jakarta Contexts and Dependency Injection (CDI)**, **Jakarta Persistence**, y **Jakarta Authentication / Jakarta Authorization (JAAS)**. La aplicación utiliza Maven para la gestión de dependencias y construcción del proyecto, y se despliega en un servidor de aplicaciones WildFly.

## Características Principales

- Implementación de CRUD para la entidad `Producto` utilizando varias implementaciones de **Jakarta EE**.
- Interfaz de usuario moderna y receptiva gracias a **Jakarta Faces**, junto a sus bibliotecas **PrimeFaces** y **PrimeFlex**.
- Uso de JPA con Hibernate como proveedor de persistencia en **Jakarta Persistence**.
- Integración con **CDI** para la inyección de dependencias y gestión de ciclo de vida.
- Definir el comportamiento y la accesibilidad de los servicios mediante **EJB**.
- Manejo de la autenticación y autorización con **JAAS**.
- Desarrollo realizado con el entorno de desarrollo integrado **IntelliJ IDEA**.
- Gestión de dependencias y construcción del proyecto facilitada con **Maven**.
- Configuración de DataSource con **MySQL** para la persistencia de datos.
- Despliegue en el servidor de aplicaciones **WildFly**.

## Tecnologías Utilizadas

[![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-10.0.0-blue)](https://jakarta.ee/)
[![Jakarta Faces](https://img.shields.io/badge/Jakarta%20Faces-4.0.1-blue)](https://eclipse-ee4j.github.io/faces/)
[![PrimeFaces](https://img.shields.io/badge/PrimeFaces-12.0.0-orange)](https://www.primefaces.org/)
[![PrimeFlex](https://img.shields.io/badge/PrimeFlex-2.0.0-green)](https://primefaces.org/primeflex/)
[![Jakarta Persistence](https://img.shields.io/badge/Jakarta%20Persistence-3.1-blue)](https://jakarta.ee/specifications/persistence/3.1/)
[![Jakarta Enterprise Beans](https://img.shields.io/badge/Jakarta%20Enterprise%20Beans-4.0-blue)](https://jakarta.ee/specifications/enterprise-beans/4.0/)
[![Jakarta CDI](https://img.shields.io/badge/Jakarta%20CDI-4.0-blue)](https://jakarta.ee/specifications/cdi/4.0/)
[![Jakarta Authentication](https://img.shields.io/badge/Jakarta%20Authentication-3.0-blue)](https://jakarta.ee/specifications/authentication/3.0/)
[![Jakarta Authorization](https://img.shields.io/badge/Jakarta%20Authorization-2.1-blue)](https://jakarta.ee/specifications/authorization/2.1/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-yellow)](https://maven.apache.org/)
[![WildFly](https://img.shields.io/badge/WildFly-32.0.0.Final-red)](https://www.wildfly.org/)
[![MySQL Workbench](https://img.shields.io/badge/MySQL%20Workbench-8.0.32-blueviolet)](https://www.mysql.com/products/workbench/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2024.1.1-blue)](https://www.jetbrains.com/idea/)

## Requisitos Previos

- JDK 21 instalado.
- IntelliJ IDEA 2024.1.1 instalado.
- MySQL Workbench 8.0.32 instalado.
- Base de datos MySQL configurada y accesible desde el servidor WildFly.
- Servidor de aplicaciones WildFly 32.0.0.Final configurado y ejecutándose.

## Configuración del Entorno de Desarrollo

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de Java preferido.
3. Configura tu servidor de aplicaciones WildFly en el IDE.
4. Configura el DataSource en WildFly para conectar con tu base de datos MySQL.
5. Compila y despliega la aplicación en el servidor WildFly.

## Estructura de Carpetas

```markdown
.
└── src
├── main
│   ├── java
│   │   └── org
│   │       └── mbohorquez
│   │           └── webapp
│   │               └── jsf3
│   │                   ├── configs
│   │                   │   ├── ProducerEntityManager.java
│   │                   │   └── ProducerResources.java
│   │                   ├── controllers
│   │                   │   ├── LenguajeController.java
│   │                   │   ├── LogoutController.java
│   │                   │   └── ProductoController.java
│   │                   ├── converters
│   │                   │   └── CategoriaConverter.java
│   │                   ├── models
│   │                   │   └── entities
│   │                   │       ├── Categoria.java
│   │                   │       └── Producto.java
│   │                   ├── repositories
│   │                   │   ├── CategoriaRepositoryImpl.java
│   │                   │   ├── CrudRepository.java
│   │                   │   ├── ProductoRepository.java
│   │                   │   └── ProductoRepositoryImpl.java
│   │                   └── services
│   │                       ├── ProductoService.java
│   │                       └── ProductoServiceImpl.java
│   ├── resources
│   │   ├── messages.properties
│   │   ├── messages_en.properties
│   │   ├── messages_es.properties
│   │   └── META-INF
│   │       └── persistence.xml
│   └── webapp
│       ├── form.xhtml
│       ├── index.xhtml
│       ├── login.xhtml
│       ├── loginError.xhtml
│       ├── resources
│       │   ├── css
│       │   │   └── bootstrap.min.css
│       │   ├── img
│       │   │   └── jakarta.png
│       │   └── js
│       │       └── bootstrap.bundle.min.js
│       └── WEB-INF
│           ├── web.xml
│           └── layouts
│               └── main.xhtml
└── test
├── .gitignore
├── pom.xml
└── README.md
```

## Jakarta Authentication | Jakarta Authorization (JAAS)
1. Ejecutar el comando `.\add-user.bat` para agregar los usuarios de aplicación a la configuración de seguridad del servidor, junto a ello se establecen sus roles respectivos.
2. Definir los componentes `login-config` y `security-constraint` en el archivo web.xml, la cual corresponde  una autenticación basada en formularios (FORM).
3. Crear el controlador LogoutController, la cual se va a usar en el menu item de cerrar sesión.
4. Realizar los cambios de los componentes del DOM de los archivos .jsf con el atributo `rendered` para poder obtener la autorización correspondiente, de acuerdo a los roles establecidos. 
5. Insertar el action `j_security_check` en el componente `form` que corresponde al formulario de login.


## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).


