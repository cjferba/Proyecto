
package InterfazUsuario;

import ServiciosAlmacenamiento.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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

 public class EstadisticasJugador extends javax.swing.JFrame {  
   
    BaseDatos accesoBD;
    ResultSet retset; 
    JFreeChart Grafica;
    List partidosJug = new ArrayList();
    ChartPanel Panel ;
    JFrame Ventana ;
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
            
    public EstadisticasJugador() {
        initComponents();
    }
    
     public EstadisticasJugador(BaseDatos acceso, ResultSet rst, String jugadorElegido) {
        
        accesoBD = acceso;
        retset = rst;
        initComponents();
        nombreAlumnoElegido.setText(jugadorElegido);
        try {
            actualizaTablaEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(EstadisticasEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    private  void actualizaTablaEstadisticas() throws SQLException {
        
       if(retset == null)
           JOptionPane.showMessageDialog(null,"No hay datos que mostrar para el jugador");  
       else{ 
             DefaultTableModel dtm = new DefaultTableModel();
             dtm.addColumn("Partido");
             dtm.addColumn("Asistencias");
             dtm.addColumn("Rebotes ofensivos");
             dtm.addColumn("Rebotes defensivos");
             dtm.addColumn("Robos");
             dtm.addColumn("Perdidas");
             dtm.addColumn("Puntos");

             Object[] fila = new Object[7];

             while(retset.next()){       
                 
                 int idEquipoLoc = retset.getInt(1);
                 String consulta1 = "SELECT nombre FROM equipo WHERE idEquipo='"+idEquipoLoc+"'";
                 ResultSet rst1 = accesoBD.ejecutaConsulta(consulta1); 
                 
                 int idEquipoVis = retset.getInt(2);
                 String consulta2 = "SELECT nombre FROM equipo WHERE idEquipo='"+idEquipoVis+"'";
                 ResultSet rst2 = accesoBD.ejecutaConsulta(consulta2);
                 
                 if(rst1.next()&& rst2.next()){
                    String nombrePartido = (rst1.getString(1)+"-"+rst2.getString(1));
                    fila[0] = nombrePartido;
                    
                    partidosJug.add(nombrePartido);
                 }
                 fila[1] = retset.getString(3);
                 fila[2] = retset.getString(4);
                 fila[3] = retset.getString(5);
                 fila[4] = retset.getString(6);
                 fila[5] = retset.getString(7);
                 fila[6] = retset.getString(8);

                 dtm.addRow(fila);
             }

             tablaJugadoresEstadisticas.setModel(dtm);
             retset.first();
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

        botonSalir = new javax.swing.JToggleButton();
        panelTabEstJug = new javax.swing.JScrollPane();
        tablaJugadoresEstadisticas = new javax.swing.JTable();
        jugadorLab = new javax.swing.JLabel();
        nombreAlumnoElegido = new javax.swing.JLabel();
        verGraficas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        panelTabEstJug.setAutoscrolls(true);

        tablaJugadoresEstadisticas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaJugadoresEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Partido ", "Asistencias", "Rebotes ofensivos", "Rebotes defensivos", "Robos", "Perdidas", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaJugadoresEstadisticas.setColumnSelectionAllowed(true);
        panelTabEstJug.setViewportView(tablaJugadoresEstadisticas);
        tablaJugadoresEstadisticas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jugadorLab.setText("Jugador:");

        verGraficas.setText("Graficas");
        verGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(verGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jugadorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreAlumnoElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelTabEstJug, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadorLab)
                    .addComponent(nombreAlumnoElegido))
                .addGap(32, 32, 32)
                .addComponent(panelTabEstJug, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(verGraficas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
        this.setVisible(false);
        Ventana.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void verGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraficasActionPerformed
 
        int i=0;
        try {
           while(retset.next()){
                Datos.addValue(retset.getInt(8), "Puntos", (Comparable) partidosJug.get(i));
                i++;
           }
        } catch (SQLException ex) {
            Logger.getLogger(EstadisticasJugador.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        Grafica = ChartFactory.createBarChart3D("Gráfica de puntos conseguidos", "Partidos jugados", "Puntos conseguidos",
                                               Datos, PlotOrientation.HORIZONTAL, true, true, false);
        
        Panel = new ChartPanel(Grafica);
        Ventana = new JFrame("Gráficas");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_verGraficasActionPerformed

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
            java.util.logging.Logger.getLogger(EstadisticasJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EstadisticasJugador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonSalir;
    private javax.swing.JLabel jugadorLab;
    private javax.swing.JLabel nombreAlumnoElegido;
    private javax.swing.JScrollPane panelTabEstJug;
    private javax.swing.JTable tablaJugadoresEstadisticas;
    private javax.swing.JButton verGraficas;
    // End of variables declaration//GEN-END:variables
}
