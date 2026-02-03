class recursion2 {
    // public static void towerOfHanoi(int n, String src, String helper, String dest){
    //     if(n==1){
    //         System.out.println("transfer disk"+ n + " from "+src+" to "+dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk"+ n + " from "+src+" to "+dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String args[]){
    //     int n=3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }


    // public static void reverseString(String str, int idx){
    //     if(idx == 0){
    //         System.out.print(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     reverseString(str, idx -1);
    // }
    // public static void main(String[] args){
    //     String str = "abcd";
    //     reverseString(str, str.length()-1);
    // }


    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurence(String str, int idx,char element){
    //     if(idx == str.length()){
    //         System.out.println("first occurence at index: " + first);
    //         System.out.println("last occurence at index: " + last);
    //         return;
    //     }
    //     if(str.charAt(idx) == element){
    //         if(first == -1){
    //             first = idx;
    //         }
    //         else{
    //             last = idx;
    //         }
    //     }
    //     findOccurence(str, idx+1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "abcaadefaah";
    //     char element = 'a';
    //     findOccurence(str, 0, element);
    // }


    // public static boolean isSorted(int arr[],int idx){
    //     if(idx == arr.length - 1){
    //         return true;
    //     }
    //     if(arr[idx] >= arr[idx+1]){
    //         return false;
    //     }
    //     return isSorted(arr, idx+1);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};
    //     System.out.println(isSorted(arr, 0));
    // }


    // public static void moveAllX(String str,String newString, int count, int idx){
    //     if(idx == str.length()) {
    //         for(int i=0; i<count; i++){
    //             newString +="x";
    //         }
    //         System.out.println(newString);
    //         return;
    //     }

    //     if(str.charAt(idx) == 'x'){
    //         count++;
    //         moveAllX(str, newString, count, idx+1);
    //     } else{
    //         newString += str.charAt(idx);
    //         moveAllX(str, newString, count, idx+1);
    //     }
    // }
    // public static void main(String[] args){
    //     String str = "axbcxxd";
    //     moveAllX(str, "", 0, 0);
    // }

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str,int idx, String newString){
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true){
    //         removeDuplicates(str, idx+1, newString);
    //     } else {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "aabcdda";
    //     removeDuplicates(str, 0, "");
    // }


    // public static void subsequences(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);

    //     // to be
    //     subsequences(str, idx+1, newString+currChar);

    //     // or not to be
    //     subsequences(str, idx+1, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     subsequences(str, 0, "");
    // }


    // public static void subsequences(String str, int idx, String newString, HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         } else {
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char currChar = str.charAt(idx);

    //     // to be
    //     subsequences(str, idx+1, newString+currChar, set);

    //     // or not to be
    //     subsequences(str, idx+1, newString, set);
    // }
    // public static void main(String[] args) {
    //     String str = "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     subsequences(str, 0, "",set);
    // }


    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination){
        if(idx ==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]) {
        String str = "23";
        printComb(str, 0, "");
    }
}