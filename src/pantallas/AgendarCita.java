/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public final class AgendarCita extends javax.swing.JFrame {

        private Map<String, List<String>> horariosDoctores;

    private static final String archivoUsuarios = "datos/citas.txt";
    
    public AgendarCita() {
           horariosDoctores = new HashMap<>();
        inicializarHorariosDoctores();
        initComponents();
        fecha_combo();
        hora_combo();
    }

    public void fecha_combo() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < 10; i++) {
            cbxFecha.addItem(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }

    public void hora_combo() {

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 10);

        while (calendar.get(Calendar.HOUR_OF_DAY) < 18
                || (calendar.get(Calendar.HOUR_OF_DAY) == 18
                && calendar.get(Calendar.MINUTE) == 0)) {
            cbxHora.addItem(sdf.format(calendar.getTime()));
            calendar.add(Calendar.MINUTE, 10);
        }
    }
      private void inicializarHorariosDoctores() {
        String[] nombresDoctores = {
            "Dra. Isamar Benyi", 
            "Dr. Juan Menédez", 
            "Dr. Marco Mejia",
            "Dr. Pablo Moreno", 
            "Dra. Elizabeth Espinal", 
            "Dra. Angélica Rivera",
            "Dr. Edgar Chávez", 
            "Ps. Francisco Chávez",
            "Dr. Carlos Escalante ",
            "Dra. Silvia De Los Santos"
        };

        for (String doctor : nombresDoctores) {
            horariosDoctores.put(doctor, new ArrayList<>());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        pnlColor = new javax.swing.JPanel();
        lblRegreso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        cbxHora = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cbxListaDoctores = new javax.swing.JComboBox<>();
        cbxFecha = new javax.swing.JComboBox<>();
        scrlSintomas = new javax.swing.JScrollPane();
        txtaSintomas = new javax.swing.JTextArea();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblListaDoctores = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
        lblSintomas = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlColor.setBackground(new java.awt.Color(13, 143, 131));
        pnlColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atraas.png"))); // NOI18N
        lblRegreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresoMouseClicked(evt);
            }
        });
        pnlColor.add(lblRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agendar Cita.png"))); // NOI18N
        pnlColor.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 160, 40));

        pnlCentral.add(pnlColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 65));

        cbxHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCentral.add(cbxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 100, 40));

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCentral.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 40));

        txtApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCentral.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 250, 40));

        cbxListaDoctores.setMaximumRowCount(10);
        cbxListaDoctores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dra. Isamar Benyi", "Dr. Juan Menédez", "Dr. Marco Mejia", "Dr. Pablo Moreno", "Dra. Elizabeth Espinal", "Dra. Angélica Rivera", "Dr. Edgar Chávez", "Ps. Francisco Chávez", "Dr. Carlos Escalante", "Dra. Silvia De Los Santos", " " }));
        cbxListaDoctores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCentral.add(cbxListaDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 40));

        cbxFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCentral.add(cbxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, 40));

        txtaSintomas.setColumns(20);
        txtaSintomas.setRows(5);
        scrlSintomas.setViewportView(txtaSintomas);

        pnlCentral.add(scrlSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 250, 190));

        lblNombre.setText("Nombre:");
        pnlCentral.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblApellido.setText("Apellidos:");
        pnlCentral.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblListaDoctores.setText("Lista de Doctores:");
        pnlCentral.add(lblListaDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblFechaHora.setText("Fecha y Hora:");
        pnlCentral.add(lblFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lblSintomas.setText("Sintomas:");
        pnlCentral.add(lblSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnGuardar.png"))); // NOI18N
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        pnlCentral.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 110, 50));

        getContentPane().add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresoMouseClicked
        MenuUsuario pantalla = new MenuUsuario();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresoMouseClicked

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked

        String nombrePaciente = txtNombre.getText();
        String apellidoPaciente = txtApellido.getText();
        String fecha = (String) cbxFecha.getSelectedItem();
        String hora = (String) cbxHora.getSelectedItem();
        String doctorSeleccionado = (String) cbxListaDoctores.getSelectedItem();
        String motivo = txtaSintomas.getText();

if (nombrePaciente.isEmpty() || apellidoPaciente.isEmpty() || 
    fecha == null || hora == null || motivo.isEmpty()) {
    JOptionPane.showMessageDialog(null, 
            "Por favor, complete todos los campos "
                    + "antes de guardar la cita.");
} else {
    List<String> horariosOcupados = horariosDoctores.get(doctorSeleccionado);
    if (horariosOcupados.contains(hora)) {
        JOptionPane.showMessageDialog(null, 
                "El horario seleccionado para este"
                        + " doctor ya está ocupado.");
    } else {
        horariosOcupados.add(hora);

        String citaAGuardar = nombrePaciente + "," + apellidoPaciente +
                "," + fecha + "," + hora + "," + motivo;

        try (BufferedWriter writer = 
                new BufferedWriter
        (new FileWriter("citas.txt", true))) {
            writer.write(citaAGuardar);
            writer.newLine();
            JOptionPane.showMessageDialog(null, 
                    "Cita guardada con éxito");

            txtNombre.setText("");
            txtApellido.setText("");
            cbxFecha.setSelectedIndex(0);
            cbxHora.setSelectedIndex(0);
            txtaSintomas.setText("");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar la cita");
        }
    }
    
}


    }//GEN-LAST:event_lblGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFecha;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cbxListaDoctores;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblListaDoctores;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegreso;
    private javax.swing.JLabel lblSintomas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JScrollPane scrlSintomas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaSintomas;
    // End of variables declaration//GEN-END:variables
}
