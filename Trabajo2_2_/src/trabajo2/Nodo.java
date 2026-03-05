
package trabajo2;

public class Nodo {
    private Compra objCompra;
    private Nodo liga;

    public Nodo(int pCodigo, int pvalor) {
        objCompra = new Compra(pCodigo, pvalor);
        liga = null;
    }

    public Compra getObjCompra() {
        return objCompra;
    }

    public void setObjCompra(Compra objCompra) {
        this.objCompra = objCompra;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    
}
