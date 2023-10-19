import java.util.Arrays;

public class cyclic_sort {
   public static void main(String[] args) {
    int arr[]={3,5,2,5,2,4,1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
   }

public static int sort(int [] nums){
    int i=0;
    while(i<nums.length){
     if(nums[i]!=i+1){
        int correct=nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }
        else{
            return nums[i];
        }
    }
        else{
            i++;
        
        }

        }
        return -1;
    }
    


static void swap(int []arr,int first,int second){
    int temp=arr[first];

    arr[first]=arr[second];
    arr[second]=temp;
}
    
}