import java.util.Scanner;
public class Sb7
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int person=sc.nextInt();
        int equall=(candies/person);
        int remain=(candies%person);
        System.out.println("Each person get:"+equall);
        System.out.println("Remain :"+remain);
    }
}