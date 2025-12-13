import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int buy=sc.nextInt();
        int price=sc.nextInt();
        int a=(buy/5)*3;
        int b=(buy%5);
        int c=(a+b)*price;
        System.out.print(c);
    }
}