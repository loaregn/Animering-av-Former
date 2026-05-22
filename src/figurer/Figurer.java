package figurer;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.io.Serializable;
public abstract class Figurer implements Serializable{

    /**
     * Denna class gör det möjligt att rita ut formerna men även för animering
     * Har variabler för xPosition o yPosition som är koordinater, men även för hastigeten
     * Men det finns också en method som flipDirection, vilket gör så att formerna går från sida till sida
     * getXpos och getYpos gör det också möjligt för former att utnyttja dem
     */
    
    protected int yPosition;
    protected int xPosition;
    protected Color color;
    protected int xSpeed = 5; //hastigheten 

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
    
    
    public void move(int x, int y) { //detta är kopplad till f.move(0, 0) där det istället är x och y (int)
        this.xPosition = this.xPosition + xSpeed;
    }
    
    public void flipDirection() { //påverkar xSpeed, där -this.xSpeed påverkar sidan den glider åt, höger eller vänster. Om den åker höger, kommer det senare ändras till andra hållet (vänster)
        this.xSpeed = -this.xSpeed; //direkt ändrar riktning
    }
    

    public abstract void draw(Graphics g);
    public abstract double getArea();
    public abstract String whatFigur();

    

}
