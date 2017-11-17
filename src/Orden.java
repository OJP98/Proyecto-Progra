
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
@Entity
public class Orden {
    
    @Id private ObjectId ido; 
    private String comida, bebida, chips, comentario;
    private int cComidal, cCbebida, cChips, idOrden, restaurante;
    private Date fecha;
    private boolean despachado;
    private double total;

    public Orden(String comida, String bebida, String chips, String comentario, int idOrden, int cComidal, int cCbebida, int cChips, Date fecha, double total, int restaurante) {
        this.comida = comida;
        this.bebida = bebida;
        this.chips = chips;
        this.comentario = comentario;
        this.idOrden = idOrden;
        this.cComidal = cComidal;
        this.cCbebida = cCbebida;
        this.cChips = cChips;
        this.fecha = fecha;
        this.total = total;
    }   
    
    public Orden(){}

    public String getComida() {
        return comida;
    }

    public String getBebida() {
        return bebida;
    }

    public String getChips() {
        return chips;
    }

    public String getComentario() {
        return comentario;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public int getcComidal() {
        return cComidal;
    }

    public int getcCbebida() {
        return cCbebida;
    }

    public int getcChips() {
        return cChips;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }

    public double getTotal() {
        return total;
    }
    
    public int getRestaurante(){
        return restaurante;
    }      
    
    public boolean getDespachado(){
        return despachado;
    }
    
    public String imprimirOrden(){
        return "ID: " + idOrden + " Fecha de entrega: " + fecha + "\nComida: " + comida + " - Cantidad: " + cComidal + "\nBebida: " + bebida + " - Cantidad: " + cCbebida + "\nChips: " + chips + " - Cantidad: " + cChips + "\n"; 
    }
    
    @Override
    public String toString() {
        return "Orden{" + " comida: " + comida +  " cantidad: " + cComidal + "\n Bebida: " + bebida + " cantidad: " + cCbebida + "\n Chips: " + chips + " cantidad: " + cChips + '}';
    }
    
    
        
}
