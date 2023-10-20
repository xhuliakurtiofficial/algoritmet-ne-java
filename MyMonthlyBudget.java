import java.awt.*;
public class MyMonthlyBudget {
   public static void main(String[] args) {
      PieChartWriter p = new PieChartWriter();
      p.setTitle("How I spend my monthly budget");
      p.setSlice4("Clothes", 25, Color.pink);
      p.setSlice2("Food", 50, Color.blue);
      p.setSlice1("Books", 40, Color.orange);
      p.setSlice3("Rent", 80, Color.red);
   }
}