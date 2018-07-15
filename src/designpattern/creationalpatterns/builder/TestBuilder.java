package designpattern.creationalpatterns.builder;

import designpattern.creationalpatterns.builder.CreateAccount.AccountBuilder;

public class TestBuilder {

	public static void main(String[] args) {

		AccountBuilder accBuilder = new CreateAccount.AccountBuilder("Raj", "MP");
		accBuilder =  accBuilder.setService("default");
		CreateAccount account = accBuilder.build();
		System.out.println("Account: "+account.getName());
		
	}

}
