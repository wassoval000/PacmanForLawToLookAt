import java.awt.*;
import java.awt.image.BufferedImage;

public class Ghost2 extends Sprite{

    public Ghost2(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        BufferedImage img2=ImageDraw.GetPic("ProjectImages/inky.png");
        g.drawImage(img2.getScaledInstance(width,height, Image.SCALE_SMOOTH),x,y,null);

    }

    public void move(int boardHeight, int boardWidth){
        if(System.currentTimeMillis() == 10000){
            if(Game.isLeftPressed()){
                if(x > 0 || x < boardWidth){
                        x -= 8;
                }
            }
            else if(Game.isRightPressed()){
                        x += 8;

            }
            else if(Game.isUpPressed()){
                    y -= 8;

            }
            else if(Game.isDownPressed()){
                    y += 8;

            }

        }

    }

}
