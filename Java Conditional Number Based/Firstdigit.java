import java.util.Scanner;
public class Firstdigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    int b=a/100;
	
       if((b%2)==0)
		{
		    System.out.println("Even number");
		}
		else{
		    System.out.println("odd number");
		}
	}}