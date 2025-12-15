import java.util.Scanner;
public class BillDiscount {
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int bill=sc.nextInt();
    if(bill>=500 && bill<1000)
    {
System.out.println("Discount is 10%");
System.out.printf("After discount is :"+"%.2f",(bill-(bill*(10.0/100))));
    }
       else if(bill>=1000 && bill<2000)
    {
System.out.println("Discount is 20%");
System.out.printf("After discount is :"+"%.2f",(bill-(bill*(20.0/100))));
    }
       else if(bill>=2000 && bill<3000)
    {
System.out.println("Discount is 30%");
System.out.printf("After discount is :"+"%.2f",(bill-(bill*(30.0/100))));
    }
    else
    {
        System.out.println("No discount");
    }
    sc.close();
}
}