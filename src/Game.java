import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {

    Board board;
    static boolean leftPressed, rightPressed, upPressed, downPressed;

    public Game() {

        setVisible(true);
        setResizable(false);
        setTitle("PACMAN");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board();
        add(board);
        pack();
        setLocationRelativeTo(null);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    leftPressed = true;
                }
                else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    rightPressed = true;
                }
                else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    downPressed = true;
                }
                else if(e.getKeyCode()==KeyEvent.VK_UP){
                    upPressed = true;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    leftPressed = false;
                }
                else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    rightPressed = false;
                }
                else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    downPressed = false;
                }
                else if(e.getKeyCode()==KeyEvent.VK_UP){
                    upPressed = false;
                }
            }
        });



    }


    public static void main(String[] args) {
        Game game = new Game();
        game.board.setup();

    }

    public static boolean isLeftPressed(){
        return leftPressed;
    }

    public static boolean isRightPressed(){
        return rightPressed;
    }

    public static boolean isUpPressed(){
        return upPressed;
    }

    public static boolean isDownPressed(){
        return downPressed;
    }
}
