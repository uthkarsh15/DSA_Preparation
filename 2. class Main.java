// import java.util.*;
// public class variables {
//     public static void main(String[] args) {
//         // String name = "john";
//         // int age = 19;
//         // double height = 5.9;
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         //nextInt() reads the next integer from the input
//         //nextFloat() reads the next float from the input
//         System.out.println(name);
//     }
// }


import java.util.Scanner;
class Main{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("the sum is: "+sum);
        }
    }
}