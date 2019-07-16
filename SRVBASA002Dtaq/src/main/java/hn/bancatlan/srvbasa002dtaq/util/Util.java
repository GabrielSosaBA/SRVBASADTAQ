/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */
package hn.bancatlan.srvbasa002dtaq.util;

import hn.bancatlan.srvbasa002dtaq.dtaq.Dtaq;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Métodos y variables de uso común.
 *
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 03-jul-2019
 */
public class Util {

    /**
     * Configuración de propiedades.
     */
    public static Properties properties;

    /**
     * Archivo AppLog-FechaHora.log de la aplicación.
     */
    public static String FILE_LOG;

    /**
     * Archivo de propiedades.
     */
    public static String FILE_CONFIG;

    /**
     * Conexión de la base de datos.
     */
    public static Connection conexion;

    /**
     * Retorna True si la cargar de propiedades fue exitosa, False en caso
     * contrario.
     *
     * @return config
     */
    public static boolean cargarPropiedades() {
        boolean config = false; //Representa si la carga de propiedades fue exitosa
        properties = new Properties();
        try {
            properties.load(new FileReader(FILE_CONFIG));
            //------------OBTENIENDO LAS VARIABLES DE CONFIGURACION------------//            
            String url = "jdbc:as400://" + properties.getProperty(Dtaq.DTAQ + ".sistema").trim();
            String user = properties.getProperty(Dtaq.DTAQ + ".usuario").trim();
            String password = properties.getProperty(Dtaq.DTAQ + ".password").trim();
            //Validaciones de propiedades
            try {
                Class.forName("com.ibm.as400.access.AS400JDBCDriver");
                conexion = DriverManager.getConnection(url, user, password);
                config = true;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, "ERROR ClassNotFoundException", ex);
            } catch (SQLException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, "ERROR SQLException", ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, "ERROR: Archivo de propiedades " + FILE_CONFIG + " no encotrado", ex);
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, "ERROR: Al cargar el archivo de propiedades " + FILE_CONFIG, ex);
        }
        return config;
    }

    /**
     * Escribe en el archivo <b>App.log</b> del programa. Se utiliza para
     * registrar los procesos realizados.
     *
     * @param proceso Mensaje
     */
    public static void log(String proceso) {

        FileWriter lector = null;
        PrintWriter escritor = null;

        try {
            //Obteniento la ruta absoluta del archivo App.log            
            String rutaAbsoluta = FILE_LOG;

            //#1 Abrir
            lector = new FileWriter(rutaAbsoluta, true);
            escritor = new PrintWriter(lector);

            //#2 Escribir
            escritor.write(proceso + "\r\n");

            //#3 Cerrar
            escritor.close();
            lector.close();

        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Registra el proceso en el log de la aplicación y lo muestra en la
     * consola.
     *
     * @param string Mensaje
     */
    public static void print(String string) {
        System.out.println(string);
        log(string);
    }

    /**
     * Registra el proceso en el log de la aplicación y lo muestra en la consola
     * con la fecha actual.
     *
     * @param string Mensaje
     */
    public static void printLog(String string) {
        print(getFechaHoraActual("[yyyyMMdd-HH:mm:ss] -> ") + string);
    }

    /**
     * Obtiene la fecha y la hora según formato requerido.
     *
     * @param formato Formato de fecha que se desea. Ejemplo: DD/MM/YYYY -
     * 10/11/1994
     * @return formato Fecha del sistema.
     */
    public static String getFechaHoraActual(String formato) {
        SimpleDateFormat fecha = new SimpleDateFormat(formato);
        Date fechaActual = new Date(System.currentTimeMillis());
        return fecha.format(fechaActual);
    }

    /**
     * Retorna una lista con las tramas delimitados por el limite de longitud.
     *
     * @param limite
     * @param trama
     * @return tramas
     */
    public static ArrayList<String> convertirTrama(int limite, String trama) {
        ArrayList<String> tramas = new ArrayList<>();
        int caracteres = trama.length();
        if (caracteres <= limite) {
            tramas.add(trama);
        } else {
            while (trama.length() > limite) {
                tramas.add(trama.substring(0, limite));
                trama = trama.substring(limite, trama.length());
            }
            if (!trama.isEmpty()) {
                tramas.add(trama);
            }
        }
        return tramas;
    }

    /**
     * Inserta el la tabla SRVSAPDTA.SAPRES
     * @param UUID
     * @param tramaIn
     * @param tramaOut 
     * @return  rows cantidad de registros agregados
     */
    public static int insertar(String UUID, String tramaIn, String tramaOut) {
        int rows = 0;        
        ArrayList<String> tramas = convertirTrama(256, tramaOut);
        String query = "INSERT INTO SRVSAPDTA.SAPRES (SAPPET, SAPFEC, SAPHOR, SAPCOR, SAPDQIN, SAPDQOUT) VALUES ";
        int contador = 1;
        
        for (String trama : tramas) {
            query += 
                    "('" +                                        
                    UUID + "', '" +
                    getFechaHoraActual("yyyyMMdd") + "', '" +
                    getFechaHoraActual("HH:mm:ss") + "', " +
                    contador++ + ", '" + 
                    tramaIn + "', '" +
                    trama +
                    "'),";                        
        }
        
        //Elimina la ultima coma
        query = query.substring(0, query.length()-1);
        //System.out.println("query:" + query);
                
        try {
            Statement st = conexion.createStatement();
            rows = st.executeUpdate(query);
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rows;
    }

}
