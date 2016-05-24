 package br.com.adelsoncouto.util;
 
 import java.awt.event.ActionListener;
 import java.util.Enumeration;
 import javax.swing.AbstractButton;
 import javax.swing.ButtonGroup;
 import javax.swing.JRadioButton;
 
 
 
 
 
 public class Radio
 {
   public static String Button(JRadioButton[] jRadioButtons)
   {
     String texto = "";
     for (int i = 0; i < jRadioButtons.length; i++) {
       if (jRadioButtons[i].isSelected()) {
         texto = jRadioButtons[i].getText();
       }
     }
     return texto;
   }
   
   public static String Grupo(ButtonGroup buttonGroup) {
     String texto = "";
     Enumeration<AbstractButton> botoes = buttonGroup.getElements();
     while (botoes.hasMoreElements()) {
       AbstractButton ab = (AbstractButton)botoes.nextElement();
       if (ab.isSelected()) {
         texto = ab.getText();
       }
     }
     return texto;
   }
   
 
   public static void Marcar(ButtonGroup buttonGroup, String escolha)
   {
     Enumeration<AbstractButton> botoes = buttonGroup.getElements();
     while (botoes.hasMoreElements()) {
       AbstractButton ab = (AbstractButton)botoes.nextElement();
       if (ab.getText().equals(escolha)) {
         ab.setSelected(true);
       } else {
         ab.setSelected(false);
       }
     }
   }
   
   public static void addAction(ButtonGroup buttonGroup, ActionListener actionListener) {
     Enumeration<AbstractButton> botoes = buttonGroup.getElements();
     while (botoes.hasMoreElements()) {
       AbstractButton ab = (AbstractButton)botoes.nextElement();
       ab.addActionListener(actionListener);
     }
   }
   
   public static void setEnable(ButtonGroup buttonGroup, boolean ativar) {
     Enumeration<AbstractButton> botoes = buttonGroup.getElements();
     buttonGroup.clearSelection();
     while (botoes.hasMoreElements()) {
       AbstractButton ab = (AbstractButton)botoes.nextElement();
       ab.setEnabled(ativar);
     }
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Radio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */