package Binario;

public class LabABB {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        try {
            arbol.insertar(7);
            arbol.insertar(5);
            arbol.insertar(2);
            arbol.insertar(14);
            arbol.insertar(12);
            arbol.insertar(9);
            arbol.insertar(4);

            System.out.println("Datos del arbol inOrden");
            arbol.inOrden();
            System.out.println("Datos del arbol preOrden");
            arbol.preOrden();
            System.out.println("Datos del arbol postOrden");
            arbol.postOrden();

            System.out.println("La altura del árbol es:");
            System.out.println(arbol.altura());
            System.out.println("La profundidad de 4 es:");
            System.out.println(arbol.profundidad(4));
            System.out.println("La profundidad de 12 es:");
            System.out.println(arbol.profundidad(12));
            System.out.println("La profundidad de 9 es:");
            System.out.println(arbol.profundidad(9));
            System.out.println("Numero de nodos del arbol:");
            System.out.println(arbol.numNodos());
            System.out.println("Numero de hojas del arbol:");
            System.out.println(arbol.numHojas());
            System.out.println("Numero  de  nodos  internos  del arbol:");
            System.out.println(arbol.numInternos());
        }catch (ClaveDuplicadaException e){
            System.out.println(e.getMessage());
        } catch (ClaveNoEncontradaException e){
            System.out.println(e.getMessage());
        }
    }
}
