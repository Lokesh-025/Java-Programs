import java.util.Scanner;
public class Trafficlight
{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    String color=sc.nextLine();
    String red="red";
    String yellow="yellow";
    String green="green";
        if(color.equals(red))
    {
        System.out.println("stop");
        
    }
    else if(color.equals(yellow))
    {
        System.out.println("Ready");
    }
    else if(color.equals(green))
        {
        System.out.println("Go");
    }
    else
    {
        System.out.println("invalid");
    }
}}