
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Clase que crea usuarios para las personas que utilizaran el servicio
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 */
@Entity
public class Usuarios {

//Variables de instancia    
@Id private ObjectId idu;
private String usuario, clave;
    
    /**
     * Crea un objeto user a partir de los parametros que le envia el usuario
     * @param usuario: El nombre de usuario
     * @param clave: Un string de la clave
     */
    public Usuarios(String usuario, String clave){ 
        //Cuando se envía el parametro crearlo con lo que el usuario haya dicho                
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public Usuarios(){}
    
    //Getters

    /**
     * Consigue el nombre de usuario de la persona
     * @return usuario: El usuario de la perosna
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Permite configurar el nombre de usuario
     * @param usuario: El usuario a establecer
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Consigue la contrasena de usuario de la persona
     * @return clave: La clave de la cuenta
     */
    public String getClave() {
        return clave;
    }

    /**
     * Permite configurar la contrasena del usuario
     * @param clave: La clave a establecer
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
