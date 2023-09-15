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
public class Plan {
    private Integer idPlan;
    private String nomPlan;
    private Integer anioInicio;
    private List<Materia> materias;

    public Plan(Integer idPlan, String nomPlan, Integer anioInicio) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias = new ArrayList<>();
    }
    
    public Plan(Integer idPlan, String nomPlan, Integer anioInicio, List<Materia> materias) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias = materias;
    }    

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

      public void addMateria(Materia materia) {
        materias.add(materia);
    }

    public void deleteMateria(Materia materia) {
        materias.remove(materia);
    }
    
}
