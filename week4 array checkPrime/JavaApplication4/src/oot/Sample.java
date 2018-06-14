
package oot;

public class Sample {
    public static void main(String[] args) {
        int []x = {3,5,1,9,4};
      //int min =x[0],max=x[0],sum = 0;
        int max,min,sum;
            max = min = sum = x[0];
      /*for(int i = 0; i < x.length; i++){
            if(x[i]>max)
                max = x[i];
            if(x[i]<min)
                min = x[i];
            sum += x[i];
        } */
      
        sum = sumMember(x);
        min = minimum(x);
        max = maximum(x);
        System.out.print("sum except max and min = " + (sum-(max+min))); 
    } 
    
    public static int sumMember(int[]a){
        int sum=0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        
        return sum;
    }
    
    public static int maximum(int[]a){
        int max=a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }
    
    public static int minimum(int[]a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i]<min)
                min = a[i];
        }
        return min;
    }
}
