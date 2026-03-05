
package ejem2hilerasll;
public class Nodo {
    private char caracter;
    private Nodo liga;
    
    public Nodo(char pCaracter){
        caracter = pCaracter;
        liga = null;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
}
