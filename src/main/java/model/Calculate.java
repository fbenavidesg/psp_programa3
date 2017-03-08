
package model;

import java.util.ArrayList;
/**
 * clase que calcula los resultados
 * @author fbenavides
 */
public class Calculate {
    
    private Result resultCalculator;
    /**
     * metodo principal de calculo
     * @param arrayListPair
     * @param proxy float valor ingresado por el usuario
     * @return 
     */
    public Result execute( ArrayList<ListPair> arrayListPair, float proxy ){
        
        double sumXY = sumXY(arrayListPair);
        double sumX = sumX(arrayListPair);
        double sumY = sumY(arrayListPair);
        double sumX2 = sumX2(arrayListPair);
        double sumY2 = sumY2(arrayListPair);
        double averageX = sumX / arrayListPair.size();
        double averageY = sumY / arrayListPair.size();
        double b1 = calculateB1(arrayListPair.size(),sumXY,averageX,averageY,sumX2);
        double b0 = calculateB0( averageY, b1, averageX);
        double r = calculateR( arrayListPair.size(),sumXY,sumX,sumY,sumX2,sumY2);
        double r2 = r * r;
        double proxy_new = b0 + b1 * proxy;
        resultCalculator = new Result(b0, b1, r, r2, proxy, proxy_new);
        return resultCalculator;
    }
    /**
     * metodo de apoyo que calcula r
     * @param n
     * @param sumXY
     * @param sumX
     * @param sumY
     * @param sumX2
     * @param sumY2
     * @return 
     */
    public double calculateR( int n, double sumXY, double sumX, double sumY, double sumX2, double sumY2 ){
        double result;
        result = ((n*sumXY) - (sumX*sumY)) / 
                Math.sqrt( ((n*sumX2) - Math.pow(sumX, 2)) * ( (n * sumY2) - Math.pow(sumY, 2) ));
        return result;
    }
    /**
     * metodo de apoyo que calcula B1
     * @param n
     * @param sumXY
     * @param averageX
     * @param averageY
     * @param sumX2
     * @return 
     */
    public double calculateB1( int n, double sumXY, double averageX, double averageY,double sumX2 ){
        double result;
        result = (sumXY - (n*averageX*averageY)) / (sumX2 - (n* Math.pow(averageX, 2)));
        return result;
    }
    /**
     * metodo de apoyo que calcula B0
     * @param averageY
     * @param b1
     * @param averageX
     * @return 
     */
    public double calculateB0(double averageY, double b1, double averageX){
        double result;
        result = averageY - (b1*averageX);
        return result;
    }
    /**
     * metodo de apoyo que calcula sumatoria XY
     * @param arrayListPair
     * @return 
     */
    private double sumXY( ArrayList<ListPair> arrayListPair ){
        double suma = 0.0;
        for(ListPair listPair :arrayListPair){
            suma += listPair.getNumberX() * listPair.getNumberY();
        }
        return suma;
    }
    /**
     * metodo de apoyo que calcula sumatoria X
     * @param arrayListPair
     * @return 
     */
    private double sumX( ArrayList<ListPair> arrayListPair ){
        double suma = 0.0;
        for(ListPair listPair :arrayListPair){
            suma += listPair.getNumberX();
        }
        return suma;
    }
    /**
     * metodo de apoyo que calcula sumatoria Y
     * @param arrayListPair
     * @return 
     */
    private double sumY( ArrayList<ListPair> arrayListPair ){
        double suma = 0.0;
        for(ListPair listPair :arrayListPair){
            suma += listPair.getNumberY();
        }
        return suma;
    }
    /**
     * metodo de apoyo que calcula sumatoria X2
     * @param arrayListPair
     * @return 
     */
    private double sumX2( ArrayList<ListPair> arrayListPair ){
        double suma = 0.0;
        for(ListPair listPair :arrayListPair){
            suma += listPair.getNumberX()*listPair.getNumberX();
        }
        return suma;
    }
    /**
     * metodo de apoyo que calcula sumatoria Y2
     * @param arrayListPair
     * @return 
     */
    private double sumY2( ArrayList<ListPair> arrayListPair ){
        double suma = 0.0;
        for(ListPair listPair :arrayListPair){
            suma += listPair.getNumberY()*listPair.getNumberY();
        }
        return suma;
    }
}
