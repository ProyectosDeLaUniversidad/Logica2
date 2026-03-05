
package ejem1recursion;

public class Ejem1Recursion {
    static int i;
    public static void main(String[] args) {
//        i=1;
//        solucion(i,10);
        int base=3, exp=4;
        System.out.println(base+" a la "+exp+" = "+potencia(base, exp));
        System.out.println();
    }
    
//    public static void solucion(int k, int m){
//        if (k <= m) {
//            System.out.println((i++)+" Llamar metodos es un concepto poderoso");
//            solucion(k+1, m);
//        }
//    }
    
    public static int potencia(int n, int r){
        int x;
        if (r == 0) {
            x=1;
        }
        else{
            x=n*potencia(n, r-1);
        }
        return x;
    }
    
}
