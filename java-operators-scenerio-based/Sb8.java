import java.util.Scanner;
public class Sb8
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int trays=sc.nextInt();
        int cakes_per_tray=sc.nextInt();
        int total=trays*cakes_per_tray;
        System.out.println("Total no of cakes :"+total);
    }
}