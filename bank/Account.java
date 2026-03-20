package bank;

public class Account{
    public String name;
    protected String email;
    private String password;

    // getter & setter
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

class bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "uthkarsh";
        account1.email = "shivamg1505@gmail.com";
        // account1.passwrod = "abcd";
        account1.setPassword("ABCD");
        System.out.println(account1.getPassword());
    }
}