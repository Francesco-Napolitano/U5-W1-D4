package it.ripasso.esercizio_d1.entity;

import it.ripasso.esercizio_d1.more.MainFood;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevande extends MainFood {
    private String name;
    private float quantity;

    public Bevande(float prezzo, float kcal, String name, float quantity) {
        super(prezzo, kcal);
        this.name = name;
        this.quantity = quantity;
    }
}
