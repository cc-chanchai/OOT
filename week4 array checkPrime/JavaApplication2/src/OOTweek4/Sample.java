
package OOTweek4;

public class Sample {
    public static void main(String[] args) {
        //int []x = new int[10]; // x is array of integer and have 10 member
        int []x = {3,5,1,9,15,10,4};
        int max = x[0];
        for(int i=0; i < x.length; i++){
        System.out.print(x[i]+ " ");
        }
        System.out.println();
        
        for(int i = x.length-1; i >= 0; i--){
        System.out.print(x[i]+ " ");
        }
        System.out.println();
       
        for(int i = 1; i < x.length; i++){
            if(x[i]>max)
                max = x[i];
        }
        System.out.println("max = " + max);
        System.out.println();
    }
}
