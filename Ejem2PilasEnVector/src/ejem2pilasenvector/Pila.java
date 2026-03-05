
package ejem2pilasenvector;

public class Pila {
    private int[] pila;
    private int tope, maximo, x;
   
    public Pila(int pCantReservada){
       maximo = pCantReservada-1;
       pila = new int[maximo+1];
       tope = -1;
       x = -1;
    }
    
    public boolean pilaLlena(){
        return(tope == maximo);
    }
    
    public boolean pilaVacia(){
        return(tope == -1);
    }
    
    public void apilar(int pNum){
        ++tope;
        pila[tope] = pNum;
        x=tope;
    }
    
    public int desapilar(){
        int datoDesapilado;
        datoDesapilado =pila[tope];
        --tope;
        x=tope;
        return datoDesapilado;
    }
    
    public int mostrarPila(){
        int dato;
        if (x == -1) {
            dato=0; //0 es el dato centinela
            x = tope;
        }
        else{
            dato=pila[x];
            --x;
        }
        return dato;
    }
}
