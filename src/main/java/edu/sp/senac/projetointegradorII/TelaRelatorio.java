/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII;

import edu.sp.senac.projetointegradorII.validadores.ValidadorRelatorio;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Matheus Lima
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
        formatarCampoDataDe(); // Criação de formatação para padrão de data JFormattedField
        formatarCampoDataAte();
        //Mudar ícone das telas
        ImageIcon img = new ImageIcon("src/main/resources/icons/musica.png");
        this.setIconImage(img.getImage());
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void formatarCampoDataDe()          // Criação de formatação para padrão de data JFormattedField
    {
        try {
            MaskFormatter mask = new MaskFormatter("##-##-####");
            mask.install(txtDe);
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Informe a data corretamente", "Erro", JOptionPane.ERROR);
        }
    }
    
    private void formatarCampoDataAte()          // Criação de formatação para padrão de data JFormattedField
    {
        try {
            MaskFormatter mask = new MaskFormatter("##-##-####");     
            mask.install(txtAte);
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Informe a data corretamente", "Erro", JOptionPane.ERROR);
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JToggleButton();
        lblDe = new javax.swing.JLabel();
        lblAte = new javax.swing.JLabel();
        txtDe = new javax.swing.JFormattedTextField();
        txtAte = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        tbRelatorioSintetico = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMaisDetalhes = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Sintético");

        jPanel1.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConsultar.setBackground(new java.awt.Color(234, 215, 206));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnConsultar.setText("<html> \t<font face=\"Montserrat\"> Consultar </font> </html>");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidadorRangeData(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblDe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        lblDe.setText("De:");

        lblAte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        lblAte.setText("Até:");

        txtDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        txtDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeActionPerformed(evt);
            }
        });
        txtDe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerico(evt);
                date(evt);
            }
        });

        txtAte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-y"))));
        txtAte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAteActionPerformed(evt);
            }
        });
        txtAte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerico(evt);
                date(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDe, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btnConsultar)
                .addGap(277, 277, 277))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDe)
                    .addComponent(lblAte)
                    .addComponent(txtDe)
                    .addComponent(txtAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome ", "Data da Compra", "Valor Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRelatorioSintetico.setFocusable(false);
        tbRelatorioSintetico.setRowHeight(25);
        tbRelatorioSintetico.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbRelatorioSintetico.setShowHorizontalLines(true);
        tbRelatorioSintetico.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(tbRelatorioSintetico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(table, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(251, 250, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTotal.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money-bag.png"))); // NOI18N
        jLabel1.setText("Total:");

        btnMaisDetalhes.setBackground(new java.awt.Color(234, 215, 206));
        btnMaisDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaisDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisa.png"))); // NOI18N
        btnMaisDetalhes.setText("Mais Detalhes");
        btnMaisDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisDetalhesActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(234, 215, 206));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/casa.png"))); // NOI18N
        btnInicio.setText("Início");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addGap(18, 18, 18)
                .addComponent(btnMaisDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnMaisDetalhes)
                    .addComponent(btnInicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        ValidadorRelatorio validar = new ValidadorRelatorio();
        validar.ValidarVazioJ(txtDe);
        validar.ValidarVazioJ(txtAte);
        validar.mensagem();
        
        validar.findDifference(txtDe.getText(), txtAte.getText());
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void numerico(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerico
        char c  = evt.getKeyChar();
     
        if ((c<'0')||(c>'9') && (c!=KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            //JOptionPane.showMessageDialog(this,"Digite apenas números!");
        }
        
        
        
        
    }//GEN-LAST:event_numerico

    private void date(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date
        
       

           // if(txtDeData.getText().length()>=6)
//        {
//            evt.consume();
//            JOptionPane.showMessageDialog(this,"Máximo de 6 caractéres atingido");
//        }

        
    }//GEN-LAST:event_date

    private void txtDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDeActionPerformed

    private void txtAteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAteActionPerformed

    private void btnMaisDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisDetalhesActionPerformed
        // TODO add your handling code here:
        TelaRelatorioAnalitico relatorioAnalitico = new TelaRelatorioAnalitico();
        relatorioAnalitico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMaisDetalhesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnValidadorRangeData(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidadorRangeData
        
            }//GEN-LAST:event_btnValidadorRangeData

    public void tabel() {

        initComponents();
        setBackground(new Color(0,0,0,0));

        tbRelatorioSintetico.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbRelatorioSintetico.getTableHeader().setOpaque(false);
        tbRelatorioSintetico.getTableHeader().setBackground(new Color(32,136,203));
        tbRelatorioSintetico.getTableHeader().setForeground(new Color(255,255,255));
        tbRelatorioSintetico.setRowHeight(25);


}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMaisDetalhes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblDe;
    private javax.swing.JScrollPane table;
    private javax.swing.JTable tbRelatorioSintetico;
    private javax.swing.JFormattedTextField txtAte;
    private javax.swing.JFormattedTextField txtDe;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
