import java.util.Scanner;

public class AddTwoComplexNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of the first complex number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the real and imaginary parts of the second complex number: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("The sum of the two complex numbers is: " + (a+c) + " + " + (b+d) + "i");
    }
}
