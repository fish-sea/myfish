package com.fish;

public class PickUp extends TrafficTools{
	
public PickUp(String name,int price,int passenger,int goods)
{
	super.setName(name);
	super.setPrice(price);
	super.setPassenger(passenger);
	super.setGoods(goods);
	}
	
@Override
public void list(){
	System.out.println(getName()+"\t"+getPrice()+"元/天\t\t"+
                       "载人："+getPassenger()+"人 载货："+getGoods()+"吨A");
}

}
