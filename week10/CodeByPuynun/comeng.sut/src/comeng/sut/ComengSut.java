package comeng.sut;
public class ComengSut {
    public static void main(String[] args) {    
  
        String s = "manatsawan"; //m aaaa nn t s w
        String t = "wantasanma";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String a , String b){
        int[]count = new int[26];
        
        if(a.length() != b.length())
            return false;
            
        for(int i = 0; i < a.length(); i++){
            char ch1 = a.charAt(i);
            count[ch1-'a']++;
        }
        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            count[ch-'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0)
        return false;
        }
        return true;
    }
}
//public static     

//==============================================================================

/*
String s = "tram";
        String t = "mart";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String a , String b){
        int[]count = new int[26];
        
        if(a.length() != b.length())
            return false;
            
        for(int i = 0; i < a.length(); i++){
            char ch1 = a.charAt(i);
            count[ch1-'a']++;
        }
        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            count[ch-'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0)
        return false;
        }
        return true;
    }
}
------------------------------------------------------
run:
true
*/

//==============================================================================

/*
   String s = "1234567";
        System.out.println(sumDigit(s));
    }
    public static int sumDigit(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            sum+= ch-'0';
        System.out.println("sum = "+sum);
        }
        return sum;
    }
}
--------------------------------------------
run:
sum = 1
sum = 3
sum = 6
sum = 10
sum = 15
sum = 21
sum = 28
28
*/

//==============================================================================

/*
String s = "abcxcba";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str){
        int left , right;
        left = 0;
        right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
------------------------------------------------------
run:
true
*/

//==============================================================================

/*
 String s = "3:10:100";
        String[]t;
        t=s.split(":");
        int sum = 0;
        
        for(int i=0; i< t.length; i++)
            sum+=Integer.valueOf(t[i]);
        System.out.println("sum = "+sum);
------------------------------------------
run:
sum = 113
*/


//==============================================================================


/*
String s = "3:10:100";
        String[]t;
        t=s.split(":");
        for(int i=0; i< t.length; i++)
        System.out.println(t[i]);
---------------------------------------
run:
3
10
100
*/

//==============================================================================

/*
        String s = "hello";
        System.out.println(s.length());
        String t = "    hello   ";
        System.out.println(t.length());
        t =t.trim();
        System.out.println(t.length());
----------------------------------------
run:
5
12
5
*/

//==============================================================================

/*
String s = "hello";
        System.out.println(s.substring(0 , 2));
------------------------------------------------
run:
he
*/


//==============================================================================

/*
 String s = "hello";
        System.out.println(s.equalsIgnoreCase("Hello"));
----------------------------------------------------------
run:
true
*/

//==============================================================================


/*
        String s = "hello";
        System.out.println(s.equals("hello"));
-----------------------------------------------
run:
true
*/


//==============================================================================
        
        /*
        String s = "hello";
        System.out.println(toUpper(s));
    }
    public static String toUpper(String s){
        String t = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'a' && ch<='z')
                t = t+(ch-32);
            else if(ch >= 'A' && ch <= 'z')
                t= t+ch;
        }
        return t;
    }
}
---------------------------------------------
run:
7269767679
*/

//==============================================================================

        /*
        String s = "hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat(" there"));
        System.out.println(s+" there");
        ----------------------------------------
                run:
        HELLO
        hello
        hello there
        hello there
        */

//==============================================================================

        /*
        String s = "hello";
        System.out.println(findString(s,"ell"));  //1
    }
    public static int findString(String s , String t){
        boolean canFind = false;
        for(int i = 0; i <= s.length()-t.length(); i++){
            char ch1 = s.charAt(i);
            if(ch1 == t.charAt(0)){
                canFind = true;
                for(int j = 0;  j < t.length(); j++){
                char ch2 = t.charAt(j);
                if(s.charAt(i+j) != ch2){
                    canFind = false;
                    break;
            }
                }
            }
            if(canFind)
                return i;
    }
            return -1;
---------------------------------------------------------
run:
1
*/

//==============================================================================
        
        /*
        String s = "hello";
        System.out.println(s.lastIndexOf('l')); //3
        System.out.println(s.indexOf('l')); //2
        ---------------------------------------------
        */
    
//==============================================================================

        /*
        String s = "he23l32lo";
        for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(ch>='a'&&ch<='z')
            System.out.print(ch);
        }
        System.out.println();
        ---------------------------------
        run:
        hello
        */


//==============================================================================
    
        /*
        String s = "hello"; 
        for(int i=s.length()-1; i>=0; i--){
             System.out.print(s.charAt(i)+"   ");     
        ----------------------------------------------
        run:
        o   l   l   e   h         
        }
        */
        

//==============================================================================
        
        /*
        for(int i=0; i<s.length(); i++){
             System.out.print(s.charAt(i)+"   ");    
        }
        -----------------------------------------------
        run:
        h   e   l   l   o       
        */
        

//==============================================================================
        
        /*
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        ----------------------------------------------
        run:
        hello
        5
        l
        */