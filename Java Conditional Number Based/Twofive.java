import java.util.Scanner;
public class Twofive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0 && a%5==0 && a%8!=0)
		{
		    System.out.println("Divisible by 2&5 but not 8");
		}
		else
		{
		    System.out.println("Coindition not statisfy");
		}
		
	}
}