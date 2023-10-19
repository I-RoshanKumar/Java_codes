import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int [] arr={3,2,4,1,5};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int [] arr,int s,int e){
        int max=s;
        for(int i=s;i<=e;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
