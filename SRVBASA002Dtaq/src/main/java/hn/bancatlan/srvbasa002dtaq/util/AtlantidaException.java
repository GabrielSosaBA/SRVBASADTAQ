/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */

package hn.bancatlan.srvbasa002dtaq.util;

/**
 * Para el control de errores lógicos de aplicación.
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 03-jul-2019
 */
public class AtlantidaException extends Exception{
    
    /**
     * Constructor de instancia <code>AtlantidaException</code> con el detalle del mensaje.
     * @param msg detalles de mensaje.
     */
    public AtlantidaException(String msg) {
        super(msg);
        Util.printLog(msg);
    }

}
