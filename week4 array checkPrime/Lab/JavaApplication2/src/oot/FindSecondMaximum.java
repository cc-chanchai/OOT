
package oot;

public class FindSecondMaximum {
    public static void main(String[] args) {
        int[]x = {3,1,9,5,4,7,2};
        //int[]x = {30,20,2,30,3,15};
        int max=-1,max2=-1;
        
        for(int i=0; i<x.length; i++){
            if(x[i]>max){
                max2 = max;
                max = x[i];
            }
            else if(x[i] > max2 && x[i] != max){
                max2 = x[i];
            }
        }
        System.out.print(max2);
    }
}
