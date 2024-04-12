public class Super{
    public static void main(String args[]){
Dog d= new Dog();
d.printcolor();
d.eat();
    }
}
class Animal{
    String color="white";
    void eat(){
        System.out.println("Eating");
    }
Animal(){
    System.out.println("Animal is created");
}
}
class Dog extends Animal{
    String color = "black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
        void eat(){
            super.eat();
            System.out.println("Dog is eating");
        }
        Dog(){
            super();//if we did not use super() then aslo animal constructor will
            //invoked implicitly as java compiler automatically called super() whenever
            //the object of sub class is created
            System.out.println("Dog is created");
        }
    }
