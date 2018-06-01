import java.awt.*;

public class Walls extends Sprite {

    public Walls(Color color, int x, int y, int width, int height) {

        super(color, x, y, width, height);

    }

    public void Move(int boardHeight, int boardWidth){

    }

    public void paint (Graphics g){

        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);

    }

}
