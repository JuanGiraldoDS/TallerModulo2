package Modulo2Taller;

public  class Caballo  extends Piece {
    public Caballo( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Caballo";
    }
    public String peso(){
        return "400 kg";
    }
    public String  MaximoEspecies(){
        return "20";
    }
    public String  maxSpeed(){
        return "4";
    }
    public String   kgMaximos(){
        return "60";
    }
}
