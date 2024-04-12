// public class anagrams{
//     public static boolean check(String st1,String st2){
// boolean count=false;
// if(st1.length()==st2.length()){
// for(int i=0;i<st1.length();i++){
//     count=false;
//     for(int j=0;j<st2.length();j++){
//         if(st1.charAt(i)==st2.charAt(j)){
//             count=true;
//         }
        
//     }
//     if(count==false){
//         break;
//     }
// }
// return count;
//     }
//     else {
//         return count;}
//     }
//     public static void main(String args[]){
//         String st1="abcde";
//         String st2="bcaedf";
//         System.out.println(check(st1,st2));
//     }
// }
import java.util.Arrays;
public class anagrams{
    public static void main(String args[]){
        String s1="simti";
        String s2="mimsi";
        //convert both strings to lowercase so that we
        // do not have to check separately for upper and lowercase
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
        //convert them to character array
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        //sort them
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result=Arrays.equals(ch1,ch2);
        if(result){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        }
        else {
            System.out.println("false");
        }
    }
}