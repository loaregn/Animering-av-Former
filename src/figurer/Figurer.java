package figurer;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.io.Serializable;
public abstract class Figurer implements Serializable{

    protected int yPosition;
    protected int xPosition;
    protected Color color;

    public Figurer(int yPoint, int xPoint) {
        this.yPosition = yPoint;
        this.xPosition = xPoint;
    }
    
    public Point getPos() {
        return new Point(xPosition, yPosition);
    }

    public int getXpos() {
        return this.xPosition;
    }

    public int getYpos() {
        return this.yPosition;
    }

    public void move(int x, int y) {

    }

    public abstract void draw(Graphics g);
    public abstract double getArea();
    public abstract String whatFigur();

}
