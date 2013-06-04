package InterfazUsuario;

import GestionDeUsuarios.GestorUsuarios;
import ServiciosAlmacenamiento.BaseDatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */

/******************************************************************************
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
 ******************************************************************************/

public class EstadisticasEntrenador extends javax.swing.JFrame {

    BaseDatos accesoBD;
    ResultSet retset;   
    
    public EstadisticasEntrenador() {
        
        initComponents();
    }
    
    public EstadisticasEntrenador(BaseDatos acceso, ResultSet rst, String usuarioElegido) {
        
        accesoBD = acceso;
        retset = rst;
        initComponents();
        nombreApellidosEntrenador.setText(usuarioElegido);
        try {
            actualizaTablaEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(EstadisticasEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    private  void actualizaTablaEstadisticas() throws SQLException {
       
       if(retset == null)
           JOptionPane.showMessageDialog(null,"No hay datos que mostrar para el entrenador");  
       else{ 
             DefaultTableModel dtm = new DefaultTableModel();
             dtm.addColumn("Fecha");
             dtm.addColumn("Equipo local");
             dtm.addColumn("Equipo visitante");
             dtm.addColumn("Resultado local");
             dtm.addColumn("Resultado visitante");

             Object[] fila = new Object[5];

             while(retset.next()){       
                 
                 fila[0] = retset.getString(1);
                 
                 int idEquipoLoc = retset.getInt(2);
                 String consulta1 = "SELECT nombre FROM equipo WHERE idEquipo='"+idEquipoLoc+"'";
                 ResultSet rst1 = accesoBD.ejecutaConsulta(consulta1); 
                 if(rst1.next())
                    fila[1] = rst1.getString(1);
                 
                 int idEquipoVis = retset.getInt(3);
                 String consulta2 = "SELECT nombre FROM equipo WHERE idEquipo='"+idEquipoVis+"'";
                 ResultSet rst2 = accesoBD.ejecutaConsulta(consulta2);
                 if(rst2.next())
                    fila[2] = rst2.getString(1);

                 fila[3] = retset.getString(4);
                 fila[4] = retset.getString(5);

                 dtm.addRow(fila);
             }

             tablaEntrenadorEstadisticas.setModel(dtm);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabEstEntr = new javax.swing.JScrollPane();
        tablaEntrenadorEstadisticas = new javax.swing.JTable();
        botonSalir = new javax.swing.JToggleButton();
        entrenadorLab = new javax.swing.JLabel();
        nombreApellidosEntrenador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTabEstEntr.setAutoscrolls(true);

        tablaEntrenadorEstadisticas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaEntrenadorEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Equipo local", "Equipo visitante", "Resultado local", "Resultado visitante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEntrenadorEstadisticas.setColumnSelectionAllowed(true);
        panelTabEstEntr.setViewportView(tablaEntrenadorEstadisticas);
        tablaEntrenadorEstadisticas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        entrenadorLab.setText("Entrenador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelTabEstEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrenadorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombreApellidosEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrenadorLab)
                    .addComponent(nombreApellidosEntrenador))
                .addGap(33, 33, 33)
                .addComponent(panelTabEstEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonSalir)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(EstadisticasEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EstadisticasEntrenador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonSalir;
    private javax.swing.JLabel entrenadorLab;
    private javax.swing.JLabel nombreApellidosEntrenador;
    private javax.swing.JScrollPane panelTabEstEntr;
    private javax.swing.JTable tablaEntrenadorEstadisticas;
    // End of variables declaration//GEN-END:variables
}
