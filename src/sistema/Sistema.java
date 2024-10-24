/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import vista.CrearProducto;
import vista.RegistroEmpleados;
import vista.LoginVista;
import vista.Inventario;
/**
 *
 * @author Dania Lozano
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vista de Login
        LoginVista loginVista = new LoginVista();

        // Visible ventana logi
        loginVista.setVisible(true);
        
        RegistroEmpleados registro = new RegistroEmpleados();
        registro.setVisible(true);
        CrearProducto crear = new CrearProducto();
        crear.setVisible(true);
        
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
    }
    
}
