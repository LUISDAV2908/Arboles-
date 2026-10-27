public class lab {
    public static void main(String[] args) throws Exception {
        Arbol a = new Arbol();
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
        System.out.println("EL RECORRIDO DEL ARBOL EN POSORDEN: ");
        System.out.println(a.posOrden());
    }
}
