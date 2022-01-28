package com.candy.sweettooth.sweet;

public class Sweet {

    private String name;
    private Float price;
    private String flavour;
    private String[] characteristics;

    public Sweet(String name, Float price, String flavour, String[] characteristics) {
        super();
        this.name = name;
        this.price = price;
        this.flavour = flavour;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }
}
