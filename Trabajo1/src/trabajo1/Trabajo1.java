
package trabajo1;

import java.util.Scanner;

public class Trabajo1 {

    public static void main(String[] args) {
        String aNom, aId;
        char opc;
        float aSalBru, aBoni, aDedu;
        Empleado unEmpleado;
        Scanner lector = new Scanner(System.in);
        ListaDobleEmpleado objListaDoble = new ListaDobleEmpleado();
        
        System.out.println("Digite la identificación del primer empleado (/* para salir): ");
        aId = lector.nextLine();
        while(!"/*".equals(aId)){
            System.out.println("Nombre: ");
            aNom = lector.nextLine();
            System.out.println("Salario bruto: ");
            aSalBru = lector.nextFloat();
            System.out.println("Bonificación: ");
            aBoni = lector.nextFloat();
            System.out.println("Deducción: ");
            aDedu = lector.nextFloat();
            
            objListaDoble.CrearListaDoble(aId, aNom, aSalBru, aBoni, aDedu);
            
            lector.nextLine();
            System.out.println("Digite la identificación del siguiente empleado (/* para salir): ");
            aId = lector.nextLine();
        }
        
        do{
            opc = menu();
            switch(opc){
                case '1':
                    lector.nextLine();
                    System.out.println("Digite la identificación del empleado: ");
                    aId = lector.nextLine();
                    System.out.println("Nombre: ");
                    aNom = lector.nextLine();
                    System.out.println("Salario bruto: ");
                    aSalBru = lector.nextFloat();
                    System.out.println("Bonificación: ");
                    aBoni = lector.nextFloat();
                    System.out.println("Deducción: ");
                    aDedu = lector.nextFloat();
            
                    objListaDoble.CrearListaDoble(aId, aNom, aSalBru, aBoni, aDedu);
            
                    break;
                case '2':
                    System.out.println("Ingrese la identificacion del empleado que desea eliminar: ");
                    aId = lector.nextLine();
                    if(objListaDoble.eliminar(aId) == true){
                        System.out.println("Eliminación exitosa");
                    }
                    else{
                        System.out.println("El dato no exite ");
                    }
                    break;
                case '3':
                    
                    System.out.println("\nIDENTIFICACION\tNOMBRE\t\tSALARIO NETO");
                    unEmpleado = objListaDoble.MostrarListaDoble();
                    while(!"".equals(unEmpleado.getNom())){
                        System.out.println(unEmpleado.getId()+"\t\t"+unEmpleado.getNom()+"\t\t"+unEmpleado.getSalNeto());
                        unEmpleado = objListaDoble.MostrarListaDoble();
                    }
                    break;
                case '4':
                    System.out.println("Salario neto promedio de los empleados: "+objListaDoble.promedioSalNeto());
                    break;
                case '5':
                    System.out.println("Monto total de deducciones "+objListaDoble.totalDedu());
                    break;
                case '6':
                    System.out.println("Monto total de bonificaciones "+objListaDoble.totalBoni());
                    break;
                case '7':
                    System.out.println("Salario neto mayor de los empleados "+objListaDoble.calcularSalMay());
                    break;
                case '8':
                    System.out.println("Cedula(s) de los empleado(s) con mayor salario neto "+objListaDoble.idSalarMayor());
                    break; 
                case '9':
                    System.out.println("Eligio salir");
                default:
                    break;        
            }
        }
        while(opc != '9');
        System.out.println("");

    }
    
    static char menu(){
        char opcion;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("\n\t ... MENÚ DE OPCIONES ...");
        System.out.println("1. Ingresar un nuevo empleado");
        System.out.println("2. Eliminar un empleado");
        System.out.println("3. Mostrar los datos de la lista");
        System.out.println("4. Mostrar el salario neto promedio de los empleados");
        System.out.println("5. Mostrar el monto total de deducciones");
        System.out.println("6. Mostrar el monto total de bonificaciones");
        System.out.println("7. Mostrar el salario neto mayor de los empleados");
        System.out.println("8. Mostrar la(s) cedula(s) de los empleado(s) con mayor salario neto");
        System.out.println("9. Salir");
        
        do{
            System.out.print("Ingrese la opción(1 a 9): ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion > '9');
        return opcion;
    }
    
}
