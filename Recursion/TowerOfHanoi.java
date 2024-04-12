public class TowerOfHanoi{
    public static void print(int n ,String source ,String helper ,String destination){
        // if(n==0){--can also be used as a base case
        //     return;
        // }
        if(n==1){
            System.out.println("move disk "+ n + " from "+ source +" to "+destination);
            return;
        }
        print(n-1,source,destination,helper);
        System.out.println("move disk "+ n + " from "+ source +" to "+destination);
        print(n-1,helper,source,destination);
    }
public static void main(String args[]) {
    print(3,"source","helper","destination");
}
}