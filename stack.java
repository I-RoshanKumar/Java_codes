class stack1 {
    public int push(int a,int top,int[] arr){
        if(top==5){
            System.out.println("Stack overflow.");
        }
        else{
            arr[top]=a;
            top++;
            System.out.println(a+"was pushed");
        }
        return top;

    }

    public int pop(int top){
        if(top==0){
            System.out.println("Stack underflow");
        }
        else{
            top--;
        }
        return top;
    }
    public void peep(int top,int[] arr){
        System.out.println("Recently added element is:"+arr[top]);
    }

    public void display(int top,int[]arr){
        for(int i=0;i<top;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class stack{
    public static void main(String args[]){
        int[] arr=new int[6];
        stack1 s1=new stack1();
        int top=0;
        top=s1.push(12,top,arr);
        System.out.println(top);
        top=s1.push(32,top,arr);
        top=s1.push(42,top,arr);
        top=s1.push(52,top,arr);
        top=s1.push(62,top,arr);
        top=s1.pop(top);
        System.out.println(top);
        s1.peep(top, arr);
        s1.display(top, arr);
    }
}
