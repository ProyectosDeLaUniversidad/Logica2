
package ejem1hilerasll;
public class NodoHilera {
    private char caracter;
    private NodoHilera liga;
    
    public NodoHilera(char pCar){
        caracter = pCar;
        liga = null;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public NodoHilera getLiga() {
        return liga;
    }

    public void setLiga(NodoHilera liga) {
        this.liga = liga;
    }
    
}
