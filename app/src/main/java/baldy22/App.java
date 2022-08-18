package baldy22;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        BufferedImage img = null;
        File baldy = null;

        try{
            baldy = new File("src/main/resources/baldy-8bit.bmp");
            img = ImageIO.read(baldy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int width = img.getWidth();
        int height = img.getHeight();
        for(int y = 0; y < height; y++){
            for(int x = 0; x <width; x++){
                int p = img.getRGB(x,y);
                int a = (p>>24)&0xff;
                int g = (p>>8)&0xff;

                p = (a<<24) | (0<<16) | (g<<8) | 0;

                img.setRGB(x, y, p);
            }
        }try{
            File output = new File("src/main/resources/output.bmp");
            ImageIO.write(img, "BMP", output);
        }catch(IOException e){
            System.out.println(e);
        }
//    public void save() throws IOException {
//        ImageIO.write(img, "bmp", new File("app/src/main/resources/output.bmp"));
//    }
    }}