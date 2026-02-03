import java.util.*;

class function{
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);
    // }


    // public static int AddNumbers(int a, int b){
    //     int sum = a + b;

    //     return sum;
    // }
    // public static int multiple(int a, int b){
    //     return a*b;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = AddNumbers(a, b);
    //     System.out.println(sum);

    //     System.out.println("product "+multiple(a, b));
    // }


    public static int factorial(int a){
        int fact = 1;
        for(int i = a; i>0; i--){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("factorial "+factorial(a));
    }
}

