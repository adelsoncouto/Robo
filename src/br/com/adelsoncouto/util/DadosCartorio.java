 package br.com.adelsoncouto.util;
 
 import java.util.List;
 
 
 
 
 
 
 
 
 public class DadosCartorio
 {
   public static String nome(String stringNula)
   {
     String nome = "";
     List<Configuracao> conf = Arquivo.carregaConfigList("lib/dadosCartorio.ini");
     for (Configuracao configuracao : conf) {
       if (configuracao.getCampo().toUpperCase().equals("NOME")) {
         nome = configuracao.getValor();
       }
     }
     return nome;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/DadosCartorio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */