 public class typeConversion{ 
public static void main(String args[]) { 
// char a='a';
// char b='f';
// System.out.println(b-a);
// System.out.println(a);//gives a as output
/*type promotion
type promotion 
will happen when expressions are used
 i.e. operations
like addition and subtractions will
 going to be performed*/
//  char c=(char)(b-a);//this gives an unusal answer
//char c=b-a; //gives lossy conversion error as 
 //a-b will become an integer value and c is defined
 //as a character value 
//  System.out.println(c);
//  short x=5;//neither x,y nor z are of int type
 //stiil x+y+z will be converted into int 
//  byte y=22;
//  char z='c';
//  byte w=x+y+z;  //error int to byte lossy conversion
// byte w=(byte)(x+y+z);
//  System.out.println(w);
//  int j=5;
//  float k=20.45f;
//  double l=34;
//  long m=6;
//  char o= 'a';
//  double n=j+k+l+o+m;//all the values will be converted to double
//  System.out.println(n);
byte b=10;
// b=b*2;//gives lossy conversion error
b=(byte)(b*2);
System.out.println(b);
} 
}