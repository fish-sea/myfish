package com.fish;

public abstract class TrafficTools {
	 private String name;  //车类型名字
	 private int price;    //每日租金价格
	 private int passenger;   //载客量
	 private int goods;      //载货量
	 
public void setName(String name){
	  this.name=name;
   }

public String getName(){
	return name;
   }

public void setPrice(int price){
	 this.price=price;
   }

public int getPrice(){
	 return price;
   }

public void setPassenger(int passenger){
	 this.passenger=passenger;
   }

public int getPassenger(){
	 return passenger;
   }

public void setGoods(int goods){
	 this.goods=goods;
   }

public int getGoods(){
	 return goods;
   }

public abstract void list();
}
