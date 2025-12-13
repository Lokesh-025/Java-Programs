import java.util.Scanner;
public class Digit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<10)
		{
		    System.out.println("Single digit");
		}
		else if(a<100)
		{
		    System.out.println("Double digtit");
		}
		else if(a<1000)
		    {
		    System.out.println("Three digit");
		}
		else{
		    System.out.println("Exceed digit");
		}
	}
}