
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Se encarga de realizar los calculos que se deben utilizar mediante todo el programa
 * @author Oscar Juarez, Rodrigo Zea, Andres Quan
 * @version: 24/10/17
 */
public class Procesos {
    
    private String user, pass;
    public static ArrayList<Usuarios> usuariosCalc = new ArrayList<>();
    public int contador=1;
    
    public Procesos(){
         
        String user = "", pass = "";    
    }

    /**
     * Se encarga de observar si ya existe el usuario en la lista o no. Luego, permite ingresar al usuario al sistema.
     * @param usuario: Almacena el nombre de usuario
     * @param contra: Almacena la contraseña del usuario
     */
    public boolean Validar(String usuario, String contra) {
        
        boolean cuentaE = false;
        boolean confirmar;
        PantallaPrincipal PP = new PantallaPrincipal();
        
        // Busca si existe el usuario o no
        for (int i = 0; i < usuariosCalc.size(); i++) {
            if (usuariosCalc.get(i).getUsuario().equals(usuario) && usuariosCalc.get(i).getClave().equals(contra)) {
                //Si la cuenta existe y el usuario ingreso su clave respectiva
                //Entonces se marca el boolean que la cuenta sí existe
                cuentaE = true;
                
            }
        }
        
        //Si la cuenta existe entonces...
        if (cuentaE == true ){ 
            //Se muestra un aviso de verificación completa
            JOptionPane.showMessageDialog(PP, "Verificación completa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            confirmar = true;
            
        }else{
            //Si no existe entonces que muestre un error
            JOptionPane.showMessageDialog(PP, "Usuario o contraseña incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
            confirmar = false;
            
        }
        
        return confirmar; 
        
    }
    
    public void agregarUsuario(String usuario, String contra){
        
        boolean exists = false;        
        
        try{ 
        //Si no hay ningún usuario registrado que haga esto...    
        if (usuariosCalc.isEmpty()){
             //Agrega un nuevo usuario a la lista
             Usuarios usr1 = new Usuarios(usuario, contra);
             usuariosCalc.add(usr1);
             //Se muestra el mensaje de éxito            
             JOptionPane.showMessageDialog(null, "Éxito", "Usuario Agregado", JOptionPane.INFORMATION_MESSAGE); 
 
        }else{ 
            //Busca si existe el usuario o no
            for (int i = 0; i < usuariosCalc.size(); i++) {
                if (usuariosCalc.get(i).getUsuario().equals(usuario)) {
                  exists = true;
                }
            }
            //Si existe entonces que no se pueda registrar porque ya existe
            if (exists){
                JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Error", JOptionPane.INFORMATION_MESSAGE); 
            //Si no existe que se agregue a la lista de usuarios
            }else{
                Usuarios usr1 = new Usuarios(usuario, contra);
                usuariosCalc.add(usr1);
                //Mensaje de éxito
                JOptionPane.showMessageDialog(null, "Usuario Agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE); 
            }
            
        }
        }catch (Exception e){
            e.getMessage();
        }
        
    }
    
    public void showOpts(int x, JComboBox comidaCbx, JComboBox bebidaCbx, JComboBox chipsCbx){
        
        switch (x){
            case 1:
                //Si eligió GoGreen...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "iGO Indic", "iGO Cesar", "iGO Club", "Ensalada" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pepsi Light", "Limonada Piña", "Agua Pura", "Limonada Fresa" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Lays", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 2:
                //Bagel Bros...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pollo Cesar", "Pavocado", "Napoli", "Grilled Cheese" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pepsi", "Mirinda", "Agua Pura", "7 Up" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Lays", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 3:
                //Café Gitane...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Gitane Pollo", "Quesadilla", "Croissant", "Hamburgesa" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Horchata", "Naranjada", "Jamaica", "Limonada" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Brownie", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 4:
                //Picnic...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pan con Huevo", "Pan con Jamón", "Pan con Frijol", "Sopa" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Aloe Vera", "Mountain Dew", "Pepsi", "Mirinda" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Papas", "Dorito Verde", "Dorito Rojo", "Lays Verdes" }));
                break;
        } 
        
    }
    
}

