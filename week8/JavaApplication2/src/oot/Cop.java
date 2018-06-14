
package oot;


public class Cop {
    private int num;
    public void setNumber(int num){
        this.num = num;
    }
    public int getNumber(){
        return num;
    }
    public int sum(int a, int b){
        return a+b;
    }
    public void print(int n){
        for(int i=1; i<=n*2; i++){
            if(i<=n)
                System.out.print("\\");
            else
                System.out.print("/"); 
        }
        System.out.println();
    }
}
