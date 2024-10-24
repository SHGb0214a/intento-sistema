package vista;
import controlador.Validaciones;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEmpleados extends JFrame{
    
    public RegistroEmpleados(){
        setTitle("Registro de Empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000,600);
        setLocationRelativeTo(null);
        
        JPanel pantalla = new JPanel();
        pantalla.setLayout(new GridLayout(10,1,5,10));
        pantalla.setBackground(new Color(190,221,231));
        pantalla.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        
        Font labelTiFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        Font fieldFont = new Font("Arial", Font.PLAIN, 16);
        
        JLabel titulo = new JLabel("Registro de Empleados", SwingConstants.CENTER);
        titulo.setFont(labelTiFont);
        
        JLabel name = new JLabel("Nombre: ");
        name.setFont(labelFont);
        JTextField nombre = new JTextField();
        nombre.setFont(fieldFont);
        
        JLabel rol = new JLabel("Rol: ");
        rol.setFont(labelFont);
        JTextField papel = new JTextField();
        papel.setFont(fieldFont);
        
        JLabel user = new JLabel("Usuario: ");
        user.setFont(labelFont);
        JTextField usuario = new JTextField();
        usuario.setFont(fieldFont);
        
        JLabel password = new JLabel("Contraseña: ");
        password.setFont(labelFont);
        JTextField contra = new JTextField();
        contra.setFont(fieldFont);
        
        pantalla.add(name);
        pantalla.add(nombre);
        pantalla.add(rol);
        pantalla.add(papel);
        pantalla.add(user);
        pantalla.add(usuario);
        pantalla.add(password);
        pantalla.add(contra);
        
        JButton registrar = new JButton("Registrar");
        registrar.setBackground(new Color(51,51,51));
        registrar.setForeground(new Color(255,255,255));
        registrar.setFont(labelFont);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBackground(new Color(51, 51, 51));
        cancelar.setForeground(new Color(255,255,255));
        cancelar.setFont(labelFont);
        
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1,2,30,10));
        botones.setBackground(new Color(190,221,231));
        botones.setBorder(BorderFactory.createEmptyBorder(20,70,20,70));
        
        botones.add(registrar);
        botones.add(cancelar);
        
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout(0,20));
        mainpanel.setBackground(new Color(190,221,231));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10,250,10,250));
        
        mainpanel.add(pantalla,BorderLayout.CENTER);
        mainpanel.add(botones, BorderLayout.SOUTH);
        
        JButton cerrar = new JButton("Cerrar sesión");
        cerrar.setBackground(new Color(255,0,0));
        cerrar.setForeground(new Color(255,255,255));
        cerrar.setFont(labelFont);
        
        JPanel encabezado = new JPanel();
        encabezado.setLayout(new BorderLayout(0,5));
        encabezado.setBackground(new Color(255,255,255));
        encabezado.setBorder(BorderFactory.createEmptyBorder(50,50,50,75));
        
        encabezado.add(titulo, BorderLayout.WEST);
        encabezado.add(cerrar, BorderLayout.EAST);
        
        JLabel menu = new JLabel("MENÚ");
        menu.setFont(labelFont);
        
        
        JPanel menuBoton = new JPanel();
        menuBoton.setLayout(new GridLayout(1,1,30,10));
        menuBoton.setBackground(new Color(190, 221, 231));
        menuBoton.setBorder(BorderFactory.createEmptyBorder(140,0,140,0));
        
        JButton inicio = new JButton("Inicio");
        inicio.setBackground(new Color(51,51,51));
        inicio.setForeground(new Color(255,255,255));
        inicio.setFont(labelFont);
        inicio.setPreferredSize(new Dimension(50,30));
        
        menuBoton.add(inicio);
        
        JPanel menuI = new JPanel();
        menuI.setLayout(new BorderLayout(0,5));
        menuI.setBackground(new Color(200,200,200));
        menuI.setBorder(BorderFactory.createEmptyBorder(50,75,50,75));
        
        menuI.add(menu, BorderLayout.NORTH);
        menuI.add(menuBoton, BorderLayout.CENTER);
        
        add(mainpanel, BorderLayout.CENTER);
        add(encabezado, BorderLayout.NORTH);
        add(menuI, BorderLayout.WEST);
        
        
        //acciones
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres = nombre.getText();
                String rols = papel.getText();
                String users = usuario.getText().trim();
                String contraseñas = contra.getText().trim();
                if (nombres.isEmpty() || rols.isEmpty() || users.isEmpty() || contraseñas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }else if (!Validaciones.noNum(nombres) || !Validaciones.noNum(rols)) {
                    JOptionPane.showMessageDialog(null, "El nombre y rol solo deben contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
                }else if (!Validaciones.noEspacios(users) || !Validaciones.noEspacios(contraseñas)) {
                    JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña no pueden contener espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Todo correcto");
                }
            }
        });
    } 
}