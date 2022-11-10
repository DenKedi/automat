package src;

import src.GUI.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class UIHandler {
    GamePanel gp;
    BufferedImage bgImage;
    Color rectOutl = new Color(0x2E323232, true);
    Color slotBarrier = new Color(0x2E323232, true);
    public UIHandler(GamePanel gp){
        this.gp = gp;
        try {
            bgImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("res/casino.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void drawBg(Graphics2D g2){

        g2.drawRect(0, gp.screenHeight-420, gp.screenWidth, 420);
        g2.setColor(rectOutl);
        g2.fillRect(0, gp.screenHeight-420, gp.screenWidth, 420);

        g2.fillRect(500, 120, 2, 450);
        g2.fillRect(gp.screenWidth-1000, 120, 1, 450);


    }
    public void drawSymbols(Graphics2D g2){

    }
}
