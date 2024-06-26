// Aluno: Victor Gabriel Lucio | RA: A2575302

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class JanelaLembreteEdit extends javax.swing.JFrame {

    // Singleton
    private static JanelaLembreteEdit singleJanelaLembreteEdit;
    
    private JanelaLembreteEdit() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // MÉTODO SINGLETON
    public static JanelaLembreteEdit getSingleJanelaLembreteEdit() {
        if (singleJanelaLembreteEdit == null) {
            singleJanelaLembreteEdit = new JanelaLembreteEdit();
        }
        
        return singleJanelaLembreteEdit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        separadorButton = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textContent = new javax.swing.JTextArea();
        labelTexto = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        textTitulo = new javax.swing.JTextField();
        textDataInicial = new javax.swing.JFormattedTextField();
        labelDataInicial = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        labelDataInicial1 = new javax.swing.JLabel();
        buttonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lembrete - Editar lembrete");
        setResizable(false);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Sair");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        textContent.setColumns(20);
        textContent.setLineWrap(true);
        textContent.setRows(5);
        textContent.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textContent);

        labelTexto.setText("Texto:");

        labelId.setText("ID:");

        textId.setEnabled(false);
        textId.setFocusable(false);

        labelTitulo.setText("Título:");

        textDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textDataInicial.setEnabled(false);
        textDataInicial.setFocusable(false);

        labelDataInicial.setText("Data inicial:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Importante", "Urgente" }));

        labelDataInicial1.setText("Categoria:");

        buttonDeletar.setText("Deletar lembrete");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorButton, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTitulo)
                            .addComponent(labelTexto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDataInicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDataInicial1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textTitulo)
                            .addComponent(jScrollPane1))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancelar)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataInicial)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataInicial1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(separadorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonDeletar))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Tem certeza que deseja editar este lembrete?",
            "Editar Lembrete",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta == 0) {
            try {
                Assistente.getSingleAssistente().modificarLembrete(
                    Integer.parseInt(textId.getText()),
                    textTitulo.getText(),
                    comboCategoria.getSelectedItem().toString(),
                    textContent.getText(),
                    LocalDate.parse(textDataInicial.getText())
                );

                JOptionPane.showMessageDialog(
                    null,
                    "Lembrete editado com sucesso!",
                    "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            catch (LembreteException le) {
                JOptionPane.showMessageDialog(
                    null,
                    le.getMessage(),
                    "ERROR!",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja Realmente sair?\nTodo conteúdo não salvo será perdido!",
            "Sair?",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta == 0) dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        removerLembrete();
    }//GEN-LAST:event_buttonDeletarActionPerformed

    public void removerLembrete() {
        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja Realmente deletar o lembrete?",
            "DELETAR",
            JOptionPane.YES_NO_OPTION
        );
        
        if (resposta == 0) {
            try {
                Assistente.getSingleAssistente().removerLembrete(
                        Integer.parseInt(textId.getText())
                );
                JOptionPane.showMessageDialog(
                        null,
                        "Lembrete deletado com sucesso!",
                        "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE
                );
                dispose();
            }
            catch (LembreteException le) {
                JOptionPane.showMessageDialog(
                    null,
                    le.getMessage(),
                    "ERROR!",
                    JOptionPane.ERROR_MESSAGE
                );
            }      
        }       
    }
    
    public void setInformacoes(int id, String title, String content, String category, Object data) {
        textId.setText(String.valueOf(id));
        textTitulo.setText(title);
        textContent.setText(content);
        textDataInicial.setText(String.valueOf(data));
        
        if (category == "Urgente") comboCategoria.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(JanelaLembreteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaLembreteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaLembreteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLembreteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaLembreteEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataInicial;
    private javax.swing.JLabel labelDataInicial1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSeparator separadorButton;
    private javax.swing.JTextArea textContent;
    private javax.swing.JFormattedTextField textDataInicial;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
