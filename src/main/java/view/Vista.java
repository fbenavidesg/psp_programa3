package view;

import model.Result;
import java.util.Scanner;

/**
 * Clase para entrada de datos y mostrar resultados
 * @author fbenavides
 */
public class Vista {
    /**
     * metodo para solicitar al usuario la ruta y nombre del archivo
     * @return String ruta y nombre del archivo
     */
    public String requireDataFile(){
        System.out.println("***Hola, Bienvenido al programa de predicción mejorada.***\n\n");
        System.out.print("Ingresa ruta y nombre del archivo, vacio usar por defecto:");
        Scanner scannerIn = new Scanner (System.in);
        String pathScanner = "";
        pathScanner = scannerIn.nextLine ();
        if( pathScanner.equals("") ){
            pathScanner = "src/valores.txt";
        }
        return pathScanner;
    }
    /**
     * metodo que solicita el valor del proxy
     * @return String proxy ingresado 
     */
    public String requireDataProxy(){
        System.out.print("Ingresa valor proxy:");
        String valueProxy;
        Scanner scannerIn = new Scanner (System.in);
        valueProxy = scannerIn.nextLine ();
        if( valueProxy.equals("") ){
            System.out.println("Ingrese un valor numerico:");
            requireDataProxy();
        }
        return valueProxy;
    }
    /**
     * Muestra los resultados del calculo
     * @param result 
     */
    public void showResult( Result result ){
        System.out.println("\n\nResultados\n");
        System.out.println("B0: "+ result.getB0());
        System.out.println("B1: "+ result.getB1());
        System.out.println("r: "+ result.getR());
        System.out.println("r^2: "+ result.getR2());
        System.out.println("Proxy mejorado: "+ result.getProxy_new());
    }
    
}
