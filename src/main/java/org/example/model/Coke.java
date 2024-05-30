package org.example.model;

public class Coke extends ProductForSale{
    private int volume;

    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{Type: "+getType()+" Price: "+getPrice()+" Description: "+getDescription()+" Cocoa Pct: "+getVolume());
    }
}
