import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swapping: num1 = " + num1 + " num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("After swapping: num1 = " + num1 + " num2 = " + num2);
    }
}
