package N_arios;
public class lab {
    public static void main(String[] args) throws Exception {
        Arbol a = new Arbol();
        System.out.println("---- Primer Arbol ----");
        a.insertar("A");  // significa la raiz
        a.insertar("A", "B");
        a.insertar("A", "C");
        a.insertar("B", "E");
        a.insertar("B", "F");
        a.insertar("E", "L");
        a.insertar("F", "I");
        a.insertar("F", "J");
        a.insertar("F", "K");
        a.insertar("C", "G");
        a.insertar("C", "H");
        a.insertar("H", "D");
        a.insertar("D", "M");
        System.out.println("EL RECORRIDO DEL ARBOL EN PREORDEN: ");
        System.out.println(a.preOrden());
        System.out.println("EL RECORRIDO DEL ARBOL EN POSORDEN: ");
        System.out.println(a.posOrden());
        System.out.println("EL RECORRIDO DEL ARBOL EN NIVELES: ");
        System.out.println(a.levelOrden());
        Arbol a2 = new Arbol();
        System.out.println("---- Segundo Arbol ----");
        a2.insertar("A");  // significa la raiz
        a2.insertar("A", "B");
        a2.insertar("A", "C");
        a2.insertar("A", "D");
        a2.insertar("B", "E");
        a2.insertar("C","F");
        a2.insertar("C","G");
        a2.insertar("G","K");
        a2.insertar("G","L");
        a2.insertar("D","H");
        a2.insertar("D","I");
        a2.insertar("D","J");
        System.out.println("EL RECORRIDO DEL ARBOL EN PREORDEN: ");
        System.out.println(a2.preOrden());
        System.out.println("EL RECORRIDO DEL ARBOL EN POSORDEN: ");
        System.out.println(a2.posOrden());
        System.out.println("EL RECORRIDO DEL ARBOL EN NIVELES: ");
        System.out.println(a2.levelOrden());
    }
}
