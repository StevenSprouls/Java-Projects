import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int height, int width){
        this.setLocation(x,y);
        this.setSize(width, height);
    }
    public int getPerimeter(){
        return(2*width + 2*height);
    }
    public int getArea(){
        return (width*height);
    }

}