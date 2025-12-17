import java.util.Scanner;
public class Pa
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
	    int rev=0;
	    int digit=0;
	    while(n>0){
	         digit=n%10;
	        rev=rev*10+digit;
	        n/=10;
	    }
	    if(a==rev){
	        System.out.println("Palindrome");
	    }
	    else{
	        System.out.println("Not palindrome");
	    }sc.close();
	}
}