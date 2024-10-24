package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

public class Inventario extends JFrame{
    public Inventario(){
        setTitle("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000, 600);
        setLocationRelativeTo(null);
        
        JPanel pantalla = new JPanel();
        pantalla.setLayout(new GridLayout(10,1,5,10));
        pantalla.setBackground(new Color(190,221,231));
        pantalla.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        
        Font labelTiFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        Font fieldFont = new Font("Arial", Font.PLAIN, 16);
        
        JLabel titulo = new JLabel("Inventario", SwingConstants.CENTER);
        titulo.setFont(labelTiFont);
        
        
        JButton crearProducto = new JButton("Crear Producto");
        crearProducto.setBackground(new Color(51,51,51));
        crearProducto.setForeground(new Color(255,255,255));
        crearProducto.setFont(labelFont);
        JButton modificar = new JButton("Modificar Producto");
        modificar.setBackground(new Color(51,51,51));
        modificar.setForeground(new Color(255, 255,255));
        modificar.setFont(labelFont);
        JButton eliminar = new JButton("Eliminar Producto");
        eliminar.setBackground(new Color(51,51,51));
        eliminar.setForeground(new Color(255,255,255));
        eliminar.setFont(labelFont);
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1,2,30,10));
        botones.setBackground(new Color(0x74, 0x88, 0xC9));
        botones.setBorder(BorderFactory.createEmptyBorder(20,70,20,70));
        
        botones.add(crearProducto);
        botones.add(modificar);
        botones.add(eliminar);
        
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout(0,20));
        mainpanel.setBackground(new Color(190,221,231));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10,250,10,250));
        
        mainpanel.add(pantalla, BorderLayout.CENTER);
                
        JButton cerrar = new JButton ("Cerrar sesión");
        cerrar.setBackground(new Color(255,0,0));
        cerrar.setForeground(new Color(255,255,255));
        cerrar.setFont(labelFont);
        
        JPanel Encabezado= new JPanel();
        Encabezado.setLayout(new BorderLayout(0, 5));
        Encabezado.setBackground(new Color(0x74, 0x88, 0xC9));
        Encabezado.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 75));
        
        //Añadir componentes del encabezado
        Encabezado.add(titulo, BorderLayout.WEST);
        Encabezado.add(botones, BorderLayout.CENTER);
        Encabezado.add(cerrar, BorderLayout.EAST);
        
        add(mainpanel, BorderLayout.CENTER);
        add(Encabezado, BorderLayout.NORTH);
        
        JPanel Logopanel = new JPanel(); 
        Logopanel.setLayout(new BorderLayout());
        Logopanel.setBackground(new Color(190, 221, 231));
        Logopanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        
        JButton regresar = new JButton("Regresar");
        regresar.setBackground(new Color(51,51,51));
        regresar.setForeground(new Color(255,255,255));
        regresar.setFont(labelFont);
        regresar.setPreferredSize(new Dimension(100,30));
        
        JPanel MenuI = new JPanel();
        MenuI.setLayout(new BorderLayout(0,5));
        MenuI.setBackground(new Color(0x74, 0x88, 0xC9));
        MenuI.setBorder(BorderFactory.createEmptyBorder(50,75,50,75));
        
        MenuI.add(Logopanel, BorderLayout.SOUTH);
        MenuI.add(regresar, BorderLayout.SOUTH);
        
        add(MenuI, BorderLayout.WEST);
    }
}
