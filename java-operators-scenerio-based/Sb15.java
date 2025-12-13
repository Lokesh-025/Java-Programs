import java.util.Scanner;
public class Sb15
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int rs2000=amount/2000;
        int remaining=amount%2000;
        int rs500=remaining/500;
        int remaining1=remaining%500;
        int rs100 =remaining1/100;
        System.out.print(rs2000+"+"+rs500+"+"+rs100);
    }
}