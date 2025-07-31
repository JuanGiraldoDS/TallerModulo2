package Modulo2Taller;

public class Conejo extends Piece {
    public Conejo( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Aguila";
    }
    public String peso(){
        return "2 kg";
    }
    public String  MaximoEspecies(){
        return "150";
    }
    public String  maxSpeed(){
        return "2";
    }
    public String   kgMaximos(){
        return "0,45";
    }
}
