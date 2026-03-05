
package trabajo2;

public class ListaLigada {
    private Nodo cab, ult, x;
    
    public ListaLigada(){
        cab = new Nodo(0,0);
        ult = cab;
        x = cab;
    }
   
    public void encolar(int codigo, int valor){
        Nodo p = new Nodo(codigo, valor);
        ult.setLiga(p);
        ult = p;
    }
    
    public boolean colaVacia(){
        return (cab.getLiga() == null);
    }
    
    public int desencolar(){
        int datoDesencolado;
        Nodo p = cab.getLiga();
        datoDesencolado = p.getCodigo();
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
        return x.getValor();
    }
    
    public int acumulado(){
        int acumulado = 0;
        Nodo p = cab.getLiga();
        while(p != null){
            acumulado += p.getValor();
            p = p.getLiga();
        }
        return acumulado;
    }
    
}
