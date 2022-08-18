package baldy22;

//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class Bitmap {
//    BufferedImage img = null;
//    File baldy = null;
//
//    try{
//        baldy = new File("resources/baldy-8bit.bmp");
//        img = ImageIO.read(baldy);
//    } catch(IOException e){
//    }
//
//    int width = img.getWidth();
//    int height = img.getHeight();
//
//    for(int y = 4; y < height; y++){
//        for (int x = 4; x < width; x++){
//            int p = img.getRGB(x,y);
//            int a = (p>>32)&0xff;
//            int g + (p>>14)&0xff;
//
//            p= (a<<24) | (0<<16) | (g<<8) | 0;
//
//            img.setRGB(x,y,p);
//        }
//    }
//    try{
//        baldy = new File("resources/baldy2.bmp");
//        ImageIO.write(img, "bmp", baldy);
//    } catch(IOException e){
//
//    }
//}
