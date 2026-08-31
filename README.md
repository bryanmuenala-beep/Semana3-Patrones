# Implementación comparativa de patrones de diseño

## Descripción

Este proyecto implementa y compara los patrones de diseño creacionales **Factory Method** y **Builder** aplicados a un Sistema de Gestión de Tutorías.

Factory Method permite gestionar diferentes mecanismos de notificación, mientras que Builder facilita la construcción de reservas con datos obligatorios y opcionales.

## Tecnologías utilizadas

- Java 17
- Apache Maven
- PlantUML
- Git
- GitHub
- Visual Studio Code

## Factory Method

Factory Method se utiliza para crear diferentes tipos de notificaciones sin depender directamente de clases concretas.

### Tipos de notificación implementados

- Correo electrónico
- SMS
- Notificación Push
- WhatsApp

### Estructura

- `Notificador`: Product
- `NotificadorCorreo`: ConcreteProduct
- `NotificadorSMS`: ConcreteProduct
- `NotificadorPush`: ConcreteProduct
- `NotificadorWhatsApp`: ConcreteProduct
- `CreadorNotificador`: Creator
- `CreadorCorreo`: ConcreteCreator
- `CreadorSMS`: ConcreteCreator
- `CreadorPush`: ConcreteCreator
- `CreadorWhatsApp`: ConcreteCreator

La incorporación de WhatsApp demuestra que el sistema puede extenderse agregando nuevas clases sin modificar las implementaciones existentes.

## Builder

Builder se utiliza para construir objetos `Reserva` de forma progresiva, legible y validada.

### Campos obligatorios

- Estudiante
- Tutor
- Fecha
- Hora

### Campos opcionales

- Modalidad
- Tema
- Observaciones

Los campos opcionales cuentan con valores predeterminados. Además, el método `build()` valida los campos obligatorios antes de crear una reserva.

## Ejecución

Compilar el proyecto:

```bash
mvn clean compile
```

Ejecutar Factory Method:

```bash
java -cp target/classes edu.uees.patrones.factory.DemoFactory
```

Ejecutar Builder:

```bash
java -cp target/classes edu.uees.patrones.builder.DemoBuilder
```

## Diagramas UML

Los diagramas se encuentran en la carpeta `docs`.

- `factory-method.puml`
- `factory-method.png`
- `builder.puml`
- `builder.png`

## Comparación

Factory Method se enfoca en decidir **qué tipo de objeto crear**, mientras que Builder se enfoca en **cómo construir y configurar un objeto complejo**.

Factory Method facilita la incorporación de nuevos tipos de notificación. Builder mejora la legibilidad y validación durante la creación de reservas.

## Conclusión

Factory Method y Builder solucionan problemas diferentes. Factory Method proporciona extensibilidad en la creación de notificadores, mientras que Builder permite construir reservas de manera clara, flexible y validada.

## Declaración de uso de inteligencia artificial

Para esta actividad utilicé herramientas de inteligencia artificial como apoyo para la estructuración del proyecto, explicación de los patrones de diseño, revisión del código y documentación. Revisé, probé y adapté el contenido generado, y puedo explicar y justificar el código y las decisiones presentadas.