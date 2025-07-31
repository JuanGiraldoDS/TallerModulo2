package Modulo2Taller;

public  class Pato extends Piece {
    public Pato( Position position) {
        super(position);
    }
    public String getName(){
        return  "soy un pato";
    }
    public String peso(){
        return "1 kg";
    }
    public String  MaximoEspecies(){
        return "200";
    }
    public String  maxSpeed(){
        return "4";
    }
    public String   kgMaximos(){
        return "0.15";
    }
}
