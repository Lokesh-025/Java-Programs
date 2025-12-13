import java.util.Scanner;
public class Sphere
{
   public static void main (String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();   

        double s = 4 * 3.14 * (r * r);
        double v = (4.0 / 3.0) * 3.14 * (r * r * r);

        System.out.println(s + "\n" + v);
    }
}
