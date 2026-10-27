import java.util.*;
public class Arbol {
    private String nombre;
    private Nodo Raiz;

    public Arbol(){
        this.nombre = "";
        this.Raiz = null;
    }

    public Arbol(String nombre){
        this.nombre = nombre;
        this.Raiz = null;
    }

    public Nodo getRaiz(){
        return Raiz;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setRaiz(Nodo raiz){
        this.Raiz = raiz;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean estaVacio(){
        return getRaiz() == null;
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

    public boolean Insertar(String padre){
        if(estaVacio()){
            setRaiz(new Nodo(padre));
            return true;
        }
        return false;
    }

    public boolean Insertar(String padre, String valorInfo){
        if(estaVacio()){
            setRaiz(new Nodo(valorInfo));
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
            if(Insertar(hijo,valorInfo,padre)){
                return true;
            }
        }
        return false;
    }

    public boolean borrar(String valorInfo){
        if(estaVacio())return false;
        if(getRaiz().getInfo() != null && getRaiz().getInfo().equals(valorInfo)){
            setRaiz(null);;
            return true;
        }
        return borrar(getRaiz(),valorInfo);
    }

    public boolean borrar(Nodo act,String valorInfo){
        if(act == null){
            return false;
        }
        
        for(int i = 0; i < act.getHijos().size();i++){
            Nodo hijo = act.getHijos().get(i);
            if(hijo.getInfo() != null && hijo.getInfo().equals(valorInfo)){
                act.getHijos().remove(i);
                return true;
            }
        }

        for(Nodo p : act.getHijos()){
            if(borrar(p,valorInfo)){
                return true;
            }
        }
        return false;
    }




}
