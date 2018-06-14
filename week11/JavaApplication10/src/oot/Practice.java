
package oot;


public class Practice {
    public static void main(String[] args) {
        String s  = "123:34:41:120:202";
        int sum=0;
        String[]t;
        t= s.split(":");
        
        for(int i = 0; i < t.length; i++){
            try{
                check(t[i]);
                System.out.println(t[i]);
                sum += Integer.valueOf(t[i]);
            }
            catch(ZeroException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("sum = " + sum);
    }
    public static void check(String str) throws ZeroException{
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '0')
                throw new ZeroException("ZeroException : " + str);
        }
    }
}
