
package ejem2listasligadas;
public class Empleado {
    private String id;
    private String nombre;
    private char sexo;
    private float salario;
    
    public Empleado(String pId, String pNom, char pSexo, float pSal){
        id = pId;
        nombre = pNom;
        sexo = pSexo;
        salario = pSal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
