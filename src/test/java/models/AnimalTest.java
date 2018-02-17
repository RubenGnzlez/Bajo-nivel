package models;

import models.enums.Genero;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ruben
 */
public class AnimalTest {
    //Pruebas unitarias
    // notacion: en codigo es una manera de identificar una propiedad adicional de una clase metodo propiedad o atributo


    @Test
    public void instanciaAnimalTest(){
        Animal animal = new Animal();
        Assert.assertTrue(Genero.FEMENINO.equals(animal.getGenero()));
        Assert.assertFalse(animal.getGenero().equals(Genero.MASCULINO));
    }
    @Test
    public void generoAnimalTest(){
        Assert.assertTrue(Genero.FEMENINO.getAmamanta());
    }
}
