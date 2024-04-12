public class primeRanges{
public static void primeRan(int range){
    for(int i=2;i<=range;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
}
public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int j=2;j<=Math.sqrt(n);j++)
    {
        if(n%j==0){
            return false;
        }
        
    }
    return true;
}
public static void main(String args[]){
    primeRan(29);
}
}