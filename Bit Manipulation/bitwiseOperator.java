public class bitwiseOperator{

 public static void main(String args[]){
    int a=5,b=6;
    System.out.println("Binary AND of 5 and 6 is :" + (a&b));
    System.out.println("Binary OR of 5 and 6 is :" + (a|b));
    System.out.println("One's Complement of 5 is : "+ (~a));
    System.out.println("XOR of a and b is :" + (a^b));
    System.out.println("Binary Left Shift of 5 is : "+(a<<2) );
    //formula for binary left shift : a<<b = a* 2^b;
    System.out.println("Binary Right Shift of 5 is : " + (a>>2));
    //formula for binary right shift : a>>b = a/ 2^b;

 }   
}