import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel implements ActionListener{

    static Timer timer;
    static List<Sprite> sprites = new ArrayList<>();
    static int x;
    static int y;
    static boolean hit = false;

    public static void setup(){

        DrawMap.draw();

        for(int i = 0; i < DrawMap.col; i++){
            for(int j = 0; j < DrawMap.rows; j++){
                if(DrawMap.arr[j][i] == 0){
                    x = j;
                    y = i;
                    if(i%50==0 && j%50==0) {
                        if(x>105&&x<DrawMap.rows-105){
                            sprites.add(new Pac(Color.PINK, x, y, 10));
                        }
                    }
                }
            }
        }
        sprites.add(new Pac(Color.PINK, 95, 10, 18));
        sprites.add(new Pac(Color.PINK, 95, 100, 18));
        sprites.add(new Pac(Color.PINK, 95, 200, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, 10, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, 100, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, 200, 18));
        sprites.add(new Pac(Color.PINK, 95, DrawMap.col-50, 18));
        sprites.add(new Pac(Color.PINK, 95, DrawMap.col-140, 18));
        sprites.add(new Pac(Color.PINK, 95, DrawMap.col-240, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, DrawMap.col-50, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, DrawMap.col-100, 18));
        sprites.add(new Pac(Color.PINK, DrawMap.rows-95, DrawMap.col-200, 18));

        sprites.add(new Man(Color.BLACK, DrawMap.rows/2,DrawMap.col/2-120, 30, 30));

        sprites.add(new Ghost(Color.BLACK, DrawMap.rows/2, DrawMap.col/2, 30, 30));
        sprites.add(new Ghost1(Color.BLACK, DrawMap.rows/2-40, DrawMap.col/2, 40, 40));
        sprites.add(new Ghost2(Color.BLACK, DrawMap.rows/2+40, DrawMap.col/2, 30, 30));
        sprites.add(new Ghost3(Color.BLACK, DrawMap.rows/2, DrawMap.col/2-40, 40, 40));

    }

    public Board(){

        setPreferredSize(new Dimension(700, 900));
        setBackground(Color.BLACK);
        timer = new Timer(1000/60, this);
        timer.start();

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        setBackground(Color.BLACK);

        for(int i = 0; i < DrawMap.col; i++){
            for(int j = 0; j < DrawMap.rows; j++){
                if(DrawMap.arr[j][i] == 1){
                    sprites.add(new Walls(Color.BLUE, j, i, 1, 1));
                }
                else if(DrawMap.arr[j][i] == 0){
                    g.setColor(Color.BLACK);
                    g.fillRect(j, i, 1, 1);
                }
            }
        }

        for(int i = 0; i < sprites.size(); i++){
            sprites.get(i).paint(g);
            sprites.get(i).move(getHeight(),getWidth());
        }

    }

    public void checkCollisions(){

        for (int i = 0; i < sprites.size(); i++) {
            for (int j = 0; j < sprites.size(); j++) {
                if (i != j) {
                    if (sprites.get(i).getBounds().intersects(sprites.get(j).getBounds())) {
                        if(sprites.get(i) instanceof Man && sprites.get(j) instanceof Pac){
                            sprites.remove(j);
                            break;
                        }
                        break;
                    }
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < sprites.size(); i++){

            sprites.get(i).move(getHeight(),getWidth());

        }
        //checkCollisions();
        repaint();

    }
}
