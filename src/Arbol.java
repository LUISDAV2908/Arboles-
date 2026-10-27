import java.util.*;
public class Arbol {
    private String nombre;
    private Nodo Raiz;

    public Arbol(String nombre){
        this.nombre = nombre;
        this.Raiz = null;
    }

    public Nodo getRaiz(){
        return Raiz;
    }

    public Nodo Buscar(Nodo act, String dato){
        if(act == null)return null;
        if(act.getInfo().equals(dato))return act;

        for(Nodo hijo : act.getHijos()){
            Nodo encontrado = Buscar(hijo, dato);
            if(encontrado != null)return encontrado;
        }
        return null;
    }

    public boolean Insertar(String padre, String valorInfo){
        if(this.Raiz == null){
            this.Raiz = new Nodo(valorInfo);
            return true;
        }
        return Insertar(getRaiz(), valorInfo, padre);
    }

    public boolean Insertar(Nodo act, String valorInfo, String padre){
        if(act == null){
            return false;
        }
        if(act.getInfo() != null && act.getInfo().equals(padre)){
            act.addHijo(new Nodo(valorInfo));
            return true;
        }

        for(Nodo hijo : act.getHijos()){
            if(Insertar(hijo, padre, valorInfo)){
                return true;
            }
        }
        return false;
    }


}
