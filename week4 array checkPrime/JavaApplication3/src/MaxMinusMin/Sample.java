
package MaxMinusMin;


public class Sample {
    public static void main(String[] args) {
        int []x = {3,9,15,1,8,20,12,4};
        int min =x[0],max=x[0],sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
            if(x[i]>max)
                max = x[i];
            if(x[i]<min)
                min = x[i];
        }
        System.out.println("max-min = " + (max-min));
        System.out.print("sum = " + sum); 
    }
    
}
