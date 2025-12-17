import java.util.*;
public class Harshad {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(temp>0)
        {
            int b=temp%10;
            sum+=b;
            temp/=10;

        }
        if(a%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad number");
        }sc.close();
    }
    
}
