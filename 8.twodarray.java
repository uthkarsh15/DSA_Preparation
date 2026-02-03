import java.util.*;
 class twodarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int tar = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(tar == numbers[i][j]){
                    System.out.println("found at "+ i +"," + j);
                }
                // System.out.print(numbers[i][j] + " ");
            }
            // System.out.println();
        }
    }
}
