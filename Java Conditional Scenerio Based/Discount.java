import java.util.Scanner;
public class Discount{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		double discount = 0;
		double totalamt = 0;
		if(price<500){
		    discount = 2;
		}else if(price>=500 && price<1000){
		     discount = 4;
		}else if(price>=1000 && price<1500){
		     discount = 6;
		}else if(price>=1500 && price<2000){
		     discount = 8;
        }
		totalamt=((double)discount/100)*price;;
		double n = price-totalamt;
		System.out.println(n);
        sc.close();
	}
}