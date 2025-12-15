import java.util.*;
public class Passenger
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
		int price=10;
		int price1=20;
		int price2=30;
        if(age<18) {
	        System.out.println("Child"+price);
	    }else if(age>=18 && age<51) {
	        System.out.println("adult"+price1);
	    }else if(age>50) {
	        System.out.println("Senior"+price2);
	    }sc.close();
	}
}