
package trabajo1;

public class NodoDobleEmpleado {
    private Empleado objEmpleado;
    private NodoDobleEmpleado ligaDer, ligaIzq;
    
    public NodoDobleEmpleado(String pId, String pNom, float pSalBru, float pBoni, float pDedu){
        objEmpleado = new Empleado(pId, pNom, pSalBru, pBoni, pDedu);
        ligaDer = null;
        ligaIzq = null;
    }

    public Empleado getEmpleado() {
        return objEmpleado;
    }

    public NodoDobleEmpleado getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDobleEmpleado ligaDer) {
        this.ligaDer = ligaDer;
    }

    public NodoDobleEmpleado getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDobleEmpleado ligaIzq) {
        this.ligaIzq = ligaIzq;
    }
   
}
