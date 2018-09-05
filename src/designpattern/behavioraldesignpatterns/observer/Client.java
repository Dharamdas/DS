package designpattern.behavioraldesignpatterns.observer;

public class Client {

	public static void main(String[] args) {
		// create customer to subscribe
		Customer c1 = new Customer("Raj","10011");
		Customer c2 = new Customer("Dharam", "3887777");
		// create Subject 
		Product p = new Product("Samsung Mobile", "Android", true);
		// register the Subscribers
		p.registerSubscriber(c1);
		p.registerSubscriber(c2);
		
		// now publish the message
		p.setAvailable(true);
	}
}
