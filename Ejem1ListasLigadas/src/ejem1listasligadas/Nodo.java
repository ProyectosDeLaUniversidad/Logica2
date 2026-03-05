
package ejem1listasligadas;
public class Nodo {
    private int numero;
    private Nodo liga;

    public Nodo(int pNum) {
        numero = pNum;
        liga = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int pNum) {
        numero = pNum;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo pLiga) {
        liga = pLiga;
    }
    
}
