package AVL;

public class LabABB {
    public static void main(String[] args) {
        Arbol_AVL arbol = new Arbol_AVL();
        Arbol_AVL arbol2 = new Arbol_AVL();

        try {
            System.out.println("Caso de prueba 1: 43, 21, 35, 61, 77, 79, 78, 26");
            arbol.insertar(43);
            arbol.insertar(21);
            arbol.insertar(35);
            arbol.insertar(61);
            arbol.insertar(77);
            arbol.insertar(79);
            arbol.insertar(78);
            arbol.insertar(26);
            arbol.inOrden();
            // Caso de prueba dos
            System.out.println("\nCaso de prueba 2: 50, 75, 60, 30, 15, 10, 12, 80");
            arbol2.insertar(50);
            arbol2.insertar(75);
            arbol2.insertar(60);
            arbol2.insertar(30);
            arbol2.insertar(15);
            arbol2.insertar(10);
            arbol2.insertar(12);
            arbol2.insertar(80);
            arbol2.inOrden();

        }catch (ClaveDuplicadaException e){
            System.out.println(e.getMessage());
        } //catch (ClaveNoEncontradaException e){
            //System.out.println(e.getMessage());
        //}
    }
}
