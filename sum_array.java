public class sum_array {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int element: arr ){
            sum=sum + element;
        }
        System.out.println("Sum of the array is:"+sum);
    }
    
}
