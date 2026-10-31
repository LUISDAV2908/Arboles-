package Binario;

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
            preOrden(n.getNodoIzq());
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
    



}
