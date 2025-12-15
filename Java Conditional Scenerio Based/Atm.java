import java.util.Scanner;
public class Atm
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=1234;
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Atm valid pin");
        }
        else
        {
            System.out.println("Invalid pin");
        }
    }
}