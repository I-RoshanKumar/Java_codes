class A extends Thread{
    public void run(){
        System.out.println("Thread A Started");
        for(int i=0;i<=4;i++){
            System.out.println(("\t From A: i="+i));
        }
        System.out.println("Exit from Thread A");
    }

    public Object getPriority(int i) {
        return null;
    }
}

class B extends Thread{
     public void run(){
        System.out.println("Thread B Started");
        for(int i=0;i<=4;i++){
            System.out.println(("\t From B: i="+i));
        }
        System.out.println("Exit from Thread B");
    }
}

class C extends Thread{
     public void run(){
        System.out.println("Thread C Started");
        for(int i=0;i<=4;i++){
            System.out.println(("\t From C: i="+i));
        }
        System.out.println("Exit from Thread C");
    }
}

class thread_priority{
    public static void main(String[] args) {
        A threadA=new A();
        B threadB=new B();
        C threadC=new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY); 
        System.out.println("Started A");
        threadA.start();
        System.out.println("Thread B stareed");
        threadB.start();
        System.out.println("Started C");
        threadC.start();
        System.out.println("End of main");
    }
}