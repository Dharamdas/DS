package designpattern.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

	private List<Subscribers> subscriberList =  new ArrayList<Subscribers>();
	private String productName;
	private String productType;
	private boolean available;
	
	Product(String pn,String pt,boolean flag)
	{
		super();
		this.productName=pn;
		this.productType=pt;
		this.available=flag;
	}
	
	public List<Subscribers> getSubscriberList() {
		return subscriberList;
	}

	public void setSubscriberList(List<Subscribers> subscriberList) {

		this.subscriberList = subscriberList;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		notifySubscriber();
	}

	@Override
	public void registerSubscriber(Subscribers subscriber) {
		subscriberList.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscribers subscriber) {
			subscriberList.remove(subscriber);
	}

	@Override
	public void notifySubscriber() {

		System.out.println("Notify all the Subscriber when product become available");
		for(Subscribers subscribers : subscriberList)
		{
			subscribers.updateSubscriber(this.available);
		}
	}
}
