import java.util.Scanner;
public class Distance
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        double e=Math.sqrt((b-a)*(b-a)+(d-c)*(d-c));
        System.out.println(e);
    }
}