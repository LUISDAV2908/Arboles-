package Binario;

public class Nodo {
    private String Info;
    private Nodo Izq;
    private Nodo Der;

    //Constructores
    public Nodo(){
        this.Info = "Prueba";
        this.Der = null;
        this.Izq = null;
    }

    public Nodo(String T){
        this.Info = T;
        this.Der = null;
        this.Izq = null;
    }

    //Metodos basicos
    public String getInfo(){return Info;}
    public Nodo getNodoDer(){return Der;}
    public Nodo getNodoIzq(){return Izq;}
    public void setInfo(String I){this.Info = I;}
    public void setNodoIzq(Nodo n){this.Izq = n;}
    public void setNodoDer(Nodo n){this.Der = n;}

    

    
}
