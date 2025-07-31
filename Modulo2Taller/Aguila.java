package Modulo2Taller;

public  class Aguila extends Piece {
    public Aguila( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Aguila";
    }
    public String peso(){
        return "6 kg";
    }
    public String  MaximoEspecies(){
        return "20";
    }
    public String  maxSpeed(){
        return "3";
    }
    public String   kgMaximos(){
        return "1";
    }


}
