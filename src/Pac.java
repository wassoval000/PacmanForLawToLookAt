import java.awt.*;

public class Pac extends Sprite {

    public Pac(Color color, int x, int y, int diameter) {

        super(color, x, y, diameter, diameter);

    }

    public void Move(int boardHeight, int boardWidth){

    }

    public void paint (Graphics g){

        g.setColor(Color.PINK);
        g.drawOval(x, y, width, height);
        g.fillOval(x, y, width, height);

    }

}
