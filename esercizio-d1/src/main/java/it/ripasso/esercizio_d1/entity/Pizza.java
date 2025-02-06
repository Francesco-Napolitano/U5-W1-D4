package it.ripasso.esercizio_d1.entity;

import it.ripasso.esercizio_d1.more.MainFood;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString

public class Pizza extends MainFood {

    private String name;
    private ArrayList<Topping> toppings;

    public Pizza(float prezzo, float kcal, String name, ArrayList<Topping> toppings) {
        super(prezzo, kcal);
        this.name = name;
        this.toppings = toppings;
    }
}
