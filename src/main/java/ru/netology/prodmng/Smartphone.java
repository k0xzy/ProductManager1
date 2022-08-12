package ru.netology.prodmng;
public class Smartphone extends Product {
    private String prodName;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String prodName, String manufacturer) {
        super(id, name, price);
        this.prodName = prodName;
        this.manufacturer = manufacturer;
    }
//    public String getProdName() {
//        return prodName;
//    }
//
//    public void setProdName(String prodName) {
//        this.prodName = prodName;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }


}
