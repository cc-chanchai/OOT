package oot;


public class Foo {
    private String name;
    
    public Foo(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void add(int[]n){
        int sum = 0;
        System.out.print(name + " add (except 0 in number) = ");
        for(int i=0; i<n.length; i++)
           if(!hasZero(n[i])){
               sum += n[i];
        }
        System.out.println(sum);
    }
    private boolean hasZero(int num){
        while(num > 0){
            if(num%10==0)
                return true;
            num /= 10;
        }
        return false;
    }
}
