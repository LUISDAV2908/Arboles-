package Binario;

public class Nodo {
    private int Info;
    private Nodo Izq;
    private Nodo Der;

    //Constructores
    public Nodo(){
        this.Info = -1;
        this.Der = null;
        this.Izq = null;
    }

    public Nodo(int T){
        this.Info = T;
        this.Der = null;
        this.Izq = null;
    }

    //Metodos basicos
    public int getInfo(){return Info;}
    public Nodo getNodoDer(){return Der;}
    public Nodo getNodoIzq(){return Izq;}
    public void setInfo(int I){this.Info = I;}
    public void setNodoIzq(Nodo n){this.Izq = n;}
    public void setNodoDer(Nodo n){this.Der = n;}

    

    
}
