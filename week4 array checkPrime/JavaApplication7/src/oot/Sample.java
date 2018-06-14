
package oot;


public class Sample {
    public static void main(String[] args) {
        int[]x = {14,5,9,101,33,7,222,17};
        check(x);
    }
    
    public static void check(int []a){
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
            if(isPrime(a[i])){
                System.out.print("prime ");
                if(isPalindrome(a[i]))
                    System.out.print("palindrome");
            System.out.println();
            }
            else if(isPalindrome(a[i]))
                System.out.println("palindrome");
            else
                System.out.println("ordinary");
        }
        System.out.println();
    }
    public static boolean isPalindrome(int num){
        int temp = num, rev = 0;
        while(num > 0){
            rev = rev*10+num%10;
            num /=10;
        }
        return rev == temp;
    }
    public static boolean isPrime(int num){
        if(num < 2)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        for(int i = 5; i*i <= num; i+=6){
            if(num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
