import java.util.*;
public class magic
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum;
        while(a>9)
        {
            sum=0;

        }
        while(a>0)
        {
            sum=a%10;
            a=a/10;
            a=sum;
        }
        if(a==1)
        {
            System.out.println("Magic number");
        }
        else
        {
            System.out.println("not");
        }
    }
}