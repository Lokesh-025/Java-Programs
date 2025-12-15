import java.util.Scanner;

public class Electricityunit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int amt = 0;   

        if (unit <= 100)
        {
            System.out.println("Free");
        }
        else if (unit > 100 && unit <= 300)
        {
            amt = (unit - 100) * 5;
            System.out.println("Electricity bill " + amt);
        }
        else if (unit > 500)
        {
            amt = (200 * 5) + (200 * 10);   
            int extra = amt * 10 / 100;     
            int total = amt + extra;
            System.out.println("Electricity bill " + total);
        }
        else if (unit > 300)
        {
            amt = (200 * 5) + (unit - 300) * 10;
            System.out.println("Electricity bill " + amt);
        }
        else
        {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
