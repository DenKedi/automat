package src;

import src.GUI.GamePanel;
import src.GUI.Slot;

import javax.swing.*;

public class Main implements Runnable{

    public static void main(String[] args) {


        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Glücksspiel");

        GamePanel gamePanel = new GamePanel(window);
        window.add(gamePanel);
        window.pack();
        gamePanel.startGameThread();

        gamePanel.startGameThread();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

}

    @Override
    public void run() {

    }
}
