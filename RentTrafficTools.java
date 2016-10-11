package com.fish;

import java.util.Scanner;

public class RentTrafficTools {
	
public static void main(String[] args){
	int money=0;  //保存支付金钱信息
	System.out.println("欢迎使用滴答租车：\n您是否要租车1:是 0:否");
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	if(x==1){
	TrafficTools[] tt={new Car("大巴",500,50),
					   new Car("奥迪",400,5),
					   new Truck("大卡",600,20),
					   new PickUp("皮卡",300,2,5)
						};
	System.out.println("您可租用的汽车信息：");
	for(int i=0;i<tt.length;i++){
		System.out.print(i+1+". ");
		tt[i].list();
	}
	while (true){
	System.out.println("请输入您想要租的车的序号");
	int num = in.nextInt();
	System.out.println("您想要租几辆");
	int count = in.nextInt();
	System.out.println("你想要租几天");
	int day = in.nextInt();
//	System.out.println("感谢你的使用，你应该付"+pay(price(num),count,day));
    int sum = pay(price(num),count,day);
    money+=sum;
    System.out.println("你还要租其他车型吗？ 1：继续租其他车型 0：不租了");
    if(in.nextInt()==0) break;
	}
	System.out.println("感谢您的使用！您应该付："+money+"元");
}
}
public static int pay(int price,int count,int day){
	return price*count*day;
}

public static int price(int num){
 /*    if(num==1)
    	 return 500;
     else if(num==2)
         return 400;
     else if(num==3)
    	 return 600;
     else if(num==4)
    	 return 300;
     return 0;*/
	switch (num)
	{
	case 1:return 500;
		  // break;
	case 2:return 400;
		  // break;
	case 3:return 600;
		 //  break;
	case 4:return 300;
			//break;
    default:return 0;
	}
}
}
