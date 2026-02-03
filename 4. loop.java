import java.util.*;
class loop {
   public static void main(String[]args){
      //   for(int i=0; i<3; i++){
      //       System.out.println("Hello World");
      //   }
      // for (int count=0; count<11; count++){
      //    System.out.println(count);
      // }
      
      
      // int i=0;
      // while (i<11) {
      //    System.out.println(i);
      //    i++;
      // }

      // int i=0;
      // do {
      //    System.out.println(i);
      //    i++;
      // } while (i<11);


      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      // int sum=0;
      // for(int i=1; i<=n; i++){
      //    sum += i;
      // }
      // System.out.println(sum);

      for(int i=1; i<=10; i++){
         System.out.println(n*i);
      }
   }
}
