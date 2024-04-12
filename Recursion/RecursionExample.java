public class RecursionExample{
    public static void print(int n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        //to print increasing numbers
        print(n-1);
        System.out.print(n+" ");
        //for print decreasing numbers
        // System.out.print(n+" ");
        // print(n-1);
        
        
    }
    public static void main (String args[]){
      int n =10;
      print(10) ;
    }
    
}