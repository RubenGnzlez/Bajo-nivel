package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Carnivorous;



public class Lion extends Carnivorous implements Consumidor{

    private Boolean melena;

    public Lion() {
        this.melena = Boolean.TRUE;
    }

    @Override
    public void Comer() {
        System.out.println("guuuuuuur");
    }

    @Override
    public String hablar(String leng, Integer dialecto) {
        return null;
    }
}
