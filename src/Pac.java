import java.awt.*;

public class Pac extends Sprite{

    public Pac(Color color, int x, int y, int diameter) {

        super(color, x, y, diameter, diameter);

    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, width, height);

    }

    public void Move(int boardHeight, int boardWidth){



    }

}
