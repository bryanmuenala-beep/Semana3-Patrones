# Sistema de Gestión de Tutorías - Incremento 1

## Descripción

Este proyecto corresponde al primer incremento del Sistema de Gestión de Tutorías. El objetivo es aplicar principios de diseño orientado a objetos y patrones de diseño para mantener un sistema organizado, extensible y con bajo acoplamiento.

El proyecto parte de la implementación desarrollada anteriormente con los patrones Factory Method y Builder, e incorpora los patrones Observer y Strategy para resolver nuevas necesidades del sistema.

## Tecnologías utilizadas

- Java 17
- Apache Maven
- PlantUML
- Git
- GitHub
- Visual Studio Code

## Alcance del incremento

En este incremento se mantienen Factory Method y Builder porque continúan resolviendo problemas del sistema.

Además, se incorporan:

- Observer para permitir que varios componentes reaccionen cuando cambia el estado de una reserva.
- Strategy para manejar diferentes políticas de cancelación de tutorías.

## Patrones de diseño

### Factory Method

Factory Method permite crear diferentes mecanismos de notificación sin que el sistema dependa directamente de clases concretas.

Tipos implementados:

- Correo electrónico
- SMS
- Notificación Push
- WhatsApp

La incorporación de nuevos mecanismos de notificación puede realizarse agregando nuevas implementaciones sin modificar las existentes.

### Builder

Builder permite construir objetos `Reserva` de manera progresiva, legible y validada.

Campos obligatorios:

- Estudiante
- Tutor
- Fecha
- Hora

Campos opcionales:

- Modalidad
- Tema
- Observaciones

El método `build()` valida los datos obligatorios antes de crear la reserva.

### Observer

Observer se utiliza para permitir que varios componentes reaccionen automáticamente cuando cambia el estado de una reserva.

Componentes principales:

- `ObservadorReserva`
- `ReservaObservable`
- `ObservadorNotificacion`
- `ObservadorCalendario`
- `ObservadorPanel`

Cuando una reserva cambia de estado, los observadores registrados son notificados sin que `ReservaObservable` dependa directamente de sus implementaciones concretas.

### Strategy

Strategy se utiliza para encapsular diferentes políticas de cancelación de tutorías.

Políticas implementadas:

- `CancelacionNormal`: requiere al menos 24 horas de anticipación.
- `CancelacionPrioritaria`: requiere al menos 2 horas de anticipación.
- `CancelacionGrupal`: requiere al menos 48 horas de anticipación.

`GestorCancelacion` trabaja mediante la interfaz `PoliticaCancelacion`, permitiendo cambiar la política sin modificar la lógica principal del gestor.

## Principios SOLID

### Open/Closed Principle (OCP)

El sistema permite incorporar nuevos observadores, mecanismos de notificación y políticas de cancelación mediante nuevas clases sin modificar innecesariamente las implementaciones existentes.

### Dependency Inversion Principle (DIP)

Las clases principales dependen de abstracciones como `Notificador`, `ObservadorReserva` y `PoliticaCancelacion`, reduciendo la dependencia directa de implementaciones concretas.

### Single Responsibility Principle (SRP)

Las responsabilidades se distribuyen entre diferentes clases. Las políticas de cancelación contienen las reglas de cancelación, los observadores reaccionan a los cambios de las reservas y los notificadores gestionan sus respectivos mecanismos de comunicación.

## Cohesión y acoplamiento

Las clases mantienen responsabilidades específicas, favoreciendo una alta cohesión.

El uso de interfaces como `Notificador`, `ObservadorReserva` y `PoliticaCancelacion` reduce el acoplamiento entre los componentes y facilita la extensión del sistema.

## Estructura de paquetes

```text
edu.uees.patrones
├── builder
│   ├── Reserva
│   ├── ReservaBuilder
│   └── DemoBuilder
├── factory
│   ├── Notificador
│   ├── NotificadorCorreo
│   ├── NotificadorSMS
│   ├── NotificadorPush
│   ├── NotificadorWhatsApp
│   ├── CreadorNotificador
│   └── DemoFactory
├── observer
│   ├── ObservadorReserva
│   ├── ObservadorNotificacion
│   ├── ObservadorCalendario
│   ├── ObservadorPanel
│   ├── ReservaObservable
│   └── DemoObserver
└── strategy
    ├── PoliticaCancelacion
    ├── CancelacionNormal
    ├── CancelacionPrioritaria
    ├── CancelacionGrupal
    ├── GestorCancelacion
    └── DemoStrategy
```

## Compilación y ejecución

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

Ejecutar Observer:

```bash
java -cp target/classes edu.uees.patrones.observer.DemoObserver
```

Ejecutar Strategy:

```bash
java -cp target/classes edu.uees.patrones.strategy.DemoStrategy
```

## Diagrama UML

El UML actualizado del Incremento 1 se encuentra en:

- `docs/uml-incremento1.puml`
- `docs/uml-incremento1.png`

El diagrama representa las clases, interfaces y relaciones correspondientes a Factory Method, Builder, Observer y Strategy.

## Verificación

El proyecto fue compilado mediante:

```bash
mvn clean compile
```

obteniendo como resultado:

```text
BUILD SUCCESS
```

También se ejecutaron `DemoObserver` y `DemoStrategy` para comprobar el comportamiento de los patrones incorporados.

## Conclusión

Este incremento permitió evolucionar el Sistema de Gestión de Tutorías incorporando nuevos comportamientos sin aumentar innecesariamente el acoplamiento entre las clases.

Observer permite que diferentes componentes reaccionen ante cambios en las reservas, mientras que Strategy permite modificar las políticas de cancelación de forma independiente. Factory Method y Builder se mantienen porque continúan resolviendo necesidades existentes del sistema.

## Declaración de uso de inteligencia artificial

Para esta actividad utilicé herramientas de inteligencia artificial como apoyo para la estructuración del proyecto, explicación de los patrones de diseño, revisión del código, UML y documentación. Revisé, probé y adapté el contenido generado, y puedo explicar y justificar el código y las decisiones presentadas.