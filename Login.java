package proyect.avance.sistemaventa.vista;

import javax.swing.JFrame;
import proyect.avance.sistemaventa.controladorAdministrador.LoginControlador;
import proyect.avance.sistemaventa.utils.Utilitarios;

/**
 *
 * @author Juan Carlos Estevez Vargas
 */
public class Login extends JFrame {

    private final LoginControlador loginControlador;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.loginControlador = LoginControlador.getInstance();
    }

        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelLogin = new javax.swing.JPanel();
                labelInicio = new javax.swing.JLabel();
                labelCorreoElectronico = new javax.swing.JLabel();
                txtCorreo = new javax.swing.JTextField();
                labelPassword = new javax.swing.JLabel();
                txtPassword = new javax.swing.JPasswordField();
                btnRegistro = new javax.swing.JButton();
                btnIniciar = new javax.swing.JButton();
                Fondo = new javax.swing.JPanel();
                labelLogo = new javax.swing.JLabel();
                labelTituloLogin = new javax.swing.JLabel();
                labelDesarrolladoPorLogin = new javax.swing.JLabel();
                labelNombreDesarrolladorLogin = new javax.swing.JLabel();
                labelTituloVersionLogin = new javax.swing.JLabel();
                labelNumeroVersionLogin = new javax.swing.JLabel();
                labelContactoLogin = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                imagenFondo = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                panelLogin.setBackground(new java.awt.Color(255, 255, 255));

                labelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juan/estevez/sistemaventa/img/iniciar.png"))); // NOI18N

                labelCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelCorreoElectronico.setForeground(new java.awt.Color(51, 51, 51));
                labelCorreoElectronico.setText("Correo Electrónico");

                txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

                labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelPassword.setForeground(new java.awt.Color(51, 51, 51));
                labelPassword.setText("Contraseña");

                txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

                btnRegistro.setBackground(new java.awt.Color(0, 51, 102));
                btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
                btnRegistro.setText("Registrarse");
                btnRegistro.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRegistroActionPerformed(evt);
                        }
                });

                btnIniciar.setBackground(new java.awt.Color(0, 51, 102));
                btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
                btnIniciar.setText("Iniciar");
                btnIniciar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnIniciarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
                panelLogin.setLayout(panelLoginLayout);
                panelLoginLayout.setHorizontalGroup(
                        panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelCorreoElectronico)
                                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelPassword))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(labelInicio))
                                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(btnRegistro)))
                                .addContainerGap(22, Short.MAX_VALUE))
                );
                panelLoginLayout.setVerticalGroup(
                        panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(labelCorreoElectronico)
                                .addGap(29, 29, 29)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInicio)
                                .addGap(19, 19, 19)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141))
                );

                getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 320, 370));

                Fondo.setBackground(new java.awt.Color(0, 102, 102));

                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juan/estevez/sistemaventa/img/logo.png"))); // NOI18N

                labelTituloLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                labelTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
                labelTituloLogin.setText("INGRESO");

                labelDesarrolladoPorLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelDesarrolladoPorLogin.setForeground(new java.awt.Color(204, 204, 204));

                labelNombreDesarrolladorLogin.setForeground(new java.awt.Color(204, 204, 204));

                labelTituloVersionLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelTituloVersionLogin.setForeground(new java.awt.Color(204, 204, 204));

                labelNumeroVersionLogin.setForeground(new java.awt.Color(204, 204, 204));

                labelContactoLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelContactoLogin.setForeground(new java.awt.Color(204, 204, 204));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyect/avance/sistemaventa/img/cslogin_104358.png"))); // NOI18N

                javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
                Fondo.setLayout(FondoLayout);
                FondoLayout.setHorizontalGroup(
                        FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelLogo)
                                        .addComponent(labelTituloVersionLogin))
                                .addGap(34, 34, 34)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelContactoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelDesarrolladoPorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelNombreDesarrolladorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelNumeroVersionLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(labelTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                FondoLayout.setVerticalGroup(
                        FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(labelLogo)
                                                .addGap(71, 71, 71)
                                                .addComponent(labelDesarrolladoPorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelNombreDesarrolladorLogin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelTituloVersionLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelNumeroVersionLogin))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelContactoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(labelTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120))))
                );

                getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 370));

                imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyect/avance/sistemaventa/img/login.jpg"))); // NOI18N
                getContentPane().add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 330, 400));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        new RegistroUsuarios(false).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String correo = Utilitarios.eliminarEspaciosEnBlanco(txtCorreo.getText());
        String password = Utilitarios.eliminarEspaciosEnBlanco(String.valueOf(txtPassword.getPassword()));
        if(loginControlador.validar(correo, password)) {
            this.dispose();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Fondo;
        private javax.swing.JButton btnIniciar;
        private javax.swing.JButton btnRegistro;
        private javax.swing.JLabel imagenFondo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel labelContactoLogin;
        private javax.swing.JLabel labelCorreoElectronico;
        private javax.swing.JLabel labelDesarrolladoPorLogin;
        private javax.swing.JLabel labelInicio;
        private javax.swing.JLabel labelLogo;
        private javax.swing.JLabel labelNombreDesarrolladorLogin;
        private javax.swing.JLabel labelNumeroVersionLogin;
        private javax.swing.JLabel labelPassword;
        private javax.swing.JLabel labelTituloLogin;
        private javax.swing.JLabel labelTituloVersionLogin;
        private javax.swing.JPanel panelLogin;
        private javax.swing.JTextField txtCorreo;
        private javax.swing.JPasswordField txtPassword;
        // End of variables declaration//GEN-END:variables
}
