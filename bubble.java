import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Start entering the elements in the array decalred");

        //Taking elements from the users
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        //Calling the bubble sort function created 

        bubble_search(arr);

        //Printing the sorted array in the form of array by using arrrays.toString()
        
        System.out.println("Sorted array is"+": "+Arrays.toString(arr));
        sc.close();
    }
    static void bubble_search(int [] arr) {
        //Checking if the array provided is already sorted or not
        boolean swapped;

        //Outer look which starts from 0 and runs till the length of the given inserted array
        for(int i=0;i<arr.length;i++){
            swapped=false;
            // Inner loop where swapping of the elements occur
            for(int j=1;j<arr.length;j++){
                //Checking whether the previous element is smaller thean the current element then it is required to swap the eleemnt with the use of the third variable
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;

                }
            }
            //if swap is not done then break the statement
            
            if(!swapped){
                break;
            }
        }

    }
}
