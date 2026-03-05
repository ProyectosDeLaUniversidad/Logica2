
package ejem1hilerasll;
public class ListaHilera {
    private String hilera;
    private NodoHilera cab, ult, x;
    
    public ListaHilera(String pCadena){
        hilera = pCadena;
        cab = new NodoHilera('*');
        ult = cab;
        x = cab;
    }
    
    public void repHilerEnLL(){
        NodoHilera p;
        int i;
        for (i = 0; i < hilera.length(); i++) {
            p = new NodoHilera(hilera.charAt(i));
            ult.setLiga(p);
            ult = p;
        }
    }
    
    public char mostrarHileraDeLL(){
        x = x.getLiga();
        if (x == null) {
            x = cab;
        }
        return x.getCaracter();
    }
    
    public int contAparCarac(char pCar){
        int cont=0;
        NodoHilera p =cab.getLiga();
        while(p !=null){
            if(p.getCaracter() == pCar){
                cont++;
            }
            p = p.getLiga();
        }
        return cont;
    } 
}
