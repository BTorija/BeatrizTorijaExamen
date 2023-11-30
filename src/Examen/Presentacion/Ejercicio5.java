package Examen.Presentacion;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "“Nunca mates una mosca sobre la cabeza de un tigre.”";
        //Mostrar la cadena en mayusculas
        System.out.println(frase.toUpperCase());
        //Mostrar la cadena en minusculas
        System.out.println(frase.toLowerCase());
        //Mostrar solo la palabra sobre
        int posicionInicial = frase.indexOf("sobre");
        System.out.println(posicionInicial);
        System.out.println("sobre".length());
        System.out.println("("+ frase.substring(posicionInicial,posicionInicial+"sobre".length())+")");
        //Mostrar la longitud de la cadena
        System.out.println(frase.length());
    }
}
