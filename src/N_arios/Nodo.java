package N_arios;
import java.util.*;
public class Nodo {
    private String info;
    private List<Nodo> hijos;
    

    public Nodo(){
        this.info = null;
        this.hijos = new ArrayList<>();
    }

    public Nodo(String s){
        this.info = s;
        this.hijos = new ArrayList<>();
    }

    public void setInfo(String s){
        this.info = s;

    }

    public String getInfo(){
        return info;
    }

    public void addHijo(Nodo hijo){
        this.hijos.add(hijo);
    }

    public List<Nodo> getHijos(){
        return hijos;
    }

    public void addHijo(Nodo hijo, int posicion){
        if(posicion >= 0 && posicion <= hijos.size()){
            this.hijos.add(posicion, hijo);
        } else {
            this.hijos.add(hijo);
        }
    }

}

