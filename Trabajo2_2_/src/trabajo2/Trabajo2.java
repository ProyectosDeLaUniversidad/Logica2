
package trabajo2;

import java.util.Scanner;

/**
 *
 * @author Huber Arroyave y Carlos Cordoba
 */
public class Trabajo2 {

    public static void main(String[] args) {
        char opc;
        int numColas, codigo, valor, acumulado, colaModi;
        Compra unCompra;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de colas: ");
        numColas = lector.nextInt();
        int[] vector = new int[numColas];
        
        do{
            System.out.println("Ingrese el numero de la cola que desea modificar(1 hasta "+numColas+"):");
            colaModi=lector.nextInt();
            
        }
        while(colaModi < 1 || colaModi > vector.length);
        System.out.println("\tCOLA # "+(colaModi));
        ListaLigada objCola = new ListaLigada(vector.length+1);
        
        do{
            opc = menu();
            switch (opc) {
                case '1':
                    System.out.println("Ingrese el codigo a encolar: ");
                    codigo = lector.nextInt();
                    System.out.println("Ingrese el valor a encolar: ");
                    valor = lector.nextInt();
                    objCola.encolar(codigo, valor, colaModi);
                    break;
                case '2':
                    if (objCola.colaVacia(colaModi)) {
                        System.out.println("Cola vacia");
                    }
                    else{
                        unCompra = objCola.desencolar(colaModi);
                        System.out.println("Elemento retirado: ");
                        System.out.println("\nCodigo | Precio");
                        System.out.println(""+unCompra.getCodigo()+" \t"+unCompra.getValor());
                    }
                    break;
                case '3':
                    if (objCola.colaVacia(colaModi)) {
                        System.out.println("Cola vacia");
                    }
                    else{
                        System.out.println("Elementos de la cola: ");
                        System.out.println("\nCodigo | Precio");
                        unCompra = objCola.mostrarCola(colaModi);
                        while (unCompra.getValor() != 0) {                            
                            System.out.println(""+unCompra.getCodigo()+" \t"+unCompra.getValor());
                            unCompra = objCola.mostrarCola(colaModi);
                        }
                    }
                    System.out.println();
                    break;
                case '4':
                    if (objCola.colaVacia(colaModi)) {
                        System.out.println("Cola vacia");
                    }
                    else{
                        acumulado = objCola.acumulado(colaModi);
                        System.out.println("El valor acumulado de la compra es de: "+acumulado);
                    }
                    break;
                case '5':
                    System.out.println("Eligio salir de la cola");
                    do{
                        System.out.println("Ingrese el numero de la cola que desea modificar(1 hasta "+(numColas)+"):");
                        colaModi=lector.nextInt();
                    }
                    while(colaModi < 1 || colaModi > vector.length);
                    System.out.println("\tCOLA # "+(colaModi));
                        
                    break;
                case '6':
                    System.out.println("Eligio finalizar");
                    break;
                default: break;
            }
        }
        while(opc != '6');
    }
    
    static char menu(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("\n....MENU DE OPCIONES....");
        System.out.println("\t1. Encolar");
        System.out.println("\t2. Desencolar");
        System.out.println("\t3. Mostrar cola");
        System.out.println("\t4. Mostrar acumulado");
        System.out.println("\t5. Salir de la cola");
        System.out.println("\t6. Finalizar");
        do{
            System.out.print("\tOpcion: ");
            opcion = lector.next().charAt(0);
        }
        while (opcion < '1' || opcion > '6');
        return opcion;
    } 
}
