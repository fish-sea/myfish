package com.fish;

public class Truck extends TrafficTools {

public Truck(String name,int price,int goods)
{
	  super.setName(name);
	  super.setPrice(price);
	//  super.setPassenger(passenger);
	  super.setGoods(goods);
   }
	
@Override
public void list() {
		// TODO Auto-generated method stub
     System.out.println(getName()+"\t"+getPrice()+"元/天\t\t"+
		                "载货："+getGoods()+"吨");
  }

}
