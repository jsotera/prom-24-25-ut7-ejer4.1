package es.masanz.ut7.ejercicio4.model.entities;

import es.masanz.ut7.ejercicio4.model.base.Pokemon;
import es.masanz.ut7.ejercicio4.model.types.Planta;

public class Bulbasaur implements Pokemon, Planta {

    public Bulbasaur() {

    }

    @Override
    public void atacar(Pokemon enemigo) {
        System.out.println(this.getClass().getSimpleName() + " esta atacando a " + enemigo.getClass().getSimpleName());
        enemigo.recibirAtaque(this, 10);
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        int puntosDeVideRecuperados = recuperarVida();
        System.out.println("\n" + this.getClass().getSimpleName() + " recibe " + cantidadDano + " puntos de dano de " + agresor.getClass().getSimpleName() + " pero recupera " + puntosDeVideRecuperados + " puntos de vida");
    }

    @Override
    public int recuperarVida() {
        return 5;
    }
}
