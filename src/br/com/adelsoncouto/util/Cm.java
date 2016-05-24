 package br.com.adelsoncouto.util;
 
 import java.text.DecimalFormat;
 
 
 
 
 
 
 
 public class Cm
 {
   public static int getPixel(Double cm)
   {
     double x = cm.doubleValue();
     DecimalFormat dc = new DecimalFormat("0");
     int pixel = Integer.parseInt(dc.format(x));
     return pixel;
   }
 }





