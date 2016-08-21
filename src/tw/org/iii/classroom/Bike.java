package tw.org.iii.classroom;

public class Bike {
	// 屬性 Field
     private double speed; //封裝
     
     //Constructor 建構式.建構值.建構方法 (無傳回值,類別名稱與所在一樣(含大小寫))
     Bike(){
    	 
    	 System.out.println("Bike():" + speed); //建立初始設定
     }
     
     //Method 方法
     void upspeed(){
    	 speed = speed<1?1:speed*1.2;
     }
     void downspeed(){
    	 speed = speed<1?1:speed*0.7;
    	 
     }
     double getSpeed(){
    	 return speed;
    	 
    	 
     }
}