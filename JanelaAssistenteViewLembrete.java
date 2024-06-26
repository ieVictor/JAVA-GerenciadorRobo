// Aluno: Victor Gabriel Lucio | RA: A2575302

import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaAssistenteViewLembrete extends javax.swing.JFrame {
    
    private boolean listagemPorCategoria;
    
    // Singleton
    private static JanelaAssistenteViewLembrete singleJanelaAssistenteViewLembrete;
   
    private JanelaAssistenteViewLembrete() {
        initComponents();
        listagemPorCategoria = false;
        setLocationRelativeTo(null);
        dialogInformacoes.setLocationRelativeTo(null);
    }
    
    // MÉTODO SINGLETON
    public static JanelaAssistenteViewLembrete getSingleJanelaAssistenteViewLembrete() {
        if (singleJanelaAssistenteViewLembrete == null) {
            singleJanelaAssistenteViewLembrete = new JanelaAssistenteViewLembrete();
        }
        
        return singleJanelaAssistenteViewLembrete;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogInformacoes = new javax.swing.JFrame();
        textId = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        labelDataInicial = new javax.swing.JLabel();
        textDataInicial = new javax.swing.JFormattedTextField();
        labelCategoria = new javax.swing.JLabel();
        textTitulo = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textContent = new javax.swing.JTextArea();
        labelTexto = new javax.swing.JLabel();
        textCategoria = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLembretes = new javax.swing.JTable();
        buttonConsultarCategoria = new javax.swing.JButton();
        buttonConsultarID = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        dialogInformacoes.setResizable(false);
        dialogInformacoes.setSize(new java.awt.Dimension(471, 320));

        textId.setFocusable(false);

        labelId.setText("ID:");

        labelDataInicial.setText("Data inicial:");

        textDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textDataInicial.setText(String.valueOf(LocalDate.now())
        );
        textDataInicial.setFocusable(false);

        labelCategoria.setText("Categoria:");

        textTitulo.setFocusable(false);

        labelTitulo.setText("Título:");

        textContent.setColumns(20);
        textContent.setLineWrap(true);
        textContent.setRows(5);
        textContent.setWrapStyleWord(true);
        textContent.setFocusable(false);
        jScrollPane2.setViewportView(textContent);

        labelTexto.setText("Texto:");

        textCategoria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textCategoria.setFocusable(false);

        javax.swing.GroupLayout dialogInformacoesLayout = new javax.swing.GroupLayout(dialogInformacoes.getContentPane());
        dialogInformacoes.getContentPane().setLayout(dialogInformacoesLayout);
        dialogInformacoesLayout.setHorizontalGroup(
            dialogInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInformacoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo)
                    .addComponent(labelTexto)
                    .addGroup(dialogInformacoesLayout.createSequentialGroup()
                        .addComponent(labelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCategoria))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        dialogInformacoesLayout.setVerticalGroup(
            dialogInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInformacoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(textId)
                    .addComponent(textDataInicial)
                    .addComponent(labelDataInicial)
                    .addComponent(labelCategoria)
                    .addComponent(textCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTitulo)
                .addGap(12, 12, 12)
                .addComponent(labelTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Robô - Lembretes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tableLembretes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Text", "Categoria", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLembretes);

        buttonConsultarCategoria.setText("Consultar Categoria");
        buttonConsultarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarCategoriaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonConsultarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConsultarID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonConsultarID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonConsultarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        buttonVoltar.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConsultarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarIDActionPerformed
        consultarID();
    }//GEN-LAST:event_buttonConsultarIDActionPerformed

    private void consultarID() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Insira um id"));
            Lembrete lembrete =
                    Assistente.getSingleAssistente().consultarLembrete(id);
            
            textId.setText(String.valueOf(id));
            textDataInicial.setText(String.valueOf(lembrete.getDate()));
            textCategoria.setText(lembrete.getCategoria());
            textTitulo.setText(lembrete.getTitulo());
            textContent.setText(lembrete.getTexto());
            dialogInformacoes.setTitle("Lembrete " + id);
            dialogInformacoes.setVisible(true);
        }
        catch (LembreteException le) {
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
                    "O id deve ser um inteiro!",
                    "ERRO!",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(!listagemPorCategoria) listarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void buttonConsultarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarCategoriaActionPerformed
        Object[] options = {"Importante", "Urgente"};
        
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma categoria:",
                "Consulta por categoria",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        
        if (escolha == 0) listarTabela("Importante");
        else listarTabela("Urgente");
        buttonVoltar.setVisible(true);
        listagemPorCategoria = true;
    }//GEN-LAST:event_buttonConsultarCategoriaActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        listarTabela();
        buttonVoltar.setVisible(false);
        listagemPorCategoria = false;
    }//GEN-LAST:event_buttonVoltarActionPerformed

    // Sobrescrita
    private void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tableLembretes.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Lembrete lembrete : BDLembrete.getSingleLembreteDB().getLembretes()) {
            modelo.insertRow(posLin, new Object[]{
                lembrete.getId(),
                lembrete.getTitulo(),
                lembrete.getTexto(),
                lembrete.getCategoria(),
                lembrete.getDate()
            });
            posLin++;
        }
    }
    
    // Sobrescrita
    private void listarTabela(String categoria) {
        DefaultTableModel modelo = (DefaultTableModel) tableLembretes.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for (Lembrete lembrete : BDLembrete.getSingleLembreteDB().getLembretes()) {
            if (lembrete.getCategoria() == categoria) {
               modelo.insertRow(posLin, new Object[]{
                    lembrete.getId(),
                    lembrete.getTitulo(),
                    lembrete.getTexto(),
                    lembrete.getCategoria(),
                    lembrete.getDate()
                });
                posLin++; 
            }          
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
            java.util.logging.Logger.getLogger(JanelaAssistenteViewLembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteViewLembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteViewLembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteViewLembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAssistenteViewLembrete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConsultarCategoria;
    private javax.swing.JButton buttonConsultarID;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JFrame dialogInformacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDataInicial;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableLembretes;
    private javax.swing.JFormattedTextField textCategoria;
    private javax.swing.JTextArea textContent;
    private javax.swing.JFormattedTextField textDataInicial;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
