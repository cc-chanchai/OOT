
package oot;

public class Calculator {
    private String brand;
    
    public Calculator(){}
    public Calculator(String brand){
        this.brand = brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void print(int n, char c){
        System.out.println( brand + " prints ");
        System.out.print(n);
        for(int i =1; i<= n-2; i++)
            System.out.print(c);
        System.out.println(n);
    }
    public void calculate(int a, int b){
        System.out.print(brand + " calculate " + a + "^" + b + " = ");
        int res = 1;
        for(int i = 1; i <= b; i++)
            res *= a;
        System.out.println(res);
    }
    public void findDuplicate(int[]a){
        System.out.print(brand + " find dubplicate ");
        for(int i = 0; i < a.length; i++){
            boolean isDuplicate = false;
            for(int j = i+1; j < a.length; j++){
                if(a[i]==a[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate)
                System.out.print(a[i] + " ");
        }
    }
}
