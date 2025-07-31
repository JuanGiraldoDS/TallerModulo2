package MenuLeccion24;

public class ConLeche implements Bebida{
    private Bebida bebidaBase;
    public ConLeche(Bebida bebidaBase){ // constructor
        this.bebidaBase=bebidaBase;
    }
    public String beber(){
        return bebidaBase.beber()+ "con leche";
    }
}
