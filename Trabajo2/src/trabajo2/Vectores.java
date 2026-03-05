
package trabajo2;


public class Vectores {
    private ListaLigada[] primeros;
    private int posicion=0;

    public Vectores(int pCantidad) {
        primeros = new ListaLigada[pCantidad];
    }

    public void insertar(ListaLigada l) {
        primeros[posicion]= l;
        posicion += 1;
    }
}
