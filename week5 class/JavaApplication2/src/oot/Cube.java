
package oot;


public class Cube {
    private Square side;
    
    public void setSide(Square side){
        this.side = side;    
    }
    public Square getSide(){
        return side;
    }
    public int getVolume(){
        return side.getLine().getLength()*side.getLine().getLength()*side.getLine().getLength();
    }
}
