import java.util.Scanner;

class numberpattern{
  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); // Change n to the desired value
        printNumberPattern(n);
    }

    public static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
