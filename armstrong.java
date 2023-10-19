public class armstrong{
public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

        static boolean isArmstrong(int a){
            int original=a;
            int sum=0;
            while(a>0){
                int rem=a%10;
                a=a/10;
                sum=sum+rem*rem*rem;
            }
            return sum==original;
        
    }
}