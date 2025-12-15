 import java.util.Scanner;
public class Vote{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int vote=sc.nextInt();
    if(vote>=18)
    {
        System.out.println("Eligible for vote:");
    }
    else
    {
        System.out.println("Not Eligible");
    }
    sc.close();

}}