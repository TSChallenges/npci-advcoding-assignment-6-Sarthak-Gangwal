package com.mystore.app;


import org.springframework.stereotype.Component;

@Component
class Product {
    
    private int id;
    private String name;
    private String barcode;

    @AutoWired
    Barcode barCoder;

    public Product() {
        System.out.println("In Product constructor");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode() {
        this.barcode = barCoder.createBarcode(this);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
    }

}
