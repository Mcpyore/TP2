/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Carrera {
    private Integer idCarrera;
    private String nomCarrera;
    private List<Plan> planes;

    public Carrera(Integer idCarrera, String nomCarrera) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.planes = new ArrayList<>();
    }

     public Carrera(Integer idCarrera, String nomCarrera, List<Plan> planes) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.planes = planes;
    }   

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plan> planes) {
        this.planes = planes;
    }
    
    public void addPlan(Plan plan) {
        planes.add(plan);
    }

    public void daletePlan(Plan plan) {
        planes.remove(plan);
    }


    
    
    
}
