 package br.com.adelsoncouto.util;
 import java.awt.AWTException;
 import java.awt.Color;
 import java.awt.MouseInfo;
 import java.awt.Point;
 import java.awt.PointerInfo;
 import java.awt.Robot;

import br.com.adelsoncouto.gui.Principal;
 
 
 
 public class Relogio
   implements Runnable
 {
   private Robot rob;
   private boolean repete = true;
   private int yy = 0; private int xx = 0;
   
   public void inicia() {
     try { this.rob = new Robot();
     } catch (AWTException e) { Principal.setMensagem("Erro posição do mouse: " + e);
     }
     new Thread(this).start();
   }
   
   public void paint()
   {
     int x = (int)MouseInfo.getPointerInfo().getLocation().getX();
     int y = (int)MouseInfo.getPointerInfo().getLocation().getY();
     int r1 = this.rob.getPixelColor(x, y).getRed();
     int g1 = this.rob.getPixelColor(x, y).getGreen();
     int b1 = this.rob.getPixelColor(x, y).getBlue();
     int r2 = this.rob.getPixelColor(x + 1, y).getRed();
     int g2 = this.rob.getPixelColor(x + 1, y).getGreen();
     int b2 = this.rob.getPixelColor(x + 1, y).getBlue();
     int r3 = this.rob.getPixelColor(x + 1, y + 1).getRed();
     int g3 = this.rob.getPixelColor(x + 1, y + 1).getGreen();
     int b3 = this.rob.getPixelColor(x + 1, y + 1).getBlue();
     int r4 = this.rob.getPixelColor(x, y + 1).getRed();
     int g4 = this.rob.getPixelColor(x, y + 1).getGreen();
     int b4 = this.rob.getPixelColor(x, y + 1).getBlue();
     
     if ((this.xx != x) || (this.yy != y)) {
       Principal.setMensagem("\nX:" + x + " - Y:" + y + "\nPixel 1 = R:" + r1 + " - G:" + g1 + " - B:" + b1 + "\nPixel 2 = R:" + r2 + " - G:" + g2 + " - B:" + b2 + "\nPixel 3 = R:" + r3 + " - G:" + g3 + " - B:" + b3 + "\nPixel 4 = R:" + r4 + " - G:" + g4 + " - B:" + b4);
     }
   }
   
 
 
 
 
 
 
   public void run()
   {
     while (isRepete()) {
       try {
         Thread.sleep(10L);
         paint();
       }
       catch (InterruptedException ie) {}
     }
   }
   
   public boolean isRepete() {
     return this.repete;
   }
   
   public void setRepete(boolean repete) {
     this.repete = repete;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Relogio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */