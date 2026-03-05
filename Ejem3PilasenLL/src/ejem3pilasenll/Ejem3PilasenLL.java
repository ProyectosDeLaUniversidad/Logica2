
package ejem3pilasenll;

import java.util.Scanner;

public class Ejem3PilasenLL {

    public static void main(String[] args) {
        char aCaracter, opc;
        
        ClaseHilera hilera = new ClaseHilera();
        
        do{
            System.out.println();
            opc = menu();
            switch(opc){
                case '1':
                    hilera.creaHileraComoLL(LeerTextoValido());
                    break;
                case '2':
                    System.out.print("\nLa hilera es: ");
                    aCaracter = hilera.mostrarHileraLL();
                    while(aCaracter != '*'){
                        System.out.print(aCaracter+"");
                        aCaracter = hilera.mostrarHileraLL();
                    }
                    System.out.println();
                    break;
                case '3':
                    System.out.println("\n\nLa hilera esta bien emparejada = "+hilera.verificarEmparejamiento());
                    break;
                case '4':
                    break;
                default:
                    break;
            }
        }
        while(opc != '4');
        
        System.out.println();
    }
    
    public static String LeerTextoValido(){
        String texto;
        boolean bandera;
        int i;
        char c;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("\n\tIngrese el texto solo de estos simbolos {}[](): ");
            texto = lector.nextLine();
            bandera = false;
            i=0;
            while(i< texto.length() && !bandera){
                c = texto.charAt(i);
                if (c != '{' && c != '}' && c != '[' && c != ']' && c != '(' && c != ')') {
                    bandera = true;
                }
                else{
                    i++;
                }
            }
        }
        while(bandera);
        return texto;
    }
    
    public static char menu(){
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t... MENU DE OPCIONES MANEJO DE PILA");
        System.out.println("\t\t\t1. Ingresar una nueva hilera");
        System.out.println("\t\t\t2. Mostrar la hilera");
        System.out.println("\t\t\t3. Verificar si los simbolos estan bien emparejados");
        System.out.println("\t\t\t4. Salir");
        do{
            System.out.println("\t\t Opcion: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion > '4');
        return opcion;
    }
}
