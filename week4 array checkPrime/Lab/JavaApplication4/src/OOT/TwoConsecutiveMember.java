
package OOT;


public class TwoConsecutiveMember {
    public static void main(String[] args) {
        
        int[]x = {20,2,18,9,5,15};
             
        System.out.print(maxSum2Consecutive(x)); 
    }
    public static int maxSum2Consecutive(int[]a){
        int max=0,sum;
        
        for(int i=0; i<a.length-1; i++){
            sum = a[i] + a[i+1];
            if(sum > max)
                max = sum;
        }
        
        return max;
    }
}
