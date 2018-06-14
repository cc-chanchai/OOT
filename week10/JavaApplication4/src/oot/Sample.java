
package oot;


public class Sample {
    public static void main(String[] args) {
        String s = "abcxcba";
        String t = "1234567";
        //System.out.println(isPalindrome(s)); //true
        System.out.println(sumDigit(s)); //28
    }
    public static boolean isPalindrome(String s){
        int left, right;
        
        left = 0;
        right = s.length()-1;
        
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static int sumDigit(String str){
        int sum = 0;
        
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            sum += ch - '0'; //change type
        }
        return sum;
    }
}
