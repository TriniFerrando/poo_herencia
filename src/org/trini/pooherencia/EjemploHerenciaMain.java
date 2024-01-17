package org.trini.pooherencia;

public class EjemploHerenciaMain {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Trini");




        Profesor profesor = new Profesor();
        profesor.setNombre("Carla");

        System.out.println("Nombre del alumno: "+alumno.getNombre());
        System.out.println("Nombre del docente: "+profesor.getNombre());
    }
}
