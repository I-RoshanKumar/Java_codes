//Make a program that takes the radius of a circle as input, calculates its area and prints it as output to the user.

import java.util.Scanner;

public class radius {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double pi=3.14;
        double area=(pi*(r*r));
        System.out.println(area);
    } 
    
}
