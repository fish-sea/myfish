package com.fish;

public class Car extends TrafficTools {
	
public Car(String name,int price,int passenger)
{
	super.setName(name);
	super.setPrice(price);
	super.setPassenger(passenger);
	}

@Override
public void list() {
		// TODO Auto-generated method stub
	System.out.println(getName()+"\t"+getPrice()+"元/天\t\t"+
		               "载人"+getPassenger()+"人");
	}

}
