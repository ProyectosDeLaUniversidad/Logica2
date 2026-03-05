
package ejem3listadoblementeligada;
import java.util.Scanner;
public class Ejem3ListaDoblementeLigada {
    public static void main(String[] args) {
        int aNum;
        Scanner lector = new Scanner(System.in);
        
        ListaDoble objListaDoble = new ListaDoble();
        do{
            System.out.print("Digite el primer dato de la colección: ");
            aNum = lector.nextInt();
        }
        while(aNum <= 0);
        
        while(aNum != 999){
            objListaDoble.CrearListaDoble(aNum);
            do{
                System.out.print("Digite el siguiente dato de la colección: ");
                aNum = lector.nextInt();
            }
            while(aNum <= 0);
        }
        System.out.println();
        System.out.print("--> ");
        aNum = objListaDoble.MostrarListaDoble();
        while(aNum != 0){
            System.out.print(aNum+", ");
            aNum = objListaDoble.MostrarListaDoble();
        }
        System.out.println("\nHay "+objListaDoble.ContarImpares()+" impares");
        
        System.out.println("Digite el dato a eliminar: ");
        aNum = lector.nextInt();
        
        if(objListaDoble.EliminarPrimeraAparicion(aNum) == true){
            System.out.println("Eliminación exitosa");
        }
        else{
            System.out.println("El dato no exite ");
        }
        System.out.println("");
        
        System.out.println();
        System.out.print("--> ");
        aNum = objListaDoble.MostrarListaDoble();
        while(aNum != 0){
            System.out.print(aNum+", ");
            aNum = objListaDoble.MostrarListaDoble();
        }
    }
    
    
}
