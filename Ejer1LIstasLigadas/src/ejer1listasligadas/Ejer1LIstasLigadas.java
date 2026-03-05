
package ejer1listasligadas;

import java.util.Scanner;

public class Ejer1LIstasLigadas {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int aNum;
        ListaLigada objListaLigada = new ListaLigada();
        
        do{
            System.out.print("Digite el primer dato de la colección (999 para salir): ");
            aNum = lector.nextInt();
        }
        while(aNum <= 0);

        while(aNum != 999){
            objListaLigada.CrearListaLigada(aNum);
            do{
                System.out.print("Digite el siguiente dato de la colección (999 para salir): ");
                aNum = lector.nextInt();
            }
            while(aNum <= 0);
        }
            
        System.out.println("");
        aNum = objListaLigada.MostrarLista();            
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        System.out.println("");
        
        System.out.println("El promedio de los impares es: "+objListaLigada.promedioImpares());
            
        System.out.println("la cantidad de numeros superiores al promedio de los impares es: "+objListaLigada.impares());
        
        System.out.println("El mayor es: "+objListaLigada.calcularMayor());
        
        System.out.println("El menor es: "+objListaLigada.calcularMenor());
        
        System.out.print("Digite el dato a eliminar: ");
        aNum = lector.nextInt();
        
        if(objListaLigada.eliminarPrimeraAparicion(aNum) == true){
            System.out.println("Eliminación exitosa");
        }
        else{
            System.out.println("El dato no exite ");
        }
        
        System.out.println("");
        aNum = objListaLigada.MostrarLista();            
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
        
        objListaLigada.reversarLista();
        
        System.out.println("");
        aNum = objListaLigada.MostrarLista();            
        while(aNum != 0){
            System.out.print(aNum+" ");
            aNum = objListaLigada.MostrarLista();
        }
    }
    
    
}
