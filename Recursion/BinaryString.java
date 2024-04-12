public class BinaryString{
    public static void print(String st,int n,int prev){
        if(n==0){
            System.out.println(st);
            return;
        }
if(prev!=1){
  print(st+"1",n-1,1)  ;
}
print(st+"0",n-1,0);

    }
    public static void main(String args[]){
        print( new String(""),3,0);
    }
}