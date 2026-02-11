 class recursion {
    // public static void printNumb(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     printNumb(n);
    // }


    // public static void printNumb(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);
    // }
    // public static void main(String[] args) {
    //     int n=1;
    //     printNumb(n);
    // }


    // public static void printSum(int i, int n, int sum){
    //     if(i==n){
    //         sum += i;
    //         System.out.println(sum);
    //         System.out.println(i);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }

    // public static void main(String[] args) {
    //     printSum(1, 5, 0);
    // }


    // public static int calcFactorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     int fact_nm1 = calcFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String args[]){
    //     int n = 2;
    //     int ans = calcFactorial(n);
    //     System.out.println(ans);
    // }


    // public static void printFib(int a,int b, int n){
    //     if(n == 0){
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String args[]){
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n=7;
    //     printFib(a, b, n-2);
    // }


    // public static int calcPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
    //     int xPownm1 = calcPower(x, n-1);
    //     int xPown = x * xPownm1;
    //     return xPown;
    // }

    //  public static void main(String args[]){
    //     int x=3, n=2;
    //     System.out.println(calcPower(x, n));
    // }


    
    // public static int calcPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0; 
    //     }
    //     if(n % 2==0){
    //         return calcPower(x, n/2) * calcPower(x, n/2);
    //     }
    //     else{
    //         return calcPower(x, n/2) * calcPower(x, n/2) * x;
    //     }
    // }
    // public static void main(String args[]){
    //     int x=3, n=2;
    //     System.out.println(calcPower(x, n));
    // }
}