

 class recursion3 {

    public static void printpermutation(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);
            printpermutation(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printpermutation(str, "");
    }

    // public static int pathCount(int i, int j, int m, int n){
    //     if(i==m || j==n){
    //         return 0;
    //     }
    //     if(i==m-1 && j==n-1){
    //         return 1;
    //     }
    //     int downPaths = pathCount(i+1, j, m, n);
    //     int rightPaths = pathCount(i, j+1, m, n);

    //     return downPaths + rightPaths;
    // }
    // public static void main(String[] args) {
    //     int m = 3, n =2;
    //     int totalPath = pathCount(0, 0, m, n);
    //     System.out.println(totalPath);
    // }

    // public static int placeTitle(int m, int n){
    //     if(m==n){
    //         return 2;
    //     }
    //     if(m<n){
    //         return 1;
    //     }

    //     int vertPlacements = placeTitle(m-n, n);

    //     int horiPlacements = placeTitle(m-1, n);

    //     return vertPlacements + horiPlacements;
    // }

    // public static void main(String[] args) {
    //     int m=4, n=2;
    //     int totalWays = placeTitle(m, n);
    //     System.out.println(totalWays);
    // }

    // public static int callGuests(int n){
    //     if(n<=1){
    //         return 1;
    //     }

    //     int single = callGuests(n-1);

    //     int pairs = (n-1) * callGuests(n-2);

    //     return single + pairs;
    // }
    // public static void main(String[] args) {
    //     int n=4;
    //     System.out.println(callGuests(n));
    // }

    // public static void printsubs(ArrayList<Integer> subset){
    //     for(int i=0; i<subset.size(); i++){
    //         System.out.print(subset.get(i));
    //     }
    //     System.out.println();
    // }
    // public static void findSubsets(int n, ArrayList<Integer> subset){
    //     if(n==0){
    //         printsubs(subset);
    //         return;
    //     }

    //     subset.add(n);
    //     findSubsets(n-1, subset);

    //     subset.remove(subset.size()-1);
    //     findSubsets(n-1, subset);
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     ArrayList<Integer> subset = new ArrayList<>();
    //     findSubsets(n, subset);
    // }
}
