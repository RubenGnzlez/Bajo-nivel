package models.subtypes;

import models.Animal;
import models.enums.TypeCarnivorous;
import models.enums.TypeHerviborous;

/**
 * Model that represents an {@code models.Animal},this animals feeds on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Animal
 * @since 1.0
 * @version
 *
 */

public class Carnivorous extends Animal {

    private TypeCarnivorous typeCarnivorous;

    public Carnivorous() {
        this.setTypeCarnivorous(TypeCarnivorous.MIXTO);
    }

    public TypeCarnivorous getTypeCarnivorous() {
        return typeCarnivorous;
    }

    public void setTypeCarnivorous(TypeCarnivorous typeCarnivorous) {
        this.typeCarnivorous = typeCarnivorous;
    }
}