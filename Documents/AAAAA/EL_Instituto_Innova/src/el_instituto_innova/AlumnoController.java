/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_instituto_innova;

import java.util.ArrayList;

/**
 *
 * @author UCA40403
 */
public class AlumnoController {
    
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public void listar() {
        System.out.println("\n--- LISTA DE ALUMNOS REGISTRADOS ---");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.print((i + 1) + ". ");
            listaAlumnos.get(i).verDatos();
        }
    }
    
    public void agregar(Alumno nuevoAlumno) {
        listaAlumnos.add(nuevoAlumno);
    }
}
