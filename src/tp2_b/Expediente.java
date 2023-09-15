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

// Clase hija (subclase) Expediente
public class Expediente extends Documento {
    private Integer nro;
    private String letra;
    private Integer anio;
    private String anexo;

    // Constructor de Expediente que llama al constructor de Documento
    public Expediente(Integer id, Date fechacreacion, Integer nro, String letra, Integer anio, String anexo) {
        super(id, fechacreacion); // Llama al constructor de la superclase
        this.nro = nro;
        this.letra = letra;
        this.anio = anio;
        this.anexo = anexo;
    }

    // Getters y setters para los atributos de Expediente
    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
}


