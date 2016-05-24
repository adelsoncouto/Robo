 package br.com.adelsoncouto.util;
 import javax.swing.JMenu;
 import javax.swing.JMenuBar;

import br.com.adelsoncouto.gui.Principal;
 
 
 
 
 public class AtivarMenu
 {
   public static void AtivarMenu(boolean ativar)
   {
     if (ativar) {
       for (int i = 0; i < Principal.jMenuBar1.getMenuCount(); i++) {
         Principal.jMenuBar1.getMenu(i).setEnabled(true);
       }
     } else {
       for (int i = 0; i < Principal.jMenuBar1.getMenuCount(); i++) {
         Principal.jMenuBar1.getMenu(i).setEnabled(false);
       }
     }
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/AtivarMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */