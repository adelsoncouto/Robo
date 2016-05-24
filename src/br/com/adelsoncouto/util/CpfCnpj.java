 package br.com.adelsoncouto.util;
 
 
 
 
 
 
 
 
 
 
 public class CpfCnpj
 {
   public static boolean cpf(String numeroCpf)
   {
     boolean avaliado = false;
     
     numeroCpf = numeroCpf.replaceAll("\\.", "");
     numeroCpf = numeroCpf.replaceAll("-", "");
     
 
 
 
 
     int[] n = { Integer.parseInt(numeroCpf.substring(0, 1)), Integer.parseInt(numeroCpf.substring(1, 2)), Integer.parseInt(numeroCpf.substring(2, 3)), Integer.parseInt(numeroCpf.substring(3, 4)), Integer.parseInt(numeroCpf.substring(4, 5)), Integer.parseInt(numeroCpf.substring(5, 6)), Integer.parseInt(numeroCpf.substring(6, 7)), Integer.parseInt(numeroCpf.substring(7, 8)), Integer.parseInt(numeroCpf.substring(8, 9)), Integer.parseInt(numeroCpf.substring(9, 10)), Integer.parseInt(numeroCpf.substring(10, 11)) };
     
 
 
 
 
 
 
 
 
 
 
 
 
     int soma1 = 0;int soma2 = 0;
     
     for (int i = 0; i < 9; i++) {
       soma1 += n[i] * (10 - i);
       soma2 += n[i] * (11 - i);
     }
     
     soma1 %= 11;
     if (soma1 > 1) {
       soma1 = 11 - soma1;
     } else {
       soma1 = 0;
     }
     
     soma2 += soma1 * 2;
     soma2 %= 11;
     if (soma2 > 1) {
       soma2 = 11 - soma2;
     } else {
       soma2 = 0;
     }
     
     if ((n[9] == soma1) && (n[10] == soma2)) {
       avaliado = true;
     }
     
     boolean rever = false;
     
     for (int i = 0; i < 9; i++) {
       if (n[i] != n[(i + 1)]) {
         rever = true;
       }
     }
     
     if (avaliado) {
       avaliado = rever;
     }
     
 
     return avaliado;
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/CpfCnpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */