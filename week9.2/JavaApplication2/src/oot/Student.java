
package oot;

public class Student extends Person implements Movable{
    public Student(String name){
        super(name);
    }
    public void findMax(int a){
        System.out.print(getName() + " find max and remove duplicate = ");
        int[]count = new int[10];
        while(a>0){
            count[a%10]++;
            a/=10;
        }
        int sum = 0;
        for(int i=9; i>=0;i--){
            if(count[i]>0)
                sum  = sum*10+i;
        }
        System.out.println(sum);
    }
    public void moveZeroToEnd(int num){
        System.out.print(getName() + " move from " + num + " to ");
        int sum = 0, count = 1, base = 1, d;
        
        while(num > 0){
            d = num%10;
            if(d==0)
                count *= 10;
            else{
                sum = sum+base*d;
                base *= 10;
            }
            num /= 10;
        }
        System.out.println(sum*count);
    }
}
