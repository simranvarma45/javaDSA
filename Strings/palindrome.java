public class palindrome{
    public static boolean check(String str){
for(int i=0;i<str.length()/2;i++){
   if (str.charAt(i)!=str.charAt(str.length()-i-1)){
    return false;
   }
} 
return true;
    }
    public static void main(String []args){
        String str="simran verma";
        String str1="bob";
        if(check(str)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        if(check(str1)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}