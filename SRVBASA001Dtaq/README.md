# Plantilla para el procesamiento de cola de datos

### Descripción
Lee los mensajes de una colas de entrada, realiza el procesamiento y escribe en una cola de salida.

------------

### DTAQ-IN
**Longitud de cola:** 254
**Ejemplo de trama:** 0123456789ABCDEFErick1234  ABC

| Campo| Tipo | Descripción |
| ----- | ---- | ---- |
| Key| Char(16) | LLave del mensaje |
| Campo1| Char(9) | campo1 descripción |
| Campo2| Char(5) | campo2 descripción |

------------

### DTAQ-OUT
**Longitud de cola:** 254
**Ejemplo de trama:** 0123456789ABCDEF|HOLA MUNDO

| Campo| Tipo | Descripción |
| ----- | ---- | ---- |
| Key| Char(16) | LLave del mensaje |
| Mensaje| Char(238) | Mensaje de procesamiento |

------------
#### Autor
Erick Fabricio Martínez Castellanos efmartinez@bancatlan.hn
