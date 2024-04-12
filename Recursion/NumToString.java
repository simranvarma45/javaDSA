public class NumToString{
    static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
public static void convert(int num){
    if(num==0){
        return;
    }
    int lastDigit=num%10;
    convert(num/10);
    System.out.print(str[lastDigit]+" ");

}
public static void main (String args[]){
    int num=3423;
    convert(num);
}

}