// public class fastExponential{
//     public static int result(int a,int n){
//         int ans =1;
//         while(n!=0){
// if((n&1)!=0){
// ans= ans*a;

// }
// n=n>>1;
// a=a*a;
//     }
//     return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(result(5,3));
//     }
// }
public class fastExponential{
    public static int result(int a){
        int ans =1;
        int n =a;
        while(n!=0){
if((n&1)!=0){
ans= ans*a;

}
n=n>>1;
a=a*a;
    }
    return ans;
    }
    public static void main(String args[]){
        System.out.println(result(3));
    }
}