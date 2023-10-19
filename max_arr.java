import java.util.Scanner;

public class max_arr {
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the size of the array:");
           int size=sc.nextInt();   
           int arr[]=new int[5];
           System.out.println("Enter the values of the array:");
           for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
           }
           int max=0;
           int min=100;
           
           ;
           for(int i=0; i<size; i++) {
        
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i] ;
            }

        }
        
        System.out.println("min is"+min);
        System.out.println("Max is :"+max);
 
 
        

    sc.close(); 
}
}
