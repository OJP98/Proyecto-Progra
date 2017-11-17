
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;


/**
 * Clase mediante la cual el programa puede establecer una conexión con MongoDB
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 * @version 17.11.17
 */
public class Connection {
     Datastore ds;
  
    /**
     * Crea una conexión entre el programa y el servidor de MongoDB
     */
    public Connection(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Orden.class).map(Usuarios.class);
        ds = morphia.createDatastore(mongo, "ordenes");
    }
    
}
