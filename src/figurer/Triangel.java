package figurer;
import java.awt.Color;
import java.awt.Graphics;
public class Triangel extends Figurer {

    private int bas;
    private int höjd;
    private boolean färg;

    public Triangel(int yPoint, int xPoint, int b, int h, boolean f) {
        super(yPoint, xPoint);
        this.bas = b;
        this.höjd = h;
        this.färg = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {xPosition, xPosition + bas / 2, xPosition + bas};
        int[] yPoints = {yPosition, yPosition - höjd, yPosition};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public String whatFigur() {
        return "Triangel";
    }

    @Override
    public double getArea() {
        return (bas * höjd) / 2;
    }
}
