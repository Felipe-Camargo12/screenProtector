package classes;

import java.awt.*;

public class Ellipse extends Rectangle {

    public Ellipse (Color color, int posX, int posY, int width, int height) {
        super(color,posX,posY, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillOval(super.getPosX(), super.getPosY(), super.getWidth(), super.getHeight());
    }

}
