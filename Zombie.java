import java.lang.Math;

//ZOMBIE-CLASS

public class Zombie {

  protected double x; //X-coordinate
  protected double y; //Y-coordinate

  public Zombie(double initX, double initY) {
    x = initX;
    y = initY;
  }

  //Find distance to another zombies/point
  public double getDistance(double xB, double yB) {
    return Math.pow(Math.pow((x-xB),2)+Math.pow((y-yB),2),0.5);
  }

   //Return position
  public void hentPos() {

    System.out.println(x + " " + y);

  }

}
