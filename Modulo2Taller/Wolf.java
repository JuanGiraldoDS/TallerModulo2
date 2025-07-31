package Modulo2Taller;

public class Wolf extends Piece  {

    public Wolf( Position position) {
        super(position);
    }

    public String getName(){
        return  "soy un Lobo";
    }

    public String peso(){
        return "50 kg";
    }
    public String  MaximoEspecies(){
        return "30";
    }
    public String  maxSpeed(){
        return "3";
    }
    public String   kgMaximos(){
        return "8";
    }

}
