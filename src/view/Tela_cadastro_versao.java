package view;

import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela_cadastro_versao extends javax.swing.JDialog {

    /**
     * Creates new form Tela_cadastro_versao
     * @param parent
     * @param modal
     */
    public Tela_cadastro_versao(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JButton getjB_cancelar() {
        return jB_cancelar;
    }

    public JButton getjB_gravar() {
        return jB_gravar;
    }

    public JButton getjB_novo() {
        return jB_novo;
    }

    public JButton getjB_pesquisar() {
        return jB_pesquisar;
    }

    public JButton getjB_sair() {
        return jB_sair;
    }

    public JComboBox<String> getjCb_modelo() {
        return jCb_modelo;
    }

    public JPanel getPainelDados() {
        return painelDados;
    }

    public JTextField getjTf_cambio() {
        return jTf_cambio;
    }

    public JTextField getjTf_consumo() {
        return jTf_consumo;
    }

    public JTextField getjTf_nLugares() {
        return jTf_nLugares;
    }

    public JComboBox<String> getjCb_portas() {
        return jCb_portas;
    }


    public JTextField getjTf_potencia() {
        return jTf_potencia;
    }

    public JTextField getjTf_versao() {
        return jTf_versao;
    }

    public void setjCb_modelo(JComboBox<String> jCb_modelo) {
        this.jCb_modelo = jCb_modelo;
    }

    public JTextField getjTf_id() {
        return jTf_id;
    }
    

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icon-car.png")));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTf_id = new javax.swing.JTextField();
        jTf_versao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTf_potencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTf_nLugares = new javax.swing.JTextField();
        jTf_cambio = new javax.swing.JTextField();
        jTf_consumo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCb_modelo = new javax.swing.JComboBox<>();
        jCb_portas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nomeTela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        areaBotoes = new javax.swing.JPanel();
        jB_novo = new javax.swing.JButton();
        jB_gravar = new javax.swing.JButton();
        jB_cancelar = new javax.swing.JButton();
        jB_pesquisar = new javax.swing.JButton();
        jB_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        jTf_id.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel5.setText("Consumo");

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel6.setText("Potência");

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel7.setText("Portas");

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel8.setText("Lugares");

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel9.setText("Câmbio");

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel10.setText("Versão");

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel11.setText("Modelo");

        jCb_modelo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N

        jCb_portas.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jCb_portas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "4 portas", "2 portas", " " }));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 13)); // NOI18N
        jLabel2.setText("Km/Litro");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(jTf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addComponent(jTf_versao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTf_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCb_portas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(jTf_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCb_modelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTf_nLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTf_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jCb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTf_versao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTf_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jCb_portas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTf_nLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTf_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTf_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        nomeTela.setBackground(new java.awt.Color(94, 153, 215));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de versões");

        javax.swing.GroupLayout nomeTelaLayout = new javax.swing.GroupLayout(nomeTela);
        nomeTela.setLayout(nomeTelaLayout);
        nomeTelaLayout.setHorizontalGroup(
            nomeTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomeTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nomeTelaLayout.setVerticalGroup(
            nomeTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomeTelaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jB_novo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jB_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        jB_novo.setText("Novo");
        jB_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_novoActionPerformed(evt);
            }
        });

        jB_gravar.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jB_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_20px.png"))); // NOI18N
        jB_gravar.setText("Salvar");

        jB_cancelar.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jB_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_2_20px.png"))); // NOI18N
        jB_cancelar.setText("Cancelar");

        jB_pesquisar.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jB_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_20px.png"))); // NOI18N
        jB_pesquisar.setText("Pesquisar");

        jB_sair.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jB_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_exit_20px.png"))); // NOI18N
        jB_sair.setText("Sair");

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomeTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nomeTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_novoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_novoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_cadastro_versao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_versao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_versao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_versao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tela_cadastro_versao dialog = new Tela_cadastro_versao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JButton jB_cancelar;
    private javax.swing.JButton jB_gravar;
    private javax.swing.JButton jB_novo;
    private javax.swing.JButton jB_pesquisar;
    private javax.swing.JButton jB_sair;
    private javax.swing.JComboBox<String> jCb_modelo;
    private javax.swing.JComboBox<String> jCb_portas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTf_cambio;
    private javax.swing.JTextField jTf_consumo;
    private javax.swing.JTextField jTf_id;
    private javax.swing.JTextField jTf_nLugares;
    private javax.swing.JTextField jTf_potencia;
    private javax.swing.JTextField jTf_versao;
    private javax.swing.JPanel nomeTela;
    private javax.swing.JPanel painelDados;
    // End of variables declaration//GEN-END:variables
}
