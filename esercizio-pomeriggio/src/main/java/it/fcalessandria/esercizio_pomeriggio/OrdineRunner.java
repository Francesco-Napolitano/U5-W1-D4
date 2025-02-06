package it.fcalessandria.esercizio_pomeriggio;

import it.fcalessandria.esercizio_pomeriggio.config.AppConfig;
import it.fcalessandria.esercizio_pomeriggio.ordine.Ordine;
import it.fcalessandria.esercizio_pomeriggio.entities.Menu;
import it.fcalessandria.esercizio_pomeriggio.ordine.Stato;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class OrdineRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    private final AppConfig appConfig;

    @Override
    public void run(String... args)  throws Exception{
        System.out.println("\n🔥 Benvenuto nel ristorante! 🔥\n");

        menu.printMenu();

        Ordine ordine = new Ordine(1, Stato.in_corso, 2, 0, null);
        ordine.aggiungiPizza(menu.getPizzaList().getFirst());
        ordine.aggiungiBevande(menu.getDrinkList().get(1));
        ordine.aggiungiTopping(menu.getToppingList().get(2));

        
        ordine.printOrdine();

    }
}
