
package oot;


public class Sample {
    public static void main(String[] args) {
        int[]n = {3,5,20,19,10,3};
        
        for(int i = 0; i < n.length; i++){
            try{
                check(n[i]);
                System.out.println(n[i]);
            }
            catch(OddException e){
                System.out.println(e.getMessage());
            }
            
        }
    }
    public static void check(int num) throws OddException{
        if(num%2 ==1)
            throw new OddException("Oddxception : " + num);
    }
}
