
package ejer1hilerasll;

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
    
    public void eliEspacios(){
        Nodo ant, p;
        ant = cab;
        p = cab.getLiga();
        while(p != null){
            if (p.getCaracter() == ' ') {
                ant.setLiga(p.getLiga());
                p = ant.getLiga();
            }
            else{
                ant = p;
                p = p.getLiga();
            }
        }
    }
    
//    public void eliUltCarPala2(){
//        Nodo p = cab.getLiga();
//        int contEsp = 0;
//        while(p != null){
//            if (p.getCaracter() == ' ') {
//                contEsp++;
//            }
//            if(contEsp == 1){
//                if (p.getCaracter() == ' ') {
//                    
//                }
//            }
//        }
//    }
    
    public int contarLetrasO(){
        Nodo p = cab.getLiga();
        int contEsp = 0;
        int contO = 0;
        while(p != null){
            if (p.getCaracter() == ' ') {
                contEsp++;
            }
            if (contEsp == 2 && p.getCaracter() == 'o') {
                contO++;
            }
            cab.setLiga(p.getLiga());
            p = cab.getLiga();
        }
        return contO;
    }
}
