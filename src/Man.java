import java.awt.*;
import java.awt.image.BufferedImage;

public class Man extends Sprite{
    public Man(Color color, int x, int y, int width, int height){
        super(color, x, y, width, height);
    }
    public void paint(Graphics g){
        BufferedImage img=ImageDraw.GetPic("ProjectImages/pac0.jpg");
        g.drawImage(img.getScaledInstance(width,height, Image.SCALE_SMOOTH),x,y,null);
    }

    public void move(int boardHeight, int boardWidth){

        if(Game.isLeftPressed()){
            if(DrawMap.arr[x][y] != 1){
                x -= 5;
            }
        }
        else if(Game.isRightPressed()){
            if(DrawMap.arr[x][y] != 1){
                x += 5;
            }

        }
        else if(Game.isUpPressed()){
            if(DrawMap.arr[x][y] != 1){
                y -= 5;
            }

        }
        else if(Game.isDownPressed()){
            if(DrawMap.arr[x][y] != 1){
                y += 5;
            }

        }

    }
}
