
public class StaticKeyword{
    Test d= new Test();
 static void m1(){
        System.out.println("Method m1 is called!!");
    }   
    static int a=10;//we have to make 'a' static in order to operates it with another static variable
    static int b;
    static{//static block
        b=a*4;
        System.out.println(b);
    }
public static void main(String args[]){
m1();//method m1 is called without creating an object of the class
}
}
 