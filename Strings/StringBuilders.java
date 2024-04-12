public class StringBuilders{
    public static void main(String args[]){
        StringBuilder s= new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            s.append(ch);
        }
        System.out.println(s);
        System.out.println(s.length());
    }
}
//efficient use of memory can be done using stringbuilder
//TC=O(n); if we used string then TC=O(n^2) 
//one n for charcters to be added and second is for string to be copied to new string
