/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class S15ejercicio02 {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso01 = new Curso("Estructura de Datos");
        Curso curso02 = new Curso("Sistemas de Bases");
        
        curso01.agregarEstudiante("Peter Jones");
        curso01.agregarEstudiante("Kim Smith");
        curso01.agregarEstudiante("Anne Kennedy");
        
        curso02.agregarEstudiante("Peter Jones");
        curso02.agregarEstudiante("Steve Smith");
        
        System.out.println("");
        System.out.println("N° Esutdiantes   -  Curso01: "+curso01.obtenerNumEstudiantes());
        String[] estudiantesC01 = new String[curso01.obtenerNumEstudiantes()];
        for(int i = 0 ; i < curso01.obtenerNumEstudiantes() ; i++)
        {
            System.out.println("-" + estudiantesC01[i]);
        }
        System.out.println("");
        System.out.println("N° Esutdiantes   -  Curso02: "+curso02.obtenerNumEstudiantes());
        String[] estudiantesC02 = new String[curso02.obtenerNumEstudiantes()];
        for(int i = 0 ; i < curso02.obtenerNumEstudiantes() ; i++)
        {
            System.out.println("-" + estudiantesC02[i]);
        }
        
              
    }
    
}
