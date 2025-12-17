import java.util.*;
public class p3
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if(a<1)
       {
        System.out.println("Not a power of 3");
       }
       while(a%3==0)
       {
        a=a/3;
       }
       if(a==1)
       {
        System.out.println("Power of 3");
       }
       else
       {
        System.out.println("not power of 3");
       }sc.close();
    }
}