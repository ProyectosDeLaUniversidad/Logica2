
package ejer1hilerasll;

import java.util.Scanner;

public class Ejer1HilerasLL {

    public static void main(String[] args) {
        String texto;
        char opc, aCaracter, aCual, APorCual;
        Scanner lector = new Scanner(System.in);
        
        ListaHilera objHilera = new ListaHilera();
        
        System.out.println("Ingrese el texto(la hilera): ");
        texto = lector.nextLine();
        
        objHilera.repreHileraEnLL(texto);
        
        do{
            opc = menu();
            switch(opc){
                case '1':
                    System.out.print("\nHilera original: "+objHilera.getHilera());
                    System.out.print("\nHilera final:  ");
                    aCaracter = objHilera.mostrarHileraLL();
                    while(aCaracter != '*'){
                        System.out.print(aCaracter);
                        aCaracter = objHilera.mostrarHileraLL();
                    }
                    break;
                    
                case '2':
                    objHilera.LiberarLista();
                    System.out.print("Ingrese el nuevo texto:");
                    texto = lector.nextLine();
                    
                    objHilera.repreHileraEnLL(texto);
                    break;
                    
                case '3':
                    objHilera.eliEspacios();
                    break;
                    
                case '4':
                    
                    break;
                    
                case '5':
                    System.out.println("Total de letras 'o': "+objHilera.contarLetrasO());
                    break;
                    
                case '6':
                    
                    break;
                    
                case '7':
                    
                    break;
                    
                case '8':
                   
                    break;
                    
                case '9':
                    System.out.println("Eligio salir ...");
                    break;
                    
                default:
                    break;
            }
            System.out.println();
        }
        while(opc != '9');
        System.out.println();
    }
    
    public static char menu(){
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\n\t********** MENU DE OPCIONES **********");
        System.out.println("\t\t1. Mostrar hilera original y final");
        System.out.println("\t\t2. Ingresar nueva hilera");
        System.out.println("\t\t3. Eliminar los espacios");
        System.out.println("\t\t4. Eliminar el último carácter de la segunda palabra");
        System.out.println("\t\t5. Contar las 'o' que aparecen en la tercer palabra");
        System.out.println("\t\t6. Contar aparicion carácter");
        System.out.println("\t\t7. Eliminar aparaciones caracter");
        System.out.println("\t\t8. Cambiar caracter por otro");
        System.out.println("\t\t9. Salir");
        do{
            System.out.println("\t\t\tIngrese la opcion: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion > '9');
        return opcion;
    }
}
