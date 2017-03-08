/******************************************************************************/
/* Programa ID: PSP_TAREA3                                                    */
/* Autor: Fredy Benavides                                                     */
/* Fecha: 07/03/2017                                                          */
/* Descripción: Programa realiza calculo de regresión y correlacción          */
/*   proxy mejorado                                                           */
/******************************************************************************/
package edu.uniandes.ecos.ASE.app;

import java.io.IOException;


/**
 * Clase principal funciona como controllador frontal
 * @author fbenavides
 */
public class App 
{
    /**
     * Metodo de entrada de la aplicacion.
     * @param args
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException
    {
        ControllerApp controllerApp = new ControllerApp();
        controllerApp.run();
    }
}
