
package ejernodo;
public class EjerNodo {
    public static void main(String[] args) {
        Nodo p1, p2, p3, p4, p5, p;
        int aux, mayor, producto;

        p1 = new Nodo(7);
        p2 = new Nodo(4);
        p3 = new Nodo(5);
        p4 = new Nodo(2);
        p5 = new Nodo(9);

        aux = p1.getNumero();
        p1.setNumero(p2.getNumero());
        p2.setNumero(aux);

        if (p1.getNumero()>p2.getNumero() && p1.getNumero()>p3.getNumero())
        {
            mayor = p1.getNumero();
        }
        else
        {
            if(p2.getNumero()>p3.getNumero())
            {
                mayor = p2.getNumero();
            }
            else
            {
                mayor = p3.getNumero();
            }
        }

        producto = p4.getNumero()*p5.getNumero();

        System.out.println("");
        
        p1.setLiga(p2);
        p2.setLiga(p3);
        p3.setLiga(p4);
        p4.setLiga(p5);

        p = p1;
        p1=p2=p3=p4=p5=null;
        while(p != null)
        {
            System.out.print(p.getNumero()+" ");
            p = p.getLiga();
        } 
    }

}
