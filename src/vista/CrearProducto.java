package vista;

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

public class CrearProducto extends JFrame{

    public CrearProducto(){
        //Ajustes de la ventana
        setTitle("Crear Producto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000, 600);
        setLocationRelativeTo(null);
        
        //Panel del formulario
        JPanel pantalla = new JPanel(); 
        pantalla.setLayout(new GridLayout(10, 1, 5, 10));
        pantalla.setBackground(new Color(190, 221, 231));
        pantalla.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        //Fuentes para etiquetas y cuadros
        Font labelTiFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        Font fieldFont = new Font("Arial", Font.PLAIN, 16);
        
        //Etiqueta del titulo 
        JLabel titulo = new JLabel("Crear Producto", SwingConstants.CENTER);
        titulo.setFont(labelTiFont);

        //Etiquetas y cuadros del formulario
        JLabel codigo = new JLabel("Código: ");
        codigo.setFont(labelFont);
        JTextField tcodigo = new JTextField();
        tcodigo.setFont(fieldFont);
        
        JLabel nombre = new JLabel("Nombre: ");
        nombre.setFont(labelFont);
        JTextField tnombre = new JTextField();
        tnombre.setFont(fieldFont);

        JLabel desc = new JLabel("Descripción: ");
        desc.setFont(labelFont);
        JTextField tdesc = new JTextField();
        tdesc.setFont(fieldFont);

        JLabel precio = new JLabel("Precio: ");
        precio.setFont(labelFont);
        JTextField tprecio = new JTextField();
        tprecio.setFont(fieldFont);

        JLabel cant = new JLabel("Cantidad: ");
        cant.setFont(labelFont);
        JTextField tcant = new JTextField();
        tcant.setFont(fieldFont);

        //Añadir los componentes al panel del formulario
        pantalla.add(codigo);
        pantalla.add(tcodigo);
        pantalla.add(nombre);
        pantalla.add(tnombre);
        pantalla.add(desc);
        pantalla.add(tdesc);
        pantalla.add(precio);
        pantalla.add(tprecio);
        pantalla.add(cant);
        pantalla.add(tcant);

        //Creación de botones del formulario
        JButton guardar = new JButton("Crear");
        guardar.setBackground(new Color(51, 51, 51));
        guardar.setForeground(new Color(255, 255, 255));
        guardar.setFont(labelFont);
        JButton cancela = new JButton("Cancelar");
        cancela.setBackground(new Color(51, 51, 51));
        cancela.setForeground(new Color(255, 255, 255));
        cancela.setFont(labelFont);

        //Panel para los botones del formulario
        JPanel botone = new JPanel(); 
        botone.setLayout(new GridLayout(1, 2, 30, 10));
        botone.setBackground(new Color(190, 221, 231));
        botone.setBorder(BorderFactory.createEmptyBorder(20, 70, 20, 70));

        botone.add(guardar);
        botone.add(cancela);

        //Panel principal del formulario(donde se añaden los paneles de los componentes y botones)
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout(0, 20));
        mainpanel.setBackground(new Color(190, 221, 231));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 250, 10, 250));

        mainpanel.add(pantalla, BorderLayout.CENTER);
        mainpanel.add(botone, BorderLayout.SOUTH);

        //Boton de cerrar sesión
        JButton cerrarButton = new JButton("Cerrar sesión");
        cerrarButton.setBackground(new Color(255, 0, 0));
        cerrarButton.setForeground(new Color(255, 255, 255));
        cerrarButton.setFont(labelFont);

        //Panel del encabezado 
        JPanel Encabezado= new JPanel();
        Encabezado.setLayout(new BorderLayout(0, 5));
        Encabezado.setBackground(new Color(255, 255, 255));
        Encabezado.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 75));
        
        //Añadir componentes del encabezado
        Encabezado.add(titulo, BorderLayout.WEST);
        Encabezado.add(cerrarButton, BorderLayout.EAST);
        
        //Etiqueta del menu
        JLabel menu = new JLabel("MENÚ");
        menu.setFont(labelFont);

        //Panel de los botones del menu
        JPanel MenuBoton = new JPanel(); 
        MenuBoton.setLayout(new GridLayout(1, 1, 30, 10));
        MenuBoton.setBackground(new Color(190, 221, 231));
        MenuBoton.setBorder(BorderFactory.createEmptyBorder(140, 0, 140, 0));

        //Botones del Menu
        JButton Inicio = new JButton("Inicio");
        Inicio.setBackground(new Color(51, 51, 51));
        Inicio.setForeground(new Color(255, 255, 255));
        Inicio.setFont(labelFont);
        Inicio.setPreferredSize(new Dimension(50, 30));

        //Añadir botones al panel de botones del menu
        MenuBoton.add(Inicio);

        //Panel del Menu
        JPanel MenuI = new JPanel();
        MenuI.setLayout(new BorderLayout(0, 5));
        MenuI.setBackground(new Color(200, 200, 200));
        MenuI.setBorder(BorderFactory.createEmptyBorder(50, 75, 50, 75));

        //Añadir los componentes al Panel del menu
        MenuI.add(menu, BorderLayout.NORTH);
        MenuI.add(MenuBoton, BorderLayout.CENTER);

        //Se añaden los tres paneles principales a la ventana
        add(mainpanel, BorderLayout.CENTER);
        add(Encabezado, BorderLayout.NORTH);
        add(MenuI, BorderLayout.WEST);
    }
    
}
