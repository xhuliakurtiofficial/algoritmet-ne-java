import java.awt.*;
public class MassesOfThePlanets {
   public static void main(String[] args) {
      PieChartWriter p = new PieChartWriter();
      p.setTitle("Mass (relative to Earth)");
      p.setSlice1("Mercury", 0.05, Color.black);
      p.setSlice4("Venus", 0.81, Color.red);
      p.setSlice2("Earth", 1.00, Color.blue);
      p.setSlice3("Mars", 0.11, Color.gray);
      p.setSlice5("Jupiter", 318.4, Color.green);
      p.setSlice6("Saturn", 95.3, Color.magenta);
   }
}