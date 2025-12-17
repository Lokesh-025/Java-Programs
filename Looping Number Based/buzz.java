import java.util.*;
public class buzz
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%7==0 || a%10==7))
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not Buzz number");
        }sc.close();
    }
}