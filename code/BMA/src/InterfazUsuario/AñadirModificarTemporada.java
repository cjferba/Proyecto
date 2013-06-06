/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import GestionDeTemporadas.GestorTemporadas;
import GestionDeTemporadas.Temporada;
import ServiciosAlmacenamiento.BaseDatos;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class AñadirModificarTemporada extends javax.swing.JFrame {
    private PrincipalTemporadas pP;
    private BaseDatos bd;
    private int aAnt;
    private double impAnt;
    private String inicioAnt;
    private String finAnt;

    /**
     * Creates new form NuevaTemporada
     */
    public AñadirModificarTemporada(PrincipalTemporadas pP, BaseDatos bd) {
        initComponents();
        setLocationRelativeTo(pP);
        this.pP = pP;
        this.bd = bd;
        this.modLabel.setVisible(false);
        this.modTitulo.setVisible(false);
        this.botonMod.setVisible(false);
        setTitle("Nueva temporada");
        
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        chooserCurso.setYear(ano);
        labelCurso.setText(ano+"/"+(ano+1));
    }
    
    public AñadirModificarTemporada(PrincipalTemporadas pP, BaseDatos bd, int a, double importe, String inicio, String fin){
        initComponents();
        setLocationRelativeTo(pP);
        this.pP = pP;
        this.bd = bd;
        this.aAnt = a;
        this.campoImporte.setText(Double.toString(importe));
        this.impAnt = importe;
        this.inicioAnt = inicio;
        this.finAnt = fin;
        
        this.nuevoLabel.setVisible(false);
        this.nuevoTitulo.setVisible(false);
        this.botonAceptar.setVisible(false);
        setTitle("Nodificar temporada");
        
        chooserCurso.setYear(a);
        labelCurso.setText(a+"/"+(a+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nuevoLabel = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();
        chooserCurso = new com.toedter.calendar.JYearChooser();
        nuevoTitulo = new javax.swing.JLabel();
        modTitulo = new javax.swing.JLabel();
        modLabel = new javax.swing.JLabel();
        botonMod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectorFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        selectorFechaFin = new com.toedter.calendar.JDateChooser();
        campoImporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Temporada");
        setResizable(false);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar curso:");

        nuevoLabel.setText("Se creará la temporada:");

        labelCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCurso.setText("2012/2013");

        chooserCurso.setYear(0);
        chooserCurso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chooserCursoPropertyChange(evt);
            }
        });

        nuevoTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nuevoTitulo.setText("Nueva Temporada");

        modTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modTitulo.setText("Modificar Temporada");

        modLabel.setText("Se modificará a la temporada:");

        botonMod.setText("Aceptar");
        botonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModActionPerformed(evt);
            }
        });

        jLabel2.setText("Inicio:");

        jLabel3.setText("Fin:");

        campoImporte.setText("0.00");
        campoImporte.setMaximumSize(new java.awt.Dimension(35, 2147483647));
        campoImporte.setMinimumSize(new java.awt.Dimension(35, 20));
        campoImporte.setPreferredSize(new java.awt.Dimension(35, 20));

        jLabel4.setText("Importe Mensual:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooserCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modLabel)
                            .addComponent(nuevoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCancelar)
                            .addComponent(labelCurso))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectorFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectorFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(107, Short.MAX_VALUE)
                    .addComponent(nuevoTitulo)
                    .addContainerGap(106, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(97, Short.MAX_VALUE)
                    .addComponent(modTitulo)
                    .addContainerGap(97, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(botonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(chooserCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(campoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectorFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectorFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoLabel)
                    .addComponent(labelCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(nuevoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 175, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(modTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 175, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(botonMod)
                    .addGap(22, 22, 22)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooserCursoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chooserCursoPropertyChange
        int aux1 = chooserCurso.getYear();
        int aux2 = chooserCurso.getYear()+1;
        String auxCurso = Integer.toString(aux1)+"/"+Integer.toString(aux2);
        
        labelCurso.setText(auxCurso);
        
        GregorianCalendar inicio = new GregorianCalendar(chooserCurso.getYear(), 8, 1);
        GregorianCalendar fin = new GregorianCalendar(chooserCurso.getYear(), 4, 31);
        
        selectorFechaInicio.setDate(inicio.getTime());
        selectorFechaFin.setDate(fin.getTime());
    }//GEN-LAST:event_chooserCursoPropertyChange

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        int curso = chooserCurso.getYear();
        try {
            Date date = selectorFechaInicio.getDate();
            String fechaInicio = String.format("%1$tY-%1$tm-%1$td", date);
            date = selectorFechaFin.getDate();
            String fechaFin = String.format("%1$tY-%1$tm-%1$td", date);
            
            Temporada t = new Temporada(curso, fechaInicio, fechaFin, Double.parseDouble(campoImporte.getText()));
            GestorTemporadas.InsertarTemporada(this.bd, t);
            //GestorTemporadas.InsertarTemporada(curso, this.bd);
            pP.actualizaComboBoxTemporadas();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AñadirModificarTemporada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModActionPerformed
        int curso = chooserCurso.getYear();
        if (curso != aAnt || impAnt != Double.parseDouble(campoImporte.getText())) {
            try {
                Date date = selectorFechaInicio.getDate();
                String fechaInicio = String.format("%1$tY-%1$tm-%1$td", date);
                date = selectorFechaFin.getDate();
                String fechaFin = String.format("%1$tY-%1$tm-%1$td", date);
            
                Temporada t = new Temporada(curso, fechaInicio, fechaFin, Double.parseDouble(campoImporte.getText()));
                
                GestorTemporadas.modificarTemporada(this.bd, t, aAnt);
                //GestorTemporadas.modificarTemporada(this.bd, curso, aAnt);
                pP.actualizaComboBoxTemporadas();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonModActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonMod;
    private javax.swing.JTextField campoImporte;
    private com.toedter.calendar.JYearChooser chooserCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel modLabel;
    private javax.swing.JLabel modTitulo;
    private javax.swing.JLabel nuevoLabel;
    private javax.swing.JLabel nuevoTitulo;
    private com.toedter.calendar.JDateChooser selectorFechaFin;
    private com.toedter.calendar.JDateChooser selectorFechaInicio;
    // End of variables declaration//GEN-END:variables
}
