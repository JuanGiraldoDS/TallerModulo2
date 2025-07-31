package MenuLeccion24;

public class Main {
    public static void main(String[] args) {
        // Juan pide un cafe
        CafeSimple cafeSimple = new CafeSimple();
        System.out.println(cafeSimple.beber());
        // Maria pide un te con leche
        TeSimple teSimple = new TeSimple();
        ConLeche teConLeche = new ConLeche(teSimple);
        System.out.println(teConLeche.beber());
        // Alberto pide un cafe con crema
        CafeSimple otroCafeSimple = new CafeSimple();
        ConCrema cafeConCrema = new ConCrema(otroCafeSimple);
        System.out.println(cafeConCrema.beber());
    }


}
