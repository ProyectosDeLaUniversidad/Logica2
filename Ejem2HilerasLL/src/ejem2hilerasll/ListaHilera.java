
package ejem2hilerasll;
public class ListaHilera {
    private String hilera;
    private Nodo cab, ult, x;
    
    public ListaHilera(){
        hilera = "";
        cab = new Nodo('*');
        ult = x = cab;
    }
    
    public void repreHileraEnLL(String pHilera){
        hilera = pHilera;
        Nodo p;
        for (int i = 0; i < hilera.length(); i++) {
            p = new Nodo(hilera.charAt(i));
            ult.setLiga(p);
            ult = p;
        }
    }
    
    public String getHilera(){
        return hilera;
    }
    
    public char mostrarHileraLL(){
        x = x.getLiga();
        if (x == null) {
            x = cab;
        }
        return x.getCaracter();
    }
    
    public void LiberarLista(){
        Nodo p = cab.getLiga();
        while(p != null){
            cab.setLiga(p.getLiga());
            p = cab.getLiga();
        }
        ult = cab;
    }
    
    public boolean averPorVocales(){
        Nodo p;
        boolean a, e, i, o, u, lasTiene;
        a = e = i = o = u = lasTiene = false;
        p = cab.getLiga();
        while(p != null && !lasTiene){
            switch(p.getCaracter()){
                case 'a':
                    a = true; break;
                case 'e':
                    e = true; break;
                case 'i':
                    i = true; break;
                case 'o':
                    o = true; break;
                case 'u':
                    u = true; break;
                default:
                    break;
            }
            if (a && e && i && o && u) {
                lasTiene = true;
            }
            else{
                p = p.getLiga();
            }
        }
        return lasTiene;
    }
    
    public int contApariciones(char pCaracter){
        Nodo p;
        int contador = 0;
        p = cab.getLiga();
        while(p != null){
            if (p.getCaracter()==pCaracter) {
                contador++;
            }
            p = p.getLiga();
        }
        return contador;
    }
    
    public void eliApariciones(char pCaracter){
        Nodo ant, p;
        ant = cab;
        p = cab.getLiga();
        while(p != null){
            if (p.getCaracter() == pCaracter) {
                ant.setLiga(p.getLiga());
                p = ant.getLiga();
            }
            else{
                ant = p;
                p = p.getLiga();
            }
        }
    }
    
    public void camCaracter(char pCual, char pPorCual){
        Nodo p= cab.getLiga();
        while(p != null){
            if (p.getCaracter() == pCual) {
                p.setCaracter(pPorCual);
            }
            p = p.getLiga();
        }
    }
}
