import java.util.Scanner;
public class Cyclinder
{
   public static void main (String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        double r =sc.nextDouble();   
        double h =sc.nextDouble();
        double a=2*3.14*r*(r+h);
        double v=3.14*(r*r)*h;
        System.out.println(a + "\n" + v);
    }
}
