package Examen.Presentacion;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numeroMayor=0;
        int numeroMenor=0;
        int contador1Repetido=0;
        int contadorRepetido=0;

        int[] array1 = new int[]{2,-4,-13,1,-3,15,1,9,6,-8,4,23,7,-13,13,13,23,15,-13,9,0};

        for (int i=0;i<array1.length;i++){
            if (array1[i]>numeroMayor){
                numeroMayor=array1[i];
                contadorRepetido+=1;
            } else if (array1[i]<numeroMenor){
                numeroMenor=array1[i];
                contador1Repetido+=1;

            }


        }
        System.out.println("El número mayor es " + numeroMayor+ " y se repite "+contador1Repetido+ " veces");
        System.out.println("El número menor es " + numeroMenor+ " y se repite "+contadorRepetido+ " veces");



    }
}
