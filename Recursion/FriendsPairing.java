public class FriendsPairing{
    public static int count(int n){
        if(n==1 || n==2){
            return n;
        }
        // if(n==2){
        //     return 2;
        // }
        // int single=count(n-1);
        // int couple= (n-1) * count(n-2);
        // int totalCount = single+couple;
        // return totalCount;
        return count(n-1) + (n-1)* count(n-2);
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(count(5));

    }
}