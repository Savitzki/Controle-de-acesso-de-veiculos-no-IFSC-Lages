package view;

import controller.ControllerCadastroAutomovel;
import controller.ControllerCadastroMarca;
import controller.ControllerCadastroModelo;
import controller.ControllerCadastroProprietario;
import controller.ControllerCadastroVersao;
import controller.ControllerHelp;
import controller.ControllerSobre;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Tela_menu extends javax.swing.JFrame {

    public Tela_menu(java.awt.Frame parent, boolean modal) {
        initComponents();        
        //setExtendedState(MAXIMIZED_BOTH);
        
        //Centraliza a tela
        setLocationRelativeTo(null);
        setIcon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        janela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_cadastro = new javax.swing.JMenu();
        jMi_automovel = new javax.swing.JMenuItem();
        jMi_marca = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMi_proprietario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMmovimentos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        info = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu principal - CTRLacess");
        setBackground(new java.awt.Color(230, 230, 250));
        setResizable(false);

        janela.setBackground(new java.awt.Color(230, 230, 250));
        janela.setToolTipText("Controle de Acesso");

        jLabel1.setBackground(new java.awt.Color(9, 132, 227));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundo.png"))); // NOI18N

        javax.swing.GroupLayout janelaLayout = new javax.swing.GroupLayout(janela);
        janela.setLayout(janelaLayout);
        janelaLayout.setHorizontalGroup(
            janelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        janelaLayout.setVerticalGroup(
            janelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setEnabled(false);

        jMenu_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_list_16px.png"))); // NOI18N
        jMenu_cadastro.setText("Cadastro");
        jMenu_cadastro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMi_automovel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMi_automovel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMi_automovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_create_new_16px.png"))); // NOI18N
        jMi_automovel.setText("Automovel");
        jMi_automovel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMi_automovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMi_automovelActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMi_automovel);

        jMi_marca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMi_marca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMi_marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_create_new_16px.png"))); // NOI18N
        jMi_marca.setText("Marca");
        jMi_marca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMi_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMi_marcaActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMi_marca);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_create_new_16px.png"))); // NOI18N
        jMenuItem2.setText("Modelo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem2);

        jMi_proprietario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMi_proprietario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMi_proprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_create_new_16px.png"))); // NOI18N
        jMi_proprietario.setText("Proprietário");
        jMi_proprietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMi_proprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMi_proprietarioActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMi_proprietario);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_create_new_16px.png"))); // NOI18N
        jMenuItem1.setText("Versão");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem1);

        jMenuBar1.add(jMenu_cadastro);
        jMenuBar1.add(jMenu2);

        jMmovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_move_stock_16px.png"))); // NOI18N
        jMmovimentos.setText("Movimentos");
        jMmovimentos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_overtime_16px.png"))); // NOI18N
        jMenuItem3.setText("Novo acesso");
        jMmovimentos.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_property_16px.png"))); // NOI18N
        jMenuItem4.setText("Pesquisa de acesso");
        jMmovimentos.add(jMenuItem4);

        jMenuBar1.add(jMmovimentos);

        info.setBorder(null);
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_info_16px.png"))); // NOI18N
        info.setText("Informações");
        info.setFont(new java.awt.Font("Microsoft Tai Le", 0, 16)); // NOI18N
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        ajuda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_help_16px.png"))); // NOI18N
        ajuda.setText("Ajuda");
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        info.add(ajuda);

        sobre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_high_importance_16px.png"))); // NOI18N
        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        info.add(sobre);
        info.add(jSeparator1);

        jMenu_sair.setFont(new java.awt.Font("Microsoft Tai Le", 0, 16)); // NOI18N
        jMenu_sair.setText("Sair");
        jMenu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_sairActionPerformed(evt);
            }
        });
        info.add(jMenu_sair);

        jMenuBar1.add(info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMi_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMi_marcaActionPerformed
        Tela_cadastro_marca telaCadMarca = new Tela_cadastro_marca(null, true); //JDialog 
        ControllerCadastroMarca controlerCadastroMarca = new ControllerCadastroMarca(telaCadMarca);//Controlando a tela
        telaCadMarca.setVisible(true);
    }//GEN-LAST:event_jMi_marcaActionPerformed

    private void jMi_automovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMi_automovelActionPerformed
        Tela_cadastro_automovel telaCadAutomovel = new Tela_cadastro_automovel(null, true);
        ControllerCadastroAutomovel controlerCadastroAuto = new ControllerCadastroAutomovel(telaCadAutomovel);
        telaCadAutomovel.setVisible(true);
        
    }//GEN-LAST:event_jMi_automovelActionPerformed

    private void jMi_proprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMi_proprietarioActionPerformed
        Tela_cadastro_proprietario telaCadProprietario = new Tela_cadastro_proprietario(null, true);
        ControllerCadastroProprietario controlerCadastroProp = new ControllerCadastroProprietario(telaCadProprietario);
        telaCadProprietario.setVisible(true);
    }//GEN-LAST:event_jMi_proprietarioActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        Help tela = new Help();
        ControllerHelp controler = new ControllerHelp(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_ajudaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tela_cadastro_versao telaCadVersao = new Tela_cadastro_versao(null, true);
        ControllerCadastroVersao controlerCadVersao = new ControllerCadastroVersao(telaCadVersao);
        telaCadVersao.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tela_cadastro_modelo telaCadastroModelo = new Tela_cadastro_modelo(null, true);
        ControllerCadastroModelo controlerCadModelo = new ControllerCadastroModelo(telaCadastroModelo);
        telaCadastroModelo.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
         Sobre tela = new Sobre();
         ControllerSobre controler = new ControllerSobre(tela);
         tela.setVisible(true);
    }//GEN-LAST:event_sobreActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        
    }//GEN-LAST:event_infoActionPerformed

    private void jMenu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_sairActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja fechar a aplicação?", "ATENÇÃO", JOptionPane.YES_OPTION);        
        if(confirm == JOptionPane.YES_OPTION){            
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajuda;
    private javax.swing.JMenu info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenu_cadastro;
    private javax.swing.JMenuItem jMenu_sair;
    private javax.swing.JMenuItem jMi_automovel;
    private javax.swing.JMenuItem jMi_marca;
    private javax.swing.JMenuItem jMi_proprietario;
    private javax.swing.JMenu jMmovimentos;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel janela;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables


    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icon-car.png")));//define o icone da janela
    }

}
