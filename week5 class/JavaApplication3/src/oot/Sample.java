
package oot;


public class Sample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator("CASIO");
        int[]num = {25,30,25,30,9,10};
        c1.setBrand("SHARP");
        c1.print(10, '#');
        c2.print(9, '*');
        c1.calculate(3,4);
        c2.calculate(5,0);
        c1.findDuplicate(num);
    }
}
