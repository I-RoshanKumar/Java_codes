public class binary_search {
    public static void main(String[] args) {
        int []arr={1,2,32,36,65,69,68,100,125,366};
        int target=366;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int []arr, int target){
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
