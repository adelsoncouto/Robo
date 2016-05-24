 package br.com.adelsoncouto.gui;
 
 import java.awt.event.ActionEvent;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
 
 public class Principal extends javax.swing.JFrame
 {
   private static final long serialVersionUID = 1L;
   private Mouse mouse = new Mouse();
   private static JPanel bloquea;
   private static javax.swing.JDesktopPane desktopModal = new javax.swing.JDesktopPane();
   private RoboIni robo = new RoboIni();
   public static javax.swing.JButton jButton1;
   private static JComboBox jComboBox1;
   private javax.swing.JLabel jLabel1;
   
   public Principal() {
     initComponents();
     setBounds(0, 0, 400, 350);
     carregaTarefas();
   }
   
 
   public static JPanel getBloquea() { return bloquea; }
   
   public static void setBloquea(JPanel aBloquea) { bloquea = aBloquea; }
   
   public static javax.swing.JDesktopPane getDesktopModal() { return desktopModal; }
   
   public static void setDesktopModal(javax.swing.JDesktopPane aDesktopModal) { desktopModal = aDesktopModal; }
   
 
 
   public static javax.swing.JMenuBar jMenuBar1;
   
 
   private JMenuItem jMenuItem1;
   
   private JMenuItem jMenuItem2;
   
   private void initComponents()
   {
     this.jPanel1 = new JPanel();
     jComboBox1 = new JComboBox();
     jtbTarefas = new JToggleButton();
     jtbPosicaoMouse = new JToggleButton();
     jButton1 = new javax.swing.JButton();
     this.jLabel1 = new javax.swing.JLabel();
     this.jScrollPane1 = new javax.swing.JScrollPane();
     jTextArea1 = new JTextArea();
     jMenuBar1 = new javax.swing.JMenuBar();
     this.jMenuSistema = new javax.swing.JMenu();
     this.jMenuItem2 = new JMenuItem();
     this.jMenuItem1 = new JMenuItem();
     
     setDefaultCloseOperation(3);
     setTitle("Rob o robô");
     addWindowListener(new java.awt.event.WindowAdapter() {
       public void windowClosing(java.awt.event.WindowEvent evt) {
         Principal.this.formWindowClosing(evt);
       }
       
     });
     jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarefas" }));
     
     jtbTarefas.setText("Executar Tarefas");
     jtbTarefas.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(ActionEvent evt) {
         Principal.this.jtbTarefasActionPerformed(evt);
       }
       
     });
     jtbPosicaoMouse.setText("Posição Mouse");
     jtbPosicaoMouse.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(ActionEvent evt) {
         Principal.this.jtbPosicaoMouseActionPerformed(evt);
       }
       
     });
     jButton1.setText("Atualiza Tarefas");
     jButton1.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(ActionEvent evt) {
         Principal.this.jButton1ActionPerformed(evt);
       }
       
     });
     this.jLabel1.setText("Tarefas:");
     
     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
     this.jPanel1.setLayout(jPanel1Layout);
     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, 0).addComponent(jtbPosicaoMouse, -1, -1, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jtbTarefas, -1, -1, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1, -1, -1, 32767).addGap(4, 4, 4)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jComboBox1, 0, -1, 32767)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jComboBox1, -2, 23, -2).addComponent(this.jLabel1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jtbTarefas).addComponent(jtbPosicaoMouse).addComponent(jButton1)).addContainerGap()));
     
 
 
 
 
 
 
 
 
 
 
 
 
     jTextArea1.setEditable(false);
     jTextArea1.setColumns(20);
     jTextArea1.setLineWrap(true);
     jTextArea1.setRows(5);
     jTextArea1.setWrapStyleWord(true);
     this.jScrollPane1.setViewportView(jTextArea1);
     
     this.jMenuSistema.setText("Sistema");
     
     this.jMenuItem2.setText("Sair");
     this.jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(ActionEvent evt) {
         Principal.this.jMenuItem2ActionPerformed(evt);
       }
     });
     this.jMenuSistema.add(this.jMenuItem2);
     
     this.jMenuItem1.setText("Limpar janela");
     this.jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(ActionEvent evt) {
         Principal.this.jMenuItem1ActionPerformed(evt);
       }
     });
     this.jMenuSistema.add(this.jMenuItem1);
     
     jMenuBar1.add(this.jMenuSistema);
     
     setJMenuBar(jMenuBar1);
     
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1).addComponent(this.jPanel1, -1, -1, 32767));
     
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -1, 89, 32767)));
     
 
 
 
 
 
 
     pack();
   }
   
   private void jMenuItem2ActionPerformed(ActionEvent evt) {
     System.exit(0);
   }
   
 
   private void formWindowClosing(java.awt.event.WindowEvent evt) {}
   
   private void jtbPosicaoMouseActionPerformed(ActionEvent evt)
   {
     if (jtbPosicaoMouse.isSelected()) {
       jtbPosicaoMouse.setText("Parar obs mouse");
       this.mouse.setRepete(true);
       this.mouse.inicia();
     } else {
       jtbPosicaoMouse.setText("Posição Mouse");
       this.mouse.setRepete(false);
     }
   }
   
   private void jtbTarefasActionPerformed(ActionEvent evt) {
     if (jtbTarefas.isSelected()) {
       this.robo.setRepete(true);
       this.robo.inicia(jComboBox1.getSelectedItem().toString());
     } else {
       this.robo.setRepete(false);
     }
   }
   
 
   private void jButton1ActionPerformed(ActionEvent evt) {}
   
   private void jMenuItem1ActionPerformed(ActionEvent evt)
   {
     jTextArea1.setText("");
   }
   
 
 
 
 
 
 
   public static void main(String[] args)
   {
     try
     {
       for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
         if ("Nimbus".equals(info.getName())) {
           javax.swing.UIManager.setLookAndFeel(info.getClassName());
           break;
         }
       }
     } catch (ClassNotFoundException ex) {
       Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
       Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
       Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
       Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     
 
 
     java.awt.EventQueue.invokeLater(new Runnable()
     {
       public void run() {
         new Principal().setVisible(true);
       }
     });
   }
   
 
 
   private javax.swing.JMenu jMenuSistema;
   
   private JPanel jPanel1;
   
   private javax.swing.JScrollPane jScrollPane1;
   
   public static JTextArea jTextArea1;
   
   public static JToggleButton jtbPosicaoMouse;
   
   public static JToggleButton jtbTarefas;
   
   public static void setMensagem(String texto)
   {
     jTextArea1.append(texto);
     jTextArea1.append("\n--------------\n");
     jTextArea1.select(jTextArea1.getText().length(), jTextArea1.getText().length());
   }
   
   public static void carregaTarefas()
   {
     java.io.File diretorio = new java.io.File(".");
     java.io.File[] arqs = diretorio.listFiles();
     jComboBox1.removeAllItems();
     for (int x = 0; x < arqs.length; x++) {
       if (arqs[x].getName().endsWith(".txt")) {
         jComboBox1.addItem(arqs[x].getName());
       }
     }
   }
 }





