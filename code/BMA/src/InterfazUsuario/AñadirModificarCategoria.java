package InterfazUsuario;

import GestionDeCategorias.Categoria;
import GestionDeCategorias.GestorCategorias;
import ServiciosAlmacenamiento.BaseDatos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
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

public class AñadirModificarCategoria extends javax.swing.JFrame {
    private PrincipalCategorias pP;
    private BaseDatos bd;
    private String tAnt, dAnt;
    
    /**
     * Creates new form NuevaCategoria
     */
    public AñadirModificarCategoria(PrincipalCategorias pP, BaseDatos bd) {
        initComponents();
        setLocationRelativeTo(pP);
        this.pP = pP;
        this.bd = bd;
        this.jLabel4.setVisible(false);
        this.botoGuardar.setVisible(false);
        setTitle("Añadir categoría");
    }
    
    public AñadirModificarCategoria(PrincipalCategorias pP, BaseDatos bd, String t, String d) {
        initComponents();
        this.setLocationRelativeTo(pP);
        this.bd = bd;
        this.pP = pP;
        this.textTipo.setText(t);
        this.textDesc.setText(d);
        this.tAnt = t;
        this.dAnt = d;
        this.jLabel1.setVisible(false);
        this.botoAceptar.setVisible(false);
        setTitle("Modificar categoría");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textDesc = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botoAceptar = new javax.swing.JButton();
        botoGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nueva Categoria");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modificar Categoria");

        jLabel2.setText("Tipo:");

        textTipo.setMinimumSize(new java.awt.Dimension(100, 20));
        textTipo.setPreferredSize(new java.awt.Dimension(100, 20));

        jLabel3.setText("Descripcion:");

        textDesc.setMinimumSize(new java.awt.Dimension(100, 20));
        textDesc.setPreferredSize(new java.awt.Dimension(100, 20));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botoAceptar.setText("Aceptar");
        botoAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoAceptarActionPerformed(evt);
            }
        });

        botoGuardar.setText("Aceptar");
        botoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botoAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(104, 104, 104)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(167, Short.MAX_VALUE)
                    .addComponent(botoGuardar)
                    .addGap(90, 90, 90)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botoAceptar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 95, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(97, Short.MAX_VALUE)
                    .addComponent(botoGuardar)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoAceptarActionPerformed
        if(!textTipo.getText().isEmpty() && !textDesc.getText().isEmpty()){
            try {
                GestorCategorias.InsertarDatosCategorias(this.bd, textTipo.getText(), textDesc.getText());
                pP.actualizarTabla();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(AñadirModificarCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botoAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoGuardarActionPerformed
        if(!textTipo.getText().isEmpty() && !textDesc.getText().isEmpty()){
            if(!tAnt.equals(textTipo.getText()) || !dAnt.equals(textDesc.getText())) {
                Categoria cNuevo = new Categoria(textTipo.getText(), textDesc.getText());
                Categoria cViejo = new Categoria(tAnt, dAnt);
                try {
                    GestorCategorias.ModificarCategoria(this.bd, cNuevo, cViejo);
                    pP.actualizarTabla();
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(AñadirModificarCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe modificar algun campo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botoGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoAceptar;
    private javax.swing.JButton botoGuardar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textDesc;
    private javax.swing.JTextField textTipo;
    // End of variables declaration//GEN-END:variables

    
}
