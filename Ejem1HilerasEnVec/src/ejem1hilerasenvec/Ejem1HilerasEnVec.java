
package ejem1hilerasenvec;

public class Ejem1HilerasEnVec {

    public static void main(String[] args) {
        char aCar;
        HileraEnVector objHileraEnVec = new HileraEnVector("0123456789 son los digitos");
        objHileraEnVec.repHileraEnVec();
        
        aCar = objHileraEnVec.mostrarHilera();
        while(aCar != '*'){
            System.out.print(aCar);
            aCar = objHileraEnVec.mostrarHilera();
        }
        
        objHileraEnVec.camCaracter(11, 'S');
        System.out.println();
        
        aCar =objHileraEnVec.mostrarHilera();
        while(aCar != '*'){
            System.out.print(aCar);
            aCar = objHileraEnVec.mostrarHilera();
        }
        
        objHileraEnVec.inseCaracter(16, 'I');
        System.out.println();
        
        aCar =objHileraEnVec.mostrarHilera();
        while(aCar != '*'){
            System.out.print(aCar);
            aCar = objHileraEnVec.mostrarHilera();
        }
        
        System.out.println("\nTiene "+objHileraEnVec.getCantReal()+" caracteres");
        System.out.println("\n"+objHileraEnVec.getHilera());
        System.out.println();
    }
    
}
