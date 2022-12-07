package game;
import game.utils.Vehicle;
public class Player
{
String name,IP_address;
int health;
Vehicle v;
public Player (String n, String IP, int h, Vehicle v){
    this.name = n;
    this.IP_address = IP;
    this.health = h;
    this.v=v;
}
 public String toString(){
    String str;
    if(this.v == null){
    str = this.name + this.IP_address + String.valueOf(this.health) + "null" ;
             return str;
    }
    else
    str = this.name +" "+ this.IP_address +" "+ String.valueOf(this.health) +" "+ (this.v).getter() ;
             return str; 
 }
}
