
package ejem3pilasenll;
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

    public void setCaracter(char pCaracter) {
        caracter = pCaracter;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo pLiga) {
        liga = pLiga;
    }
    
    
        
}
