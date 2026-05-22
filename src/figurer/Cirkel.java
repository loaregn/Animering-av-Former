package figurer;
import java.awt.Color;
import java.awt.Graphics;
public class Cirkel extends Figurer {
    
    private int radie;
    private boolean färg;

    public Cirkel(int yPoint, int xPoint, int r, boolean f) {
        super(yPoint, xPoint);
        this.radie = r;
        this.färg = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(xPosition, yPosition, radie, radie);
    }

    @Override
    public double getArea() {
        return (radie * radie) * Math.PI;
    }
    
    @Override
    public String whatFigur() {
        return "Cirkel";
    }
}
