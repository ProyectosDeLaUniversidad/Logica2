
package ejem1hilerasll;

public class Ejem1HilerasLL {

    public static void main(String[] args) {
        String cadena = "Hola, este es otra hilera para prueba si o no";
        char aCarac;
        ListaHilera objHilera1 = new ListaHilera(cadena);
        
        objHilera1.repHilerEnLL();
        
        aCarac = objHilera1.mostrarHileraDeLL();
        while(aCarac != '*'){
            System.out.print(aCarac);
            aCarac = objHilera1.mostrarHileraDeLL();
        }
        System.out.println("\nTiene: "+objHilera1.contAparCarac('a')+" aes minúsculas");
        System.out.println();
    }
    
}
