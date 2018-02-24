package models.subtypes;

import models.Animal;
import models.enums.TypeHerviborous;

/**
 * Model that represents an {@code models.Animal},this animals doesnt feed on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 *
 */

public class Herbivorous extends Animal{
    private TypeHerviborous typeHerviborous;

    public Herbivorous() {

        this.setTypeHerviborous(TypeHerviborous.XILOFAGOUS);
    }

    public TypeHerviborous getTypeHerviborous() {
        return typeHerviborous;
    }

    public void setTypeHerviborous(TypeHerviborous typeHerviborous) {
        this.typeHerviborous = typeHerviborous;
    }
}
