package models.animals;

import models.subtypes.Herbivorous;

import java.util.Arrays;
import java.util.List;

public class Toucan extends Herbivorous{
    public void correr(String... args) {
        List<String> argsList = Arrays.asList(args);
        argsList.stream().forEach((String e)->{
            System.out.println(e);
        });
    }
}
