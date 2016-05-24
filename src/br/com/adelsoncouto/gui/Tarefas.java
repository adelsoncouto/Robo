 package br.com.adelsoncouto.gui;
 
 import java.awt.AWTException;
 import java.awt.Color;
 import java.awt.Dimension;
 import java.awt.Rectangle;
 import java.awt.Robot;
 import java.awt.Toolkit;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.imageio.ImageIO;
 
 
 
 
 
 
 
 
 
 
 public class Tarefas
 {
   public static void teclaCodigo(Robot rob, String texto)
   {
     String total = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~€‚ƒ„…†‡ˆ‰Š‹ŒŽ‘’“”•–—˜™š›œžŸ ¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ";
     char[] lTotal = total.toCharArray();
     char[] t = texto.toCharArray();
     for (int x = 0; x < t.length; x++) {
       for (int i = 0; i < lTotal.length; i++) {
         if (t[x] == lTotal[i]) {
           pressUnicode(i + 32, rob);
           break;
         }
       }
     }
   }
   
 
   public static void filma(Robot rob, int tempo, int intervalo)
   {
     for (int x = 0; x < tempo; x++) {
       try {
         rob.delay(intervalo);
         Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
         BufferedImage img = rob.createScreenCapture(new Rectangle(tela));
         String arq = "img" + x + ".jpg";
         File file = new File(arq);
         ImageIO.write(img, "jpg", file);
         x += intervalo;
       } catch (IOException ex) {
         Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
   }
   
   public static void espera(Robot rob, int tempo)
   {
     rob.delay(tempo);
   }
   
   public static void move(int x, int y, Robot rob)
   {
     rob.mouseMove(x, y);
   }
   
   public static void clica(Robot rob) {
     rob.mousePress(16);
     rob.mouseRelease(16);
   }
   
   public static void teclas(String texto, Robot rob) {
     texto = texto.toUpperCase();
     texto = texto.replaceAll("Á", "A");
     texto = texto.replaceAll("É", "E");
     texto = texto.replaceAll("Í", "I");
     texto = texto.replaceAll("Ó", "O");
     texto = texto.replaceAll("Ú", "U");
     
     texto = texto.replaceAll("À", "A");
     texto = texto.replaceAll("È", "E");
     texto = texto.replaceAll("Ì", "I");
     texto = texto.replaceAll("Ò", "O");
     texto = texto.replaceAll("Ù", "U");
     
     texto = texto.replaceAll("Ã", "A");
     texto = texto.replaceAll("Õ", "O");
     
     texto = texto.replaceAll("Ä", "A");
     texto = texto.replaceAll("Ë", "E");
     texto = texto.replaceAll("Ï", "I");
     texto = texto.replaceAll("Ö", "O");
     texto = texto.replaceAll("Ü", "U");
     
 
     texto = texto.replaceAll("Â", "A");
     texto = texto.replaceAll("Ê", "E");
     texto = texto.replaceAll("Î", "I");
     texto = texto.replaceAll("Ô", "O");
     texto = texto.replaceAll("Û", "U");
     
 
     texto = texto.replaceAll("Ç", "C");
     
 
     char[] t = texto.toCharArray();
     
     for (int x = 0; x < t.length; x++) {
       teclaFuncao(String.valueOf(t[x]), true, true, rob);
     }
   }
   
   public static void teclaFuncao(String tecla, boolean aperta, boolean solta, Robot rob) {
     int t = -1;
     if (tecla.toUpperCase().equals("ENTER")) t = 10;
     if (tecla.toUpperCase().equals("SUBLINHA")) t = 523;
     if (tecla.toUpperCase().equals("SETAABAIXO")) t = 40;
     if (tecla.toUpperCase().equals("SETAACIMA")) t = 38;
     if (tecla.toUpperCase().equals("SETADIREITA")) t = 39;
     if (tecla.toUpperCase().equals("SETAESQUERDA")) t = 37;
     if (tecla.toUpperCase().equals("END")) t = 35;
     if (tecla.toUpperCase().equals("HOME")) t = 36;
     if (tecla.toUpperCase().equals("FIXA")) t = 20;
     if (tecla.toUpperCase().equals("PGUP")) t = 33;
     if (tecla.toUpperCase().equals("PGDN")) t = 34;
     if (tecla.toUpperCase().equals("DEL")) t = 127;
     if (tecla.toUpperCase().equals("APAGA")) t = 8;
     if (tecla.toUpperCase().equals("SHIFT")) t = 16;
     if (tecla.toUpperCase().equals("TAB")) t = 9;
     if (tecla.toUpperCase().equals("ALT")) t = 18;
     if (tecla.toUpperCase().equals("WIN")) t = 524;
     if (tecla.toUpperCase().equals("A")) t = 65;
     if (tecla.toUpperCase().equals("B")) t = 66;
     if (tecla.toUpperCase().equals("C")) t = 67;
     if (tecla.toUpperCase().equals("D")) t = 68;
     if (tecla.toUpperCase().equals("E")) t = 69;
     if (tecla.toUpperCase().equals("F")) t = 70;
     if (tecla.toUpperCase().equals("G")) t = 71;
     if (tecla.toUpperCase().equals("H")) t = 72;
     if (tecla.toUpperCase().equals("I")) t = 73;
     if (tecla.toUpperCase().equals("J")) t = 74;
     if (tecla.toUpperCase().equals("K")) t = 75;
     if (tecla.toUpperCase().equals("L")) t = 76;
     if (tecla.toUpperCase().equals("M")) t = 77;
     if (tecla.toUpperCase().equals("N")) t = 78;
     if (tecla.toUpperCase().equals("O")) t = 79;
     if (tecla.toUpperCase().equals("P")) t = 80;
     if (tecla.toUpperCase().equals("Q")) t = 81;
     if (tecla.toUpperCase().equals("R")) t = 82;
     if (tecla.toUpperCase().equals("S")) t = 83;
     if (tecla.toUpperCase().equals("T")) t = 84;
     if (tecla.toUpperCase().equals("U")) t = 85;
     if (tecla.toUpperCase().equals("V")) t = 86;
     if (tecla.toUpperCase().equals("X")) t = 88;
     if (tecla.toUpperCase().equals("W")) t = 87;
     if (tecla.toUpperCase().equals("Y")) t = 89;
     if (tecla.toUpperCase().equals("Z")) t = 90;
     if (tecla.toUpperCase().equals("F1")) t = 112;
     if (tecla.toUpperCase().equals("F2")) t = 113;
     if (tecla.toUpperCase().equals("F3")) t = 114;
     if (tecla.toUpperCase().equals("F4")) t = 115;
     if (tecla.toUpperCase().equals("F5")) t = 116;
     if (tecla.toUpperCase().equals("F6")) t = 117;
     if (tecla.toUpperCase().equals("F7")) t = 118;
     if (tecla.toUpperCase().equals("F8")) t = 119;
     if (tecla.toUpperCase().equals("F9")) t = 120;
     if (tecla.toUpperCase().equals("F10")) t = 121;
     if (tecla.toUpperCase().equals("F11")) t = 122;
     if (tecla.toUpperCase().equals("F12")) t = 123;
     if (tecla.toUpperCase().equals("ESC")) t = 27;
     if (tecla.toUpperCase().equals("0")) t = 48;
     if (tecla.toUpperCase().equals("1")) t = 49;
     if (tecla.toUpperCase().equals("2")) t = 50;
     if (tecla.toUpperCase().equals("3")) t = 51;
     if (tecla.toUpperCase().equals("4")) t = 52;
     if (tecla.toUpperCase().equals("5")) t = 53;
     if (tecla.toUpperCase().equals("6")) t = 54;
     if (tecla.toUpperCase().equals("7")) t = 55;
     if (tecla.toUpperCase().equals("8")) t = 56;
     if (tecla.toUpperCase().equals("9")) t = 57;
     if (tecla.toUpperCase().equals("CTRL")) t = 17;
     if (tecla.toUpperCase().equals(" ")) t = 32;
     if (tecla.toUpperCase().equals(",")) t = 44;
     if (tecla.toUpperCase().equals(".")) t = 46;
     if (tecla.toUpperCase().equals("+")) {
       rob.keyPress(16);
       rob.keyPress(61);
       rob.keyRelease(61);
       rob.keyRelease(16);
     }
     if (tecla.toUpperCase().equals("|")) {
       rob.keyPress(16);
       rob.keyPress(92);
       rob.keyRelease(92);
       rob.keyRelease(16);
     }
     if (tecla.toUpperCase().equals(")")) {
       rob.keyPress(16);
       rob.keyPress(48);
       rob.keyRelease(48);
       rob.keyRelease(16);
     }
     if (tecla.toUpperCase().equals("(")) {
       rob.keyPress(16);
       rob.keyPress(57);
       rob.keyRelease(57);
       rob.keyRelease(16);
     }
     if (tecla.toUpperCase().equals(":")) {
       rob.keyPress(16);
       rob.keyPress(59);
       rob.keyRelease(59);
       rob.keyRelease(16);
     }
     
 
 
 
 
 
 
 
 
 
     if (t > -1) {
       if (aperta) {
         rob.keyPress(t);
       }
       if (solta) {
         rob.keyRelease(t);
       }
     }
   }
   
   public static boolean observa(int x, int y, int t, Robot rob)
   {
     boolean continua = true;
     int conta = 0;
     boolean o = false;
     
     int r = rob.getPixelColor(x, y).getRed();
     int g = rob.getPixelColor(x, y).getGreen();
     int b = rob.getPixelColor(x, y).getBlue();
     while (continua) {
       rob.delay(50);
       
       int r1 = rob.getPixelColor(x, y).getRed();
       int g1 = rob.getPixelColor(x, y).getGreen();
       int b1 = rob.getPixelColor(x, y).getBlue();
       conta += 50;
       if ((r != r1) && (g != g1) && (b != b1)) {
         continua = false;
         o = true;
       }
       if (conta > t) {
         continua = false;
         o = false;
       }
     }
     return o;
   }
   
 
 
 
 
 
 
 
 
 
 
 
   public static boolean ver(Robot rob, int x, int y, int r, int g, int b, int t)
   {
     boolean continua = true;
     
     boolean v = false;
     
     int conta = 0;
     
     while (continua) {
       rob.delay(100);
       
       int r1 = rob.getPixelColor(x, y).getRed();
       int g1 = rob.getPixelColor(x, y).getGreen();
       int b1 = rob.getPixelColor(x, y).getBlue();
       conta += 100;
       if ((r == r1) && (g == g1) && (b == b1)) {
         continua = false;
         v = true;
       }
       if (conta >= t) {
         continua = false;
         v = false;
       }
     }
     return v;
   }
   
   public static void pressUnicode(int key_code, Robot rob) {
     rob.keyPress(18);
     for (int i = 3; i >= 0; i--) {
       int numpad_kc = key_code / (int)Math.pow(10.0D, i) % 10 + 96;
       rob.keyPress(numpad_kc);
       rob.keyRelease(numpad_kc);
     }
     rob.keyRelease(18);
   }
   
   public static void main(String[] args)
   {
     try
     {
       filma(new Robot(), 10000, 1000);
     } catch (AWTException ex) {
       Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/gui/Tarefas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */