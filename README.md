# Encapsulamiento y Validación de Datos (Repaso 7)

Evolución del modelo de Programación Orientada a Objetos que implementa mecanismos de seguridad y validación para asegurar que los objetos mantengan un estado consistente.

## 🚀 Funcionalidades
* **Privacidad de Atributos:** Aplica el principio de ocultación de datos mediante modificadores de acceso `private`, impidiendo la manipulación externa directa.
* **Validación de Reglas de Negocio:** El método `setEdad` incluye una restricción lógica que impide asignar valores negativos, lanzando una excepción si se intenta.
* **Integridad en el Constructor:** El constructor delega la asignación de la edad al método `setEdad`, asegurando que incluso en el momento de la creación se cumplan las reglas de validación.
* **Gestión de Errores Críticos:** El programa principal utiliza bloques `try-catch` para capturar tanto errores de entrada por consola como excepciones lógicas de la clase.

## 🛠️ Estructura técnica
El código profundiza en la robustez del diseño de clases en Java:
* **Lanzamiento de Excepciones (`throw new Exception`)**: Técnica utilizada para notificar que se ha producido un error lógico en la lógica de negocio.
* **Cláusula `throws`**: Indica que un método puede delegar la responsabilidad de manejar un error a quien lo invoque.
* **Encapsulamiento Estricto**: Uso de métodos accesores (*Getters*) y mutadores (*Setters*) para controlar cómo se lee y se escribe la información de los atributos.
* **Seguridad de Tipos**: Combina la captura de errores de tipo (`InputMismatchException`) con errores de valor (Edad negativa).