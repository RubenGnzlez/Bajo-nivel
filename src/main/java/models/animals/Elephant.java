package models.animals;

import models.enums.TypeHerviborous;
import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Model that represents an {@code animals.Deer},this animals feeds on meat.
 * @author Ruben arturo Gonzalez
 * @see models.Herbivorous
 * @since 1.0
 * @version 1.0

 */

public class Elephant extends Herbivorous implements Consumidor{
    @Override
    public String toString() {
        return "soy un elefante";
    }

    private Boolean razaExtinta ;
    private Boolean colmillos;
    private TypeHerviborous typeHerviborous;

    public Elephant() {
        this.setColmillos(Boolean.TRUE);
        this.setRazaExtinta(Boolean.TRUE);
    }

    public Boolean getRazaExtinta() {
        return razaExtinta;
    }

    public void setRazaExtinta(Boolean razaExtinta) {
        this.razaExtinta = razaExtinta;
    }

    public Boolean getColmillos() {
        return colmillos;
    }

    public void setColmillos(Boolean colmillos) {
        this.colmillos = colmillos;
    }


    @Override
    public void Comer() {
        System.out.println("ñom ñom");
    }

    @Override
    public String hablar(String leng, Integer dialecto) {
        return "Hablo como quiero" + "";
    }
}
