
package oot;

public class Sample {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(findString(s, "ell"));
        
    }
    public static int findString(String str, String t){
        boolean canFind = false;       
        for(int i=0;i<=str.length();i++){
            char ch1 = str.charAt(i);
           
            if(ch1 == t.charAt(0)){ 
                canFind = true;
                for(int j=0;j<t.length();j++){
                    char ch2 = t.charAt(j);
                    if(str.charAt(i+j) != ch2){
                        canFind = false;
                        break;
                    }
                }
            }
            if(canFind)
                return i;
        }
        return -1;
    }
}
