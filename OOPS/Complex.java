import java.util.Scanner;
public class Complex{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter real and imaginary values");

int x1= sc.nextInt();
int y1 = sc.nextInt();
int x2= sc.nextInt();
int y2 = sc.nextInt();
Number c1= new Number(x1,y1);
Number c2= new Number(x2,y2);
// Operations o = new Operations();
// o.sum(c1,c2);
// o.multiplication(c1,c2);
// o.difference(c1,c2);
Number c3=Number.add(c1,c2);
Number c4=Number.difference(c1,c2);
Number c5=Number.multiplication(c1,c2);
c3.print();
c4.print();
c5.print();

    }
}
class Number{
    int real;
    int img;
     public Number(int real, int img){
        this.real=real;
        this.img=img;
    }
    void print(){
        if (this.real==0 && this.img==0){
            System.out.println("0 + 0i");
        }
        else if(this.real==0){
            System.out.println(img+"i");
        }
        else if(this.img==0){
            System.out.println(real);
        }
         
        else{
System.out.println("The complex number is " + this.real +"+ i "+this.img);
        }
    }
    public static Number add(Number c1, Number c2){
        return new Number ((c1.real+c2.real),(c1.img + c2.img));
    }
    public static Number difference(Number c1, Number c2){
        return new Number ((c1.real-c2.real),(c1.img - c2.img));
    }
    public static Number multiplication(Number c1, Number c2){
        return new Number ((c1.real*c2.real),(c1.img * c2.img));
    }
    
}
// class Operations{
// void sum (Number o1, Number o2){
//         System.out.println("The sum is :"+ (o1.real +o2.real) +" + "+ (o1.img+o2.img)+ " i ");
//     }
//     void multiplication (Number o1, Number o2){
//         System.out.println("The product is :"+ (o1.real * o2.real) +" + "+ (o1.img * o2.img)+ " i ");
//     }
//     void difference (Number o1, Number o2){
//         System.out.println("The sum is :" +(o1.real - o2.real)+" + "+ (o1.img- o2.img)+ " i ");
//     }
// }