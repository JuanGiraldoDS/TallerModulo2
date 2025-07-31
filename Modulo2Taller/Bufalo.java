package Modulo2Taller;

public  class Bufalo extends Piece {
    public Bufalo( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Aguila";
    }
    public String peso(){
        return "700 kg";
    }
    public String  MaximoEspecies(){
        return "10";
    }
    public String  maxSpeed(){
        return "3";
    }
    public String   kgMaximos(){
        return "100";
    }
}
