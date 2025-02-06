package it.ripasso.esercizio_d1.entity;

import it.ripasso.esercizio_d1.more.MainFood;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Topping extends MainFood {
    private String name;

    public Topping(float prezzo, float kcal, String name) {
        super(prezzo, kcal);
        this.name = name;
    }
}
