import java.util.Scanner;

public class testt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<n;j++){
                if(arr[i]<arr[i+1]){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        
    }
}