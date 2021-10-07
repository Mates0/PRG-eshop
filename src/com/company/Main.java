package com.company;


public class Main {

    public static void main(String[] args) {
        Eshop alza = new Eshop("alza");
        Product nokia3310 = new Product("Nokia 3310", 500, "Cihlový telefon, dokáže zníčit i ty nejpevnější zdi.");
        Product samsungnote7 = new Product("Samsung Galaxy Note 7", 5000,"Pečlivá jihokorejská výroba, po 3 hodinách používání vybouchne v ruce.");
        Product cats31 = new Product("CAT S31", 3000, "Telefon pro pravé boomery");
        alza.addToStock(nokia3310);
        alza.addToStock(samsungnote7);
        alza.addToStock(cats31);
        alza.sell(cats31);
        System.out.println("Cena naskladněného zboží je: " + alza.getCostsofAllStocks());
        System.out.println("Váš výdělek naskladněného zboží je: " + alza.getProfit());
    }
}
