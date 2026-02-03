import java.util.*;
class conditional{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
        
        
            //     int age = sc.nextInt();

            //     if(age>18){
            //         System.out.println("adult");
            //     } else{
            //         System.out.println("Not adult");
            //     }


            // int x = sc.nextInt();

            // if(x % 2 == 0) {
            //     System.out.println("Even");
            // } else {
            //     System.out.println("Odd");
            // }


            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // if(a == b){
            //     System.out.println("equal");
            // } else {
            //     if(a > b) {
            //         System.out.println("a is greater");
            //     } else {
            //         System.out.println("a is lesser");
            //     }
            // }

            // if(a == b){
            //     System.out.println("equal");
            // } else if(a > b) {
            //         System.out.println("a is greater");
            // } else {
            //         System.out.println("a is lesser");
            //     }


            int button =sc.nextInt();

            // if(button == 1) {
            //     System.out.println("Hello");
            // } else if(button == 2){
            //     System.out.println("namaste");
            // } else if(button == 3){
            //     System.out.println("Bonjour");
            // } else {
            //     System.out.println("Invalid Button");
            // }

            switch(button) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;
                default:
                    System.out.println("Invalid Button");
            }
        }
    }
}
