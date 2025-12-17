import java.util.Scanner;
public class Arm
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
	    int sum=0;
	    int digit=0;
	    while(n>0){
	         digit=n%10;
	        sum+=digit*digit*digit;
	        n/=10;
	    }
	    if(sum==a){
	        System.out.println("Armstrong ");
	    }
	    else{
	        System.out.println("Not Armstrong");
	    }sc.close();
	}
}