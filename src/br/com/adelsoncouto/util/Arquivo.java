 package br.com.adelsoncouto.util;
 
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.util.ArrayList;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class Arquivo
 {
   public static ArrayList carregaConfigList(String arquivo)
   {
     ArrayList list = new ArrayList();
     
 
 
 
     File f = new File(arquivo);
     try {
       InputStream is = new FileInputStream(f);
       InputStreamReader isr = new InputStreamReader(is, "UTF8");
       BufferedReader br = new BufferedReader(isr);
       int i = 0;
       String texto = br.readLine();
       while (texto != null) {
         if (!texto.substring(0, 1).equals("#")) {
           String[] campos = texto.split("=");
           Configuracao conf = new Configuracao();
           conf.setCampo(campos[0]);
           conf.setValor(campos[1]);
           list.add(conf);
         }
         texto = br.readLine();
       }
       is.close();
       isr.close();
       br.close();
     }
     catch (Exception e) {}
     
 
     return list;
   }
   
   public static ArrayList carregaStringList(String arquivo)
   {
     ArrayList list = new ArrayList();
     
 
 
 
     File f = new File(arquivo);
     try {
       InputStream is = new FileInputStream(f);
       InputStreamReader isr = new InputStreamReader(is, "UTF8");
       BufferedReader br = new BufferedReader(isr);
       int i = 0;
       String texto = br.readLine();
       while (texto != null) {
         if (!texto.substring(0, 1).equals("#")) {
           list.add(texto);
         }
         texto = br.readLine();
       }
       is.close();
       isr.close();
       br.close();
     }
     catch (Exception e) {}
     
 
     return list;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Arquivo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */