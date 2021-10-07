package com.company;

import java.util.ArrayList;

public class Eshop {
    private String eshopname;
    private ArrayList<Product> eshop = new ArrayList<>();
    private int profit;
    private int stock;

    public Eshop(String eshopname) {
        this.eshopname = eshopname;
        setEshopName(eshopname);
    }

    public void setEshopName(String eshopname) {
        this.eshopname = eshopname;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addToStock(Product product) {
        eshop.add(product);
        profit += product.getProductprice();
        stock += product.getProductprice();
        setStock(stock);
    }

    public void sell(Product product) {
        try {
            stock -= product.getProductprice();
            setStock(stock);
            eshop.remove(product);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nejde nic prodat, jelikož ve skladu nic není");
        }
    }

    public int getProfit() {
        return profit;
    }

    public int getCostsofAllStocks() {
        return stock;
    }
}
