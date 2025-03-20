//To break an integer into a sequence of digits
import java.util.Scanner;
public class BreakDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        System.out.print("Digits: ");
        printDigits(num);
    }

    public static void printDigits(int num) {
        if (num == 0) {
            return;
        }
        printDigits(num / 10); 
        System.out.print(num % 10 + " "); 
    }
}
