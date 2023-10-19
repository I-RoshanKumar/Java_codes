public class clock {
    int hours,min,seconds;
    clock(int h,int m,int s){
        hours=h;
        min=m;
        seconds=s;

    }
    void TimeValid(){
        if(hours>=0 && hours<24  && min>0 && min<60 && seconds>0 && seconds<60){
            System.out.println("Time is valid");
        }
        else{
            System.out.println("Time invalid");
        }

    }
    void TimeMode(){
        if(hours<12 ){
            System.out.println("AM");
        }
        else{
            System.out.println("PM");
        }
    }
class clock1{
public static void main(String[] args){
            clock c1=new clock(16,30,46);
            c1.TimeValid();
            c1.TimeMode();
        }
    }
}
