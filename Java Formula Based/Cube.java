import java.util.Scanner;
public class Cube
{
   public static void main (String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=6*(a*a);
        int v=(a*a);
        int p=12*a;
        System.out.println(s+"\n"+v+"\n"+p);
    }
}