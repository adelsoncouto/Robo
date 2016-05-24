 package br.com.adelsoncouto.util;
 
 import javax.swing.JTable;
 import javax.swing.table.DefaultTableCellRenderer;
 import javax.swing.table.TableColumn;
 import javax.swing.table.TableColumnModel;
 
 
 
 
 
 
 
 public class Tabela
 {
   public static DefaultTableCellRenderer getCentro()
   {
     DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(0);
     return alinha;
   }
   
   public static DefaultTableCellRenderer getDireita() { DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(4);
     return alinha;
   }
   
   public static DefaultTableCellRenderer getEsquerda() { DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(2);
     return alinha;
   }
   
   public static void alinhaCentro(JTable tabela, int coluna) {
     DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(0);
     tabela.getColumnModel().getColumn(coluna).setCellRenderer(alinha);
   }
   
   public static void alinhaDireita(JTable tabela, int coluna) { DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(4);
     tabela.getColumnModel().getColumn(coluna).setCellRenderer(alinha);
   }
   
   public static void alinhaEsquerda(JTable tabela, int coluna) { DefaultTableCellRenderer alinha = new DefaultTableCellRenderer();
     alinha.setHorizontalAlignment(2);
     tabela.getColumnModel().getColumn(coluna).setCellRenderer(alinha);
   }
   
   public static void ocultarColuna(JTable tabela, int colunaIndex)
   {
     tabela.getColumnModel().getColumn(colunaIndex).setMaxWidth(0);
     tabela.getColumnModel().getColumn(colunaIndex).setMinWidth(0);
     tabela.getColumnModel().getColumn(colunaIndex).setPreferredWidth(0);
     tabela.getColumnModel().getColumn(colunaIndex).setWidth(0);
   }
   
   public static void redimensionarColunasDefault(JTable tabela) {
     int col = tabela.getColumnCount();
     
     for (int i = 0; i < col; i++) {
       String ncol = tabela.getColumnName(i);
       int tcol = ncol.length() * 15;
       tabela.getColumnModel().getColumn(i).setPreferredWidth(tcol);
     }
   }
   
   public static void redimencionaColuna(JTable tabela, int colunaIndex, int tamanho) { tabela.getColumnModel().getColumn(colunaIndex).setPreferredWidth(tamanho);
     tabela.getColumnModel().getColumn(colunaIndex).setWidth(tamanho);
   }
 }


/* Location:              /opt/lampp/htdocs/robo/Robo.jar!/util/Tabela.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */