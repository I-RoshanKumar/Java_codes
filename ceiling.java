public class ceiling {
    public static void main(String[] args) {
        int []letters={1,2,32,36,65,69,68,100,125,366};
        int target=33;
        int ans=ceill(letters, target);
        System.out.println(ans);
    }

    static int ceill(char []letters, char target){
       
        int s=0;
        int e=letters.length-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<letters[mid]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return letters[s%letters.length];
    }
    
}
