#SRVBASA007Dtaq para el procesamiento de cola de datos 

### Descripción
Lee los mensajes de una colas de entrada, realiza el procesamiento y escribe en una cola de salida.
Este proceso realizá el servicio Ordenes Payment Engine  **SRVBASA007Dtaq**

------------

### DTAQ-IN
**Longitud de cola:** 256
**Ejemplo de trama:** 00000000000019921234           LPS 100.00                   1  12345678       0000000344          |C2;1234; |LPS;100.0;0000000345;&C2*1234

| Campo| Tipo | Descripción |
| ----- | ---- | ---- |
| Key| Char(16) | LLave del mensaje |
| referenciaCanal | Char(15) | Referencia canal |
| monedaOrdenPago | Char(4) | Moneda con la que se realiza orden de pago |
| montoTotalOrdenPago | Char(25) | Monto total orden de pago |
| totalRegistroOrdenPago | Char(3) | Total registro de pago |
| idClaveConciliacion | Char(15) | Id Clave de conciliación |
| numeroCuentaAfectar | Char(20) | Número de cuenta afectar |
| coleccionNotaPago | Char(20) | Colección nota de pago: codigoNotaPago, valorNotaPago |
| coleccionItemTransaccionOrdenPago | Char(88) | Colección Transacción orden de pago:  moneda, monto, numeroCuenta, coleccionNotaPago: codigoNotaPago, valorNotaPago|

------------

### DTAQ-OUT
**Longitud de cola:** 256
**Ejemplo de trama:** 0000000000001992|00|PROCESAMIENTO EXITOSO.|qe13y8jbifl1|05|Transferencia bancaria|2| |2|true|Transacción devuelta.|false|LPS|100.0|1|12345678|0000000344|UUID:048f9e6e-ed9c-4d5d-821f-bc0e0756f9ce|*

**Observación:** Probablemente al hacer la trama se particiona y se guardará en una tabla temporal, está tabla es denominada SRVSAPDTA.SAPRES

| Campo| Descripción |
| ----- | ---- |
| Key | LLave del mensaje |
|  codigoMensaje  | Devuelve el codigo del mensaje|
|  mensaje | Devuelve el mensaje |
|  idReferenciaSAP | Devuelve el id de referencia |
|  fechaHoraCreacionSAP | fecha de hora creación SAP |
|  estadoTransaccionSAP | Estado de transacción SAP |
|  idOrdenPago | Id orden pago |
|  referenciaCanal | Referencia del canal  |
|  codigoFormaPago | Código forma de pago |
|  descripcionFormaPago | Descripción forma de pago |
|  codigoTipoOrdenPago | Código tipo orden de pago |
|  descripcionTipoOrdenPago | Descripción tipo orden de pago |
|  codigoPrioridadEjecucion | Código prioridad ejecución |
|  codigoEstadoEjecucion | código estado de ejecución SAP |
|  descripcionEstadoEjecucion | descripción estado de ejecución SAP |
|  fechaEjecucion | fecha ejecución SAP |
|  IndicadorSolicitudNotificacion | indicador de solucitud de notificación |
|  motivoRetiro | Motivo del retiro |
|  indicadorDebitoCuenta | Indicador debito de la cuenta |
|  monedaOrdenPago | Moneda de orden de pago |
|  montoTotalOrdenPago | Monto total orden de pago |
|  totalRegistroOrdenPago | Total registro orden de pago |
|  idClaveConciliacion | Id clave conciliación |
|  numeroCuentaAfectar | Número de cuenta afectar |
|  NOTA:# |  coleccionNotaPago estos son: codigoNotaPago, valorNotaPago |
|  COMP:# |  coleccionComprobacionEjecucionFallida: codigo, nombre, descripcion |
|  TRANS:# | coleccionItemTransaccionOrdenPagoRespuesta: idItemTransaccionOP, codigoEstadoEjecucion, descripcionEstadoEjecucion,  motivoRetiro, moneda, monto, numeroCuenta,  &coleccionComprobacionEjecucionFallida#: codigo, nombre, descripcion |


------------
#### Autor
Gabriel Alexander Sosa Ramirez gsosa@bancatlan.hn