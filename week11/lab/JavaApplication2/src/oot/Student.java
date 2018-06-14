package oot;

public class Student implements Sout{
    private String name;
    
    public Student(String name){
        this.name = name;
    }
    public void printNumExcept9(String str){
        String[]t;
        t = str.split(":");
        System.out.println(name + " print numbers except 9 as follows");
        for(int i = 0; i < t.length; i++){
            try{
                check(t[i]);
                System.out.println(t[i]);
            }
            catch(Exception e){
               System.out.println(e.getMessage());
            }
        }
    }
    public void doReverse(String str){       
        String[]t;
        t = str.split(":");
        System.out.println(name + " reverse numbers as follows");
        for(int i = 0; i < t.length; i++){
            try{
                //check2(t[i]);
                System.out.println(reverse(t[i]));
            }
            catch(Exception e){
               System.out.println(e.getMessage());
            }
        }
    }
    
    public static void check(String str) throws Exception{
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '9')
                throw new Exception("NineException : " + str);
            else if(ch < '0' || ch >'9' )
                throw new Exception("NotNumberException : " + str);
        }
    }
    
    /*public static void check2(String str) throws Exception{       *********do more for succes
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '9')
                throw new Exception("NineException : " + str);
            else if(ch < '0' || ch >'9' )
                throw new Exception("NotNumberException : " + str);
        }
    }*/
    
    public int reverse(String str){
        int n = Integer.valueOf(str);
        int rev = 0;
        
        while(n>0){
            rev = rev*10+n%10;
            n /= 10;
        }
        return rev;
    }
}
