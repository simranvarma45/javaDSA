public class funcOverloading{
  public static int sum(int a,int b){
        return a+b;
    }
   public static float sum(float a, float b){//usimg datatype
        return a+b;
    }
    public static int sum(int a, int b ,int c){//using different number of parameter passing
        return a+b+c;
    }
public static void main(String args[]){
System.out.println("The sum is : " + sum(2,3));
System.out.println("The sum is : " + sum(2.3f,3.5f));
System.out.println("The sum is : " + sum(2,3,5));
}

}//function overloading depends on the number of parameters passing
//not on the return type of the function
//either the parameters type should be different 
//or the number of parameters passing should be different
//in order to archieve function overloading