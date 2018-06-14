package oot;

public class Sample {
    public static void main(String[] args) {
        createEvenNumber(13842);
        createEvenNumber(58900);
        createEvenNumber(3210);
    }
    public static void createEvenNumber(int num){
        int sum1, sum2,digit1, digit2;
        
        sum1 = reverseEven(num);
        digit1 = countEven(num);
        sum2 = reverseEven(sum1);
        digit2 = countEven(sum1);
        
        for(int i = 1; i <= digit1 - digit2; i++){
            sum2 *= 10;
        }
        System.out.println(sum2);
        
    }
    public static int reverseEven(int num){
        int rev = 0, d;
        
        while(num > 0){
            d = num %10;
            if(d %2 == 0)
                rev =rev*10 +d;
            num /=10;
        }
        return rev;
    }
    public static int countEven(int num){
        int count = 0,d;
        
        while(num >0){
            d= num%10;
            if(d%2 ==0)
                count++;
            num /=10;
        }
        return count;
    }
}
