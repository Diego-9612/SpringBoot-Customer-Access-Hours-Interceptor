# SpringBoot-Customer-Access-Hours-Interceptor
Este proyecto es una demostración de cómo controlar el acceso a una aplicación web basada en Spring Boot mediante un interceptor HTTP que valida si las solicitudes se realizan dentro del horario de atención al cliente. El interceptor bloquea el acceso fuera del horario y devuelve una respuesta JSON personalizada, mientras que durante el horario de atención permite el acceso normal.

## Características

- Control del acceso basado en horarios configurables.
- Devolución de una respuesta JSON personalizada cuando las solicitudes se realizan fuera del horario de atención.
- Mensaje de bienvenida para los usuarios que accedan dentro del horario permitido.
- Configuración de horas de apertura y cierre a través de el archivo de propiedades de Spring Boot.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Maven**
- **Jakarta Servlet**
- **Jackson (para la conversión a JSON)**

## Endpoints

- `/app/inter`: Este es el único endpoint del sistema. Si se accede dentro del horario de atención, se devuelve un mensaje de bienvenida. Si se accede fuera de horario, se devuelve un mensaje JSON informando que el servicio está cerrado.

## ¿Cómo funciona?

Este proyecto utiliza un interceptor llamado `CalendarInterceptor` que:
1. **Antes del controlador (`preHandle`)**: 
   - Verifica si la solicitud se realiza dentro del horario de atención al cliente.
   - Si la solicitud se realiza dentro del horario, permite continuar la ejecución.
   - Si la solicitud se realiza fuera del horario, bloquea el acceso y devuelve una respuesta JSON personalizada que indica que el servicio está fuera de servicio, especificando el horario de atención.
2. **Después del controlador (`postHandle`)**: En este caso, no se realiza ninguna acción adicional después de que el controlador maneja la solicitud.


