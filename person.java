public class person {
    String name;
    int dob;
    int mobile;
    void readData(String n, d,int m){
        name=n;
        dob=d;
        mobile=m;

    }
    void print_Data(){
        System.out.println("NAme:"+name);
        dob.print_Data();
        System.out.println("Mobile:"+mobile);
    }
}
class student extends person{
    String institution;
    int[]  qualfy=new int[20];
    int roll;
    int[] marks =new int[5];
    /**
     * 
     */
    void printBioData(){
        print_Data();
        System.out.println("Insttution"+institution);
        System.out.println("Roll"+roll);
        for(int i=0;i<qualfy.length;i++){
            System.out.println("Marks"+";"+ qualify[i]);
        } 
        for(int m=0;m<marks.length;m++){
            System.out.println("Result"+m+":" +marks[m]);
        
        }
    }
}