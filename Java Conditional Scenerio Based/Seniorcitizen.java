 import java.util.Scanner;
public class Seniorcitizen{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int Seniorcitizen=sc.nextInt();
    if(Seniorcitizen>=60)
    {
        System.out.println("Eligible for Seniorcitizen benefits");
    }
    else
    {
        System.out.println("Not Eligible");
    }
    sc.close();

}}