package designpattern.behavioraldesignpatterns.observer;

public class Customer implements Subscribers{
	private String custName;
	private String custId;
	Customer(String name,String id)
	{
		this.custName=name;
		this.custId=id;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	@Override
	public void updateSubscriber(boolean available) {
		System.out.println("Customer Name:"+this.custName);
		if(available)
		{
			System.out.println("Logic to send Notification that product is available::::");
		}
	}

}
