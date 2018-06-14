
package oot;

public class Sample {
    public static void main(String[] args) {
        String[]s = {"100","20","0","x3","v","5"};
        int num;
        
        for(int i = 0; i < s.length; i++){
            try{
                num = Integer.valueOf(s[i]);
                System.out.println(100/num);
            }
            catch(NumberFormatException e){
                System.out.println("format error");
            }
            catch(ArithmeticException e){
                System.out.println("divide by zero");
            }
        }
        System.out.println("bye");
    }
    
}
