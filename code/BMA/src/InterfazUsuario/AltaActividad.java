/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import ServiciosAlmacenamiento.BaseDatos;
import GestionActividades.*;
import java.sql.*;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author jesusmcs
 */
public class AltaActividad extends javax.swing.JFrame {

    BaseDatos accesoBD;
    Border bordeError;

    /**
     * Creates new form AltaActividad
     */
    public AltaActividad() {
        initComponents();
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        ((JTextFieldDateEditor) fechaInicioDateChooser.getComponents()[1]).setEditable(false);
        ((JTextFieldDateEditor) fechaFinDateChooser.getComponents()[1]).setEditable(false);
    }

    public AltaActividad(BaseDatos acceso) {
        accesoBD = acceso;
        initComponents();
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        ((JTextFieldDateEditor) fechaInicioDateChooser.getComponents()[1]).setEditable(false);
        ((JTextFieldDateEditor) fechaFinDateChooser.getComponents()[1]).setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaActividadLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        fechaInicioLabel = new javax.swing.JLabel();
        fechaInicioDateChooser = new com.toedter.calendar.JDateChooser();
        fechaFinLabel = new javax.swing.JLabel();
        fechaFinDateChooser = new com.toedter.calendar.JDateChooser();
        descripcionLabel = new javax.swing.JLabel();
        descripcionScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        plazasLabel = new javax.swing.JLabel();
        plazasTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        temporadaComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta actividad");

        NuevaActividadLabel.setText("Nueva Actividad");

        nombreLabel.setText("Nombre");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        fechaInicioLabel.setText("Fecha inicio");

        fechaInicioDateChooser.setDateFormatString("dd-MM-yyyy");

        fechaFinLabel.setText("Fecha Fin");

        fechaFinDateChooser.setDateFormatString("dd-MM-yyyy");

        descripcionLabel.setText("Descripcion");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        descripcionScrollPane.setViewportView(jTextArea1);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        plazasLabel.setText("Plazas");

        jLabel2.setText("Temporada");

        temporadaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011/2012", "2012/2013" }));
        temporadaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temporadaComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plazasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plazasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(temporadaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechaInicioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaInicioDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(fechaFinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaFinDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(descripcionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descripcionLabel)
                                .addComponent(NuevaActividadLabel))
                            .addGap(267, 267, 267))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaFinLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NuevaActividadLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaInicioLabel)
                            .addComponent(fechaInicioDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fechaFinDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plazasLabel)
                    .addComponent(plazasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(temporadaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(descripcionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String error = "";
        ResultSet retset;

        float precioSocio = 50;
        float precioNoSocio = 70;
        int idTemporada = 0;

        if (nombreTextField.getText().isEmpty()) {
            error = error + "Debes rellenar el campo 'Nombre'\n";
            nombreTextField.setBorder(bordeError);
        } else if (nombreTextField.getText().length() > 45) {
            error = error + "La longitud del campo 'Nombre' no puede superar los 45 caracteres\n";
            nombreTextField.setBorder(bordeError);
        }
        Date dateFromDateChooser = fechaInicioDateChooser.getDate();
        String dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser);
        if (dateString.equals("null-null-null")) {
            error = error + "Debes rellenar el campo 'Fecha de inicio'\n";
            fechaInicioDateChooser.setBorder(bordeError);
        }
        Date dateFromDateChooser1 = fechaFinDateChooser.getDate();
        String dateString1 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1);
        if (dateString1.equals("null-null-null")) {
            error = error + "Debes rellenar el campo 'Fecha de fin'\n";
            fechaFinDateChooser.setBorder(bordeError);
        }
        if (plazasTextField.getText().isEmpty()) {
            error = error + "Debes rellenar el campo 'Plazas'\n";
            plazasTextField.setBorder(bordeError);
        }

        if (jTextArea1.getText().isEmpty()) {
            error = error + "Debes rellenar el campo 'Plazas'\n";
            jTextArea1.setBorder(bordeError);
        }

        if (error.isEmpty()) {

            String consulta = "SELECT idTemporada FROM temporada"
                    + " WHERE ";
            consulta = consulta + "curso = " + "'" + temporadaComboBox.getSelectedItem().toString() + "'";

            System.out.print("\n\n" + consulta);

            retset = accesoBD.ejecutaConsulta(consulta);

            //System.out.print("\n\n" + retset);
            try {
                if(retset.next()){
                    idTemporada = retset.getInt("idTemporada");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(AltaActividad.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("\n\n cod temporada " + idTemporada);

            boolean errores = GestorActividad.darAltaActividad(accesoBD, jTextArea1.getText(), Integer.parseInt(plazasTextField.getText()),
                    precioSocio, precioNoSocio, idTemporada,
                    dateFromDateChooser, dateFromDateChooser1, nombreTextField.getText());
            if (!errores) {
                JOptionPane.showMessageDialog(null, "Ha habido un error en la base de datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Actividad creada con exito",
                        "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.setEnabled(false);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    error.substring(0, error.length() - 1),
                    "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void temporadaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temporadaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temporadaComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AltaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaActividad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel NuevaActividadLabel;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JScrollPane descripcionScrollPane;
    private com.toedter.calendar.JDateChooser fechaFinDateChooser;
    private javax.swing.JLabel fechaFinLabel;
    private com.toedter.calendar.JDateChooser fechaInicioDateChooser;
    private javax.swing.JLabel fechaInicioLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel plazasLabel;
    private javax.swing.JTextField plazasTextField;
    private javax.swing.JComboBox temporadaComboBox;
    // End of variables declaration//GEN-END:variables
}
