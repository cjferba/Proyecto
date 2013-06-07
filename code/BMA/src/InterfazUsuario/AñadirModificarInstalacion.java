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
public class AñadirModificarInstalacion extends javax.swing.JFrame {
    private PrincipalInstalaciones pP;
    private BaseDatos bd;
    private Border bordeError;
    private int id;
    private String nombre;
    private String capacidad;
    private String localizacion;

    /**
     * Creates new form AltaInstalacion
     */
    public AñadirModificarInstalacion(PrincipalInstalaciones pP, BaseDatos bd) {
        initComponents();
        this.bd = bd;
        this.pP = pP;
        setLocationRelativeTo(pP);
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        Titulo1.setVisible(false);
        modificar.setVisible(false);
    }

    public AñadirModificarInstalacion(PrincipalInstalaciones pP, BaseDatos bd, int id, String nombre, String capacidad, String localizacion) {
        initComponents();
        this.bd = bd;
        this.pP = pP;
        setLocationRelativeTo(pP);
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        Titulo.setVisible(false);
        aceptar.setVisible(false);
        this.id = id;
        this.nombre = nombre;
        nombreTextField.setText(nombre);
        this.capacidad = capacidad;
        capacidadTextField.setText(capacidad);
        this.localizacion = localizacion;
        direccionTextField.setText(localizacion.substring(localizacion.indexOf("0"), localizacion.length()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        DireccionLabel = new javax.swing.JLabel();
        direccionComboBox = new javax.swing.JComboBox();
        direccionTextField = new javax.swing.JTextField();
        capacidadLabel = new javax.swing.JLabel();
        capacidadTextField = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Instalacion");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo.setText("Nueva instalacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(Titulo, gridBagConstraints);

        nombreLabel.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 5);
        jPanel1.add(nombreLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(nombreTextField, gridBagConstraints);

        DireccionLabel.setText("Direccion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 5);
        jPanel1.add(DireccionLabel, gridBagConstraints);

        direccionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calle", "Avenida", "Plaza", "Carretera" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(direccionComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(direccionTextField, gridBagConstraints);

        capacidadLabel.setText("Capacidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 5);
        jPanel1.add(capacidadLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(capacidadTextField, gridBagConstraints);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(aceptar, gridBagConstraints);

        modificar.setText("Aceptar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(modificar, gridBagConstraints);

        Titulo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo1.setText("Modificar instalacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(Titulo1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String campos = "";

        if (!nombreTextField.getText().matches("[a-zA-Z0-9\\-/]{1,45}")) {
            campos = campos + "'Nombre',";
            nombreTextField.setBorder(bordeError);
        }
        if (direccionComboBox.getSelectedItem().equals("-")) {
            campos = campos + "'Tipo de via',";
            nombreTextField.setBorder(bordeError);
        }
        if (direccionTextField.getText().isEmpty()) {
            campos = campos + "'Direccion',";
            direccionTextField.setBorder(bordeError);
        } else if (direccionTextField.getText().length() > 136) {
            campos = campos + "'Direccion',";
            direccionTextField.setBorder(bordeError);
        }
        if (!capacidadTextField.getText().matches("[1-9][0-9]*")) {
            campos = campos + "'Capacidad',";
            capacidadTextField.setBorder(bordeError);
        }
        if (campos.isEmpty()) {
            String direccion = (String) direccionComboBox.getSelectedItem() + " "
                    + direccionTextField.getText();
            boolean error = GestorInstalacion.darAltaInstalacion(this.bd, nombreTextField.getText(),
                    Integer.parseInt(capacidadTextField.getText()), direccion);
            if (!error) {
                JOptionPane.showMessageDialog(null, "Ha habido un error en la base de datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Instalacion creado con exito",
                        "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                pP.actualizarTablaInstalaciones();
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    campos.substring(0, campos.length() - 1),
                    "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (!nombreTextField.getText().equals(nombre) || !capacidadTextField.getText().equals(capacidad)
                || !direccionTextField.getText().equals(localizacion)) {
            if (nombreTextField.getText().isEmpty() || capacidadTextField.getText().isEmpty() || direccionTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio",
                        "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean exito = GestorInstalacion.modificaInstalacion(this.bd, id,
                        nombreTextField.getText(), capacidadTextField.getText(),
                        direccionComboBox.getSelectedItem().toString() + " " + direccionTextField.getText());

                if (!exito) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error en la base de datos",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Instalacion modificada con exito",
                            "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                    pP.actualizarTablaInstalaciones();
                }
                this.dispose();
            }
        }
    }//GEN-LAST:event_modificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel capacidadLabel;
    private javax.swing.JTextField capacidadTextField;
    private javax.swing.JComboBox direccionComboBox;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables
}
