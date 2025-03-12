package es.masanz.ut7.ejercicio4.model.base;

public interface Pokemon {

    void atacar(Pokemon enemigo);

    void recibirAtaque(Pokemon agresor, int cantidadDano);

}
