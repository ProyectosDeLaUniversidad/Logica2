
package ejem1pilasenll;

import java.util.Scanner;

public class Ejem1PilasEnLL {

    public static void main(String[] args) {
        char opc;
        int elemento;
        Scanner lector = new Scanner(System.in);
        
        ListaLigada objPila = new ListaLigada();
        do{
            System.out.println();
            opc = menuManejoPila();
            switch(opc){
                case '1':
                    System.out.println();
                    System.out.println("Elemento a apilar: ");
                    elemento = lector.nextInt();
                    objPila.apilar(elemento);
                    break;
                case '2':
                    System.out.println();
                    if (objPila.pilaVacia()) {
                        System.out.println("Pila Vacia");
                    }
                    else{
                        elemento = objPila.desapilar();
                        System.out.println("El elemento retirado es: "+elemento);
                    }
                    break;
                case '3':
                    System.out.println();
                    if (objPila.pilaVacia()) {
                        System.out.println("Pila Vacia");
                    }
                    else {
                        System.out.println("Los datos apilados son: ");
                        elemento = objPila.mostrarPila();
                        while(elemento !=0){
                            System.out.print(elemento+" ");
                            elemento = objPila.mostrarPila();
                        }
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
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\tMENU DE OPCIONES MANEJO PILA");
        System.out.println("\t\t1. Apilar");
        System.out.println("\t\t2. Desapilar");
        System.out.println("\t\t3. Mostrar pila");
        System.out.println("\t\t4. Salir");
        do{
            System.out.print("\t\t\tOpcion: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1'  || opcion >'4');
        return opcion;
    }
}
