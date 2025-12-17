import java.util.*;
public class Perfect
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=0;
        int sum=0;
        for(int i=1;i<temp;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }
        }
        if(sum==a)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }sc.close();
    }
}
