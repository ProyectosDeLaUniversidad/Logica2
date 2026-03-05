
package ejem1pilasenll;

public class ListaLigada {
    private Nodo cab, ult, x;

    public ListaLigada() {
        cab = new Nodo(0);
        ult = x = cab;
    }
    
    public boolean pilaVacia(){
        return (ult == cab || ult == null);
    }
    
    public void apilar(int pNumero){
        Nodo p = new Nodo(pNumero);
        if (ult != cab && ult != null) {
            p.setLiga(ult);
        }
        cab.setLiga(p);
        ult = p;
    }
    
    public int desapilar(){
        int datoDesapilado;
        datoDesapilado = ult.getNumero();
        cab.setLiga(ult.getLiga());
        ult = cab.getLiga();
        return datoDesapilado;
    }
    
    public int mostrarPila(){
        x=x.getLiga();
        if (x == null) {
            x=cab;
        }
        return x.getNumero();
    }
}
