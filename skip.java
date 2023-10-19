public class skip{
    public static void main(String args[]){
        int temp;
        int arr[]={25,45,21,1,4};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length-1);j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The unordered set is: {25,45,21,1,4}");
        System.out.println("The sorted elements in order are:");
    
    {
       
        for(int i=0;i<arr.length;){
            System.out.println(arr[i]);
        i+=2;}
        }
    }
} 

