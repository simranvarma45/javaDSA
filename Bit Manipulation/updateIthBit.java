public class updateIthBit{
    public static int clear(int n, int i){
        int bitmask=(~(1<<i));
        return n & (bitmask);
    }
    public static int set(int n , int i){
        int bitmask= 1<< i;
        return n | bitmask;
    }
    //Approach 1 --
//     public static int update(int n , int i , int newvalue){
//         if(newvalue==1){
//             return set(n,i);
//         }
//         else {
// return clear(n,i);
//         }
//     }
//Second Approach --
public static int update(int n , int i , int newvalue){
 n = clear(n,i);
int bitmask =(newvalue << i) ;
return n | bitmask;

}
    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}