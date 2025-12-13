import java.util.Scanner;
public class Sb9
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        double interset=sc.nextDouble();
        int time=sc.nextInt();
        double simple_interset=(principal*interset*time)/100;
        System.out.println(simple_interset);
    }
}