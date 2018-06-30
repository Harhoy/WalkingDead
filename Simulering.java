
import java.util.ArrayList;
//Simulation class
public class Simulering {
  public static void main(String[] args) {
    ArrayList<Zombie> zombier = new ArrayList<Zombie>();


    int naarFrem = 0; //The number of zombies that reach your position
    int antall = Integer.parseInt(args[0]); //Number of zombies per square km
    double minutter = Double.parseDouble(args[1]); //Number of minutes to wait/the simulation is run
    double hastighet = Double.parseDouble(args[2]); //The zombies' walking speed
    double avstand = minutter/60.0*hastighet*1000; //THe distance a zombies is able to walk within "x" minutes

     //"Your" position
    double x = Math.random()*1000.0;
    double y = Math.random()*1000.0;

    System.out.println("-----------------");
    System.out.println("Zombie-kalkulator");
    System.out.println("-----------------");
    System.out.println("Hastighet: " + hastighet + " km/t");
    System.out.println("Minutter: " + minutter);
    System.out.println("Avstand: " + avstand + " m");

     //Generates random zombies
    for (int i = 0; i < antall;i++) {

      double initX = Math.random()*1000.0;
      double initY = Math.random()*1000.0;
      zombier.add(new Zombie(initX, initY));

    }


     //Loops through all zombies....
    int k = 0;
    for (Zombie z: zombier) {

      System.out.println("Zombie nummer " + k + " er " +z.getDistance(x,y) + " meter fra deg");
      //If the zombies is closer than "avstand", increment counter
      if (z.getDistance(x,y) < avstand) {
        naarFrem++;
      }
      k ++;
    }
    
    //Print out
    System.out.println("Antall som når frem innen " +  minutter + " minutter: " + naarFrem);

  }
}
