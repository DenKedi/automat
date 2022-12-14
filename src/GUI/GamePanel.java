package src.GUI;

import src.UIHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable{

    public JFrame parent;
    public final int FPS = 60;
    public final int screenWidth = 1920;
    public final int screenHeight = 1080;
    public Color bgColor = new Color(220, 220, 220);
    UIHandler uihandler = new UIHandler(this);
    Thread gameThread;

    public User user;

    public GamePanel(JFrame window){
        this.parent = window;
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(bgColor);
        this.setDoubleBuffered(true);
        KeyListener keyHandler;
        //this.addKeyListener();
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        while (gameThread!=null){

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;





            if (delta >= 1){
                //update();
                repaint();
                delta--;
                drawCount++;
            }

            if (timer >= 1000000000) {
                System.out.println(drawCount + " FPS");
                drawCount = 0;
                timer = 0;
            }


        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        uihandler.drawBg(g2);
    }
}
