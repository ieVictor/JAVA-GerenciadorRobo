// Aluno: Victor Gabriel Lucio | RA: A2575302

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaArticuladoView extends javax.swing.JFrame {

    private boolean listagemPorCategoria;
    
    // SINGLETON
    private static JanelaArticuladoView singleJanelaArticuladoView;
    
    private JanelaArticuladoView() {
        initComponents();
        setLocationRelativeTo(null);
        listagemPorCategoria = false;
    }
    
    // MÉTODO SINGLETON
    public static JanelaArticuladoView getSingleJanelaArticuladoView() {
        if (singleJanelaArticuladoView == null) {
            singleJanelaArticuladoView = new JanelaArticuladoView();
        }
        
        return singleJanelaArticuladoView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulado = new javax.swing.JTable();
        buttonConsultarCondicao = new javax.swing.JButton();
        buttonConsultarID = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        buttonConsultarFuncao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Robô - Vizualizar Robôs");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tableArticulado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Função", "Consumo", "Condição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableArticulado);

        buttonConsultarCondicao.setText("Consultar Condição");
        buttonConsultarCondicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarCondicaoActionPerformed(evt);
            }
        });

        buttonConsultarID.setText("Consultar ID");
        buttonConsultarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarIDActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonConsultarFuncao.setText("Consultar Função");
        buttonConsultarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarFuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonConsultarCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConsultarID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConsultarFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonConsultarID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonConsultarFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonConsultarCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        buttonVoltar.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConsultarCondicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarCondicaoActionPerformed
        consultarCondicao();
    }//GEN-LAST:event_buttonConsultarCondicaoActionPerformed

    private void buttonConsultarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarIDActionPerformed
        consultarID();
    }//GEN-LAST:event_buttonConsultarIDActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        listarTabela();
        buttonVoltar.setVisible(false);
        listagemPorCategoria = false;
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonConsultarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarFuncaoActionPerformed
        consultarFuncao();
    }//GEN-LAST:event_buttonConsultarFuncaoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (!listagemPorCategoria) listarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void consultarFuncao() {
        Object[] options = {"Soldagem", "Parafusamento", "Empacotamento", "Paletização"};

        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma função:",
            "Consulta por função",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        switch (escolha) {
            case 0 -> listarTabela("Soldagem");

            case 1 -> listarTabela("Parafusamento");

            case 2 -> listarTabela("Empacotamento");
            
            case 3 -> listarTabela("Paletização");
        }
        buttonVoltar.setVisible(true);
        listagemPorCategoria = true;
    }
    
    private void consultarCondicao() {
        Object[] options = {"Ligado", "Desligado"};

        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma função:",
            "Consulta por função",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        switch (escolha) {
            case 0 -> listarTabela(true);

            case 1 -> listarTabela(false);
        }
        buttonVoltar.setVisible(true);
        listagemPorCategoria = true;
    }
    
    // Sobrecarga
    private void listarTabela(String funcao) {
        DefaultTableModel modelo = (DefaultTableModel) tableArticulado.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            if (articulado.getFuncao() == funcao) {
               modelo.insertRow(posLin, new Object[]{
                    articulado.getId(),
                    articulado.getNome(),
                    articulado.getFuncao(),
                    articulado.getConsumoEnergia(),
                    articulado.getCondicao() ? "Ligado" : "Desligado"
                });
                posLin++; 
            }          
        }
    }
    
    // Sobrecarga
    private void listarTabela(boolean condicao) {
        DefaultTableModel modelo = (DefaultTableModel) tableArticulado.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            if (articulado.getCondicao() == condicao) {
               modelo.insertRow(posLin, new Object[]{
                    articulado.getId(),
                    articulado.getNome(),
                    articulado.getFuncao(),
                    articulado.getConsumoEnergia(),
                    articulado.getCondicao() ? "Ligado" : "Desligado"
                });
                posLin++; 
            }          
        }
    }
    
    
    private void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tableArticulado.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            modelo.insertRow(posLin, new Object[]{
                articulado.getId(),
                articulado.getNome(),
                articulado.getFuncao(),
                articulado.getConsumoEnergia(),
                articulado.getCondicao() ? "Ligado" : "Desligado"
            });
            
            posLin++;
        }
    }
    
    private void consultarID() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Insira um ID:"));
            Articulado articulado =
                    ArticuladoDAOImpl.getSingleArticuladoDAO().get(id);
            
            JanelaArticuladoEdit.getSingleJanelaArticuladoEdit().setInformacoes(articulado);
            JanelaArticuladoEdit.getSingleJanelaArticuladoEdit().setVisible(true);
        }
        catch (ArticuladoException le) {
            JOptionPane.showMessageDialog(
                    null,
                    le.getMessage(),
                    "ERRO!",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(
                    null,
                    "O ID deve ser um inteiro!",
                    "ERRO!",
                    JOptionPane.ERROR_MESSAGE
            );
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
            java.util.logging.Logger.getLogger(JanelaArticuladoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaArticuladoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaArticuladoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaArticuladoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaArticuladoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConsultarCondicao;
    private javax.swing.JButton buttonConsultarFuncao;
    private javax.swing.JButton buttonConsultarID;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArticulado;
    // End of variables declaration//GEN-END:variables
}
