/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII;

import edu.sp.senac.projetointegradorII.validadores.ValidadorProduto;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
        initComponents();
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
    
            // TODO add your handling code here:

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCadatroProduto = new javax.swing.JComboBox<>();
        txtBuscaProduto = new javax.swing.JTextField();
        btnBuscaProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscaProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JFormattedTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarcaProduto = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        lblDtCompra = new javax.swing.JLabel();
        txtDtCompraProduto = new javax.swing.JFormattedTextField();
        lblFornecedor = new javax.swing.JLabel();
        txtFornecedorProd = new javax.swing.JTextField();
        lblQtde = new javax.swing.JLabel();
        txtQuantProd = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        lblPrateleira = new javax.swing.JLabel();
        txtPrateleiraProd = new javax.swing.JComboBox<>();
        btnInício = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnAlterarProd = new javax.swing.JButton();
        btnCadastroProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Produto");

        jPanel1.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtCadatroProduto.setBackground(new java.awt.Color(234, 215, 206));
        txtCadatroProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCadatroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Nome do Produto", "Código do Produto", "Marca" }));
        txtCadatroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadatroProdutoActionPerformed(evt);
            }
        });

        txtBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaProdutoActionPerformed(evt);
            }
        });

        btnBuscaProduto.setBackground(new java.awt.Color(234, 215, 206));
        btnBuscaProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutoActionPerformed(evt);
            }
        });

        tbBuscaProduto.setForeground(new java.awt.Color(255, 255, 255));
        tbBuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código do produto", "Nome do produto", "Quant. do produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBuscaProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCadatroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscaProduto)
                    .addComponent(btnBuscaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCadatroProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(251, 250, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastrar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome:*");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyTyped(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo.setText("Código:*");

        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyTyped(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValor.setText("Valor:*");

        try {
            txtValorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorProdutoActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMarca.setText("Marca:*");

        txtMarcaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaProdutoKeyTyped(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setText("Descrição:*");

        txtDescricaoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoProdutoKeyTyped(evt);
            }
        });

        lblDtCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDtCompra.setText("Data Compra:*");

        try {
            txtDtCompraProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFornecedor.setText("Fornecedor:*");

        txtFornecedorProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorProdActionPerformed(evt);
            }
        });
        txtFornecedorProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFornecedorProdKeyTyped(evt);
            }
        });

        lblQtde.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtde.setText("Qtde.:*");

        txtQuantProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantProdActionPerformed(evt);
            }
        });
        txtQuantProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantProdKeyTyped(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCategoria.setText("Categoria:*");

        txtCategoria.setBackground(new java.awt.Color(234, 215, 206));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Corda", "Percussão", "Sopro" }));

        lblPrateleira.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrateleira.setText("Prateleira:*");

        txtPrateleiraProd.setBackground(new java.awt.Color(234, 215, 206));
        txtPrateleiraProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPrateleiraProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "A", "B", "C", "D" }));

        btnInício.setBackground(new java.awt.Color(234, 215, 206));
        btnInício.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInício.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/casa.png"))); // NOI18N
        btnInício.setText("Início");
        btnInício.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInícioActionPerformed(evt);
            }
        });

        btnExcluirProduto.setBackground(new java.awt.Color(234, 215, 206));
        btnExcluirProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir");

        btnAlterarProd.setBackground(new java.awt.Color(234, 215, 206));
        btnAlterarProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar-arquivo.png"))); // NOI18N
        btnAlterarProd.setText("Alterar");

        btnCadastroProd.setBackground(new java.awt.Color(234, 215, 206));
        btnCadastroProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastroProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diskette.png"))); // NOI18N
        btnCadastroProd.setText("Salvar");
        btnCadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnInício, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastroProd, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricao)
                            .addComponent(lblMarca)
                            .addComponent(lblValor)
                            .addComponent(lblCodigo)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricaoProduto)
                            .addComponent(txtMarcaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoProduto)
                            .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDtCompra)
                                    .addComponent(lblFornecedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFornecedorProd, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtDtCompraProduto)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQtde, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrateleira, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrateleiraProd, 0, 180, Short.MAX_VALUE)
                                    .addComponent(txtQuantProd)
                                    .addComponent(txtCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDtCompra)
                        .addComponent(txtDtCompraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornecedor)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtQuantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtde)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrateleira)
                    .addComponent(txtPrateleiraProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnAlterarProd)
                    .addComponent(btnCadastroProd)
                    .addComponent(btnInício))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadatroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadatroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadatroProdutoActionPerformed

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed

    private void txtBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaProdutoActionPerformed

    private void txtFornecedorProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorProdActionPerformed

    private void txtQuantProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantProdActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
       
       
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyTyped
        if(txtNomeProduto.getText().length()>=20){
           evt.consume();
           JOptionPane.showMessageDialog(this,"Máximo de 20 caracteres atingido!");
        }
    }//GEN-LAST:event_txtNomeProdutoKeyTyped

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void txtCodigoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyTyped
        char c = evt.getKeyChar();
        
        if (((c<'0') || (c>'9')) && (c !=KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Somente números no Código do produto");
//            this.txtCodigoProduto.setText("Somente números no Código do produto");
        }
        
        if(txtCodigoProduto.getText().length()>=2){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Digite um número menor que 100!");
        }
    }//GEN-LAST:event_txtCodigoProdutoKeyTyped

    private void txtMarcaProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaProdutoKeyTyped
        if(txtMarcaProduto.getText().length()>=20){
           evt.consume();
           JOptionPane.showMessageDialog(this,"Máximo de 20 caracteres atingido!");
        }
    }//GEN-LAST:event_txtMarcaProdutoKeyTyped

    private void txtDescricaoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoKeyTyped
        if(txtDescricaoProduto.getText().length()>=50){
           evt.consume();
           JOptionPane.showMessageDialog(this,"Máximo de 50 caracteres atingido!");
        }
    }//GEN-LAST:event_txtDescricaoProdutoKeyTyped

    private void txtFornecedorProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFornecedorProdKeyTyped
              
        if(txtFornecedorProd.getText().length()>=10){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 10 caracteres atingido!");
        }
    }//GEN-LAST:event_txtFornecedorProdKeyTyped

    private void txtQuantProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantProdKeyTyped
        char c = evt.getKeyChar();
        
        if (((c<'0') || (c>'9')) && (c !=KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Somente números no campo Quantidade do produto");
        }
        if(txtQuantProd.getText().length()>=2){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Digite um número menor que 100!");
            
        }
    }//GEN-LAST:event_txtQuantProdKeyTyped

    private void btnInícioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInícioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnInícioActionPerformed

    private void txtValorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorProdutoActionPerformed

    private void btnCadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdActionPerformed
        // TODO add your handling code here:
            	ValidadorProduto validar = new ValidadorProduto();
    	
    	//Validação dos campos obrigatorios
    	validar.ValidarVazio(txtNomeProduto);
        validar.ValidarVazio(txtCodigoProduto);
        validar.ValidarVazioJ(txtValorProduto);
        validar.ValidarVazio(txtMarcaProduto);
        validar.ValidarVazio(txtDescricaoProduto);
        validar.ValidarVazio(txtFornecedorProd);
        validar.ValidarVazio(txtQuantProd);
        validar.ValidarVazioJ(txtDtCompraProduto);
        validar.ValidarVazioJCB(txtCategoria);
        validar.ValidarVazioJCB(txtPrateleiraProd);
        validar.mensagem();
    }//GEN-LAST:event_btnCadastroProdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProd;
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton btnCadastroProd;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnInício;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDtCompra;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrateleira;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tbBuscaProduto;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JComboBox<String> txtCadatroProduto;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JFormattedTextField txtDtCompraProduto;
    private javax.swing.JTextField txtFornecedorProd;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JComboBox<String> txtPrateleiraProd;
    private javax.swing.JTextField txtQuantProd;
    private javax.swing.JFormattedTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
