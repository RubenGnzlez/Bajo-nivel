package models.animals;

import models.subtypes.Herbivorous;

/**
 * Model that represents an {@code animals.Deer},this animals feeds on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Herbivorous
 * @since 1.0
 * @version 1.0

 */

public class Giraffe extends Herbivorous {
    private Boolean manchasRegulares;
    private Double longCuello;

    public Giraffe() {
        this.manchasRegulares =  Boolean.FALSE;
        this.longCuello =  300d;

    }
}
