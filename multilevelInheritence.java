class shape {
    public void area() {
System.out.println("display area");}
    }
    
//multilevel inheritance
    class tringle extends shape{
        public void area (int h, int l){
        System.out.println(0.5*h*l);
        }
    }
    class equilateraltringle extends tringle{
        public void area(int h, int l){
            System.out.println(0.5*h*l);
        }
    }
    public  class multilevelInheritence{
    


    public static void main(String args[]) {
equilateraltringle e = new equilateraltringle();
        e.area(2,5);

    }
}


