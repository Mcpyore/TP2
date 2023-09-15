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

public class Documento {
    private Integer id;
    private Date fechacreacion;

    // Constructor de Documento
    public Documento(Integer id, Date fechacreacion) {
        this.id = id;
        this.fechacreacion = fechacreacion;
    }

    // Getters y setters para los atributos id y fechacreacion
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
}




