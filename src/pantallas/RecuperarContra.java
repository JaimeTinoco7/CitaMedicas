/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class RecuperarContra extends javax.swing.JFrame {

    private static final String archivoUsuarios = "usuarios.txt";

    public RecuperarContra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMediPlus = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        txtPregunta = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        lblPreguntaF = new javax.swing.JLabel();
        lblAutomanager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblApellidoF = new javax.swing.JLabel();
        lblApellidoF1 = new javax.swing.JLabel();
        txtPregunta1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Medicina_logo2.png"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, 220));

        lblMediPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MediPlus+ (1).png"))); // NOI18N
        jPanel1.add(lblMediPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, 40));

        txtRespuesta.setBackground(new java.awt.Color(217, 217, 217));
        txtRespuesta.setBorder(null);
        jPanel1.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 210, -1));

        txtPregunta.setBackground(new java.awt.Color(217, 217, 217));
        txtPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál es tu nick de jugador?", "¿En qué ciudad naciste?", "¿Cuál es tu película o libro favorito?", "¿Cuál es el nombre de tu abuelo materno?" }));
        txtPregunta.setBorder(null);
        txtPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 210, -1));

        txtCorreo.setBackground(new java.awt.Color(217, 217, 217));
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 210, -1));

        lblPreguntaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        jPanel1.add(lblPreguntaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 230, 40));

        lblAutomanager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A U T O M A N A G E R (1).png"))); // NOI18N
        jPanel1.add(lblAutomanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 320, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("RECUPERAR CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 195, -1));

        lblCorreo.setText("Correo");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        lblPregunta.setText("Pregunta de Seguridad:");
        jPanel1.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        lblRespuesta.setText("Respuesta:");
        jPanel1.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recuperar.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 106, -1));

        lblApellidoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        jPanel1.add(lblApellidoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 230, 40));

        lblApellidoF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        jPanel1.add(lblApellidoF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 230, 40));

        txtPregunta1.setBackground(new java.awt.Color(217, 217, 217));
        txtPregunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál es tu nik de jugador?", "¿En qué ciudad naciste?", "¿Cuál es tu película o libro favorito?", "¿Cuál es el nombre de tu abuelo materno?" }));
        txtPregunta1.setBorder(null);
        txtPregunta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(txtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DireccionDoc.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String correo = txtCorreo.getText();
        String selectedQuestion = (String) txtPregunta.getSelectedItem();
        String respuesta = txtRespuesta.getText();

        String recoveredPassword = recuperarContra(correo, 
                selectedQuestion, respuesta);
        if (recoveredPassword != null) {
            JOptionPane.showMessageDialog(this, "Tu contraseña es: " 
                    + recoveredPassword);
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Correo electrónico no encontrado o respuesta incorrecta.");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        LoginUsuario pantalla = new  LoginUsuario();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked
private static String recuperarContra(String email, 
        String preguntaSeguridad, String respuestaSeguridad) {
        try (BufferedReader reader = 
                new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    String storedEmail = parts[3];
                    String storedPassword = parts[4];
                    String storedPregunta = parts[5];
                    String storedRespuesta = parts[6];
                    if (email.equals(storedEmail) && 
                            preguntaSeguridad.equals(storedPregunta) &&
                            respuestaSeguridad.equals(storedRespuesta)) {
                        return storedPassword;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
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
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblApellidoF;
    private javax.swing.JLabel lblApellidoF1;
    private javax.swing.JLabel lblAutomanager;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMediPlus;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPreguntaF;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtPregunta;
    private javax.swing.JComboBox<String> txtPregunta1;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
