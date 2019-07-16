# Procesamiento de colas

Contenedor de los modulos DTAQ, cada modulo es un proyecto independiente y representa el procesamiento de un microservicio.

------------

### DTAQ
**Consideraciones**
**Server**: AS400S - 10.128.2.55
**Liberia DTA**: SRVSAPDAT
**Liberia SRC**: SRVSAPSRC

| SRVBASADTAQ | Descripción | RPG | CL | DQIN | DQOUT | 
| ----- | ---- | ---- | ----- | ---- | ---- |
| SRVBASA001 | Contabilidad DM | PSAP0001 | CLSAP0001 | DQIN0001  | DQOUT0001 |
| SRVBASA002 | Consulta clientes | PSAP0002 | CLSAP0002 | DQIN0002  | DQOUT0002 |
| SRVBASA003 | Consulta cuentas | PSAP0003 | CLSAP0003 | DQIN0003  | DQOUT0003 |

------------
#### Autor
Erick Fabricio Martínez Castellanos efmartinez@bancatlan.hn
