
package ejem1pilasenll;

public class Nodo {
    private int numero;
    private Nodo liga;

    public Nodo(int pNumero) {
        numero = pNumero;
        liga = null;
    }

    public int getNumero() {
        return numero;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo pLiga) {
        liga = pLiga;
    }
    
    
}
