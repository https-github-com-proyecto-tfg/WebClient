# Proyecto de Backend en Spring Boot para Gestión de Imágenes de Gatos

**Ciclo**: Desarrollo de Aplicaciones Web (DAW)  
**Alumno**: [Noelia Tinajero Ortiz]

## Índice

1. [Introducción](#introducción)
2. [Funcionalidades del Proyecto y Tecnologías Utilizadas](#funcionalidades-del-proyecto-y-tecnologías-utilizadas)
3. [Guía de Instalación](#guía-de-instalación)
4. [Guía de Uso](#guía-de-uso)
5. [Enlace a la Documentación](#enlace-a-la-documentación)
6. [Enlace a Figma de la Interfaz](#enlace-a-figma-de-la-interfaz)
7. [Conclusión](#conclusión)
8. [Contribuciones, Agradecimientos y Referencias](#contribuciones-agradecimientos-y-referencias)
9. [Licencias](#licencias)
10. [Contacto](#contacto)

## Introducción

**Descripción del Proyecto**: Este proyecto es un backend desarrollado en Spring Boot que proporciona una API para gestionar imágenes de gatos. Permite obtener imágenes aleatorias de gatos y un número limitado de imágenes según la petición del usuario.

**Justificación**: Proveer un backend robusto y escalable que soporte las funcionalidades de obtención de imágenes de gatos para aplicaciones que requieran este tipo de contenido.

**Objetivos**:
- Proveer un backend seguro y eficiente para la gestión de imágenes de gatos.
- Implementar un sistema de obtención de imágenes desde una API externa.
- Proveer endpoints para la integración con un frontend en React.

**Motivación**: Crear una solución completa para la gestión de imágenes de gatos que pueda ser utilizada en diversos proyectos y aplicaciones.

## Funcionalidades del Proyecto y Tecnologías Utilizadas

### Funcionalidades
- Obtener una imagen aleatoria de gato.
- Obtener un número limitado de imágenes de gatos.

### Tecnologías Utilizadas
- **Spring Boot**: Framework para la construcción del backend.
- **RestTemplate**: Para consumir APIs externas.
- **Maven**: Gestión de dependencias y construcción del proyecto.

## Guía de Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/https-github-com-proyecto-tfg/WebClient.git
    cd tu-repositorio-backend
    ```

2. Construye el proyecto usando Maven:

    ```bash
    mvn clean install
    ```

3. Configura el archivo `application.properties` en `src/main/resources` con los parámetros necesarios:

    ```properties
    # Configuración específica del proyecto
    ```

## Guía de Uso

Para iniciar la aplicación, ejecuta:

    ```bash
    mvn spring-boot:run
    ```

La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

### Endpoints disponibles:

- **GET /cat/image**: Obtiene una imagen aleatoria de gato.
  - **Response**: `{ "url": "string" }`

- **GET /cat/images**: Obtiene un número limitado de imágenes de gatos.
  - **Request Param**: `limit=int`
  - **Response**: `[ { "url": "string" }, ... ]`

## Enlace a la Documentación

[Documentación del Proyecto](CatApi.docx)

## Enlace a Figma de la Interfaz

[Diseño de Interfaz en Figma](https://www.figma.com/design/nVoF7Y4tbyNGQYX8rg9EpD/CatApi?node-id=0-1&t=yL39z6aUv5cEn1WC-0)

## Conclusión

Este proyecto backend en Spring Boot proporciona una API robusta y segura para la obtención de imágenes de gatos. Facilita la integración con un frontend en React y asegura una experiencia de usuario fluida.

## Contribuciones, Agradecimientos y Referencias

Agradecimientos especiales a mis profesores y compañeros que ayudaron en la realización de este proyecto.

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [RestTemplate Documentation](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html)

## Licencias

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## Contacto

**Nombre**: Noelia Tinajero Ortiz  
**Email**: noelia.tinajero@a.vedrunasevillasj.es 
**GitHub**: [NoeliaTinajeroOrtiz](https://github.com/NoeliaTinajeroOrtiz)
