package ru.netology.prodmng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {

    Repository repo = new Repository();
    ProductManager manager = new ProductManager(repo);
    Product product = new Product(10, "test", 999);


    Book book1 = new Book(1, "book1", 100, "Author1", "Title1");
    Book book2 = new Book(2, "book2", 200, "Author2", "Title2");
    Book book3 = new Book(3, "book3", 300, "Author3", "Title3");
    Book book4 = new Book(4, "novel", 400, "Author4", "Title4");

    Smartphone smart1 = new Smartphone(5, "smart1", 5000, "Iphone", "Apple");
    Smartphone smart2 = new Smartphone(6, "smart2", 3000, "Galaxy", "Samsung");

    @Test
    public void SearchManyItemsBook() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);

        Product[] expected = {book1, book2, book3};
        Product[] actual = manager.searchBy("book");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchManyItemSmart() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);

        Product[] expected = {smart1, smart2};
        Product[] actual = manager.searchBy("smart");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchOneItemsBook() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("book1");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchOneItemSmart() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);

        Product[] expected = {smart2};
        Product[] actual = manager.searchBy("smart2");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetItems() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);

        Product[] expected = {smart2, smart1, book4, book3, book2, book1};
        Product[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RemoveById() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smart1);
        manager.add(smart2);
        repo.removeById(4);

        Product[] expected = {book1, book2, book3, smart1, smart2};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SetProductId() {
        product.setId(20);

        int expected = 20;
        int actual = product.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetProductName() {
        product.setName("ChangeName");

        String expected = "ChangeName";
        String actual = product.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetProductPrice() {
        product.setProductPrice(1111);

        int expected = 1111;
        int actual = product.getProductPrice();

        Assertions.assertEquals(expected, actual);
    }

}