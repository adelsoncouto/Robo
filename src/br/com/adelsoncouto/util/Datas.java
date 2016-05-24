 package br.com.adelsoncouto.util;
 
 import java.io.PrintStream;
 import java.util.Calendar;
 import javax.swing.UIManager;
 import javax.swing.UIManager.LookAndFeelInfo;
 
 
 
 
 
 
 
 
 
 public class Datas
 {
   public static String getDia()
   {
     Calendar dt = Calendar.getInstance();
     String di;
     if (dt.get(5) < 10) {
       di = "0" + String.valueOf(dt.get(5));
     } else {
       di = String.valueOf(dt.get(5));
     }
     return di;
   }
   
   public static String getMes() { Calendar dt = Calendar.getInstance();
     String me;
     if (dt.get(2) + 1 < 10) {
       me = "0" + String.valueOf(dt.get(2) + 1);
     } else {
       me = String.valueOf(dt.get(2) + 1);
     }
     return me;
   }
   
   public static String getAno() { Calendar dt = Calendar.getInstance();
     
     String an = String.valueOf(dt.get(1));
     return an;
   }
   
   public static String getHora() { Calendar dt = Calendar.getInstance();
     String ho;
     if (dt.get(11) < 10) {
       ho = "0" + String.valueOf(dt.get(11));
     } else {
       ho = String.valueOf(dt.get(11));
     }
     return ho;
   }
   
   public static String getMinuto() { Calendar dt = Calendar.getInstance();
     String mi;
     if (dt.get(12) < 10) {
       mi = "0" + String.valueOf(dt.get(12));
     } else {
       mi = String.valueOf(dt.get(12));
     }
     return mi;
   }
   
   public static String getSegundo() { Calendar dt = Calendar.getInstance();
     String se; if (dt.get(13) < 10) {
       se = "0" + String.valueOf(dt.get(13));
     } else {
       se = String.valueOf(dt.get(13));
     }
     return se;
   }
   
   public static String getMilissegundo() { Calendar dt = Calendar.getInstance();
     String ml; if (dt.get(14) < 10) {
       ml = "0" + String.valueOf(dt.get(14));
     } else {
       ml = String.valueOf(dt.get(14));
     }
     return ml;
   }
   
   public static String getDataDDMMAAAA() {
     String dat = getDia() + "/" + getMes() + "/" + getAno();
     return dat;
   }
   
   public static String getHoraHHMMSS() {
     String horr = getHora() + ":" + getMinuto() + ":" + getSegundo();
     return horr;
   }
   
   public static String getHoraHHMMSSmm() {
     String hora = getHora() + ":" + getMinuto() + ":" + getSegundo() + ":" + getMilissegundo();
     return hora;
   }
   
   public static String getCodigoDataHora() {
     String coddtho = getAno() + getMes() + getDia() + getHora() + getMinuto() + getSegundo() + getMilissegundo();
     return coddtho;
   }
   
   public static String getMesExtenso(int mesNumero) { String mes = "";
     switch (mesNumero) {
     case 1:  mes = "Janeiro"; break;
     case 2:  mes = "Fevereiro"; break;
     case 3:  mes = "Março"; break;
     case 4:  mes = "Abril"; break;
     case 5:  mes = "Maio"; break;
     case 6:  mes = "Junho"; break;
     case 7:  mes = "Julho"; break;
     case 8:  mes = "Agosto"; break;
     case 9:  mes = "Setembro"; break;
     case 10:  mes = "Outubro"; break;
     case 11:  mes = "Novembro"; break;
     case 12:  mes = "Dezembro";
     }
     return mes;
   }
   
   public static String getSomaDataDiaRetDdMmAaaa(String dataDdMmAaaa, int dias) {
     String dt = "";
     String[] s = dataDdMmAaaa.split("/");
     int d = Integer.parseInt(s[0]);
     int m = Integer.parseInt(s[1]);
     int a = Integer.parseInt(s[2]);
     m--;
     d = dias;
     
     Calendar c = Calendar.getInstance();
     c.set(a, m, d);
     
     d = c.get(5);
     m = c.get(2) + 1;
     a = c.get(1);
     
 
     if (d < 10) {
       dt = "0" + String.valueOf(d);
     } else {
       dt = String.valueOf(d);
     }
     
     if (m < 10) {
       dt = dt + "/0" + String.valueOf(m);
     } else {
       dt = dt + "/" + String.valueOf(m);
     }
     dt = dt + "/" + String.valueOf(a);
     
     return dt;
   }
   
   public static String getDiaSemana(String dataDdMmAaaa, boolean abreviado) {
     String ddd = "";
     String[] s = dataDdMmAaaa.split("/");
     int d = Integer.parseInt(s[0]);
     int m = Integer.parseInt(s[1]);
     int a = Integer.parseInt(s[2]);
     m--;
     
     Calendar c = Calendar.getInstance();
     c.set(a, m, d);
     
     d = c.get(7);
     
     if (abreviado)
       switch (d) {
       case 1:  ddd = "Dom"; break;
       case 2:  ddd = "Seg"; break;
       case 3:  ddd = "Ter"; break;
       case 4:  ddd = "Qua"; break;
       case 5:  ddd = "Qui"; break;
       case 6:  ddd = "Sex"; break;
       case 7:  ddd = "Sáb";
       } else {
       switch (d) {
       case 1:  ddd = "Domingo"; break;
       case 2:  ddd = "Segunda-feira"; break;
       case 3:  ddd = "Terça-feira"; break;
       case 4:  ddd = "Quarta-feira"; break;
       case 5:  ddd = "Quinta-feira"; break;
       case 6:  ddd = "Sexta-feira"; break;
       case 7:  ddd = "Sábado";
       }
     }
     int dx = c.get(6);
     String x; if ((dx < 100) && (dx > 9)) {
       x = a + "+0" + dx;
     } else { 
       if (dx < 10) {
         x = a + "-00" + dx;
       } else {
         x = a + "" + dx;
       }
     }
     
 
     return ddd + x;
   }
   
   public static boolean getComparaData(String data, String dataInicial, String dataFinal)
   {
     Calendar c = Calendar.getInstance();
     int da = getTotalDias(data);
     int di = getTotalDias(dataInicial);
     int df = getTotalDias(dataFinal);
     
     if ((da >= di) && (da <= df)) {
       return true;
     }
     return false;
   }
   
 
 
 
   public static int getTotalDias(String data)
   {
     Calendar c = Calendar.getInstance();
     String[] datas = data.split("/");
     int a = Integer.parseInt(datas[2]);
     int m = Integer.parseInt(datas[1]);
     int d = Integer.parseInt(datas[0]);
     c.set(a, m - 1, d);
     int da = c.get(6);
     int at = a - 1901;
     int ab = (at - at % 4) / 4;
     int dt = at * 365 + da + ab + 365 + 1;
     return dt;
   }
   
   public static String formataData(String data) {
     try {
       String dataFormatada = "";
       String[] dt = data.split("/");
       String d = dt[0];
       String m = dt[1];
       String a = dt[2];
       int dd = Integer.parseInt(d);
       int mm = Integer.parseInt(m);
       int aa = Integer.parseInt(a);
       if (mm > 12) {
         mm = 12;
       }
       switch (mm) {
       case 1:  if (dd > 31) dd = 31;
         break;
       case 2:  if (aa % 4 == 0) {
           if (dd > 29) {
             dd = 29;
           }
         } else if (dd > 28) {
           dd = 28;
         }
         break;
       case 3: 
         if (dd > 31) dd = 31;
         break; case 4:  if (dd > 30) dd = 30;
         break; case 5:  if (dd > 31) dd = 31;
         break; case 6:  if (dd > 30) dd = 30;
         break; case 7:  if (dd > 31) dd = 31;
         break; case 8:  if (dd > 31) dd = 31;
         break; case 9:  if (dd > 30) dd = 30;
         break; case 10:  if (dd > 31) dd = 31;
         break; case 11:  if (dd > 30) dd = 30;
         break; case 12:  if (dd > 31) dd = 31;
         break; }
       if (dd < 10) {
         dataFormatada = "0" + dd + "/";
       } else {
         dataFormatada = dd + "/";
       }
       if (mm < 10) {
         dataFormatada = dataFormatada + "0" + mm + "/";
       } else {
         dataFormatada = dataFormatada + mm + "/";
       }
       if (aa < 1900) {
         dataFormatada = dataFormatada + "1900";
       } else if (aa > 2100) {
         dataFormatada = dataFormatada + "2100";
       }
       return dataFormatada + aa;
     }
     catch (Exception e) {}
     
 
 
 
     return "";
   }
   
 
 
   public static void main(String[] args)
   {
     for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
       System.out.println(info.getName());
     }
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Datas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */