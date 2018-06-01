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

        int manLoc = DrawMap.arr[x][y];

        if(Game.isLeftPressed()){
            DrawMap.arr[x][y] = manLoc;
            if(x > 0 || x < boardWidth){
                x-=8;
            }
        }
        else if(Game.isRightPressed()){
            DrawMap.arr[x][y] = manLoc;
            if(x > (boardWidth/3.0) || x < boardWidth-(boardWidth/3.0)){
                x += 8;
            }

        }
        else if(Game.isUpPressed()){
            DrawMap.arr[x][y] = manLoc;
            y-=8;

        }
        else if(Game.isDownPressed()){
            DrawMap.arr[x][y] = manLoc;
            y+=8;

        }

    }
}
