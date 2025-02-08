import java.util.*;

public class ReadNumberFromStandardInput {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter two num2: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
	}
}