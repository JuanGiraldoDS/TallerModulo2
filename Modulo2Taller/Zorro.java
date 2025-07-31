package Modulo2Taller;

public  class  Zorro extends Piece {
    public Zorro( Position position) {
        super(position);
    }

    public String getName(){
        return  "soy un Zorro";
    }
    public String peso(){
        return "8 kg";
    }
    public String  MaximoEspecies(){
        return "30";
    }
    public String  maxSpeed(){
        return "2";
    }
    public String   kgMaximos(){
        return "2";
    }
}
