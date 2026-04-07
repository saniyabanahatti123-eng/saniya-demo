 class constructorp {
    //properties
    int age;
        String name;
    
  public static void printAbout(String name){
System.out.println(name);
  }
  public static void printAbout(int age) {
    System.out.println(age);
  }
    public static void main(String[] args) {
        constructorp s1=new constructorp();
        s1.age=20;
        s1.name="sanu";
       printAbout(s1.age);
       printAbout(s1.name);
    }
}