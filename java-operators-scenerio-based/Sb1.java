import java.util.Scanner;
public class Sb1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double d=sc.nextDouble();
		double p=a*(d/100.0);
		System.out.println(a-p);
	}
}
