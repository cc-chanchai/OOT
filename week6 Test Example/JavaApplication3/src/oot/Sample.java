
package oot;


public class Sample {
        public static void main(String[] args) {
        int[]a = {3,9,15,22,23,28};
        int[]b = {4,10,22,28,30};
        findPalindrome(a);
        findPalindrome(b);
        findUnion(a,b);
        findIntersection(a,b);
    }
    public static void findPalindrome(int[]n){
        int rev;
        for(int i=0; i<n.length; i++){
            if(isPalindrome(n[i]))
                System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(int num){
        int rev=0,temp;
            temp = num;
            while(num>0){
                rev = rev*10 + num%10;
                num /= 10;
            }
        return rev == temp;
    }
    
    public static void findUnion(int[]x, int[]y){
        int i,j;
        i = j = 0;
        
        while(i<x.length && j<y.length){
            if(x[i] < y[j]){
                System.out.print(x[i] + " "); 
                i++;
            }
            else if(y[j]<x[i]){
                System.out.print(y[j] + " "); 
                j++;
            }
            else{
                System.out.print(x[i] + " "); 
                i++;
                j++;
            }
        }
        while(i < x.length)
            System.out.print(x[i++] + " "); //i++ = ใช้ i เดิมก่อนแล้วเพิ่มค่าทีหลัง
        
        while(j < y.length)
            System.out.print(y[j++] + " ");
        
        System.out.println();
    }
    
    public static void findIntersection(int[]x, int[]y){
        int i,j;
        i = j = 0;
        
        while(i<x.length && j<y.length){
            if(x[i] < y[j]){
                i++;
            }
            else if(y[j]<x[i]){
                j++;
            }
            else{
                System.out.print(x[i] + " "); 
                i++; 
                j++;
            }
        }
       
    }
    
}
