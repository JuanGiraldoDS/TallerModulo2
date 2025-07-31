package Modulo2Taller;

public  class Cabra extends Piece {
    public Cabra( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Cabra";
    }
    public String peso(){
        return "60 kg";
    }
    public String  MaximoEspecies(){
        return "140";
    }
    public String  maxSpeed(){
        return "3";
    }
    public String   kgMaximos(){
        return "10";
    }
}
