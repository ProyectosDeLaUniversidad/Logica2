
package trabajo1;

public class Empleado {
    private String nom, id;
    private float salBru, boni, dedu, salNeto;

    public Empleado(String id, String nom, float salBru, float boni, float dedu) {
        this.id = id;
        this.nom = nom;
        this.salBru = salBru;
        this.boni = boni;
        this.dedu = dedu;
        this.salNeto = salBru + boni - dedu;
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    public float getSalBru() {
        return salBru;
    }

    public float getBoni() {
        return boni;
    }

    public float getDedu() {
        return dedu;
    }

    public float getSalNeto() {
        return salNeto;
    }
  
}
