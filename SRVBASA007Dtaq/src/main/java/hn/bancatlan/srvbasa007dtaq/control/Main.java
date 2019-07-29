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
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 03-jul-2019
 */
public class Main {
        
    /**
     * Inicio de aplicación
     * @param args the command line arguments
     */
    public static void main(String[] args) {                        
        if(Util.init()){
            //Por defecto solo se ejecuta un hilo para el procesamiento de la cola
            Dtaq dtaq = new Dtaq();
            dtaq.start();            
        }else{
            try {
                throw new AtlantidaException("Error al iniciar procesamineto de la cola de datos " + DTAQ);
            } catch (AtlantidaException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error de inicio de aplicación", ex);
            }
        }       
    }

}