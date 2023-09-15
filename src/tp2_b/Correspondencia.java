/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_b;

import java.util.Date;

/**
 *
 * @author aquin
 */
public class Correspondencia extends Documento {
    String remitente;
    String direccion;
    
    public Correspondencia (Integer id, Date fechacreacion, String remitente, String direccion) {
        super(id,fechacreacion);
        this.direccion=direccion;
        this.remitente=remitente;
        
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
