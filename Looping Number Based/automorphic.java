import java.util.*;
public class automorphic
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=a*a;
     int temp=a;
     int power=1;
     while(temp>0)
     {
        power*=10;
        temp/=10;
     }
     if(b%power==a)
     {
        System.out.println("Automorphic number");
     }
     else{
        System.out.println("Not");
     } sc.close();
    }
}