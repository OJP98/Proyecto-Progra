
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
    public int contador=1000;
    
    public Procesos(){
         
        String user = "", pass = "";    
    }
    
    public void getContador(){
        Connection con = new Connection();
        Query<Orden> query = con.ds.createQuery(Orden.class);
        List<Orden> ordenes = query.asList();
        
        if (ordenes.size() != 0){
        int nCont = ordenes.get(ordenes.size() - 1).getIdOrden();
        
        if (nCont != 1000){ 
            contador = nCont;
        }
        }else{ 
            contador = 1000;
        }
        
        //Query<Integer> query = con.ds.
        //contador = query.get();
        
        //contador = cont.get(0);
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
    
    /**
     * Se encarga de agregar un usuario a la lista de usuarios
     * @param usuario: el nombre del usuario
     * @param contra: la contraseña del usuario
     * @param usuariosCalc: la lista de usuarios
     */
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
    
    /**
     * Devuelve el numero de restaurante que eligió el usuario, por ejemplo el numero 0 es GoGreen
     * @param restaurantesCbx: el combobox contenedor de las opciones de restaurantes
     * @return opt: la opcion ed restaurante seleccionada
     */
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
    
    /**
     * Muestra las opciones disponibles de un restaurante
     * @param x: el restaurante elegido por el usuario
     * @param comidaCbx: el combobox de platos fuertes
     * @param bebidaCbx: el combobox de bebidas
     * @param chipsCbx: el combobox de chips
     */
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
    
    /**
     * Retorna el precio que cuesta cada platillo
     * @param comida: el combobox de platos fuertes
     * @param comidaSpinner: el spinner con la cantidad de alimentos que se comprará
     * @return precioTC: el precio del platillo
     */
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
            case "Sin opción":
                comidaSpinner.setValue(0);
                break;
        }
        
        precioTC = precioC*cantidad;
        return precioTC;
    }
    
    /**
     * Retorna el precio que cuesta cada chip
     * @param chips: el combobox de chips
     * @param chipsSpinner: el spinner con la cantidad de chips que se comprará
     * @return precioTC: el precio de los chips
     */
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
            case "Sin opción":
                chipsSpinner.setValue(0);
                break;
        }
        
        precioTC = precioC*cantidad;
        return precioTC;
    }
    
    /**
     * Retorna el precio que cuesta cada bebida
     * @param bebidas: el combobox de bebidas
     * @param bebidasSpinner: el spinner con la cantidad de bebidas que se comprará
     * @return precioTB: el precio de las bebidas
     */
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
            case "Sin opción":
                bebidasSpinner.setValue(0);
                break;
                
        }
        
        
        precioTB = precioB * cantidad;
        return precioTB;
    }
    
    /**
     * Retorna un precio total, siendo esto lo que el usuario debe pagar
     * @param precioC: el precio de la comida seleccionada
     * @param precioCh: el precio de los chips seleccionada
     * @param precioB: el precio de la bebida seleccionada
     * @return precioT: el precio total
     */
    public int precioTotal(int precioC, int precioCh, int precioB){
        int precioT=0;
        precioT = precioC+precioCh+precioB;
        return precioT;
    }
    
    /**
     * Crea un objeto de tipo orden
     * @param text: el label donde se desplegarán los detalles de la orden
     * @param comida: el alimento seleccionado
     * @param chips: los chips seleccionados
     * @param bebida: la bebida seleccionada
     * @param cCom: la cantidad de alimentos
     * @param cChi: la cantidad de chips
     * @param cBeb: la cantidad de bebidas
     * @param comment: un comentario, en caso que el usuario decida pedir su orden sin tomate, etc
     * @param fecha: la fecha para la que se desea la orden
     * @param id: el id de la orden
     * @param ordenes: la lista de ordenes
     */
    public void crearOrden(JLabel text, String comida, String chips, String bebida, int cCom, int cChi, int cBeb, String comment, Date fecha, int id, double total, ArrayList<Orden> ordenes){
        Orden ord = new Orden(comida, bebida, chips, comment, contador, cCom, cBeb, cChi, fecha, total);
        ordenes.add(ord);
        text.setText(ord.toString());
    }
    
    public void eliminarOrden(ArrayList<Orden> ordenes){ 
        
    }
    
    /**
     * Salva los usuarios a la base de datos de MongoDB
     * @param users: la lista de usuarios creada en el programa
     */
    public void salvarUsers(ArrayList<Usuarios> users){ 
        Connection con = new Connection();
        
        for(Usuarios user: users){ 
            con.ds.save(user);
        }
    }
    
    /**
     * Cuando se inicia el programa, se consigue la lista de usuarios
     * @param users: la lista a ser rellenada con los usuarios existentes
     */
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
    
    public void conseguirListaOrdenes(ArrayList<Orden> ords){ 
        try{
          Connection con = new Connection();
          
            if (ords.size() == 0){ 
                Query<Orden> query = con.ds.createQuery(Orden.class);
                List<Orden> ordenes = query.asList();
                
                ordenes.forEach((orden) -> {
                    ords.add(orden);
                });
            }
            
            
        }catch(Exception e){ 
            
        }
    }
    
    public void salvarOrd(ArrayList<Orden> ords){ 
        Connection con = new Connection();
        
        for(Orden ord: ords){ 
            con.ds.save(ord);
        }
        
        con.ds.save(contador);
        contador += 1;
    }
    
}

