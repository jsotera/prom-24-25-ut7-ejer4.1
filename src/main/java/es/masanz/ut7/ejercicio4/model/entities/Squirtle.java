package es.masanz.ut7.ejercicio4.model.entities;

import es.masanz.ut7.ejercicio4.model.base.Pokemon;
import es.masanz.ut7.ejercicio4.model.types.Agua;
import es.masanz.ut7.ejercicio4.model.types.Fuego;

public class Squirtle implements Pokemon, Agua {

    public Squirtle() {

    }

    @Override
    public void atacar(Pokemon enemigo) {
        System.out.println(this.getClass().getSimpleName()+" esta atacando a "+enemigo.getClass().getSimpleName());
        enemigo.recibirAtaque(this, 10);
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        double factorR = resistenciaAlFuego(agresor);
        System.out.println("\n"+this.getClass().getSimpleName()+" recibe "+(cantidadDano*factorR)+" puntos de dano de "+agresor.getClass().getSimpleName()+" debido a que su factor de resistencia ha sido "+factorR);
    }

    @Override
    public double resistenciaAlFuego(Pokemon agresor){
        double factor = 1;
        if(agresor instanceof Fuego){
            factor = 0.5;
        }
        return factor;
    }

}
