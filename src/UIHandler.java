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
    public UIHandler(GamePanel gp){
        this.gp = gp;
        try {
            bgImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("res/casino.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void drawBg(Graphics2D g2){
        g2.drawImage(bgImage, 0, 0, null);
        g2.drawRect(0, 0, gp.screenWidth, 40);
        g2.setColor(rectOutl);
        g2.fillRect(0, 0, gp.screenWidth, 40);

    }
}
