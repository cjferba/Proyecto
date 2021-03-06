/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import GestionDeAlumnos.GestorAlumnos;
import ServiciosAlmacenamiento.BaseDatos;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Alex
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
public class AñadirModificarAlumno extends javax.swing.JFrame {

    private PrincipalJugadores pP;
    private BaseDatos bd;
    private Border bordeOriginal, bordeDatePicker, bordeError;
    private String nombreAnt, primerApellidoAnt, segundoApellidoAnt, cuentaCorrienteAnt, domicilioAnt, localidadAnt,
            provinciaAnt, colegioAnt, nombrePadreAnt, nombreMadreAnt, emailAnt, tallaAlumnoAnt, sexoAnt;
    private int codPostalAnt, telFijoAnt, telMovilAnt;
    private Calendar fechaNacAnt;

    /**
     * Creates new form AnadorAlumno
     */
    public AñadirModificarAlumno(PrincipalJugadores pP, BaseDatos bd) {
        initComponents();
        this.pP = pP;
        this.bd = bd;
        setLocationRelativeTo(pP);
        bordeOriginal = nombre.getBorder();
        bordeDatePicker = fechaNac.getBorder();
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        ((JTextFieldDateEditor) fechaNac.getComponents()[1]).setEditable(false);
        jLabel4.setVisible(false);
        botonModificar.setVisible(false);
        setTitle("Añadir jugador");
    }

    public AñadirModificarAlumno(PrincipalJugadores pP, BaseDatos bd, String nombre, String primerApellido, String segundoApellido, String fechaNac,
            String cuentaCorriente, String domicilio, String localidad, int codPostal, String provincia, String colegio,
            String nombrePadre, String nombreMadre, int telFijo, int telMovil, String email, String tallaAlumno, String sexo) {
        initComponents();
        this.pP = pP;
        this.bd = bd;
        setLocationRelativeTo(pP);
        bordeOriginal = this.nombre.getBorder();
        bordeDatePicker = this.fechaNac.getBorder();
        bordeError = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        ((JTextFieldDateEditor) this.fechaNac.getComponents()[1]).setEditable(false);
        jLabel2.setVisible(false);
        botonAnadir.setVisible(false);
        setTitle("Modificar jugador");
        nombreAnt = nombre;
        this.nombre.setText(nombre);
        primerApellidoAnt = primerApellido;
        this.primerApellido.setText(primerApellido);
        segundoApellidoAnt = segundoApellido;
        this.segundoApellido.setText(segundoApellido);
        String[] fecha = fechaNac.split("-");
        Calendar date = new GregorianCalendar(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]) - 1, Integer.parseInt(fecha[2]));
        fechaNacAnt = date;
        this.fechaNac.setDate(date.getTime());
        cuentaCorrienteAnt = cuentaCorriente;
        this.numCuenta.setText(cuentaCorriente);
        domicilioAnt = domicilio;
        this.domicilio.setText(domicilioAnt);
        localidadAnt = localidad;
        this.localidad.setText(localidad);
        codPostalAnt = codPostal;
        this.codPostal.setText(String.valueOf(codPostal));
        provinciaAnt = provincia;
        this.provincia.setText(provincia);
        colegioAnt = colegio;
        this.colegio.setText(colegio);
        nombrePadreAnt = nombrePadre;
        this.nombrePadre.setText(nombrePadre);
        nombreMadreAnt = nombreMadre;
        this.nombreMadre.setText(nombreMadre);
        telFijoAnt = telFijo;
        this.telFijo.setText(String.valueOf(telFijo));
        telMovilAnt = telMovil;
        this.telMovil.setText(String.valueOf(telMovil));
        emailAnt = email;
        this.email.setText(email);
        tallaAlumnoAnt = tallaAlumno;
        this.talla.setSelectedItem(tallaAlumno);
        sexoAnt = sexo;
        if (sexo.equals("M")) {
            this.sexoAlumno.setSelectedItem("Masculino");
        } else {
            this.sexoAlumno.setSelectedItem("Femenino");
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        participante = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        segundoApellidoLabel = new javax.swing.JLabel();
        segundoApellido = new javax.swing.JTextField();
        talla = new javax.swing.JComboBox();
        tallaLabel = new javax.swing.JLabel();
        fechaNac = new com.toedter.calendar.JDateChooser();
        fechaNacLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sexoAlumno = new javax.swing.JComboBox();
        domicilioLabel = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        localidadLabel = new javax.swing.JLabel();
        localidad = new javax.swing.JTextField();
        codPostalLabel = new javax.swing.JLabel();
        codPostal = new javax.swing.JTextField();
        provinciaLabel = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        colegioLabel = new javax.swing.JLabel();
        colegio = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        datosFamiliares = new javax.swing.JLabel();
        nombrePadreLabel = new javax.swing.JLabel();
        nombrePadre = new javax.swing.JTextField();
        nombreMadreLabel = new javax.swing.JLabel();
        nombreMadre = new javax.swing.JTextField();
        telFijoLabel = new javax.swing.JLabel();
        telFijo = new javax.swing.JTextField();
        telMovilLabel = new javax.swing.JLabel();
        telMovil = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        numCuentaLabel = new javax.swing.JLabel();
        numCuenta = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        botonAnadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 480));
        setResizable(false);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modificar Jugador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nuevo Jugador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel2, gridBagConstraints);

        participante.setBackground(new java.awt.Color(191, 138, 138));
        participante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        participante.setForeground(new java.awt.Color(242, 236, 236));
        participante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        participante.setText("PARTICIPANTE");
        participante.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        jPanel2.add(participante, gridBagConstraints);

        nombreLabel.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(nombreLabel, gridBagConstraints);

        nombre.setColumns(20);
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(nombre, gridBagConstraints);

        primerApellidoLabel.setText("Primer apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 5);
        jPanel2.add(primerApellidoLabel, gridBagConstraints);

        primerApellido.setColumns(20);
        primerApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                primerApellidoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(primerApellido, gridBagConstraints);

        segundoApellidoLabel.setText("Segundo apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 5);
        jPanel2.add(segundoApellidoLabel, gridBagConstraints);

        segundoApellido.setColumns(20);
        segundoApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                segundoApellidoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(segundoApellido, gridBagConstraints);

        talla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SinMedir", "6", "8", "10", "12", "XS", "S", "M", "L", "XL", "XXL" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(talla, gridBagConstraints);

        tallaLabel.setText("Talla:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(tallaLabel, gridBagConstraints);

        fechaNac.setMinimumSize(new java.awt.Dimension(40, 20));
        fechaNac.setPreferredSize(new java.awt.Dimension(120, 20));
        fechaNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(fechaNac, gridBagConstraints);

        fechaNacLabel.setText("Fecha Nacimiento: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(fechaNacLabel, gridBagConstraints);

        jLabel1.setText("Sexo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        sexoAlumno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(sexoAlumno, gridBagConstraints);

        domicilioLabel.setText("Domicilio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(domicilioLabel, gridBagConstraints);

        domicilio.setColumns(50);
        domicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                domicilioFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(domicilio, gridBagConstraints);

        localidadLabel.setText("Localidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(localidadLabel, gridBagConstraints);

        localidad.setColumns(20);
        localidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                localidadFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(localidad, gridBagConstraints);

        codPostalLabel.setText("Codigo Postal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(codPostalLabel, gridBagConstraints);

        codPostal.setColumns(20);
        codPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codPostalFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(codPostal, gridBagConstraints);

        provinciaLabel.setText("Provincia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(provinciaLabel, gridBagConstraints);

        provincia.setColumns(20);
        provincia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                provinciaFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(provincia, gridBagConstraints);

        colegioLabel.setText("Colegio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(colegioLabel, gridBagConstraints);

        colegio.setColumns(25);
        colegio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                colegioFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(colegio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(separador, gridBagConstraints);

        datosFamiliares.setBackground(new java.awt.Color(134, 190, 134));
        datosFamiliares.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datosFamiliares.setForeground(new java.awt.Color(242, 236, 236));
        datosFamiliares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosFamiliares.setText("DATOS FAMILIARES");
        datosFamiliares.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        jPanel2.add(datosFamiliares, gridBagConstraints);

        nombrePadreLabel.setText("Nombre Padre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(nombrePadreLabel, gridBagConstraints);

        nombrePadre.setColumns(50);
        nombrePadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombrePadreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(nombrePadre, gridBagConstraints);

        nombreMadreLabel.setText("Nombre Madre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(nombreMadreLabel, gridBagConstraints);

        nombreMadre.setColumns(50);
        nombreMadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreMadreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(nombreMadre, gridBagConstraints);

        telFijoLabel.setText("Telefono Fijo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(telFijoLabel, gridBagConstraints);

        telFijo.setColumns(20);
        telFijo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telFijoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(telFijo, gridBagConstraints);

        telMovilLabel.setText("Telefono Móvil:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(telMovilLabel, gridBagConstraints);

        telMovil.setColumns(20);
        telMovil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telMovilFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(telMovil, gridBagConstraints);

        emailLabel.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(emailLabel, gridBagConstraints);

        email.setColumns(30);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(email, gridBagConstraints);

        numCuentaLabel.setText("Numero Cuenta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(numCuentaLabel, gridBagConstraints);

        numCuenta.setColumns(50);
        numCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numCuentaFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(numCuenta, gridBagConstraints);

        botonModificar.setText("Guardar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(botonModificar, gridBagConstraints);

        botonAnadir.setText("Aceptar");
        botonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(botonAnadir, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if (nombre.getText().isEmpty() || nombre.getText().length() > 45) {
            nombre.setBorder(bordeError);
        } else {
            nombre.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_nombreFocusLost

    private void primerApellidoFocusLost(java.awt.event.FocusEvent evt) {
        if (primerApellido.getText().isEmpty() || primerApellido.getText().length() > 45) {
            primerApellido.setBorder(bordeError);
        } else {
            primerApellido.setBorder(bordeOriginal);
        }
    }

    private void segundoApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_primerApellidoFocusLost
        if (segundoApellido.getText().isEmpty() || segundoApellido.getText().length() > 45) {
            segundoApellido.setBorder(bordeError);
        } else {
            segundoApellido.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_primerApellidoFocusLost

    private void botonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirActionPerformed
        String campos = "";

        if (!nombre.getText().matches("[a-zA-Z]{1,45}")) {
            campos = campos + "'Nombre',";
            nombre.setBorder(bordeError);
        }
        if (!primerApellido.getText().matches("[a-zA-Z]{1,45}")) {
            campos = campos + "'Primer apellido',";
            primerApellido.setBorder(bordeError);
        }
        if (!segundoApellido.getText().matches("[a-zA-Z]{1,45}")) {
            campos = campos + "'Segundo apellido',";
            segundoApellido.setBorder(bordeError);
        }
        Date dateFromDateChooser = fechaNac.getDate();
        String dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser);
        if (dateString.equals("null-null-null")) {
            campos = campos + "'Fecha de nacimiento',";
            fechaNac.setBorder(bordeError);
        }
        if (!domicilio.getText().matches("[a-zA-Z0-9/ºª.,()\\-\\s]{1,100}")) {
            campos = campos + "'Domicilio',";
            domicilio.setBorder(bordeError);
        }
        if (!localidad.getText().matches("[a-zA-Z\\-]{1,45}")) {
            campos = campos + "'Localidad',";
            localidad.setBorder(bordeError);
        }
        if (!codPostal.getText().matches("[0-9]{1,10}")) {
            campos = campos + "'Codigo postal',";
            codPostal.setBorder(bordeError);
        }
        if (!provincia.getText().matches("[a-zA-Z\\-]{1,70}")) {
            campos = campos + "'Provincia',";
            provincia.setBorder(bordeError);
        }
        if (!colegio.getText().matches("[a-zA-Z\\-]{1,45}")) {
            campos = campos + "'Colegio',";
            colegio.setBorder(bordeError);
        }
        if (!nombrePadre.getText().matches("[a-zA-Z\\-\\s]{1,100}")) {
            campos = campos + "'Nombre padre',";
            nombrePadre.setBorder(bordeError);
        }
        if (!nombreMadre.getText().matches("[a-zA-Z\\-\\s]{1,100}")) {
            campos = campos + "'Nombre madre',";
            nombreMadre.setBorder(bordeError);
        }
        if (!telFijo.getText().matches("[0-9]{1,30}")) {
            campos = campos + "'Telefono fijo',";
            telFijo.setBorder(bordeError);
        }
        if (!telMovil.getText().matches("[0-9]{1,30}")) {
            campos = campos + "'Telefono movil',";
            telMovil.setBorder(bordeError);
        }
        if (!email.getText().matches("[a-zA-Z0-9_ \\-]{1,45}@[a-zA-Z0-9_\\-]{1,25}.[a-z]{1,5}")) {
            campos = campos + "'Email',";
            email.setBorder(bordeError);
        }
        if (!numCuenta.getText().matches("[0-9]{1,40}")) {
            campos = campos + "'Numero de cuenta',";
            numCuenta.setBorder(bordeError);
        }
        //Si no ha habido ningún error al introducir los campos, entonces hacemos el insert
        if (campos.isEmpty()) {
            boolean error = GestorAlumnos.darAltaAlumno(bd, nombre.getText(), primerApellido.getText(), segundoApellido.getText(), dateFromDateChooser,
                    numCuenta.getText(), domicilio.getText(), localidad.getText(),
                    Integer.parseInt(codPostal.getText()), provincia.getText(), colegio.getText(), nombrePadre.getText(),
                    nombreMadre.getText(), Integer.parseInt(telFijo.getText()), Integer.parseInt(telMovil.getText()), email.getText(), "",
                    (String) talla.getSelectedItem(), (String) sexoAlumno.getSelectedItem());

            if (false == error) {
                JOptionPane.showMessageDialog(null, "Ha habido un error en la base de datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Alumno creado con exito",
                        "Confirmacion", JOptionPane.INFORMATION_MESSAGE);

                pP.actualizarTabla();
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Se han encontrado errores en los siguientes campos:\n"
                    + campos.substring(0, campos.length() - 1),
                    "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAnadirActionPerformed

    private void fechaNacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacFocusLost
        Date dateFromDateChooser = fechaNac.getDate();
        String dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser);
        if (dateString.equals("null-null-null")) {
            fechaNac.setBorder(bordeError);
        } else {
            fechaNac.setBorder(bordeDatePicker);
        }
    }//GEN-LAST:event_fechaNacFocusLost

    private void domicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domicilioFocusLost
        if (domicilio.getText().isEmpty() || domicilio.getText().length() > 100) {
            domicilio.setBorder(bordeError);
        } else {
            domicilio.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_domicilioFocusLost

    private void localidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_localidadFocusLost
        if (localidad.getText().isEmpty() || localidad.getText().length() > 45) {
            localidad.setBorder(bordeError);
        } else {
            localidad.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_localidadFocusLost

    private void codPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codPostalFocusLost
        if (codPostal.getText().isEmpty() || codPostal.getText().length() > 10 || !isInteger(codPostal.getText())) {
            codPostal.setBorder(bordeError);
        } else {
            codPostal.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_codPostalFocusLost

    private void provinciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinciaFocusLost
        if (provincia.getText().isEmpty() || provincia.getText().length() > 70) {
            provincia.setBorder(bordeError);
        } else {
            provincia.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_provinciaFocusLost

    private void colegioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_colegioFocusLost
        if (colegio.getText().isEmpty() || colegio.getText().length() > 45) {
            colegio.setBorder(bordeError);
        } else {
            colegio.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_colegioFocusLost

    private void nombrePadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombrePadreFocusLost
        if (nombrePadre.getText().isEmpty() || nombrePadre.getText().length() > 100) {
            nombrePadre.setBorder(bordeError);
        } else {
            nombrePadre.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_nombrePadreFocusLost

    private void nombreMadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreMadreFocusLost
        if (nombreMadre.getText().isEmpty() || nombreMadre.getText().length() > 100) {
            nombreMadre.setBorder(bordeError);
        } else {
            nombreMadre.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_nombreMadreFocusLost

    private void telFijoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFijoFocusLost
        if (telFijo.getText().isEmpty() || telFijo.getText().length() > 30 || !isInteger(telFijo.getText())) {
            telFijo.setBorder(bordeError);
        } else {
            telFijo.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_telFijoFocusLost

    private void telMovilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telMovilFocusLost
        if (telMovil.getText().isEmpty() || telMovil.getText().length() > 30 || !isInteger(telMovil.getText())) {
            telMovil.setBorder(bordeError);
        } else {
            telMovil.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_telMovilFocusLost

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().isEmpty() || email.getText().length() > 75) {
            email.setBorder(bordeError);
        } else {
            email.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_emailFocusLost

    private void numCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numCuentaFocusLost
        if (numCuenta.getText().isEmpty() || numCuenta.getText().length() > 40) {
            numCuenta.setBorder(bordeError);
        } else {
            numCuenta.setBorder(bordeOriginal);
        }
    }//GEN-LAST:event_numCuentaFocusLost

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (!nombre.getText().equals(nombreAnt) || !primerApellido.getText().equals(primerApellidoAnt)
                || !segundoApellido.getText().equals(segundoApellidoAnt) || !fechaNacAnt.getTime().equals(fechaNac.getDate())
                || !numCuenta.getText().equals(cuentaCorrienteAnt) || !domicilio.getText().equals(domicilioAnt)
                || !localidad.getText().equals(localidadAnt) || !codPostal.getText().equals(String.valueOf(codPostalAnt))
                || !provincia.getText().equals(provinciaAnt) || !colegio.getText().equals(colegioAnt)
                || !nombrePadre.getText().equals(nombrePadreAnt) || !nombreMadre.getText().equals(nombreMadreAnt)
                || !telFijo.getText().equals(String.valueOf(telFijoAnt)) || !telMovil.getText().equals(String.valueOf(telMovilAnt))
                || !email.getText().equals(emailAnt) || !((String) talla.getSelectedItem()).equals(tallaAlumnoAnt)
                || !((String) sexoAlumno.getSelectedItem()).substring(0, 1).equals(sexoAnt)) {
            if (nombre.getText().isEmpty() || primerApellido.getText().isEmpty() || segundoApellido.getText().isEmpty()
                    || numCuenta.getText().isEmpty() || domicilio.getText().isEmpty()
                    || localidad.getText().isEmpty() || codPostal.getText().isEmpty()
                    || provincia.getText().isEmpty() || colegio.getText().isEmpty()
                    || nombrePadre.getText().isEmpty() || nombreMadre.getText().isEmpty()
                    || telFijo.getText().isEmpty() || telMovil.getText().isEmpty()
                    || email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio",
                        "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
            } else {
                String consulta_alumnos = "SELECT a.idAlumno, a.observaciones FROM alumno a WHERE "
                        + "a.nombre='" + nombreAnt + "' AND a.primerApellido='" + primerApellidoAnt + "' AND "
                        + "a.segundoApellido='" + segundoApellidoAnt + "' AND a.nombrePadre='" + nombrePadreAnt + "' AND "
                        + "a.nombreMadre='" + nombreMadreAnt + "' AND a.codigoPostal=" + codPostalAnt;
                ResultSet al = GestorAlumnos.consultarAlumno(bd, consulta_alumnos);
                String idAlumno = "", observaciones = "";
                try {
                    while (al.next()) {
                        idAlumno = al.getString("a.idAlumno");
                        observaciones = al.getString("a.observaciones");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AñadirModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }

                Date dateFromDateChooser = fechaNac.getDate();
                String dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser);
                GestorAlumnos.modificarDatos(bd, idAlumno, nombre.getText(), primerApellido.getText(), segundoApellido.getText(),
                        dateString, numCuenta.getText(), domicilio.getText(), localidad.getText(), codPostal.getText(),
                        provincia.getText(), colegio.getText(), nombrePadre.getText(), nombreMadre.getText(),
                        telFijo.getText(), telMovil.getText(), email.getText(), observaciones, (String) talla.getSelectedItem(),
                        ((String) sexoAlumno.getSelectedItem()).substring(0, 1));
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito",
                        "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                pP.actualizarTabla();
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private boolean isInteger(String cadena) {
        boolean esEntero = true;
        try {
            Integer.parseInt(cadena);
        } catch (Exception e) {
            esEntero = false;
        }
        return esEntero;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnadir;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField codPostal;
    private javax.swing.JLabel codPostalLabel;
    private javax.swing.JTextField colegio;
    private javax.swing.JLabel colegioLabel;
    private javax.swing.JLabel datosFamiliares;
    private javax.swing.JTextField domicilio;
    private javax.swing.JLabel domicilioLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private com.toedter.calendar.JDateChooser fechaNac;
    private javax.swing.JLabel fechaNacLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField localidad;
    private javax.swing.JLabel localidadLabel;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreMadre;
    private javax.swing.JLabel nombreMadreLabel;
    private javax.swing.JTextField nombrePadre;
    private javax.swing.JLabel nombrePadreLabel;
    private javax.swing.JTextField numCuenta;
    private javax.swing.JLabel numCuentaLabel;
    private javax.swing.JLabel participante;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField provincia;
    private javax.swing.JLabel provinciaLabel;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JLabel segundoApellidoLabel;
    private javax.swing.JSeparator separador;
    private javax.swing.JComboBox sexoAlumno;
    private javax.swing.JComboBox talla;
    private javax.swing.JLabel tallaLabel;
    private javax.swing.JTextField telFijo;
    private javax.swing.JLabel telFijoLabel;
    private javax.swing.JTextField telMovil;
    private javax.swing.JLabel telMovilLabel;
    // End of variables declaration//GEN-END:variables
}
