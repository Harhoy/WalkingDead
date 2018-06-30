
import java.util.ArrayList;

public class Simulering {
  public static void main(String[] args) {
    ArrayList<Zombie> zombier = new ArrayList<Zombie>();


    int naarFrem = 0;
    int antall = Integer.parseInt(args[0]);
    double minutter = Double.parseDouble(args[1]);
    double hastighet = Double.parseDouble(args[2]);
    double avstand = minutter/60.0*hastighet*1000;

    double x = Math.random()*1000.0;
    double y = Math.random()*1000.0;

    System.out.println("-----------------");
    System.out.println("Zombie-kalkulator");
    System.out.println("-----------------");
    System.out.println("Hastighet: " + hastighet + " km/t");
    System.out.println("Minutter: " + minutter);
    System.out.println("Avstand: " + avstand + " m");

    for (int i = 0; i < antall;i++) {

      double initX = Math.random()*1000.0;
      double initY = Math.random()*1000.0;
      zombier.add(new Zombie(initX, initY));

    }


    int k = 0;
    for (Zombie z: zombier) {

      System.out.println("Zombie nummer " + k + " er " +z.getDistance(x,y) + " meter fra deg");

      if (z.getDistance(x,y) < avstand) {
        naarFrem++;
      }
      k ++;
    }

    System.out.println("Antall som når frem innen " +  minutter + " minutter: " + naarFrem);

  }
}
