
package ejem1listasligadas;

public class ListaLigada {
    private Nodo cab, ult, x;
    public ListaLigada(){
        cab = new Nodo(0);
        ult = x = cab;
    }
    
    public void CrearListaLigada(int pNum){
        Nodo p = new Nodo(pNum);
        ult.setLiga(p);
        ult = p;
    }
    
    public int MostrarLista(){
        x = x.getLiga();
        if(x == null){
            x = cab;
        }
        return x.getNumero();
    }
    
    public float promedio(){
        int cont=0, acum =0;
        float prom;
        Nodo p = cab.getLiga();
        while(p != null){
            cont++;
            acum+= p.getNumero();
            p = p.getLiga();
        }
        prom = (float) acum/cont;
        return prom;
    }
    
    public void intercambiarInfoDosPrimeros(){
        int aux;
        Nodo p = cab.getLiga();
        aux = p.getNumero();
        p.setNumero(p.getLiga().getNumero());
        p.getLiga().setNumero(aux);
    }
    
    public int menorTresPrimeros(){
        int men;
        Nodo p1, p2, p3;
        p1 = cab.getLiga();
        p2 = p1.getLiga();
        p3 = p2.getLiga();
        if (p1.getNumero()<p2.getNumero() && p1.getNumero()<p3.getNumero()) {
            men = p1.getNumero();            
        }
        else{
            if (p2.getNumero()<p3.getNumero()) {
                men = p2.getNumero();                 
            }
            else{
                men = p3.getNumero(); 
            }
        }
        return men;
    }
    
    public void insertarDatoDePrimero(int pNum){
        Nodo q = new Nodo(pNum);
        q.setLiga(cab.getLiga());
        cab.setLiga(q);
    }
}
