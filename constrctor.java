 class constrctor {
    //properties
    int age;
        String name;
    public void printAbout(){ //Function 
        
        System.out.println(this.age);
        System.out.println(this.name);
        
    }
  constrctor() { //non parameterized constructor
    System.out.println("constrctor called");
  }
    public static void main(String[] args) {
        constrctor a= new constrctor();
        a.age=24;
        a.name="saniya";
        a.printAbout();
    }
}