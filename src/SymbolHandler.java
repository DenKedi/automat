package src;

import src.GUI.GamePanel;
import src.spiele.spiel1;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class SymbolHandler {

    String dir = "src/res/symbols/";
    File file = new File("src/res/symbols");
    GamePanel gp;
    ArrayList<Symbol> symbolList = new ArrayList<>();

    public SymbolHandler(GamePanel gp){
        this.gp = gp;


        int x = 0;
        for (File f : file.listFiles()){
            try {
                setSymbol(f.getName(), f, x);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public void setSymbol(String name, File file, double range) throws IOException {

        Symbol e = new Symbol(ImageIO.read(file), range, name);
        this.symbolList.add(e);
    }

}
