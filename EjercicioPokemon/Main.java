package EjercicioPokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pokemon> pokemonsDisponibles = new ArrayList<>();
        pokemonsDisponibles.add(new Pokemon("Charmander", Tipo.FUEGO, 50, 20));
        pokemonsDisponibles.add(new Pokemon("Squirtle", Tipo.AGUA, 55, 18));
        pokemonsDisponibles.add(new Pokemon("Bulbasaur", Tipo.PLANTA, 60, 16));

        System.out.println("Bienvenidos al simulador de batallas pokemon!");
        System.out.println("Elije tu pokemon: ");
        for(int i=0; i<pokemonsDisponibles.size(); i++) {
            System.out.println(i + 1 +". "+pokemonsDisponibles.get(i).getNombre());
        }
        int eleccion = scanner.nextInt();
        Pokemon elegido = pokemonsDisponibles.get(eleccion-1);
        System.out.println("Has seleccionado a " + elegido.getNombre() +  " Suerte");

        Pokemon enemigo;
        do {
            enemigo= pokemonsDisponibles.get(new Random().nextInt(pokemonsDisponibles.size()));

        }while (enemigo== elegido);
        System.out.println("tu oponente es " + enemigo.getNombre());
        //try {

       // } //catch (RuntimeException e)

    }
}
