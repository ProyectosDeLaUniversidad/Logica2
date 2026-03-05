
package trabajo1;


public class ListaDobleEmpleado {
    private NodoDobleEmpleado cab, ult, x;
    
    public ListaDobleEmpleado(){
        cab = new NodoDobleEmpleado("","",0,0,0);
        ult = cab;
        x = cab;
    } 
    
    public void CrearListaDoble(String pId, String pNom, float pSalBru, float pBoni, float pDedu){
        NodoDobleEmpleado p = new NodoDobleEmpleado(pId, pNom, pSalBru, pBoni, pDedu);
        ult.setLigaDer(p);
        p.setLigaIzq(ult);
        ult = p;
    }
    
    public Empleado MostrarListaDoble(){
        x = x.getLigaDer();
        if(x == null){
            x = cab;
        }
        return x.getEmpleado();
    }
        
    public boolean eliminar(String aId){
        boolean elimino = false;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            if(p.getEmpleado().getId().equals(aId)){
                if (p.getLigaIzq() != null && p.getLigaDer()!= null) {
                    p.getLigaIzq().setLigaDer(p.getLigaDer());
                    p.getLigaDer().setLigaIzq(p.getLigaIzq());
                }
                else if(p.getLigaIzq() != null && p.getLigaDer() == null){
                   p.getLigaIzq().setLigaDer(null);
                }
                p = null;
                elimino = true;
            }
            else{
                p = p.getLigaDer();
            }
        }
        return elimino;
    }
    
    public float promedioSalNeto(){
        int cont=0, acum =0 ;
        float prom;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            cont++;
            acum+= p.getEmpleado().getSalNeto();
            p = p.getLigaDer();
        }
        prom = (float) acum/cont;
        return prom;
    }
    
    public float totalDedu(){
        float totalDedu =0;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            totalDedu += p.getEmpleado().getDedu();
            p = p.getLigaDer();
        }
        return totalDedu;
    }
    
    public float totalBoni(){
        float totalBoni =0;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            totalBoni += p.getEmpleado().getBoni();
            p = p.getLigaDer();
        }
        return totalBoni;
    }
    
    public float calcularSalMay(){
        float may =0;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            if(p.getEmpleado().getSalNeto()>may) {
                may = p.getEmpleado().getSalNeto();
                p = p.getLigaDer();
            }
            else{
                p = p.getLigaDer();
            }
        }
        return may;
    }
    public String idSalarMayor(){
        String cedulas = "";
        float may=0;
        NodoDobleEmpleado p = cab.getLigaDer();
        while(p != null){
            if(p.getEmpleado().getSalNeto()>may) {
                cedulas = p.getEmpleado().getId();
                may = p.getEmpleado().getSalNeto();
            }if(p.getEmpleado().getSalNeto() == may && !cedulas.contains(p.getEmpleado().getId())){
                cedulas += "," + p.getEmpleado().getId();
            }
            p = p.getLigaDer();
        }
        return cedulas;
    }
}
