package figurer;
import java.awt.Color;
import java.awt.Graphics;
public class Rektangel extends Figurer {

    private int bas;
    private int höjd;
    private boolean färg;

    public Rektangel(int yPoint, int xPoint, int b, int h, boolean f) {
        super(yPoint, xPoint);
        this.bas = b;
        this.höjd = h;
        this.färg = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPosition, yPosition, bas, höjd);
    }

    @Override
    public String whatFigur() {
        return "Rektangel";
    }

    @Override
    public double getArea() {
        return bas * höjd;
    }
}
