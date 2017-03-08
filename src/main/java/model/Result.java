package model;

/**
 * Clase que almacena el resultado de los calculos de la app
 * @author fbenavides
 */
public class Result {
    
    private double b0;
    private double b1;
    private double r;
    private double r2;
    private double proxy;
    private double proxy_new;
    
    /**
     * 
     * @param b0 double valor B0
     * @param b1 double valor B1
     * @param r double valor coeficiente de correlacion
     * @param r2 double valor r2
     * @param proxy double proxy ingresado por usuario
     * @param proxy_new double proxy mejorado
     */
    public Result(double b0, double b1, double r, double r2, double proxy, double proxy_new) {
        this.b0 = b0;
        this.b1 = b1;
        this.r = r;
        this.r2 = r2;
        this.proxy = proxy;
        this.proxy_new = proxy_new;
    }
    /**
     * metodo get
     * @return double
     */
    public double getB0() {
        return b0;
    }
    /**
     * metodo set
     * @param b0 double valor que se asignara
     */
    public void setB0(double b0) {
        this.b0 = b0;
    }
    /**
     * metodo get
     * @return double
     */
    public double getB1() {
        return b1;
    }
    /**
     * metodo set
     * @param b1 double valor que se asignara
     */
    public void setB1(double b1) {
        this.b1 = b1;
    }
    /**
     * metodo get
     * @return double
     */
    public double getR() {
        return r;
    }
    /**
     * metodo set
     * @param r double valor que se asignara
     */
    public void setR(double r) {
        this.r = r;
    }
    /**
     * metodo get
     * @return double
     */
    public double getR2() {
        return r2;
    }
    /**
     * metodo set
     * @param r2 double valor que se asignara
     */
    public void setR2(double r2) {
        this.r2 = r2;
    }
    /**
     * metodo get
     * @return double
     */
    public double getProxy() {
        return proxy;
    }
    /**
     * metodo set
     * @param proxy double valor que se asignara
     */
    public void setProxy(double proxy) {
        this.proxy = proxy;
    }
    /**
     * metodo get
     * @return double
     */
    public double getProxy_new() {
        return proxy_new;
    }
    /**
     * metodo set
     * @param proxy_new double valor que se asignara
     */
    public void setProxy_new(double proxy_new) {
        this.proxy_new = proxy_new;
    }
}
