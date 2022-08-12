//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class RepositoryTest {
//    Book book1 = new Book(
//            1,
//            "Книга 1",
//            300,
//            "Пушкин",
//            "Русалка"
//    );
//    Book book2 = new Book(
//            2,
//            "Книга 2",
//            500,
//            "Достоевский",
//            "Идиот"
//    );
//    Smartphone smart1 = new Smartphone(
//            3,
//            "Тел 1",
//            1000,
//            "Iphone",
//            "Apple"
//    );
//
//    Product item1 = new Product(11, "Один", 100);
//    Product item2 = new Product(12, "Два", 200);
//    Product item3 = new Product(13, "Три", 300);
//
//    @Test
//    public void getRemove() {
//        Repository repo = new Repository();
//        repo.save(item1);
//        repo.save(item2);
//        repo.save(item3);
//        repo.removeById(item2.getId());
//        Product[] expected = {item1, item3};
//        Product[] actual = repo.getItems();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void SetId() {
//        Product prod = new Product(1, "Имя", 300);
//        prod.setId(2);
//        int expected = 2;
//        int actual = prod.getId();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SetGetName() {
//        Product prod = new Product(1, "Имя", 300);
//        prod.setName("ДругоеИмя");
//        String expected ="ДругоеИмя";
//        String  actual = prod.getName();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SetGetPrice() {
//        Product prod = new Product(1, "Имя", 300);
//        prod.setProductPrice(500);
//        int expected = 500;
//        int  actual = prod.getProductPrice();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//}
