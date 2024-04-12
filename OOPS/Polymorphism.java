public class Polymorphism{
public static void main(String args[]){
Area a= new Area();
System.out.println("Area of square is : "+ a.area(4));
System.out.println("Area of rectangle is : "+a. area(4,6));
System.out.println("Area of triangle is : "+ a.area((float) 4.4,(float) 6.6));//as 4.4 and 6.6 will be treated as double
Herbi h= new Herbi();
h.eat();
}

}
//compile time polymorphism-- method overloading
class Area{
int area (int a, int b){
    return a * b ;
}
int area (int a){
    return a*a;
}
float area(float a, float b){

    return (float)((0.5)*a*b);
}
}
// Run time polymorphism -- method overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Herbi extends Animal{
    void eat(){
System.out.println("eats grass");//override animal class method eat
}
    }
    