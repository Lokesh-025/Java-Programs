import java.util.Scanner;
public class Amount
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int amt=1000000;
        int withdraw=sc.nextInt();
        if(withdraw<=amt && withdraw%100==0)
        {
            System.out.println("Amount withdraw valid :"+withdraw);
        }
        else{
            System.out.println("Invalid");
        }sc.close();
    }
}