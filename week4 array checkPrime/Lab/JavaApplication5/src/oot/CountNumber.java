
package oot;


public class CountNumber {
    public static void main(String[] args) {
        int[]x = {15,2,3,402,9,87};
        countNumber(x);
    }
    
    public static void countNumber(int[]a){
        int[]count = new int[10];
        
        for(int i=0; i<a.length; i++){
            int num = a[i];
            while(num > 0){
                count[num%10]++;
                num/=10;
            }
        }
        for(int i=0; i<10; i++)
            System.out.println(i + " = " + count[i]); 
    }
}
