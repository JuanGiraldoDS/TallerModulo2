package Modulo2Taller;

public  class Jabali extends Piece {
    public Jabali( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un Jabali";
    }
    public String peso(){
        return "400 kg";
    }
    public String  MaximoEspecies(){
        return "50";
    }
    public String  maxSpeed(){
        return "2";
    }
    public String   kgMaximos(){
        return "50";
    }
}
