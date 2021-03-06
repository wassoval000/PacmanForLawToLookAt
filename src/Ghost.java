import java.awt.*;
import java.awt.image.BufferedImage;

public class Ghost extends Sprite{

    public Ghost(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        BufferedImage img=ImageDraw.GetPic("ProjectImages/Pinky.png");
        g.drawImage(img.getScaledInstance(width,height, Image.SCALE_SMOOTH),x,y,null);

    }

    public void move(int boardHeight, int boardWidth){

        if(System.currentTimeMillis() == 3000){
            if(Game.isLeftPressed()){
                if(x > 0 || x < boardWidth){
                        x -= 11;
                }
            }
            else if(Game.isRightPressed()){
                if(x > (boardWidth/3.0) || x < boardWidth-(boardWidth/3.0)){
                        x += 11;
                }

            }
            else if(Game.isUpPressed()){
                    y -= 11;

            }
            else if(Game.isDownPressed()){
                    y += 11;

            }
        }

    }

}
