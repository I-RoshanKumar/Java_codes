public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={12,23,36,39,45,46,47,100};
        int target=23;
        int ans=order(arr, target);
        System.out.println(ans);
    }
    static int order(int[] arr, int target){
        int s=0;
        int end=arr.length-1;
        boolean isAsc=arr[s]<arr[end];


        while(s<=end){
            int mid=s+(end-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                System.out.println("Ascending ordered");
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    s=mid+1;
                }
            }
            else{
                System.out.println("Descending Ordered");
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}
