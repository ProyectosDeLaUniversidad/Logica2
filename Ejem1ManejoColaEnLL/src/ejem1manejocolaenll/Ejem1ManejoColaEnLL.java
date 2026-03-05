
package ejem1manejocolaenll;

import java.util.Scanner;

public class Ejem1ManejoColaEnLL {
    public static void main(String[] args) {
        char opc;
        int elemento;
        Scanner lector = new Scanner(System.in);
        ListaLigada objCola = new ListaLigada();
        
        do{
            opc = menu();
            switch (opc) {
                case '1':
                    System.out.println("Ingrese el dato a encolar: ");
                    elemento = lector.nextByte();
                    objCola.encolar(elemento);
                    break;
                case '2':
                    if (objCola.colaVacia()) {
                        System.out.println("Cola vacia");
                    }
                    else{
                        elemento = objCola.desencolar();
                        System.out.println("Elemento retirado "+elemento);
                    }
                    break;
                case '3':
                    if (objCola.colaVacia()) {
                        System.out.println("Cola vacia");
                    }
                    else{
                        System.out.print("\n--->");
                        elemento = objCola.mostrarCola();
                        while (elemento != 0) {                            
                            System.out.print(elemento+" ");
                            elemento = objCola.mostrarCola();
                        }
                    }
                    System.out.println();
                    break;
                case '4':
                    System.out.println("Eligió salir, fin de la ejecución");
                    break;
                default: break;
            }    
        }
        while(opc != '4');
    }
    
    static char menu(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("\n....MENU DE OPCIONES....");
        System.out.println("\t1. Encolar");
        System.out.println("\t2. Desencolar");
        System.out.println("\t3. Mostrar cola");
        System.out.println("\t4. Salir");
        do{
            System.out.print("\tOpcion: ");
            opcion = lector.next().charAt(0);
        }
        while (opcion < '1' || opcion > '4');
        return opcion;
    }
}
