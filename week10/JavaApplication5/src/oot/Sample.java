
package oot;

public class Sample {
    public static void main(String[] args) {
        String s = "tram";
        String t = "mart";
        
        System.out.println(isAnagram(s, t)); //true
    }
    public static boolean isAnagram(String a,String b){
        int[]count = new int[26]; //26 is number in english character.
        
        if(a.length() != b.length())
            return false;
        
        for(int i=0; i<a.length(); i++){
            char ch1 = a.charAt(i);
            count[ch1 - 'a']++;
        }
        for(int i=0; i<b.length(); i++){
            char ch2 = b.charAt(i);
            count[ch2 - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0);
                return false;
        }
        return true;
    }
}
