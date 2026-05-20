# Introducción a la Programación Orientada a Objetos (Repaso 6)

Programa en Java que implementa el paradigma de Programación Orientada a Objetos (POO) mediante la creación de una clase personalizada y la gestión de sus instancias.

## 🚀 Funcionalidades
* **Modelado de Datos:** Define una clase `Persona` con atributos privados (`nombre`, `edad`) para representar entidades del mundo real.
* **Encapsulamiento:** Implementa constructores parametrizados y métodos de acceso (*Getters* y *Setters*) para asegurar una gestión correcta de los datos.
* **Comportamiento de Clase:** Incluye un método `saludar()` que define una acción específica que los objetos de tipo `Persona` pueden realizar.
* **Entrada Segura:** El programa principal valida la entrada de la edad mediante un bucle `do-while`, garantizando que solo se creen objetos con datos numéricos válidos.

## 🛠️ Estructura técnica
El código demuestra conceptos clave de la arquitectura de software en Java:
* **Instanciación:** Uso de la palabra clave `new` para crear un objeto específico en memoria basado en la plantilla de la clase.
* **Manejo de Constructores:** Utiliza `this` para diferenciar los atributos de la clase de los parámetros recibidos durante la creación del objeto.
* **Captura de Excepciones:** Gestiona `InputMismatchException` para robustecer la fase de recolección de datos previa a la creación del objeto.
* **Modulariad:** El proyecto se divide en una clase lógica (`Persona`) y una clase de ejecución (`Main`), separando la definición del comportamiento de su implementación.