package models;

import models.animals.*;
import models.enums.Genero;
import models.interfaces.Consumidor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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


    @Test
    public void testComer(){
        List<Consumidor> animals = new ArrayList<>();
        Elephant e = new Elephant();
        Lion l = new Lion();
        Giraffe g = new Giraffe();
        Hippopotamous h = new Hippopotamous();
        Toucan t = new Toucan();


        t.correr("rapido","rapido","mas rapido", "supermegarapido","superarchirecontramegarapido");
        animals.add(e);
        animals.add(l);

        animals.add(h);

        Animal animal = new Animal(Genero.MASCULINO);
        System.out.println(animal);


        for(int i = 0; i<animals.size();i++){
            System.out.println(animals.get(i));
        }

        System.out.println("__________________________");

        for(Consumidor a : animals){
            a.Comer();
        }
        System.out.println("__________________________");

        // stream genera un buffer de datos que permite usar lambda,lo cual es como una funcion anonima
        animals.stream().forEach((Consumidor x)->{
            x.Comer();
        });


    }
}
