public class swap{
    public static void swapping(int m, int n){
        m= (m^n);
        n=(m^n);
        m=(m^n);
System.out.println("values after swapping are : ");
System.out.println( m + " " + n);
    }
    public static void main(String args[]){
        int m =5,n =3;
        System.out.println("Values before swapping are : ");
        System.out.println(m + " " + n);
        swapping(m,n);
    }
}