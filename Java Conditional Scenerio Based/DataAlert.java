import java.util.Scanner;
public class DataAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalData = sc.nextDouble();    
        double usedData  = sc.nextDouble();    

        if (usedData > totalData) {
            System.out.println("Wrong Input");
        }
        else if (usedData == totalData) {
            System.out.println("Data Over");
        }
        else if (usedData >= totalData / 2) {
            System.out.println("Half Consumed");
        }
        else {
            System.out.println("Low Data");
        }
    }
}
