import java.util.Scanner;

public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y || x>z){
            System.out.println("The largest number is:"+x);
        }
        else if(y>x || y>z){
            System.out.println("the largest number is :"+y);
        }
        else if(z>x || z>y){
            System.out.println("The largest number is :"+z);
        }
        else{
            System.out.println("Invalid numbers");
        }
        sc.close();
    }
}
