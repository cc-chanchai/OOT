
package oot;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        method1();
        method11();
    }
    
    public static void method1(){
        method2();
    }
    public static void method2(){
        try{
            System.out.println(100/0);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero");
        }
    }
    
    
    public static void method11(){
        try{
        method22();
        }
        catch(ArithmeticException e){
            System.out.println("22 Divide by zero");
        }
    }
    public static void method22() throws ArithmeticException {
        System.out.println(100/0);
    }
       // and can use try catch() in main by example method11
}
