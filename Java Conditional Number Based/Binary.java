import java.util.Scanner;
public class Binary
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if((a&1)==0)
		{
		    System.out.println("Even number");
		}
		else{
		    System.out.println("odd number");
		}
	}}