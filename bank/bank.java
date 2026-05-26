
class account {
    public String name; // accesble From anywhere
    protected String email; //ony same package and otside the package sab class
    private String password;//ony within the class

    //getters & setteres access the private 
    public String getPassword() {
        return this.password;
    }

    public void setpassword(String pass) {
this.password=pass;
    }
}
 public class bank{
    public static void main(String args[]){
        account account1 = new account();
        account1.name="saniya";
        account1.email="saniyabanahatti@gamil.com";
        account1.setpassword("sanu");
        System.out.println(account1.getPassword());
    }
}
