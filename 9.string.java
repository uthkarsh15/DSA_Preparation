 class string {
    public static void main(String args[]){
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.length());

        //charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }


        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value
        // if(firstName.compareTo(lastName) == 0) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Tony") == new String("Tony")){
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not equal");
        // }

        String sentence = "TonyStark";
        String name = sentence.substring(0, 4);
        System.out.println(name);
    }
}
