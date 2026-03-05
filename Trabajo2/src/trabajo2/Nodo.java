
package trabajo2;

public class Nodo {
    private int codigo, valor;
    private Nodo liga;

    public Nodo(int codigo, int valor) {
        this.codigo = codigo;
        this.valor = valor;
        liga = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
