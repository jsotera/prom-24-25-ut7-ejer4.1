package es.masanz.ut7.ejercicio4.model.entities;

import es.masanz.ut7.ejercicio4.model.base.Pokemon;
import es.masanz.ut7.ejercicio4.model.types.Fuego;

public class Charmander implements Pokemon, Fuego {

    public Charmander() {

    }

    @Override
    public void atacar(Pokemon enemigo) {
        System.out.println(this.getClass().getSimpleName()+" esta atacando a "+enemigo.getClass().getSimpleName());
        int quemadura = quemar(enemigo);
        enemigo.recibirAtaque(this, 10+quemadura);
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        System.out.println("\n"+this.getClass().getSimpleName()+" recibe "+cantidadDano+" puntos de dano de "+agresor.getClass().getSimpleName());
    }

    @Override
    public int quemar(Pokemon agresor){
        int quemadura = 5;
        if(agresor instanceof Fuego){
            quemadura = 0;
        }
        return quemadura;
    }

}
