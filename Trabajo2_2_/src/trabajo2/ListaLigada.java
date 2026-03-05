
package trabajo2;

public class ListaLigada {
    private Nodo[] cab, ult, x;
    
    public ListaLigada(int n){
        cab = new Nodo[n];
        ult = new Nodo[n];
        x = new Nodo[n];
        int i=0;
        while(i<n){
            cab[i] = new Nodo(0,0);
            ult[i] = cab[i];
            x[i] = cab[i];
            i++;
        }
    }
    
   
    public void encolar(int codigo, int valor, int i){
        Nodo p = new Nodo(codigo, valor);
        ult[i].setLiga(p);
        ult[i] = p;
    }
    
    public boolean colaVacia(int i){
        return (cab[i].getLiga() == null);
    }
    
    public Compra desencolar(int i){
        Compra datoDesencolado;
        Nodo p = cab[i].getLiga();
        datoDesencolado = p.getObjCompra();
        cab[i].setLiga(p.getLiga());
        if (cab[i].getLiga() == null) {
            ult = cab;
        }
        return datoDesencolado;
    }
    
    public Compra mostrarCola(int i){
        x[i] = x[i].getLiga();
        if (x[i] == null) {
            x[i] = cab[i];
        }
        return x[i].getObjCompra();
    }
    
    public int acumulado(int i){
        int acumulado = 0;
        Nodo p = cab[i].getLiga();
        while(p != null){
            acumulado += p.getObjCompra().getValor();
            p = p.getLiga();
        }
        return acumulado;
    }       
}
