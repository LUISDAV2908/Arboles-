package Binario;

import java.util.LinkedList;
import java.util.Queue;

public class Arbol {
    private Nodo raiz;

    public Arbol(){
        this.raiz = null;
    }

    public boolean isVacioABB(Nodo n){
        return n == null;
    }

    public void insertar(int Valor) throws ClaveDuplicadaException{
        raiz = insertar(raiz, Valor);
        
    }

    private Nodo insertar(Nodo actual, int valor) throws ClaveDuplicadaException{
        if(isVacioABB(actual)){
            return new Nodo(valor);
        }
        if(valor < actual.getInfo()){
            actual.setNodoIzq(insertar(actual.getNodoIzq(), valor));
        } else if(valor > actual.getInfo()){
            actual.setNodoDer(insertar(actual.getNodoDer(), valor));
        }else {
            String Error = "El valor "+ valor + "ya existe en el ABB";
            throw new ClaveDuplicadaException(Error);
        }
        return actual;
    }

    public void preOrden(){
        System.out.println("PREORDEN: ");
        preOrden(raiz);
        System.out.println();
    }
    private void preOrden(Nodo n){
        if(!isVacioABB(n)){
            System.out.print(n.getInfo() + " ");
            preOrden(n.getNodoIzq());
            preOrden(n.getNodoDer());
        }
    }

    public void inOrden(){
        System.out.println("Inorden: ");
        inOrden(raiz);
        System.out.println();
    }
    private void inOrden(Nodo n){
        if(!isVacioABB(n)){
            inOrden(n.getNodoIzq());
            System.out.print(n.getInfo() + " ");
            inOrden(n.getNodoDer());
        }
    }

    public void postOrden(){
        System.out.println("PostOrden: ");
        postOrden(raiz);
        System.out.println();
    }
    private void postOrden(Nodo n){
        if(!isVacioABB(n)){
            postOrden(n.getNodoIzq());
            postOrden(n.getNodoDer());
            System.out.print(n.getInfo() + " ");
        }
    }

    public int numNodos(){
        return numNodos(raiz);
    }
    private int numNodos(Nodo n){
        if(isVacioABB(n)){
            return 0;
        }
        return 1 + numNodos(n.getNodoIzq()) + numNodos(n.getNodoDer());
    }

    public int numHojas(){
        return numHojas(raiz);
    }
    private int numHojas(Nodo n){
        if(isVacioABB(n)){
            return 0;
        }
        if(isVacioABB(n.getNodoIzq()) && isVacioABB(n.getNodoDer())){
            return 1;
        }
        return numHojas(n.getNodoIzq()) + numHojas(n.getNodoDer());
    }

    public int numInternos(){
        return numInternos(raiz);
    }
    private int numInternos(Nodo n){
        if(isVacioABB(n)){
            return 0;
        }
        if(!isVacioABB(n.getNodoIzq()) || !isVacioABB(n.getNodoDer())){
            return 1 + numInternos(n.getNodoIzq()) + numInternos(n.getNodoDer());
        }
        return 0;
    }

    public int buscar(int valor) throws ClaveNoEncontradaException {
        return buscar(raiz, valor);
    }

    private int buscar(Nodo actual, int valor) throws ClaveNoEncontradaException {
        if (isVacioABB(actual)) {
            String Error = "El valor " + valor + " no existe en el ABB.";
            throw new ClaveNoEncontradaException(Error);
        }
        if (actual.getInfo() == valor) {
            return actual.getInfo();
        }
        if (valor < actual.getInfo()) {
            return buscar(actual.getNodoIzq(), valor);
        } else {
            return buscar(actual.getNodoDer(), valor);
        }
    }

    public int profundidad(int valor)throws ClaveNoEncontradaException{
        return profundidad(raiz, valor, 0);
    }
    private int profundidad(Nodo actual, int valor, int profundidad)throws ClaveNoEncontradaException{
        if (isVacioABB(actual)) {
            String Error = "El valor " + valor + " no existe en el ABB.";
            throw new ClaveNoEncontradaException(Error);
        }
        if (actual.getInfo() == valor) {
            return profundidad;
        }
        if (valor < actual.getInfo()) {
            return profundidad(actual.getNodoIzq(), valor, profundidad + 1);
        } else {
            return profundidad(actual.getNodoDer(), valor, profundidad + 1);
        }
    }

    public int altura(){
        return altura(raiz);
    }
    private int altura(Nodo n) {
        if (isVacioABB(n)) {
            return -1;
        }
        return 1 + Math.max(altura(n.getNodoIzq()), altura(n.getNodoDer()));
    }

    public boolean completo() {
        if (isVacioABB(raiz)) {
            return true;
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        boolean encontre = false;

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();

            if (actual == null) {
                encontre = true;
            } else {
                if (encontre) {
                    return false;
                }
                cola.add(actual.getNodoIzq());
                cola.add(actual.getNodoDer());
            }
        }

        return true;
    }
}
