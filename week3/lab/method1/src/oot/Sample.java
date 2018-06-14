
package oot;


public class Sample {
    public static void main(String[] args) {
        
        sumUntilOneDigit(521);
        sumUntilOneDigit(123456789);
        sumUntilOneDigit(99992);
        sumUntilOneDigit(5);
    }
    public static void sumUntilOneDigit(int n){
        int sum;
        do{
            sum = sumDigit(n);
            System.out.print(sum + "  "); 
            n = sum;
        }while(n > 9);
        System.out.println();
    }
    public static int sumDigit(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
    return sum;
    } 
}
