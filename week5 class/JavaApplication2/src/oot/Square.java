
package oot;


public class Square {
   private Line line;
   
   public void setLine(Line line){
       this.line = line;
   }
   public Line getLine(){
       return line;
   }
   public int getArea(){
       return line.getLength()*line.getLength();
   }
}
