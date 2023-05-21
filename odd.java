import java.util.Scanner;

public class odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Numbeer to check : ");
        int Numbeer=sc.nextInt();
        if(Numbeer%2==0){
            System.out.println("Even");
        }else{
            System.out.println("ODD");
        }
        
    }
}