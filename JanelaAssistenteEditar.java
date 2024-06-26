// Aluno: Victor Gabriel Lucio | RA: A2575302

import java.awt.Color;
import javax.swing.JOptionPane;

public class JanelaAssistenteEditar extends javax.swing.JFrame {

    // Singleton
    private static JanelaAssistenteEditar singleJanelaAssistenteEditar;
    
    private JanelaAssistenteEditar() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    // MÉTODO SINGLETON
    public static JanelaAssistenteEditar getSingleJanelaAssistenteEditar() {
        if (singleJanelaAssistenteEditar == null) {
            singleJanelaAssistenteEditar = new JanelaAssistenteEditar();
        }
        
        return singleJanelaAssistenteEditar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelModelo = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        labelNomeRobo = new javax.swing.JLabel();
        textNomeRobo = new javax.swing.JTextField();
        labelCorRobo = new javax.swing.JLabel();
        textCorRobo = new javax.swing.JTextField();
        separatorRobo = new javax.swing.JSeparator();
        labelTitleRobo = new javax.swing.JLabel();
        labelTitleAssistente = new javax.swing.JLabel();
        separadorAssistente = new javax.swing.JSeparator();
        labelProprietario = new javax.swing.JLabel();
        textProprietario = new javax.swing.JTextField();
        labelSensor = new javax.swing.JLabel();
        textSensor = new javax.swing.JTextField();
        textAssistenteVirtual = new javax.swing.JTextField();
        labelAssistenteVirtual = new javax.swing.JLabel();
        separatorBateria = new javax.swing.JSeparator();
        labelTitleBateria = new javax.swing.JLabel();
        labelCarga = new javax.swing.JLabel();
        textCarga = new javax.swing.JTextField();
        textCapacidade = new javax.swing.JTextField();
        labelCapacidade = new javax.swing.JLabel();
        labelVoltagem = new javax.swing.JLabel();
        textVoltagem = new javax.swing.JTextField();
        textTemperatura = new javax.swing.JTextField();
        labelTemperatura = new javax.swing.JLabel();
        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        separatorBateria1 = new javax.swing.JSeparator();
        buttonSensor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Informações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelModelo.setText("Modelo:");

        labelNomeRobo.setText("Nome do robô:");

        labelCorRobo.setText("Cor do robô:");

        labelTitleRobo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitleRobo.setText("Robô (Geral)");

        labelTitleAssistente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitleAssistente.setText("Assistente");

        labelProprietario.setText("Proprietário:");

        labelSensor.setText("Sensor:");

        textSensor.setFocusable(false);

        labelAssistenteVirtual.setText("Assistente virtual:");

        labelTitleBateria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitleBateria.setText("Bateria");

        labelCarga.setText("Carga:");

        labelCapacidade.setText("Capacidade:");

        labelVoltagem.setText("Voltagem:");

        labelTemperatura.setText("Temperatura:");

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonSensor.setText("Ligar sensor");
        buttonSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSensorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCapacidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCarga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelVoltagem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textVoltagem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTemperatura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCorRobo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCorRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNomeRobo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNomeRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSensor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelProprietario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(labelAssistenteVirtual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAssistenteVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSensor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonFechar)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitleRobo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separatorRobo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitleAssistente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separadorAssistente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitleBateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separatorBateria))))))
            .addComponent(separatorBateria1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitleRobo)
                            .addComponent(separatorRobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelNomeRobo)
                            .addComponent(textNomeRobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelModelo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCorRobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorRobo))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTitleAssistente)
                    .addComponent(separadorAssistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelProprietario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textAssistenteVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelAssistenteVirtual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSensor))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitleBateria)
                            .addComponent(separatorBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCarga))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textVoltagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelVoltagem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCapacidade)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTemperatura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(separatorBateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonSensor))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        
        if (resposta == 0) {
            dispose();
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refreshComponents();
    }//GEN-LAST:event_formWindowOpened

    private void refreshComponents() {
        // Robô
        textNomeRobo.setText(Assistente.getSingleAssistente().getNome());
        textCorRobo.setText(Assistente.getSingleAssistente().getCor());
        textModelo.setText(Assistente.getSingleAssistente().getModelo());
        
        // Assistente
        textProprietario.setText(Assistente.getSingleAssistente().getProprietario());
        textAssistenteVirtual.setText(Assistente.getSingleAssistente().getAssVirtual());
        
        refreshSensorButton();
        
        // Bateria
        int voltagem = Assistente.getSingleAssistente().getBateria().getVoltagem();
        int temperatura = Assistente.getSingleAssistente().getBateria().getTemperatura();
        int capacidade = Assistente.getSingleAssistente().getBateria().getCapacidade();
        int carga = Assistente.getSingleAssistente().getBateria().getCarga();       
        textVoltagem.setText(String.valueOf(voltagem));
        textTemperatura.setText(String.valueOf(temperatura));
        textCapacidade.setText(String.valueOf(capacidade));
        textCarga.setText(String.valueOf(carga));     
    }
    
    public void refreshSensorButton() {
        if (Assistente.getSingleAssistente().getSensor()) {
            textSensor.setText("Ligado");
            textSensor.setForeground(Color.GREEN);
            buttonSensor.setText("Desligar sensor");
        }
        else {
            textSensor.setText("Desligado");
            textSensor.setForeground(Color.RED);
            buttonSensor.setText("Ligar sensor");
        }
    }
    
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        sair();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    public void salvar() {
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente salvar as informações?",
                "Salvar informações?",
                JOptionPane.OK_CANCEL_OPTION
        );
        
        if (resposta == 0) {
           try {
               if (
                       Integer.parseInt(textCarga.getText()) >
                       Integer.parseInt(textCapacidade.getText()) 
                       ) {
                   JOptionPane.showMessageDialog(
                           null,
                           "A carga não pode ser maior que a capacidade!",
                           "ERRO!",
                           JOptionPane.ERROR_MESSAGE
                   );
                   
                   return;
               }
               
               Assistente.getSingleAssistente().setNome(textNomeRobo.getText());
               Assistente.getSingleAssistente().setModelo(textModelo.getText());
               Assistente.getSingleAssistente().setCor(textCorRobo.getText());
               Assistente.getSingleAssistente().setAssVirtual(textAssistenteVirtual.getText());
               Assistente.getSingleAssistente().setProprietario(textProprietario.getText());
               Assistente.getSingleAssistente().getBateria().setCarga(
                       Integer.parseInt(textCarga.getText())
               );
               Assistente.getSingleAssistente().getBateria().setCapacidade(
                       Integer.parseInt(textCapacidade.getText())
               );
               Assistente.getSingleAssistente().getBateria().setTemperatura(
                       Integer.parseInt(textTemperatura.getText())
               );
               Assistente.getSingleAssistente().getBateria().setVoltagem(
                       Integer.parseInt(textVoltagem.getText())
               );
               
               JOptionPane.showMessageDialog(
                       null,
                       "As informações foram salvas com sucesso!",
                       "Sucesso!",
                       JOptionPane.INFORMATION_MESSAGE
               );
           }
           catch (RoboException | BateriaException re) {
               JOptionPane.showMessageDialog(
                       null, 
                       re.getMessage(),
                       "ERRO!",
                       JOptionPane.ERROR_MESSAGE
               );
           }    
           catch (NumberFormatException ne) {
               JOptionPane.showMessageDialog(
                       null,
                       "Os campos da bateria devem ser inteiros!",
                       "ERRO!",
                       JOptionPane.ERROR_MESSAGE
               );
           }
        }
    }
    
    private void buttonSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSensorActionPerformed
        Assistente.getSingleAssistente().setSensor(!Assistente.getSingleAssistente().getSensor());
        refreshSensorButton();
    }//GEN-LAST:event_buttonSensorActionPerformed
  
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
            java.util.logging.Logger.getLogger(JanelaAssistenteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAssistenteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAssistenteEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSensor;
    private javax.swing.JLabel labelAssistenteVirtual;
    private javax.swing.JLabel labelCapacidade;
    private javax.swing.JLabel labelCarga;
    private javax.swing.JLabel labelCorRobo;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelNomeRobo;
    private javax.swing.JLabel labelProprietario;
    private javax.swing.JLabel labelSensor;
    private javax.swing.JLabel labelTemperatura;
    private javax.swing.JLabel labelTitleAssistente;
    private javax.swing.JLabel labelTitleBateria;
    private javax.swing.JLabel labelTitleRobo;
    private javax.swing.JLabel labelVoltagem;
    private javax.swing.JSeparator separadorAssistente;
    private javax.swing.JSeparator separatorBateria;
    private javax.swing.JSeparator separatorBateria1;
    private javax.swing.JSeparator separatorRobo;
    private javax.swing.JTextField textAssistenteVirtual;
    private javax.swing.JTextField textCapacidade;
    private javax.swing.JTextField textCarga;
    private javax.swing.JTextField textCorRobo;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textNomeRobo;
    private javax.swing.JTextField textProprietario;
    private javax.swing.JTextField textSensor;
    private javax.swing.JTextField textTemperatura;
    private javax.swing.JTextField textVoltagem;
    // End of variables declaration//GEN-END:variables
}
