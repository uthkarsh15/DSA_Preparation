import java.util.Scanner;

 class bitManipulation {
    public static void main(String args[]) {

        //get bit

        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // if((bitMask & n)==0){
        //     System.out.println("bit was zero");
        // } else {
        //     System.out.println("bit was one");
        // }


        //set bit

        // int n=5;
        // int pos=1;
        // int bitMask = 1<<pos;
        
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);


        //clear bit

        // int n=5;
        // int pos=2;
        // int bitMask = 1<<pos;

        // int newNumber = (~bitMask) & n;
        // System.out.println(newNumber);


        // update bit

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set  oper=0 : clear
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper ==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newNumber = (~bitMask) & n;
            System.out.println(newNumber);
        }

    }
    
}
