import java.util.Scanner;
public class Sb10
{
     public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int Basic=sc.nextInt();
            int Hra=sc.nextInt();
            int Allowance=sc.nextInt();
            int Salary=Basic+Hra+Allowance;
            System.out.println(Salary);
        }
    }
}