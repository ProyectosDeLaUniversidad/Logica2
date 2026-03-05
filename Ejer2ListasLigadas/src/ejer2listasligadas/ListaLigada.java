
package ejer2listasligadas;

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
    
    public void insertarSegundo(int pNum){
        Nodo p = cab.getLiga();
        Nodo q = p.getLiga();
        Nodo r = new Nodo(pNum);
        p.setLiga(r);
        r.setLiga(q);
        
        
    }
    
    public int sumatoriaMult5(){
        int suma=0, i;
        Nodo p = cab.getLiga();
        if(p.getNumero()%5==0) {
            for (i = 0; i <= p.getNumero(); i++) {
                suma+=i;
            }
        }
        return suma;
    }
    
    public void eliminarSegDato(){
        Nodo p = cab.getLiga();
        Nodo q = p.getLiga();
        Nodo r = q.getLiga();
        p.setLiga(r); 
    }
    
    public void ingresarPrimerDato(int pNum){//este metodo cambiaria el segundo no el primero
        Nodo p = cab.getLiga();
        Nodo q = p.getLiga();
        Nodo r = new Nodo(pNum);
        cab.setLiga(r);
        //r.setLiga(p); no hay necesidad
    } 
    
    public void cambiarSegundo()
    { 
        Nodo p = cab.getLiga();
        Nodo q = p.getLiga();
        if(q.getNumero()%2==0){
            q.setNumero(100);
        }
        else{
            q.setNumero(25);
        }
    }

}
