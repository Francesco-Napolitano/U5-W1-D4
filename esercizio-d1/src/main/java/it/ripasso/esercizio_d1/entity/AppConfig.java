package it.ripasso.esercizio_d1.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Topping topping_pomodoro() {
        return new Topping(1.49F, 1, "Pomodoro");
    }

    @Bean
    public Topping topping_mozzarella() {
        return new Topping(1.99F, 98, "Mozzarella");
    }

    @Bean
    public Topping topping_ham() {
        return new Topping(0.99F, 59, "Ham");
    }

    @Bean
    public Topping topping_cheese() {
        return new Topping(0.99F, 100, "Cheese");
    }

    @Bean
    public Topping topping_onions() {
        return new Topping(0.99F, 41, "Onions");
    }

    @Bean
    public Topping topping_pineapple() {
        return new Topping(0.99F, 130, "Pineapple");
    }

    @Bean
    public Topping topping_salami() {
        return new Topping(0.99F, 231, "Salami");
    }

    @Bean
    public Pizza pizza() {
        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(topping_pomodoro());
        toppings.add(topping_mozzarella());
        return new Pizza(9.99F, 500, "Pizza Margherita", toppings);
    }
}
