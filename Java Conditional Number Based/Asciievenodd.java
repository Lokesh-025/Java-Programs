import java.util.Scanner;
public class Asciievenodd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		char d=(char)c;
		if(d==0)
		{
		    System.out.println("Even");
		}
		else 
		{
		    System.out.println("Odd");
		}

	}
}