package Modulo2Taller;

public class Oveja extends Piece {
    public Oveja( Position position) {
        super(position);
    }
    public String getName()
    {
        return  "soy un Oveja";
    }

    public String peso(){
        return "70 kg";
    }
    public String  MaximoEspecies(){
        return "140";
    }
    public String  maxSpeed(){
        return "3";
    }
    public String   kgMaximos(){
        return "15";
    }
}
