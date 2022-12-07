package game;
import game.utils.Vehicle;
class Main{
public static void main(String args[]){
    Vehicle v1 = new Vehicle(1,1,2,"001");
    Vehicle v2 = new Vehicle(2,2,3,"002");
    Vehicle v3 = new Vehicle(3,3,3,"003");

    Player ajay = new Player ("ajay","0000.0000.0000.0000",100,v1);
    Player sanjay = new Player ("sanjay","1111.1111.1111.1111",90,null);
    System.out.println( ajay.toString());
    System.out.println( sanjay.toString());
}
}
