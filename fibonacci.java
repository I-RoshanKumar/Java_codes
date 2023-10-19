public class fibonacci {
    public static void main(String args[]){
        
        int n=Integer.parseInt(args[0]);
        int fib1=0,fib2=1;
        System.out.println(fib1+fib2);
        while(n>1){
           int fib=fib1+fib2;
           System.out.println(fib);
           fib=fib2;fib2=fib;
           n++;
        }

    }
}
