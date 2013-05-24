/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import GestionDeInstalaciones.*;
import ServiciosAlmacenamiento.BaseDatos;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author jesusmcs
 */

/*
 ******************************************************************************
                   (c) Copyright 2013 
                   * 
                   * Moisés Gautier Gómez
                   * Julio Ros Martínez
                   * Francisco Javier Gómez del Olmo
                   * Francisco Santolalla Quiñonero
                   * Carlos Jesús Fernández Basso
                   * Alexander Moreno Borrego
                   * Jesús Manuel Contreras Siles
                   * Diego Muñoz Rio
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************
 */

public class AltaInstalacion extends javax.swing.JFrame {

    BaseDatos accesoBD;
    Border bordeError;
    PantallaPrincipal principal;

    /**
     * Creates new form AltaInstalacion
     */
    public AltaInstalacion() {
       
        initComponents();
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
    }
    
    public AltaInstalacion(BaseDatos acceso, PantallaPrincipal p) {
        accesoBD = acceso;
        initComponents();
        principal = p;
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        DireccionLabel = new javax.swing.JLabel();
        direccionComboBox = new javax.swing.JComboBox();
        numeroLabel = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        capacidadLabel = new javax.swing.JLabel();
        capacidadTextField = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Instalacion");

        Titulo.setText("Nueva Instalacion");

        nombreLabel.setText("Nombre");

        DireccionLabel.setText("Direccion");

        direccionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calle", "Avenida", "Plaza", "Carretera" }));

        numeroLabel.setText("Nº");

        capacidadLabel.setText("Capacidad");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccionLabel)
                            .addComponent(capacidadLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Guardar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(direccionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(numeroLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Cancelar)))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionLabel)
                    .addComponent(direccionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadLabel)
                    .addComponent(capacidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String errores = "";

        if (nombreTextField.getText().isEmpty()) {
            errores = errores + "Debes rellenar el campo 'Nombre'\n";
            nombreTextField.setBorder(bordeError);
        }else if (nombreTextField.getText().length() > 85) {
            errores = errores + "La longitud del campo 'Nombre' no puede superar los 45 caracteres\n";
            nombreTextField.setBorder(bordeError);
        }
        if (direccionComboBox.getSelectedItem() == "-") {
            errores = errores + "Debes rellenar el campo 'Tipo de via'\n";
            nombreTextField.setBorder(bordeError);
        }
        if (direccionTextField.getText().isEmpty() && numeroTextField.getText().isEmpty()) {
            errores = errores + "Debes rellenar el campo 'Nombre'\n";
            direccionTextField.setBorder(bordeError);
            numeroTextField.setBorder(bordeError);
        }else if ((direccionTextField.getText().length() + numeroTextField.getText().length()) > 136) {
            errores = errores + "La longitud del campo 'Direccion' no puede superar los 140 caracteres\n";
            direccionTextField.setBorder(bordeError);
            numeroTextField.setBorder(bordeError);
        }
        if (capacidadTextField.getText().isEmpty()) {
            errores = errores + "Debes rellenar el campo 'Capacidad'\n";
            capacidadTextField.setBorder(bordeError);
        }
        if (errores.isEmpty()) {
            String direccion = (String) direccionComboBox.getSelectedItem() + " " +
                    direccionTextField.getText()+ " " + numeroTextField.getText();
            boolean error = GestorInstalacion.darAltaInstalacion(accesoBD,nombreTextField.getText(),
                    Integer.parseInt(capacidadTextField.getText()),direccion);
            if (!error) {
                JOptionPane.showMessageDialog(null, "Ha habido un error en la base de datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Instalacion creado con exito",
                        "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        //this.setEnabled(false);
            this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    errores.substring(0, errores.length() - 1),
                    "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
        }
        principal.ActualizarTabla();
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(AltaInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaInstalacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel capacidadLabel;
    private javax.swing.JTextField capacidadTextField;
    private javax.swing.JComboBox direccionComboBox;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    // End of variables declaration//GEN-END:variables
}
