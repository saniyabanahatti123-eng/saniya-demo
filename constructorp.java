 class constructorp {
    //properties
    int age;
        String name;
    public void printAbout(){ //Function 
        
        System.out.println(this.age);
        System.out.println(this.name);
        
    }
  constructorp(int age ,String name) { // parameterized constructor
    this.age=age;
    this.name=name;
  }
    public static void main(String[] args) {
        constructorp a= new constructorp(20,"sanu");//constructor call pass the argument
        a.printAbout();
    }
}