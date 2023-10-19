public class linearsearch{    
   public static void main(String[] args) {
    int []arr={23,45,56,78,-1};
    int target=13;
    int ans=linearsearch1(arr,target);
    System.out.println(ans);
   }
   
   static int linearsearch1(int [] arr,int target){
    if(arr.length==0){
        return -1;
    }
    for(int i=0;i<arr.length;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
    }
    return -1;
   }
}