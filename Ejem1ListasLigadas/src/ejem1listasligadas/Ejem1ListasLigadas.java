
package ejem1listasligadas;
import java.util.Scanner;

public class Ejem1ListasLigadas {
    public static void main(String[] args) {
        int aNum;
        Scanner lector = new Scanner(System.in);
        
        ListaLigada objListaLigada = new ListaLigada();
        
        System.out.print("Digite el primer dato de la colección (999 para salir): ");
        aNum = lector.nextInt();
        while(aNum != 999){
            objListaLigada.CrearListaLigada(aNum);
            System.out.print("Digite el siguiente dato de la colección (999 para salir): ");
            aNum = lector.nextInt();
        }
        System.out.println("");
        
        aNum = objListaLigada.MostrarLista();
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        
        System.out.println("El promedio es: "+objListaLigada.promedio());
        System.out.println("");
        
        objListaLigada.intercambiarInfoDosPrimeros();
        
        System.out.println("El menor de los  primeros es: "+objListaLigada.menorTresPrimeros());
        
        aNum = objListaLigada.MostrarLista();
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        System.out.println("");
    }
    
}
