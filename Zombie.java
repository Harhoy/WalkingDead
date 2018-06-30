import java.lang.Math;

public class Zombie {

  protected double x;
  protected double y;

  public Zombie(double initX, double initY) {
    x = initX;
    y = initY;
  }

  public double getDistance(double xB, double yB) {
    return Math.pow(Math.pow((x-xB),2)+Math.pow((y-yB),2),0.5);
  }

  public void hentPos() {

    System.out.println(x + " " + y);

  }

}
