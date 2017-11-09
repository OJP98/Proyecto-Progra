
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL
 */
public class Connection {
     Datastore ds;
  
    /**
     * Crea una conexión entre el programa y el servidor de MongoDB
     */
    public Connection(){
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Orden.class);
        ds = morphia.createDatastore(mongo, "ordenes");
    }
    
}
