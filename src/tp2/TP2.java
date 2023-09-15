/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.List;
import modelo.Carrera;
import modelo.Plan;
import modelo.Materia;

/**
 *
 * @author PC
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // a) Instanciar dos Carreras
        Carrera carrera1 = new Carrera (1,"Ingenieria Informatica");
        Carrera carrera2 = new Carrera (2,"Nutricion");
        
        // b) Instanciar cuatro Planes
        Plan plan1Carrera1 = new Plan (101,"Plan 2005",2005);
        Plan plan2Carrera1 = new Plan (102,"Plan 2010",2010);
        Plan plan3Carrera1 = new Plan (103,"Plan 2017",2017);
        
        Plan plan1Carrera2 = new Plan (104,"Plan 2020",2020);
        
        // c) Instanciar cuatro Materias
        Materia materia1Plan1 = new Materia(1001, "Programación Avanzada II", 1);
        Materia materia2Plan1 = new Materia(1002, "Bases de Datos", 1);
        
        Materia materia1Plan2 = new Materia(1003, "Biologia", 1);
        Materia materia2Plan2 = new Materia(1004, "Quimica", 1);
        
        // Asociar los planes a las carreras
        carrera1.addPlan(plan1Carrera1);
        carrera1.addPlan(plan2Carrera1);
        carrera1.addPlan(plan3Carrera1);
        carrera2.addPlan(plan1Carrera2);
        
        // Asociar las materias a los planes
        plan3Carrera1.addMateria(materia1Plan1);
        plan3Carrera1.addMateria(materia2Plan1);
        
        plan1Carrera2.addMateria(materia1Plan2);
        plan1Carrera2.addMateria(materia2Plan2);
        
        System.out.println("Materias de la carrera 'Ingenieria Informatica':");
        for (Plan plan : carrera1.getPlanes()) {
            System.out.println(carrera1.getNomCarrera());
            System.out.println(plan.getNomPlan());

            List<Materia> materias = plan.getMaterias();
            for (int i = 0; i < materias.size(); i++) {
                Materia materia = materias.get(i);
                System.out.println((i + 1) + ". " + materia.getNomMat() + ", Anio: " + materia.getAnioCursado());
            }
        }       
        
        
        
        
        
        
    }
    
}
