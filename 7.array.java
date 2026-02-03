import java.util.*;
class array {
    public static void main(String args[]) {
        // int[] marks = new int[3];
        // // int marks[] = new int[3];

        // // another way to define array
        // // int marks[] = {97, 98, 95}


        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        int tar = sc.nextInt();

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }


        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==tar){
                System.out.println("found at index "+i);
            }
        }
    }
}
