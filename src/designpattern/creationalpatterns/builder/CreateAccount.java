package designpattern.creationalpatterns.builder;


public class CreateAccount {
	
	//required parameters
	String name;
	String reson;
	// optional parameters
	String service;
	
	private CreateAccount(AccountBuilder builder) {
		this.name=builder.name;
		this.reson=builder.reson;
		this.service=builder.service;
		displayAccountDetails();
	}
	
	public String getName() {
		return name;
	}
	public String getReson() {
		return reson;
	}
	public String getService() {
		return service;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Created with the following details:::");
		System.out.println("Name: "+this.name);
		System.out.println("reson: "+this.reson);
		System.out.println(" Service: "+this.service);
	}
	
	//static nested class
	
	public static class AccountBuilder {

		//required parameters
			String name;
			String reson;
		// optional parameters
			String service;
			
			public AccountBuilder(String name,String reson) {
				this.name=name;
				this.reson=reson;
			}
			public AccountBuilder setService(String service) {
				this.service = service;
				return this;
			}
			public CreateAccount build()
			{
				return new CreateAccount(this);
			}
	}

}
