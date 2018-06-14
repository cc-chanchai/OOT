
package oot;


public class Sample {
    public static void main(String[] args) {
        int[]x = {15,9,1,8,4};
        
        printForward(x);
        printBackward(x);
        printOdd(x);//เลขคี่
        printEven(x);//เลขคู่
    }
    
    public static void printForward(int []a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void printBackward(int []a){
        for(int i = a.length-1; i>=0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void printOdd(int []a){
        for(int i=0; i<a.length; i++){
            if(a[i]%2==1)
            System.out.print(a[i] + " "); 
        }
        System.out.println();
    }
    public static void printEven(int []a){
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0)
            System.out.print(a[i] + " ");
        }
    }
}
