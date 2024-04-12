public class Inheritance{
    public static void main(String args[]){
Dog d= new Dog();
cat c=new cat();
c.eat();
d.sleep();
d.heart=1;
System.out.println(d.heart);
d.legs=4;
System.out.println(d.legs);
    }
}
class Animal{
    int heart;
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    void drinkWater(){
        System.out.println("Drinking water");
    }
}
class Mammal extends Animal{
    int legs;
    void backbone(){
        System.out.println("have a backbone");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}
//types of inheritance ----
//Single Level Inheritance --> class B extends class A
//MultiLevel Inheritance--> class C extends class B extends class A
//Hierarchial Inheritance --> class b extends class A , class C extends class A and so on
//Hybrid Ineritance --> combination of two or more inheritance
//Multiple inheritance --> class C extends class A as well as class B
//Multiple inheritance is not supported by java as it creates ambiguity 
// whenever the same function is inherit from different classes then 
// java compiler confuses that which class function is called thus ambiguity occurs