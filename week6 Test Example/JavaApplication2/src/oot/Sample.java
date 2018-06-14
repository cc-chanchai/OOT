
package oot;


public class Sample {
    public static void main(String[] args) {
        System.out.println(count8(85618));
        System.out.println(count8(123));
        printTraingle(3);
        printTraingle(4);
        line(10);
        line(10,'@');
    }
      
    public static void printTraingle(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<= a-i; j++){
                System.out.print("+"); 
            }
            for(int j=1; j <= 2*i-1; j++){
                if(j==1 || j==2*i-1 || i==a)
                    System.out.print("*");
                else
                    System.out.print("-"); 
            }
            System.out.println();
        }
    }
    
    public static int count8(int a){
        int count = 0,digit;
           while(a>0){
                digit = a%10;
                    if(digit == 8)
                        count++;
                a /=10;
            }
        return count;
    }
        
    public static void line(int a){
        for(int i=0; i<a; i++){
            System.out.print("#"); 
        }
        System.out.println();
    }
    public static void line(int a,char b){
        for(int i=0; i<a; i++){
            System.out.print(b); 
        }
        System.out.println();
    }
}
