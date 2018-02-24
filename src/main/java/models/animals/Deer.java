package models.animals;

import models.enums.TypeHerviborous;
import models.subtypes.Herbivorous;
/**
 * Model that represents an {@code animals.Deer},this animals feeds on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Herbivorous
 * @since 1.0
 * @version 1.0

 */


public class Deer extends Herbivorous {
    private Double longCuernos;
    private Boolean cuernos;
    private Boolean extinto;


    public Deer() {
        this.extinto = Boolean.FALSE;
        this.setTypeHerviborous(TypeHerviborous.GRANIVOROUS);
    }

}