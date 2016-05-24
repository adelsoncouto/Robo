 package br.com.adelsoncouto.util;
 
 import java.text.DecimalFormat;
 
 
 
 
 
 
 
 
 
 public class Decimal
 {
   private static DecimalFormat dc = new DecimalFormat("0.00");
   
   public static String doubleStringVirgula(Double numero) {
     String v = dc.format(numero).replace(".", ",");
     return v;
   }
   
   public static Double stringDouble(String numero) {
     double v = Double.parseDouble(numero.replace(",", "."));
     return Double.valueOf(v);
   }
   
   public static String doubleToStringPonto(double numero) {
     String v = dc.format(numero).replace(",", ".");
     return v;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Decimal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */