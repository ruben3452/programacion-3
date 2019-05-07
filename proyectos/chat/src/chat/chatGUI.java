/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import java.awt.event.ActionEvent;

public class chatGUI extends javax.swing.JFrame {

    
    private GuiAgent owner;
    public final int TYPE = 0;
    
    public chatGUI(GuiAgent a) {
        initComponents();
        owner = a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaNicks = new javax.swing.JTextArea();
        textoEnviar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoChat = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        listaNicks.setEditable(false);
        listaNicks.setColumns(5);
        listaNicks.setRows(5);
        jScrollPane3.setViewportView(listaNicks);

        textoEnviar.setText("mensaje");
        textoEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoEnviarMouseClicked(evt);
            }
        });
        textoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnviarActionPerformed(evt);
            }
        });
        textoEnviar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textoEnviarFocusGained(evt);
            }
        });

        textoChat.setEditable(false);
        textoChat.setColumns(20);
        textoChat.setRows(5);
        jScrollPane1.setViewportView(textoChat);

        jTextField1.setText("enviar al usuario deseado");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        Enviar.setText("Responder");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoEnviarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoEnviarFocusGained
        this.textoEnviar.setText("");
    }//GEN-LAST:event_textoEnviarFocusGained

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        this.jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void textoEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEnviarMouseClicked
        this.textoEnviar.setText("");
    }//GEN-LAST:event_textoEnviarMouseClicked
   
    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        GuiEvent guieEvent = new GuiEvent(this, TYPE);
        guieEvent.addParameter(jTextField1.getText());
        guieEvent.addParameter(textoEnviar.getText());
        owner.postGuiEvent(guieEvent);
        jTextField1.setText("enviar a");
        textoEnviar.setText("");
    }//GEN-LAST:event_EnviarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.out.println("Adios");
        this.owner.doDelete();
    }//GEN-LAST:event_formWindowClosed

    private void textoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEnviarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextArea listaNicks;
    public javax.swing.JTextArea textoChat;
    private javax.swing.JTextField textoEnviar;
    // End of variables declaration//GEN-END:variables
}