
package ejem3listadoblementeligada;
public class ListaDoble {
    private NodoDoble cab, ult, x;
    
    public ListaDoble(){
        cab = new NodoDoble(0);
        ult = cab;
        x = cab;
    } 
    
    public void CrearListaDoble(int pNum){
        NodoDoble p = new NodoDoble(pNum);
        ult.setLigaDer(p);
        p.setLigaIzq(ult);
        ult = p;
    }
    
    public int MostrarListaDoble(){
        x = x.getLigaDer();
        if(x == null){
            x = cab;
        }
        return x.getNumero();
    }
    
    public int ContarImpares(){
        int contImp = 0;
        NodoDoble p = cab.getLigaDer();
        while(p != null){
            if(p.getNumero() %2 ==1){
                contImp++;
            }
            p = p.getLigaDer();
        }
        return contImp;
    }
    
    public boolean EliminarPrimeraAparicion(int pNum){
        boolean elimino = false;
        NodoDoble p = cab.getLigaDer();
        while(p != null){
            if(p.getNumero() == pNum){
                p.getLigaIzq().setLigaDer(p.getLigaDer());
                p.getLigaDer().setLigaIzq(p.getLigaIzq());
                elimino = true;
                p = null;
            }
            else{
                p = p.getLigaDer();
            }
        }
        return elimino;
    }
            
}
