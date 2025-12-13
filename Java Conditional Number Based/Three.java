import java.util.Scanner;
public class Three
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>100 && a<999)
		{
		    System.out.println("3 digit number");
		}
		else{
		    System.out.println("Not 3 digit");
		}
	}
}