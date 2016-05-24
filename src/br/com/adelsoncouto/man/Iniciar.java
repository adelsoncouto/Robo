 package br.com.adelsoncouto.man;
import br.com.adelsoncouto.gui.Principal;
 
 
 
 
 
 
 
 
 
 public class Iniciar
 {
   private static int aparencia = 1;
   
   public static Principal p;
   
 
   public static void main(String[] args)
   {
     p = new Principal();
     p.setAlwaysOnTop(true);
     p.setDefaultCloseOperation(3);
     p.setVisible(true);
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/com/br/robo/Iniciar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */