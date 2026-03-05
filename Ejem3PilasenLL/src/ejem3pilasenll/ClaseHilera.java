
package ejem3pilasenll;

public class ClaseHilera {
    private Nodo cab, ult, x;
    private char[] pila; //declaracion
    private int tope;

    public ClaseHilera() {
        cab = new Nodo('*');
        ult = x = cab;
        pila = new char[30]; //definicion
    }
    
    public void creaHileraComoLL(String pHilera){
        liberarLista();
        tope = -1;
        Nodo p;
        for (int i = 0; i < pHilera.length(); i++) {
            p = new Nodo(pHilera.charAt(i));
            ult.setLiga(p);
            ult = p;
        }
    }
    
    public boolean verificarEmparejamiento(){
        char car;
        boolean emparejada = true;
        Nodo p = cab.getLiga();
        while(p != null && emparejada){
            car = p.getCaracter();
            switch (car){
                case '{':
                case '[':
                case '(':
                    apilar(car);
                    break;
                case '}':
                    if (pilaVacia() || desApilar() != '{'){
                        emparejada = false;
                    }
                    break;
                case ']':
                    if (pilaVacia() || desApilar() != '[') {
                        emparejada = false;
                    }
                case ')':
                    if (pilaVacia() || desApilar() != '[') {
                        emparejada = false;
                    }
                    break;
                default: break;
            }
            p = p.getLiga();
        }
        if (!pilaVacia()) {
            emparejada= false;
        }
        return emparejada;
    }
    
    public char mostrarHileraLL(){
        x = x.getLiga();
        if (x == null) {
            x = cab;
        }
        return x.getCaracter();
    }
    
    private void apilar(char pCar){
        ++tope;
        pila[tope] = pCar;
    }
    
    private char desApilar(){
        char datoDesapilado;
        datoDesapilado = pila[tope];
        --tope;
        return datoDesapilado;
    }
    
    private boolean pilaVacia(){
        return (tope == -1);
    }
    
    private void liberarLista(){
        Nodo p = cab.getLiga();
        while(p != null){
            cab.setLiga(p.getLiga());
            p = cab.getLiga();
        }
        ult = cab;
    }
}
