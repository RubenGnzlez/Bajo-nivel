package models;

/**
 * Created by Ruben on 09/02/18.
 */

import models.enums.Genero;

import java.awt.*;

public class Animal {
    private Genero genero;
    private Color color;
    private Double peso;
    private Double altura;
    private Boolean hiberna;
// siempre debe existir un constructor vacio o blanco a menos que queramos establecer reglas por default
    // en constructor en blanco se deben inicializar todas las variables que pueda contener
    public Animal() {
        this.setGenero(Genero.FEMENINO);
        this.setColor(Color.BLACK);
        this.setPeso(0.1d);
        this.setAltura(0.1d);
        this.setHiberna(Boolean.FALSE);



    }

    public Animal(Genero genero) {
        this();
        this.setGenero(genero);
    }

    public Animal(Genero genero, Color color) {
        this(genero);
        this.setColor(color);

    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getHiberna() {
        return hiberna;
    }

    public void setHiberna(Boolean hiberna) {
        this.hiberna = hiberna;
    }
}
