import java.util.Scanner;
public class Sb4
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double speed=sc.nextDouble();
        double time=sc.nextDouble();
        double k=(speed*time);
        System.out.println("Kilometer :"+k);
    }
}