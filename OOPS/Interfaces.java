public class Interfaces{
public static void main(String args[]){
Dog d= new Dog();
d.eat();
Mammals c= new Dog();//reference of interface can be used to create object of subclass
c.backbone();
}
}
interface Animal{
int ears=2;
void legs();
void eat();
}
interface Mammals{
    void backbone();
}
class Dog implements Animal,Mammals{
 public void legs(){
  System.out.println("have four legs")  ;
}
public void eat(){
    System.out.println("eats both herbivore and carnivore food");
}
public void backbone(){
    System.out.println("having backbone");
}
}
//all the methods of an interface are abstract 
//we can also assign properties to an interface but we cannot modify
// those properties as they are finalt
// in sub classes the methods of the interface should be public 
//we can implements more than one interface to a class
// we can also extends class and implements interfaces to a single class
//we cannot extends more than one classes but we can 
// implements more than one interface to a class