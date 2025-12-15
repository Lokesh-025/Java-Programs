 import java.util.Scanner;
public class Mark{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int Mark=sc.nextInt();
    if(Mark>=35)
    {
        System.out.println("Pass");
    }
    else
    {
        System.out.println("Fail");
    }
    sc.close();

}}