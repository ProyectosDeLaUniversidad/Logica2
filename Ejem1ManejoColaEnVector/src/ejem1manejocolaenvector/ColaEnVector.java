
package ejem1manejocolaenvector;

public class ColaEnVector {
    private int[] vCola;
    private int primero, ultimo, maximo, x;
    
    public ColaEnVector(int pCantReser){
        maximo = pCantReser;
        vCola = new int[maximo];
        primero = 0;
        ultimo = -1;
        x=-1;
    }
    
    public void encolar(int pDato){
        ++ultimo;
        vCola[ultimo] = pDato;
    }
    
    public int desencolar(){
        int datoDesencolado;
        datoDesencolado = vCola[primero];
        x=primero;//ojo
        ++primero;
        return datoDesencolado;
    }
    
//    public void mostrarCola(){//ojo con la transportabilidad
//        System.out.print("\n---> ");
//        for (int i = primero; i <= ultimo; i++) {
//            System.out.print(vCola[i]+" ");
//        }
//    }
    
    public int mostrarCola(){//presenta fallas
        int dato;
        ++x;
        if (x <= ultimo) {
            dato = vCola[x]; 
        }
        else{
            dato = -1;
            x = -1;
        }
        return dato;
    }
    
    public boolean colaVacia(){
        boolean vacia=false;
        if(primero > ultimo){
            ultimo = -1;
            primero = 0;
            vacia = true;
        }
        return vacia;
    }
    
    public boolean colaLlena(){
        int p, k;
        if (primero == 0 && ultimo == (maximo-1)) {
            return true;
        }
        else{
            if (ultimo == (maximo-1)) {
                k = 0;
                for (p = primero; p <= ultimo; p++) {
                    vCola[k] = vCola[p];
                    ++k;
                }
                ultimo = maximo-1-primero;
                primero = 0;
            }
            return false;
        }
    }
}
