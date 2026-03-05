
package ejer1listasligadas;

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
    
    public float promedioImpares(){
        int cont=0, acum =0 ;
        float prom;
        Nodo p = cab.getLiga();
        while(p != null){
            if(p.getNumero()%2==1) {
                cont++;
                acum+= p.getNumero();
            }
            p = p.getLiga();
        }
        prom = (float) acum/cont;
        return prom;
    }
    
    public int impares(){
        int cont=0;
        Nodo p = cab.getLiga();
        while(p != null){
            if(p.getNumero()> promedioImpares()&& p.getNumero()%2==1) {
                cont++;
                p = p.getLiga();
            }
            else{
                p = p.getLiga();
            }
        }
        return cont;
    }
    
    public int calcularMayor(){
        int may =0;
        Nodo p = cab.getLiga();
        while(p != null){
            if(p.getNumero()>may) {
                may = p.getNumero();
                p = p.getLiga();
            }
            else{
                p = p.getLiga();
            }
        }
        return may;
    }
    
    public int calcularMenor(){
        int men = 2147483647;
        Nodo p = cab.getLiga();
        while(p != null){
            if(p.getNumero()<men) {
                men = p.getNumero();
                p = p.getLiga();
            }
            else{
                p = p.getLiga();
            }
        }
        return men;
    }
    
    public boolean eliminarPrimeraAparicion(int pNum){
        boolean elimino = false;
        Nodo ant,p;
        ant = cab;
        p = cab.getLiga();
        while(p != null){
            if(p.getNumero() == pNum){
                ant.setLiga(p.getLiga());//solo elimina al primero
                elimino = true;
                p = null;
            }
            else{
                ant=p;
                p = p.getLiga();
            }
        }
        return elimino;
    }
    
    public void reversarLista(){
        Nodo p, q, r;
        p = cab.getLiga();
        q = p.getLiga();
        r = q.getLiga();
        p.setLiga(null);
        while(r!=null){
            q.setLiga(p);
            p=q;
            q=r;
            r= r.getLiga();
        }
        q.setLiga(p);
        cab.setLiga(q);
    }
   
}
