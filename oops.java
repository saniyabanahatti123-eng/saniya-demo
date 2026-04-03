class pen {
    //properties
    String colour;
    String type;
    public void write() {
        System.out.println("writing something");
    }
    public void PrintColour() {
        System.out.println(this.colour);
    }
}
class student {
    String name;
    int age;
}

public class oops {
    public static void main(String[] args) {
        //object creation
        pen s = new pen(); 
        s.colour="blue";
        s.type="gel";
        s.write(); //Function call
//object to access this keyword
       pen pen1 = new pen();
       pen1.colour="black";
       pen1.type="ballpoint";
       pen1.PrintColour(); //Function call
       s.PrintColour();
    }

}

