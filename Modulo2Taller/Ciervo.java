package Modulo2Taller;

public  class Ciervo extends Piece {
    public Ciervo( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Aguila";
    }
    public String peso(){
        return "300 kg";
    }
    public String  MaximoEspecies(){
        return "20";
    }
    public String  maxSpeed(){
        return "4";
    }
    public String   kgMaximos(){
        return "50";
    }
}
