// Aluno: Victor Gabriel Lucio | RA: A2575302



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaArticulado extends javax.swing.JFrame {

    // Singleton
    private static JanelaArticulado singleJanelaArticulado;
    
    private JanelaArticulado() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // MÉTODO SINGLETON
    public static JanelaArticulado getSingleJanelaArticulado() {
        if (singleJanelaArticulado == null) {
            singleJanelaArticulado = new JanelaArticulado();
        }
        
        return singleJanelaArticulado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInformacoes = new javax.swing.JLabel();
        separadorInformacoes = new javax.swing.JSeparator();
        labelProprietario = new javax.swing.JLabel();
        labelLembretes = new javax.swing.JLabel();
        separadorLembretes = new javax.swing.JSeparator();
        separadorButtons = new javax.swing.JSeparator();
        buttonSair = new javax.swing.JButton();
        textRobosCadastrados = new javax.swing.JLabel();
        labelRobosAtivos = new javax.swing.JLabel();
        textRobosAtivos = new javax.swing.JLabel();
        labelConsumoEnergia = new javax.swing.JLabel();
        textConsumoEnergia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulados = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        menuEditar = new javax.swing.JMenu();
        menuEditLembretes = new javax.swing.JMenuItem();
        menuVizualizar = new javax.swing.JMenu();
        itemViewRobosCadastrados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Robô - Articulado");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelInformacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInformacoes.setText("Informações");

        labelProprietario.setText("Robôs Cadastrados:");

        labelLembretes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelLembretes.setText("Robôs Cadastrados");

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        textRobosCadastrados.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textRobosCadastrados.setText("Undefined");

        labelRobosAtivos.setText("Robôs ativos:");

        textRobosAtivos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textRobosAtivos.setText("Undefined");

        labelConsumoEnergia.setText("Consumo de energia:");

        textConsumoEnergia.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textConsumoEnergia.setText("Undefined");

        tableArticulados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Função", "Consumo", "Condição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableArticulados);

        menuEditar.setText("Editar");

        menuEditLembretes.setText("Robôs");
        menuEditLembretes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditLembretesActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditLembretes);

        menuBar.add(menuEditar);

        menuVizualizar.setText("Visualizar");

        itemViewRobosCadastrados.setText("Robôs Cadastrados...");
        itemViewRobosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewRobosCadastradosActionPerformed(evt);
            }
        });
        menuVizualizar.add(itemViewRobosCadastrados);

        menuBar.add(menuVizualizar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separadorButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelInformacoes)
                                .addGap(10, 10, 10)
                                .addComponent(separadorInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLembretes)
                                .addGap(10, 10, 10)
                                .addComponent(separadorLembretes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProprietario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRobosCadastrados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelRobosAtivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRobosAtivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelConsumoEnergia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textConsumoEnergia)
                                .addGap(20, 20, 20)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSair)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(separadorInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInformacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRobosAtivos)
                    .addComponent(textRobosAtivos)
                    .addComponent(labelConsumoEnergia)
                    .addComponent(textConsumoEnergia)
                    .addComponent(labelProprietario)
                    .addComponent(textRobosCadastrados))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(separadorLembretes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLembretes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(separadorButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSair)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEditLembretesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditLembretesActionPerformed
        JanelaArticuladoEditarRobo.getSingleJanelaArticuladoEditarRobo().setVisible(true);
    }//GEN-LAST:event_menuEditLembretesActionPerformed

    private void itemViewRobosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewRobosCadastradosActionPerformed
        JanelaArticuladoView.getSingleJanelaArticuladoView().setVisible(true);
    }//GEN-LAST:event_itemViewRobosCadastradosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        sair();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTabela();
        refreshComponents();
    }//GEN-LAST:event_formWindowActivated

    private void sair() {
        int resposta =  JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saída",
                JOptionPane.YES_NO_OPTION
        );

        if(resposta == 0) {
            dispose();
        }
    }
    
    private void refreshComponents() {
        textRobosCadastrados.setText(
                String.valueOf(BDArticulado.getSingleBDArticulado().getIdCounter() - 1)
        );
        
        int ativos = 0;
        int consumo = 0;
        int cadastrados = 0;
        
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            cadastrados++;
            if (articulado.getCondicao()) {
                ativos++;
                consumo += articulado.getConsumoEnergia();
            }
        }
        
        textRobosCadastrados.setText(String.valueOf(cadastrados));
        textConsumoEnergia.setText(String.valueOf(consumo));
        textRobosAtivos.setText(String.valueOf(ativos));
    }
    
    private void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tableArticulados.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            modelo.insertRow(posLin, new Object[]{
                articulado.getNome(),
                articulado.getFuncao(),
                articulado.getConsumoEnergia(),
                articulado.getCondicao() ? "Ligado" : "Desligado"
            });
            
            posLin++;
        }
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
            java.util.logging.Logger.getLogger(JanelaArticulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaArticulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaArticulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaArticulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaArticulado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSair;
    private javax.swing.JMenuItem itemViewRobosCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsumoEnergia;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelLembretes;
    private javax.swing.JLabel labelProprietario;
    private javax.swing.JLabel labelRobosAtivos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuEditLembretes;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuVizualizar;
    private javax.swing.JSeparator separadorButtons;
    private javax.swing.JSeparator separadorInformacoes;
    private javax.swing.JSeparator separadorLembretes;
    private javax.swing.JTable tableArticulados;
    private javax.swing.JLabel textConsumoEnergia;
    private javax.swing.JLabel textRobosAtivos;
    private javax.swing.JLabel textRobosCadastrados;
    // End of variables declaration//GEN-END:variables
}
