package ru.netology.prodmng;

public class Book extends Product {
    private String author;
    private String title;

    public Book(int id, String name, int price, String author, String title) {
        super(id, name, price);
        this.author = author;
        this.title = title;
    }

//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }


}
