import java.util.Scanner;
public class Sb13;
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int buy=sc.nextInt();
        int price=sc.nextInt();
        int a=(buy/3);
        int total=a+buy;
        int c=total*price;
        System.out.print(c);
    }
}