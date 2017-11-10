
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.mongodb.morphia.query.Query;

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
    public boolean Validar(String usuario, String contra, ArrayList<Usuarios> usuariosCalc) {
        
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
    
    public void agregarUsuario(String usuario, String contra, ArrayList<Usuarios> usuariosCalc){
        
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
    
    public int getRestaurante(JComboBox restaurantesCbx){
        int opt = 0;
        
        switch((String) restaurantesCbx.getSelectedItem()){
            case "Go Green":
                opt = 1;
                break;
            case "Gitanne":
                opt = 2;
                break;
            case "Bagel Bros":
                opt = 3;
                break;
            case "Snackers":
                opt = 4;
                break;
        }
        
        return opt;
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
                //Snackers...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Chicken Nuggs", "Pan con Pollo", "Wrap", "Pizzadilla" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Coca Cola", "Petit Durazno", "Squiz", "Petit Piña" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Papas", "Dorito Verde", "Dorito Rojo", "Lays Verdes" }));
                break;
        } 
        
    }
    
    public int colocarPrecioComida(JComboBox comida, JSpinner comidaSpinner){
        int precioC=0, precioTC=0;
        int cantidad = (int) comidaSpinner.getValue();
        
        switch ((String) comida.getSelectedItem()){ 
            case "iGO Indic":
                precioC = 25;
                break;
            case "iGO Cesar":
                precioC = 20;
                break;
            case "iGO Club":
                precioC = 25;
                break;
            case "Ensalada":
                precioC = 35;
                break;
            case "Pollo Cesar":
                precioC = 30;
                break;
            case "Pavocado":
                precioC = 30;
                break;
            case "Napoli":
                precioC = 25;
                break;
            case "Grilled Cheese":
                precioC = 20;
                break;
            case "Gitane Pollo":
                precioC = 32;
                break;
            case "Quesadilla":
                precioC = 25;
                break;
            case "Croissant":
                precioC = 20;
                break;
            case "Hamburgesa":
                precioC = 25;
                break;
            case "Chicken Nuggs":
                precioC = 20;
                break;
            case "Pan con Pollo":
                precioC = 20;
                break;
            case "Wrap":
                precioC = 25;
                break;
            case "Pizzadilla":
                precioC = 15;
                break;
        }
        
        precioTC = precioC*cantidad;
        return precioTC;
    }
    
    public int colocarPrecioChips(JComboBox chips, JSpinner chipsSpinner){
        int precioC=0, precioTC=0;
        int cantidad = (int) chipsSpinner.getValue();
        
        switch ((String) chips.getSelectedItem()){ 
            case "Lays":
                precioC = 5;
                break;
            case "Lays Verdes":
                precioC = 6;
                break;
            case "Dorito Rojo":
                precioC = 5;
                break;
            case "Dorito Verde":
                precioC = 6;
                break;
            case "Brownie":
                precioC = 8;
                break;
            case "Papas":
                precioC = 10;
                break;
        }
        
        precioTC = precioC*cantidad;
        return precioTC;
    }
    
    public int colocarPrecioBebidas(JComboBox bebidas, JSpinner bebidasSpinner){
        int precioB=0, precioTB=0;
        int cantidad = (int) bebidasSpinner.getValue();
        
        switch ((String) bebidas.getSelectedItem()){ 
            case "Pepsi Light":
                precioB = 5;
                break;
            case "Limonada Piña":
                precioB = 6;
                break;
            case "Agua Pura":
                precioB = 4;
                break;
            case "Limonada Fresa":
                precioB = 6;
                break;
            case "Pepsi":
                precioB = 5;
                break;
            case "Mirinda":
                precioB = 5;
                break;
            case "7 Up":
                precioB = 5;
                break;
            case "Horchata":
                precioB = 6;
                break;
            case "Naranjada":
                precioB = 6;
                break;
            case "Jamaica":
                precioB = 6;
                break;
            case "Limonada":
                precioB = 6;
                break;
            case "Coca Cola":
                precioB = 5;
                break;
            case "Petit Durazno":
                precioB = 4;
                break;
            case "Squiz":
                precioB = 4;
                break;
            case "Petit Piña":
                precioB = 4;
                break;
                
        }
        
        
        precioTB = precioB * cantidad;
        return precioTB;
    }
    
    public int precioTotal(int precioC, int precioCh, int precioB){
        int precioT=0;
        precioT = precioC+precioCh+precioB;
        return precioT;
    }
    
    public void crearOrden(JLabel text, String comida, String chips, String bebida, int cCom, int cChi, int cBeb, String comment, Date fecha, String id, ArrayList<Orden> ordenes){
        Orden ord = new Orden(comida, bebida, chips, comment, id, cCom, cBeb, cChi, fecha);
        ordenes.add(ord);
        text.setText(ord.toString());
    }
    
    public void eliminarOrden(ArrayList<Orden> ordenes){ 
        
    }
    
    public void salvarUsers(ArrayList<Usuarios> users){ 
        Connection con = new Connection();
        
        for(Usuarios user: users){ 
            con.ds.save(user);
        }
    }
    
    public void conseguirListaUsers(ArrayList<Usuarios> users){ 
        try{
          Connection con = new Connection();
          
            if (users.size() == 0){ 
                Query<Usuarios> query = con.ds.createQuery(Usuarios.class);
                List<Usuarios> usuarios = query.asList();
                
                usuarios.forEach((usera) -> {
                    users.add(usera);
                });
            }
            
            
        }catch(Exception e){ 
            
        }
    }
    
}

