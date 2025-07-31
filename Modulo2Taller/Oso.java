package Modulo2Taller;

public  class Oso extends Piece {
    public Oso( Position position) {
        super(position);
    }

    public String getName(){
        return  "soy un Oso";
    }
    public String peso(){
        return "500 kg";
    }
    public String  MaximoEspecies(){
        return "5";
    }
    public String  maxSpeed(){
        return "2";
    }
    public String   kgMaximos(){
        return "80";
    }
}
