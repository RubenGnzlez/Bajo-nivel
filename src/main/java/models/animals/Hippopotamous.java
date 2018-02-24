package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Model that represents an {@code animals.Deer},this animals feeds on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Herbivorous
 * @since 1.0
 * @version 1.0

 */

public class Hippopotamous extends Herbivorous implements Consumidor{

    public Hippopotamous() {
    }

    @Override
    public void Comer() {
        System.out.println("muuuu");
    }

    @Override
    public String hablar(String leng, Integer dialecto) {
        return null;
    }


}

