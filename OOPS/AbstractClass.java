public class AbstractClass{
    public static void main(String args[]){
Fish f = new Fish();
Dog d = new Dog();
d.walk();
f.walk();
System.out.println(d.color);
    }
}
//we cannot create any instance of abstract classes
// but constructor can be created for abstract classes
abstract class Animal{
    String color;
    Animal(){
        color = "brown";//default color will be brown 
        //which will be apply on all subclasses values
        //since the constructor of super class will invoked first
        //followed by the constructir of subclasses
        System.out.println("Animal class constructor called");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    abstract void walk();//abstract function definition will
                         // not be given in superclass. Sub classes defined them accordingly
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog class constructor called");
    }
    void changecolor() {
        color="black";
        }
    
    void bark(){
        System.out.println("barks");
    }
    void walk(){
        //it is mandatory to define abstract  function in sub classes
        System.out.println("Walks on 4 legs");
    }
}
class Fish extends Animal{
    Fish(){
        System.out.println("Fish class constructor called");
    }
    void changeColor(){
     color = "yellow";
    }
    
    void swim(){
        System.out.println("swims");
    }
    void walk(){
        
        System.out.println("this animal swims not walk");
    }
}
//constructor invoked in the following manner----
// parentclass constructor -> child class constructor and so on