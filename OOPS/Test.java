public class Test{
    public static void main(String args[]){
B obj =new B();
obj.print();
    }
}
class A {
    protected void print(){
        System.out.println("this method is protected");
    }
}
class B {
    private void print(){
        System.out.println("this method is private");
    }
}