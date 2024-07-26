package org.example.enums;

public enum Plan {
    BASIC("Basic",100),
        ;

    private String name;
    private int price;


    Plan(String name, int price) {
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
