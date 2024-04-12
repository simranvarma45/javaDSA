public class subString{
    public static String substring(String str ,int si,int ei){
String sub="";
for(int i=si;i<ei;i++){
    sub+=str.charAt(i);
}
return sub;
    }
    public static void main(String args[]){
        String str="simran verma";
       String sub= substring(str,0,6);
       for(int i=0;i<sub.length();i++){
        System.out.print(sub.charAt(i));
       }
System.out.print(str.substring(0,6));
    }
}