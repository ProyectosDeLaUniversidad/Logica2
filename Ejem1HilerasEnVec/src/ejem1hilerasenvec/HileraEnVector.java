
package ejem1hilerasenvec;

public class HileraEnVector {
    private String hilera;
    private char[] vectorHilera;
    private int cantReal, x;
    
    public HileraEnVector(String hilera){
        this.hilera = hilera;
        cantReal = hilera.length();
        vectorHilera = new char[cantReal+10];
        x = -1;
    }

    public String getHilera() {
        return hilera;
    }

    public int getCantReal() {
        return cantReal;
    }

    public void repHileraEnVec(){
        for (int i = 0; i < hilera.length(); i++) {
            vectorHilera[i] = hilera.charAt(i);
        }
    }
    
    public char mostrarHilera(){
        ++x;
        if (x <= cantReal) {
            return vectorHilera[x];
        }
        else{
            x = -1;
            return '*';
        }
    }
    
    public void camCaracter(int pPos, char pChar){
        vectorHilera[pPos] = pChar;
    }
    
    public void inseCaracter(int pPos, char pChar){
        for (int i = (cantReal-1); i >= pPos; i--) {
            vectorHilera[i+1]=vectorHilera[i];
        }
        vectorHilera[pPos]=pChar;
        ++cantReal;
    }
}
