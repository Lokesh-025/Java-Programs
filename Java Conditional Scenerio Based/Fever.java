 import java.util.Scanner;
public class Fever{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    double Fever=sc.nextDouble();
    if(Fever<=100)
    {
        System.out.println("High Fever");
    }
    else
    {
        System.out.println("Normal");
    }
    sc.close();

}}