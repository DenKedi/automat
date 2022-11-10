package src;

import java.awt.image.BufferedImage;

public class Symbol {

    public BufferedImage image;
    public double range;
    public String name;
    public Symbol(BufferedImage image, double range, String name){
        this.range = range;
        this.image = image;
        this.name = name;
    }
}
