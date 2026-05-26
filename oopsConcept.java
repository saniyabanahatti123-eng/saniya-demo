abstract class Animal { //abstaction
    abstract void walk ();
}
class horse extends Animal {
public void  walk () {
    System.out.println("walk on 4 legs");

}
}
class chicken extends Animal {
    public void walk () {
        System.out.println("walk on 2 legs");
    }
}
public class oopsConcept{
    public static void main (String args[]) {
horse s1 = new horse();
s1.walk();
    }
}