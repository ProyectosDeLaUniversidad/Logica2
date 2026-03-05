
package ejem1manejocolaenll;

public class ListaLigada {
    private Nodo cab, ult,x;
    public ListaLigada(){
        cab = new Nodo(0);
        ult = cab;
        x = cab;
    }
    
    public void encolar(int dato){
        Nodo p = new Nodo(dato);
        ult.setLiga(p);
        ult = p;
    }
    
    public boolean colaVacia(){
        return (cab.getLiga() == null);
    }
    
    public int desencolar(){
        int datoDesencolado;
        Nodo p = cab.getLiga();
        datoDesencolado = p.getNumero();
        cab.setLiga(p.getLiga());
        if (cab.getLiga() == null) {
            ult = cab;
        }
        return datoDesencolado;
    }
    
    public int mostrarCola(){
        x = x.getLiga();
        if (x == null) {
            x = cab;
        }
        return x.getNumero();
    }
}
