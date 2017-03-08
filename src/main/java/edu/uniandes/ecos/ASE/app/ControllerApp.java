package edu.uniandes.ecos.ASE.app;

import model.Result;
import model.Calculate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.ListPair;
import view.Vista;

/**
 * Clase que funciona como controlador de la aplicacion
 * @author fbenavides
 */
public class ControllerApp {
    
    private ArrayList<ListPair> arrayListPair = new ArrayList<ListPair>();
    /**
     * metodo que arranca la funcionalidad y orquesta todo el funcionamiento
     * @throws IOException 
     */
    public void run() throws IOException{
        Vista vista = new Vista();
        String pathFile = vista.requireDataFile();
        float proxy = Float.parseFloat(vista.requireDataProxy());
        readFileValues( pathFile );
        Calculate calculate = new Calculate();
        Result resultCalculate = calculate.execute(arrayListPair, proxy);
        vista.showResult( resultCalculate );
    }
    
   /**
    * metodo de apoyo para leer archivo
    * @param path String ruta y nombre del archivo
    * @throws FileNotFoundException
    * @throws IOException 
    */     
    private void readFileValues( String path ) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader( path ));
        String line;
        while ((line = br.readLine()) != null) {
            String[] valueLineArray = line.split(",");
            this.arrayListPair.add( 
                    new ListPair(
                            Float.parseFloat(valueLineArray[0]), 
                            Float.parseFloat(valueLineArray[1])
                    )
            );
        }
    }     
}
