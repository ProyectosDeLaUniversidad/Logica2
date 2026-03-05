
package ejer2listasligadas;

import java.util.Scanner;

public class Ejer2ListasLigadas {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int aNum, nuevo;
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
        System.out.println("");
        
        System.out.print("Digite el nuevo dato de la colección: ");
        aNum = lector.nextInt();
        objListaLigada.insertarSegundo(aNum);
        aNum = objListaLigada.MostrarLista();  
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        
        System.out.println("");
        
        if (objListaLigada.sumatoriaMult5()==0) {
            System.out.println("El primer dato no es multiplo de 5");
        }
        else{
            System.out.println("La sumatoria del primer dato es "+objListaLigada.sumatoriaMult5());
        }     
        
        objListaLigada.eliminarSegDato();
        aNum = objListaLigada.MostrarLista();  
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        
        System.out.println("Cambio del segundo dato");
        objListaLigada.cambiarSegundo();
        
        System.out.println("");
        aNum = objListaLigada.MostrarLista();            
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        System.out.println("");
    }  
}
