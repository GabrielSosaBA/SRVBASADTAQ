/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */
package hn.bancatlan.srvbasa007dtaq.control;

import hn.bancatlan.srvbasa007dtaq.dtaq.*;
import static hn.bancatlan.srvbasa007dtaq.dtaq.Dtaq.DTAQ;
import hn.bancatlan.srvbasa007dtaq.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal para la ejecución de la aplicación.
 *
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 19-jul-2019
 */
public class Control {

    /**
     * Inicio de aplicación
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] hil = {"7"};
        args = hil;
        /**
         * El primer argumento debe ser un número entero que indica, la cantidad
         * de hilos que se crearán para el procesamiento de la cola.
         */
        try {
            if (args.length == 1) {
                int hilos = Integer.parseInt(args[0].trim());
                if (Util.init()) {
                    for (int i = 0; i < hilos; i++) {
                        Dtaq dtaqThread = new Dtaq();
                        dtaqThread.start();
                    }
                } else {
                    throw new AtlantidaException("Error al iniciar procesamineto de la cola de datos " + DTAQ);
                }
            } else {
                throw new AtlantidaException("Error en el argumento, verifique que sea un número entero " + DTAQ);
            }
        } catch (AtlantidaException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, "Error de inicio de aplicación", ex);
        }
    }

}
