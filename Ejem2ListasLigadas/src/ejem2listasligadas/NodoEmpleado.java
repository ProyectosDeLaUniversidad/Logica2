
package ejem2listasligadas;
public class NodoEmpleado {
    private Empleado objEmpleado;
    private NodoEmpleado liga;
    
    public NodoEmpleado(String pId, String pNom, char pSexo, float pSal){
        objEmpleado = new Empleado(pId,pNom, pSexo, pSal);
        liga = null;
    }

    public Empleado getEmpleado() {
        return objEmpleado;
    }

    public NodoEmpleado getLiga() {
        return liga;
    }

    public void setLiga(NodoEmpleado liga) {
        this.liga = liga;
    }
    
    
    
}
