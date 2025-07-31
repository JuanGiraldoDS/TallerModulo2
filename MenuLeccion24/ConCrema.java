package MenuLeccion24;

public class ConCrema implements Bebida{
    private Bebida bebidaBase;
    public ConCrema(Bebida bebidaBase){
        this.bebidaBase=bebidaBase;
    }
    public String beber(){
        return bebidaBase.beber()+ "con crema";
    }

}
