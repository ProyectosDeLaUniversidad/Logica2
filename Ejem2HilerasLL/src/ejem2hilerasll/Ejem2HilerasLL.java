
package ejem2hilerasll;

import java.util.Scanner;

public class Ejem2HilerasLL {
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
                    objHilera.LiberarLista();
                    System.out.print("ingrese el nuevo texto:");
                    texto = lector.nextLine();
                    
                    objHilera.repreHileraEnLL(texto);
                    break;
                    
                case '2':
                    System.out.print("\nHilera original: "+objHilera.getHilera());
                    System.out.print("\nHilera final:  ");
                    aCaracter = objHilera.mostrarHileraLL();
                    while(aCaracter != '*'){
                        System.out.print(aCaracter);
                        aCaracter = objHilera.mostrarHileraLL();
                    }
                    break;
                    
                case '3':
                    if (objHilera.averPorVocales()) {
                        System.out.println("Si tiene las 5 vocales en minúscula");
                    }
                    else{
                        System.out.println("No tiene las 5 vocales en minúscula");
                    }
                    break;
                    
                case '4':
                    System.out.println("aes: "+objHilera.contApariciones('a'));
                    System.out.println("ees: "+objHilera.contApariciones('e'));
                    System.out.println("ies: "+objHilera.contApariciones('i'));
                    System.out.println("oes: "+objHilera.contApariciones('o'));
                    System.out.println("ues: "+objHilera.contApariciones('u'));
                    break;
                    
                case '5':
                    System.out.println("Aes: "+objHilera.contApariciones('A'));
                    System.out.println("Ees: "+objHilera.contApariciones('E'));
                    System.out.println("Ies: "+objHilera.contApariciones('I'));
                    System.out.println("Oes: "+objHilera.contApariciones('O'));
                    System.out.println("Ues: "+objHilera.contApariciones('U'));
                    break;
                    
                case '6':
                    System.out.println("Ingrese el caracter: ");
                    aCaracter = lector.next().charAt(0);
                    System.out.println("El caracter aparece: "+objHilera.contApariciones(aCaracter));
                    break;
                    
                case '7':
                    System.out.println("Ingrese el caracter a eliminar: ");
                    aCaracter = lector.next().charAt(0);
                    objHilera.eliApariciones(aCaracter);
                    break;
                    
                case '8':
                    System.out.println("Ingrese cual caracter: ");
                    aCual = lector.next().charAt(0);
                    System.out.println("Ingrese por cual caracter: ");
                    APorCual = lector.next().charAt(0);
                    objHilera.camCaracter(aCual, APorCual);
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
        System.out.println("\t\t1. Ingresar nueva hilera");
        System.out.println("\t\t2. Mostrar hilera original y final");
        System.out.println("\t\t3. Averiguar las 5 vocales");
        System.out.println("\t\t4. Contar vocales minúscula");
        System.out.println("\t\t5. Contar vocales mayúscula");
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
