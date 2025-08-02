package Modulo2Taller;

public class Boa extends Piece {
    public Boa( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Boa";
    }
    public String peso(){
        return "15 kg";
        // COMENTARIO
    }
    public String  MaximoEspecies(){
        return "30";
    }
    public String  maxSpeed(){
        return "1";
    }
    public String   kgMaximos(){
        return "3";
    }
}
