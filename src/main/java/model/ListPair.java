package model;

/**
 * Clase para el manejo de la lista encadenada
 * @author fbenavides
 */
public class ListPair {
    private float numberX;
    private float numberY;
    /**
     * Contructor de la clase
     * @param numberX float
     * @param numberY float
     */
    public ListPair(float numberX, float numberY) {
        this.numberX = numberX;
        this.numberY = numberY;
    }
    /**
     * metodo get
     * @return float
     */
    public float getNumberX() {
        return numberX;
    }
    /**
     * metodo set
     * @param numberX float
     */
    public void setNumberX(float numberX) {
        this.numberX = numberX;
    }
    /**
     * metodo get
     * @return float
     */
    public float getNumberY() {
        return numberY;
    }
    /**
     * metodo set
     * @param numberY float
     */
    public void setNumberY(float numberY) {
        this.numberY = numberY;
    }
}
