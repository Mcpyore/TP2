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
public class Nota extends Documento {
    Integer nro;
    Integer anio;
    String asunto;
            
public Nota (Integer nro, Integer anio, String asunto, Integer id, Date fechacreacion){
    super(id,fechacreacion);
    this.nro=nro;
    this.asunto=asunto;
    this.anio=anio;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }


}
