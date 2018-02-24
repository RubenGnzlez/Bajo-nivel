package models.enums;

public enum TypeHerviborous {

    FUGIVOROUS(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    FOLIVOROUS(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE),
    XILOFAGOUS( Boolean.FALSE, Boolean.FALSE, Boolean.TRUE,Boolean.FALSE),
    GRANIVOROUS(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);

    private Boolean eatsGrass;
    private Boolean eatsSeeds;
    private Boolean eatsWood;
    private Boolean eatsFlowers;




    //propiedades o metodos del enum que se vuelven estaticas conforme al valor


    TypeHerviborous(Boolean eatsGrass, Boolean eatsSeeds, Boolean eatsWood, Boolean eatsFlowers) {
        this.eatsFlowers = eatsFlowers;
        this.eatsGrass = eatsGrass;
        this.eatsSeeds = eatsSeeds;
        this.eatsWood = eatsWood;
    }

    public Boolean getEatsGrass() {
        return eatsGrass;
    }

    public Boolean getEatsSeeds() {
        return eatsSeeds;
    }

    public Boolean getEatsWood() {
        return eatsWood;
    }

    public Boolean getEatsFlowers() {
        return eatsFlowers;
    }
}
