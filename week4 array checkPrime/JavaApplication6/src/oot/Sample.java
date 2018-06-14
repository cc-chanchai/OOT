
package oot;


public class Sample {
    public static void main(String[] args) {
        int[]x = {4,9,1,3,5};
        
        printNum(x);
    }
    
    public static void printNum(int []x){
        for(int i=0; i<x.length; i++){
            for(int j=1; j <= x[i]; j++)
                System.out.print(x[i]);
            System.out.println();
        }
    }
 
}
