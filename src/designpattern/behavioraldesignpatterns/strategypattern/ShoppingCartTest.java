package designpattern.behavioraldesignpatterns.strategypattern;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        //pay by paypal
        shoppingCart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        shoppingCart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }

}
