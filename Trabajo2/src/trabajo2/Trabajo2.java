
package trabajo2;

import java.util.Scanner;

/**
 *
 * @author Huber Arroyave y Carlos Cordoba
 */
public class Trabajo2 {

    public static void main(String[] args) {
        char opc;
        int numColas, codigo, valor, acumulado;
        
        Scanner lector = new Scanner(System.in);
        ListaLigada objCola = new ListaLigada();
        
        System.out.println("Ingrese la cantidad de colas: ");
        numColas = lector.nextInt();
        Vectores vectores = new Vectores(numColas);
        
        for (int i = 0; i < numColas; i++) {
            do{
                opc = menu();
                switch (opc) {
                    case '1':
                        System.out.println("Ingrese el codigo a encolar: ");
                        codigo = lector.nextInt();
                        System.out.println("Ingrese el valor a encolar: ");
                        valor = lector.nextInt();
                        objCola.encolar(codigo, valor);
                        break;
                    case '2':
                        if (objCola.colaVacia()) {
                            System.out.println("Cola vacia");
                        }
                        else{
                            codigo = objCola.desencolar();
                            System.out.println("Elemento retirado(codigo): "+codigo);//se muestra la id
                        }
                        break;
                    case '3':
                        if (objCola.colaVacia()) {
                            System.out.println("Cola vacia");
                        }
                        else{
                            System.out.println("Elementos de la cola: ");
                            System.out.print("\n--->");
                            valor = objCola.mostrarCola();
                            while (valor != 0) {                            
                                System.out.print(valor+" ");
                                valor = objCola.mostrarCola();
                            }
                        }
                        System.out.println();
                        break;
                    case '4':
                        if (objCola.colaVacia()) {
                            System.out.println("Cola vacia");
                        }
                        else{
                            acumulado = objCola.acumulado();
                            System.out.println("El valor acumulado de la compra es de: "+acumulado);
                        }
                        break;
                    case '5':
                        System.out.println("Eligio salir");
                        vectores.insertar(objCola);
                        //System.out.println(vectores); observar de que si se guarda en el vector
                        System.out.println("Cola "+(i+1)+" guardada");
                        break;
                    default: break;
                }
            }
            while(opc != '5');
        }
    }
    
    static char menu(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("\n....MENU DE OPCIONES....");
        System.out.println("\t1. Encolar");
        System.out.println("\t2. Desencolar");
        System.out.println("\t3. Mostrar cola");
        System.out.println("\t4. Mostrar acumulado");
        System.out.println("\t5. Salir");
        do{
            System.out.print("\tOpcion: ");
            opcion = lector.next().charAt(0);
        }
        while (opcion < '1' || opcion > '5');
        return opcion;
    }    
}
