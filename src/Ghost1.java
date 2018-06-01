import java.awt.*;
import java.awt.image.BufferedImage;

public class Ghost1 extends Sprite{

    public Ghost1(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){
        BufferedImage img1=ImageDraw.GetPic("ProjectImages/blinky.jpg");
        g.drawImage(img1.getScaledInstance(width,height, Image.SCALE_SMOOTH),x,y,null);
    }

    public void move(int boardHeight, int boardWidth){
        if(System.currentTimeMillis() == 7000){
            if(Game.isLeftPressed()){
                if(x > 0 || x < boardWidth){
                        x -= 10;
                }
            }
            else if(Game.isRightPressed()){
                if(x > (boardWidth/3.0) || x < boardWidth-(boardWidth/3.0)){
                        x += 10;
                }

            }
            else if(Game.isUpPressed()){
                    y -= 10;

            }
            else if(Game.isDownPressed()){
                    y += 10;

            }
        }

    }

}
