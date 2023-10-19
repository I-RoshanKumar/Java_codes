import java.util.Scanner;
public class swap {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;  // Add both numbers and store the result in 'a'
        b = a - b;  // Subtract the original 'b' from the sum and store in 'b'
        a = a - b;  // Subtract the original 'a' from the updated sum and store in 'a'

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
