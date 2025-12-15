import java.util.Scanner;
public class Batterycheck {
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int Batterycheck=sc.nextInt();
    if(Batterycheck<=20)
    {
System.out.println("Low Battery");
    }
       else if(Batterycheck>=20 && Batterycheck<=50)
    {
System.out.println("Battery consumed");

    }
else
    {
        System.out.println("Fully charged");
    }
    sc.close();
}
}