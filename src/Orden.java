
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Orden {
    
    private String comida, bebida, chips, comentario, idOrden;
    private int cComidal, cCbebida, cChips;
    private Date fecha;
    private boolean despachado;

    public Orden(String comida, String bebida, String chips, String comentario, String idOrden, int cComidal, int cCbebida, int cChips, Date fecha) {
        this.comida = comida;
        this.bebida = bebida;
        this.chips = chips;
        this.comentario = comentario;
        this.idOrden = idOrden;
        this.cComidal = cComidal;
        this.cCbebida = cCbebida;
        this.cChips = cChips;
        this.fecha = fecha;
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

    public String getIdOrden() {
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
    
    
        
}
