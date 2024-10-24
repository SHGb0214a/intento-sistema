package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


public class LoginVista extends JFrame {
    private final JTextField correoField;
    private final JPasswordField contraseniaField;
    private final JButton loginButton;

    public LoginVista() {
        // Configuracion ventana principal
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel principal autoajustable
        JPanel panelLogin = new JPanel(new GridBagLayout());
        panelLogin.setBackground(new Color(136, 197, 127));
        GridBagConstraints contenedor = new GridBagConstraints();
        contenedor.insets = new Insets(10, 10, 10, 10);
        panelLogin.setPreferredSize(new Dimension(1000, 600));

        // Panel titulo
        JPanel panelMensajes = new JPanel(new GridBagLayout());
        GridBagConstraints gbcMensajes = new GridBagConstraints();
        panelMensajes.setBackground(new Color(136, 197, 127));
        gbcMensajes.insets = new Insets(10, 10, 10, 10);

        // Titulo bienvenida
        JLabel titulo = new JLabel("Bienvenid@ a GROCERYNOOK");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        gbcMensajes.gridx = 0;
        gbcMensajes.gridy = 0;
        gbcMensajes.gridwidth = 2;
        gbcMensajes.anchor = GridBagConstraints.CENTER;
        panelMensajes.add(titulo, gbcMensajes);

        // Indicacion
        JLabel subtitulo = new JLabel("Por favor, Ingresa con correo y contraseña ya registrados.");
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 18)); 
        gbcMensajes.gridx = 0;
        gbcMensajes.gridy = 1;  
        gbcMensajes.gridwidth = 2;
        gbcMensajes.anchor = GridBagConstraints.CENTER;
        panelMensajes.add(subtitulo, gbcMensajes);

        // Panel de mensajes
        contenedor.gridx = 1;
        contenedor.gridy = 0;
        contenedor.gridheight = 1;
        contenedor.gridwidth = 1;
        contenedor.anchor = GridBagConstraints.EAST;
        contenedor.fill = GridBagConstraints.BOTH;
        panelLogin.add(panelMensajes, contenedor);

        // Panel campos texto y etiquetas
        JPanel panelCampos = new JPanel(new GridBagLayout());
        GridBagConstraints gbcCampos = new GridBagConstraints();
        panelCampos.setBackground(new Color(136, 197, 127));
        gbcCampos.insets = new Insets(10, 10, 10, 10);

        // Etiqueta correo
        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbcCampos.gridx = 0;
        gbcCampos.gridy = 0;
        gbcCampos.anchor = GridBagConstraints.WEST;
        panelCampos.add(correoLabel, gbcCampos);

        // Caja texto correo
        correoField = new JTextField();
        correoField.setPreferredSize(new Dimension(300, 40));
        gbcCampos.gridx = 0;
        gbcCampos.gridy = 1;
        gbcCampos.anchor = GridBagConstraints.WEST;
        gbcCampos.fill = GridBagConstraints.HORIZONTAL;
        panelCampos.add(correoField, gbcCampos);

        // Etiqueta contraseña
        JLabel contraseniaLabel = new JLabel("Contraseña:");
        contraseniaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbcCampos.gridx = 0;
        gbcCampos.gridy = 2;
        gbcCampos.anchor = GridBagConstraints.WEST;
        panelCampos.add(contraseniaLabel, gbcCampos);

        // Caja de texto para la contraseña
        contraseniaField = new JPasswordField();
        contraseniaField.setPreferredSize(new Dimension(300, 40));
        gbcCampos.gridx = 0;
        gbcCampos.gridy = 3;
        gbcCampos.anchor = GridBagConstraints.WEST;
        gbcCampos.fill = GridBagConstraints.HORIZONTAL;
        panelCampos.add(contraseniaField, gbcCampos);

        // Botón de login
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setPreferredSize(new Dimension(100, 40));
        gbcCampos.gridx = 0;
        gbcCampos.gridy = 4;
        gbcCampos.anchor = GridBagConstraints.CENTER;
        // Personalizar botón de login
        loginButton.setBackground(new Color(000)); 
        loginButton.setForeground(Color.WHITE);
        
        // Panel campos config
        contenedor.gridx = 1;
        contenedor.gridy = 1;
        contenedor.gridheight = 2;
        contenedor.gridwidth = 2;
        contenedor.anchor = GridBagConstraints.EAST;
        contenedor.fill = GridBagConstraints.BOTH;
        panelLogin.add(panelCampos, contenedor);
   
        
        
        add(panelLogin, BorderLayout.CENTER);
        panelCampos.add(loginButton, gbcCampos);
        

        pack();
        setLocationRelativeTo(null);
    }

    public String getCorreo() {
        return correoField.getText();
    }

    public String getContrasenia() {
        return new String(contraseniaField.getPassword());
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
