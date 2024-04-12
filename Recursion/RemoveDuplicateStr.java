public class RemoveDuplicateStr{
    public static void remove(String str, StringBuilder newstr,int i,boolean []map){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(i);
        if(map[ch-'a']){
            remove(str,newstr,i+1,map);
        }
        else{
            map[ch-'a']=true;
            remove(str,newstr.append(ch),i+1,map);
        }
    }
    public static void main(String args[]){
String str="sssiiimrrrrrraaaannn";
remove(str, new StringBuilder(""),0,new boolean[26]);

    }
}