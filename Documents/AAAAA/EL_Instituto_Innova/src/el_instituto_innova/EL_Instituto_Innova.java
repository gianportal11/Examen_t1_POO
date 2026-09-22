/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el_instituto_innova;

import java.util.Scanner;

/**
 *
 * @author UCA40403
 */
public class EL_Instituto_Innova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        AlumnoController c = new AlumnoController();
        String rpta = "s";
        while (rpta.equalsIgnoreCase("s")) {
            
            Alumno a = new Alumno(); 
            
            System.out.println("Ingrese el tipo de documento (DNI / Residencia Temporal):");
            String tp = sc.nextLine();
            a.setTipoDocumento(tp);

            System.out.println("Ingrese el número de documento:");
            String num = sc.nextLine();
            
            
            System.out.println("Ingrese el nombre completo del alumno:");
            String n = sc.nextLine();
            a.setNombre(n);

            System.out.println("Ingrese el nivel socioeconómico (A, B o C):");
            String nivel = sc.nextLine();
            a.setNivelSocioeconomico(nivel);

            System.out.println("Ingrese el tipo de beca (Ninguna, Parcial, Total):");
            String beca = sc.nextLine();
            a.setTipoBeca(beca);
                     
            c.agregar(a);
            
            System.out.println("\n¿Desea agregar otro alumno? (s/n): ");
            rpta = sc.nextLine();
        }   
        
        c.listar();
        sc.close();
    
    }
    
}
