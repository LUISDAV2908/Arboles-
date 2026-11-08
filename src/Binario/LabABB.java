package Binario;

public class LabABB {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Arbol arbol2 = new Arbol();
        Arbol arbol3 = new Arbol();

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
            if(arbol.completo())
                System.out.println("El arbol es completo");
            else
                System.out.println("El arbol no es completo");
        // ----------------------------------------------------------
            System.out.println();
            System.out.println("Caso de Prueba 2: ");
            arbol2.insertar(8);
            arbol2.insertar(3);
            arbol2.insertar(10);
            arbol2.insertar(1);
            arbol2.insertar(6);
            arbol2.insertar(14);
            arbol2.insertar(4);
            arbol2.insertar(7);
            arbol2.insertar(13);
            System.out.println("Datos del arbol inOrden");
            arbol2.inOrden();
            System.out.println("Datos del arbol preOrden");
            arbol2.preOrden();
            System.out.println("Datos del arbol postOrden");
            arbol2.postOrden();
            System.out.println("La altura del árbol es:");
            System.out.println(arbol2.altura());

            // ----------------------------------------------------------
            System.out.println();
            System.out.println("Caso de Prueba 3: ");
            arbol3.insertar(15);
            arbol3.insertar(9);
            arbol3.insertar(20);
            arbol3.insertar(6);
            arbol3.insertar(14);
            arbol3.insertar(17);
            arbol3.insertar(64);
            arbol3.insertar(13);
            arbol3.insertar(26);
            arbol3.insertar(72);
            System.out.println("Datos del arbol inOrden");
            arbol3.inOrden();
            System.out.println("Datos del arbol preOrden");
            arbol3.preOrden();
            System.out.println("Datos del arbol postOrden");
            arbol3.postOrden();
            System.out.println("La altura del árbol es:");
            System.out.println(arbol3.altura());
            System.out.println("La profundidad de 4 es:");
            System.out.println(arbol3.profundidad(4));
            System.out.println("La profundidad de 12 es:");
            System.out.println(arbol3.profundidad(12));
            System.out.println("La profundidad de 9 es:");
            System.out.println(arbol3.profundidad(9));
            System.out.println("Numero de nodos del arbol:");
            System.out.println(arbol3.numNodos());
            System.out.println("Numero de hojas del arbol:");
            System.out.println(arbol3.numHojas());
            System.out.println("Numero  de  nodos  internos  del arbol:");
            System.out.println(arbol3.numInternos());
            if(arbol3.completo())
                System.out.println("El arbol es completo");
            else
                System.out.println("El arbol no es completo");

            System.out.println("Busqueda de 9: "+" "+arbol3.buscar(9));
        }catch (ClaveDuplicadaException e){
            System.out.println(e.getMessage());
        } catch (ClaveNoEncontradaException e){
            System.out.println(e.getMessage());
        }
    }
}
