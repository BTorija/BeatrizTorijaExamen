package Examen.Presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Calcular la edad en años de una persona que nacio el 30 de Agosto de 1992

        LocalDate fechaNacimiento= LocalDate.of(1992,8,30);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tiene "+periodo.getYears()+ " años");
        //Mostrar la fecha de hoy
        System.out.println("Hoy es "+LocalDate.now());
        //Añadir dos meses a la fecha de inicio de curso 9 de Octubre de 2023
        LocalDate fechaInicioCurso= LocalDate.of(2023,10,9);
        LocalDate fechaDosMesesDespues=fechaInicioCurso.plusMonths(2);
        System.out.println("Dos meses despues del inicio de curso es la fecha "+ fechaDosMesesDespues);
    }


}
