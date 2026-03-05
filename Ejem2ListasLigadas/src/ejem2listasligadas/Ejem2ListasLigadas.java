
package ejem2listasligadas;
import java.util.Scanner;
public class Ejem2ListasLigadas {
    public static void main(String[] args) {
        String aNom, aId;
        char aSexo, opc;
        float aSal;
        Empleado unEmpleado;
        Scanner lector = new Scanner(System.in);
        ListaLigadaEmpleado objListaLigadaEmpleado = new ListaLigadaEmpleado();
        
        System.out.print("Digite la identificación del primer empleado: ");
        aId = lector.nextLine();
        while(!"/*".equals(aId)){
            System.out.print("Nombre: ");
            aNom = lector.nextLine();
            System.out.print("Sexo: ");
            aSexo = lector.next().charAt(0);
            System.out.print("Salario: ");
            aSal = lector.nextFloat();
            
            objListaLigadaEmpleado.CrearListaLigada(aId, aNom, aSexo, aSal);
            
            lector.nextLine();
            System.out.print("Digite la identificación del siguiente empleado: ");
            aId = lector.nextLine();
        }
        
        do{
            opc = menu();
            switch(opc){
                case '1':
                    System.out.print("Digite la identificación del empleado: ");
                    aId = lector.nextLine();
                    System.out.print("Nombre: ");
                    aNom = lector.nextLine();
                    System.out.print("Sexo: ");
                    aSexo = lector.next().charAt(0);
                    System.out.print("Salario: ");
                    aSal = lector.nextFloat();
                    objListaLigadaEmpleado.CrearListaLigada(aId, aNom, aSexo, aSal);
                    break;
                case '2':
                    System.out.println("\nIDENTIFI.\tNOMBRE\t\tSEXO\t\tSALARIO");
                    unEmpleado = objListaLigadaEmpleado.MostrarListaLigadaEmpleado();
                    while(!"".equals(unEmpleado.getNombre())){
                        System.out.println(unEmpleado.getId()+"\t\t"+unEmpleado.getNombre()+"\t\t"+unEmpleado.getSexo()+"\t\t"+
                        unEmpleado.getSalario());
                        unEmpleado = objListaLigadaEmpleado.MostrarListaLigadaEmpleado();
                    }
                    break;
                case '3':
                    System.out.println("Salario promedio de los hombres: "+objListaLigadaEmpleado.MostrarSalarioPromedioXGenero('m'));
                    break;
                case '4':
                    System.out.println("Salario promedio de los hombres: "+objListaLigadaEmpleado.MostrarSalarioPromedioXGenero('f'));
                    break;
                case '5':
                    System.out.println("Eligio salir");
                default:
                    break;        
            }
        }
        while(opc != '5');
        System.out.println("");

    }
    
    static char menu(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("\n\t ... MENÚ DE oPCIONES ...");
        System.out.println("1. Ingresar nuevo empleado");
        System.out.println("2. Mostrar datos de la lista");
        System.out.println("3. Mostrar salario promedio de los hombres");
        System.out.println("4. Mostrar salario promedio de las mujeres");
        System.out.println("5. Salir");
        do{
            System.out.print("Ingrese la opción(1 a 5): ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion > '5');
        return opcion;
    }
}
