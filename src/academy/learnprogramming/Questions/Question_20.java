package academy.learnprogramming.Questions;

public class Question_20 {
}

class Product {
    double price;
}

class test {
    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        test t = new test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }

    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }
}
