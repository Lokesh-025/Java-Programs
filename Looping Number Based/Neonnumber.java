import java.util.*;
public class Neonnumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int sqaure=a*a;
        while(sqaure>0)
        {
            int b=sqaure%10;
            sum+=b;
            sqaure/=10;
        }
        if(sum==a)
        {
          System.out.println("Neon Number");

        }
        else
        {
            System.out.println("Not neon Number");
        }sc.close();
    }
    
}
