import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.io.File;

public class ImageDraw {

    public void paint(Graphics g){

    }

    public static BufferedImage GetPic(String file){
        try{
            return ImageIO.read(new File(file));
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
