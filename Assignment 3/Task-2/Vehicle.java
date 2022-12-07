package game.utils;
public class Vehicle

{
private int model_id,color1,color2;
private String registration_number;
        
public Vehicle (int id, int clr1,int clr2,String rgs)
{
this.model_id = id;
this.color1 = clr1;
this.color2= clr2;
this.registration_number = rgs;
}
public void setter (String str){ this.registration_number = str;};
public String getter (){ return this.registration_number; };
}
