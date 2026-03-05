
package ejem1manejocolaenvector;

import java.util.Scanner;

public class Ejem1ManejoColaEnVector {

    public static void main(String[] args) {
        int elemento;
        char opc;
        Scanner lector = new Scanner(System.in);
        ColaEnVector objColaVector = new ColaEnVector(10);
        
        do{
            opc = menu();
            switch (opc) {
                case '1':
                    if (objColaVector.colaLlena()) {
                        System.out.println("-----> Cola llena");
                    }
                    else{
                        System.out.print("Ingrese el dato a encolar: ");
                        elemento = lector.nextByte();
                        objColaVector.encolar(elemento);
                    }
                    break;
                case '2':
                    if (objColaVector.colaVacia()) {
                        System.out.println("-----> Cola vacia");
                    }
                    else{
                        System.out.println("\n-----> Dato retirado "+objColaVector.desencolar());
                    }
                    break;
                case '3':
                    if (objColaVector.colaVacia()) {
                        System.out.println("\n----->Cola vacia");
                    }
                    else{
                        //objColaVector.mostrarCola();
                        elemento = objColaVector.mostrarCola();
                        while (elemento != -1) {                            
                            System.out.print(elemento+" ");
                            elemento = objColaVector.mostrarCola();
                        }
                    }
                    break;
                case '4':
                    System.out.println("\nEligió salir, fin de la ejecución");
                    break;
                default: break;
            }    
        }
        while(opc != '4');
        
        System.out.println();
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
