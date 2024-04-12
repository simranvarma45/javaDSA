 public class typeCasting{ 
public static void main(String args[]) { 
// float f=12.34;//lossy conversion as 12.34 will be treated as double by default
float f=12.34f;
int g=(int)f;
System.out.println(f);
System.out.println(g);
char ch ='c';
int ch1=ch;
char d=78;
System.out.println(d);
} 
}