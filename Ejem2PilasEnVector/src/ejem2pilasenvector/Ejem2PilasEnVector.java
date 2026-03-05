
package ejem2pilasenvector;

import java.util.Scanner;

public class Ejem2PilasEnVector {

    public static void main(String[] args) {
        int cantidadReservada, elemento;
        char opc;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese las cantidades a reservar; ");
        cantidadReservada = lector.nextInt();
        
        Pila objetoPila = new  Pila(cantidadReservada);
        
        do{
            opc = menuManejoPila();
            switch(opc){
                case '1':
                    if (objetoPila.pilaLlena()) {
                        System.out.println("Desbordamiento(Pila llena");
                    }
                    else{
                        System.out.print("Digite dato a apilar");
                        elemento = lector.nextInt();
                        objetoPila.apilar(elemento);
                    }
                    break;
                case '2':
                    if (objetoPila.pilaVacia()) {
                        System.out.println("\nPILA VACIA\n");
                    }
                    else{
                        elemento = objetoPila.desapilar();
                        System.out.println("\nElemento retirado de la pila: "+elemento);
                    }
                    break;
                case '3'://falta
                    if (objetoPila.pilaVacia()) {
                        System.out.println("\nPILA VACIA\n");
                    }
                    
                    break;
                case '4':
                    System.out.println();
                    System.out.println("... Eligio salir ...");
                    break;
                default:
                    break;
            }
        }
        while(opc != '4');

    }
    
    static char menuManejoPila(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("MENU MANEJO PILA EN VECTOR");
        System.out.println("1. Apilar");
        System.out.println("2. Desapilar");
        System.out.println("3. Mostrar pila");
        System.out.println("4. Salir");
        do{
            System.out.println("Digite su opcion");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1'||opcion > '4');
        return opcion;
    }
            
}
