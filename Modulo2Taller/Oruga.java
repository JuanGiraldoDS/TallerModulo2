package Modulo2Taller;

public class Oruga extends Piece {
    public Oruga( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Aguila";
    }
    public String peso(){
        return "0.01 kg";
    }
    public String  MaximoEspecies(){
        return "1000";
    }
    public String  maxSpeed(){
        return "0";
    }
    public String   kgMaximos(){
        return "0";
    }
}
