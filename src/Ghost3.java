import java.awt.*;
import java.awt.image.BufferedImage;

public class Ghost3 extends Sprite{

    public Ghost3(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        BufferedImage img3=ImageDraw.GetPic("ProjectImages/clyde.jpg");
        g.drawImage(img3.getScaledInstance(width,height, Image.SCALE_SMOOTH),x,y,null);
    }

    public void move(int boardHeight, int boardWidth){
        if(System.currentTimeMillis() == 15000){
            if(Game.isLeftPressed()){
                if(x > 0 || x < boardWidth){
                        x -= 9;
                }
            }
            else if(Game.isRightPressed()){
                if(x > (boardWidth/3.0) || x < boardWidth-(boardWidth/3.0)){
                        x += 9;
                }

            }
            else if(Game.isUpPressed()){
                    y -= 9;

            }
            else if(Game.isDownPressed()){
                    y += 9;

            }

        }

    }

}
