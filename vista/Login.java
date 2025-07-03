package proyecto.avance.sistemaventa.vista;

import javax.swing.JFrame;
import proyecto.avance.sistemaventa.controladores.LoginControlador;
import proyecto.avance.sistemaventa.utils.Utilitarios;

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
                labelEmailDesarrolladorLogin = new javax.swing.JLabel();
                imagenFondo = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                panelLogin.setBackground(new java.awt.Color(255, 255, 255));

                labelCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                labelCorreoElectronico.setText("Correo Electrónico");

                txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

                labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                                                        .addComponent(labelInicio)
                                                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelCorreoElectronico)
                                                                .addComponent(labelPassword)
                                                                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                                .addComponent(txtPassword))))
                                        .addGroup(panelLoginLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnRegistro)))
                                .addContainerGap(28, Short.MAX_VALUE))
                );
                panelLoginLayout.setVerticalGroup(
                        panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(labelCorreoElectronico)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(labelInicio)
                                .addGap(9, 9, 9)
                                .addComponent(labelPassword)
                                .addGap(30, 30, 30)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
                );

                getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 280, 390));

                Fondo.setBackground(new java.awt.Color(0, 102, 102));

                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juan/estevez/sistemaventa/img/cslogin_104358.png"))); // NOI18N

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

                labelEmailDesarrolladorLogin.setForeground(new java.awt.Color(204, 204, 204));

                javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
                Fondo.setLayout(FondoLayout);
                FondoLayout.setHorizontalGroup(
                        FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelContactoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelNombreDesarrolladorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(FondoLayout.createSequentialGroup()
                                                                        .addGap(70, 70, 70)
                                                                        .addComponent(labelNumeroVersionLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(labelEmailDesarrolladorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelTituloVersionLogin)))
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(labelTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(labelLogo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelDesarrolladoPorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(134, Short.MAX_VALUE))
                );
                FondoLayout.setVerticalGroup(
                        FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(labelTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(labelLogo)
                                                .addGap(108, 108, 108))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelDesarrolladoPorLogin)
                                                .addGap(18, 18, 18)))
                                .addComponent(labelNombreDesarrolladorLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNumeroVersionLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(labelTituloVersionLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelContactoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(labelEmailDesarrolladorLogin)
                                .addContainerGap())
                );

                getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

                imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/avance/sistemaventa/img/login.jpg"))); // NOI18N
                getContentPane().add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 210, 430));

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
        private javax.swing.JLabel labelContactoLogin;
        private javax.swing.JLabel labelCorreoElectronico;
        private javax.swing.JLabel labelDesarrolladoPorLogin;
        private javax.swing.JLabel labelEmailDesarrolladorLogin;
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
