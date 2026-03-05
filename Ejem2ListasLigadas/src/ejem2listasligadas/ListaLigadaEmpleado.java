
package ejem2listasligadas;
public class ListaLigadaEmpleado {
    private NodoEmpleado cab, ult, x;
    
    public ListaLigadaEmpleado(){
        cab = new NodoEmpleado("", "", ' ', 0.0f);
        ult = cab;
        x = cab;
    }
    
    public void CrearListaLigada(String pId, String pNom, char pSexo, float pSal){
        NodoEmpleado p = new NodoEmpleado(pId, pNom, pSexo, pSal);
        ult.setLiga(p);
        ult = p;
    }
    
    public Empleado MostrarListaLigadaEmpleado(){
        x = x.getLiga();
        if(x == null){
            x = cab;
        }
        return x.getEmpleado();
    }
    
    public float MostrarSalarioPromedioXGenero(char pSexo){
        int contEmp=0;
        float acumSal=0.0f, salProm=0.0f;
        NodoEmpleado p = cab.getLiga();
        while(p != null){
            if (p.getEmpleado().getSexo() == pSexo) {
                contEmp++;
                acumSal += p.getEmpleado().getSalario();
            }
            p = p.getLiga();
        }
        salProm = acumSal/contEmp;
        return salProm;
    }
}
