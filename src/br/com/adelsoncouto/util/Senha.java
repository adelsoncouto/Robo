 package br.com.adelsoncouto.util;
 
 
 
 
 
 
 
 
 
 public class Senha
 {
   public static String getSenhaDecodificar(String senha)
   {
     String[] decodifica = senha.split("621346890");
     
     byte[] c = new byte[decodifica.length];
     
     for (int i = 0; i < decodifica.length; i++) {
       c[i] = ((byte)(Integer.parseInt(decodifica[i]) / 11));
     }
     
     String senhaDecodificada = new String(c);
     
     return senhaDecodificada;
   }
   
   public static String getSenhaCodificar(String senha) {
     byte[] c = senha.getBytes();
     String senCodificada = "";
     for (int i = 0; i < c.length; i++) {
       senCodificada = senCodificada + c[i] * 11 + "621346890";
     }
     
     return senCodificada;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Senha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */