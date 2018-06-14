
package oot;

public class Getter {
    public static void main(String[] args) {
        Line line = new Line(5);
        Square s = new Square();
        Cube c = new Cube();
        
        s.setLine(line);
        c.setSide(s);
        System.out.println("square with length of line = " + s.getLine().getLength() + " has area = " + s.getArea());
        System.out.println("cube with side area = " + c.getSide().getArea() + " has volume = " + c.getVolume());
    }
    
}
