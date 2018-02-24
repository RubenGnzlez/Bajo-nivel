package models.enums;

/**
 * Created by Ruben
 */
public enum TypeCarnivorous {
    CARROÑERO(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE),
    CAZADOR(Boolean.TRUE,Boolean.FALSE,Boolean.FALSE),
    MIXTO(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);

    private Boolean eatsPray;
    private Boolean eatsCorpse;
    private Boolean eatsBoth;

    TypeCarnivorous(Boolean eatsPray, Boolean eatsCorpse, Boolean eatsBoth) {
        this.eatsPray = eatsPray;
        this.eatsCorpse= eatsCorpse;
        this.eatsBoth = eatsBoth;
    }


    public Boolean getEatsPray() {
        return eatsPray;
    }

    public Boolean getEatsCorpse() {
        return eatsCorpse;
    }

    public Boolean getEatsBoth() {
        return eatsBoth;
    }
}
