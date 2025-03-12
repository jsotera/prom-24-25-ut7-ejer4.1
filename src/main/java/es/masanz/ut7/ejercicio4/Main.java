package es.masanz.ut7.ejercicio4;

import es.masanz.ut7.ejercicio4.model.base.Pokemon;
import es.masanz.ut7.ejercicio4.model.entities.Bulbasaur;
import es.masanz.ut7.ejercicio4.model.entities.Charmander;
import es.masanz.ut7.ejercicio4.model.entities.Squirtle;

public class Main {

    public static void main(String[] args) {

        Pokemon bulbasur = new Bulbasaur();

        Pokemon charmander = new Charmander();

        Pokemon squirtle = new Squirtle();

        pelear(bulbasur, charmander);
        pelear(charmander, squirtle);
        pelear(squirtle, bulbasur);

    }

    public static void pelear(Pokemon pokemon1, Pokemon pokemon2){
        System.out.println("********************************");
        System.out.println("*    RESULTADOS DEL COMBATE    *");
        System.out.println("********************************");
        int turno = 1;
        while(turno<3){
            if(turno % 2 == 0) {
                pokemon1.atacar(pokemon2);
            } else {
                pokemon2.atacar(pokemon1);
            }
            turno++;
        }
    }
}