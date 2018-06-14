
package oot;


public class ReverseMember {
    public static void main(String[] args) {
        int[]x = {1,2,3,4,5};
        
        printArray(x);
        reverse(x);
        printArray(x);
    }
    
    public static void reverse(int[]a){
        int left = 0, right = a.length-1;
        int temp;
        while(left < right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
            
        }
    }
    
    public static void printArray(int[]a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
