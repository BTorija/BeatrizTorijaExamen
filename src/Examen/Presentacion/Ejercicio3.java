package Examen.Presentacion;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero=8;
        switch (numero){
            case 1:
                System.out.println("para microcoche");
                break;
            case 2:
                System.out.println("para automóviles compactos");
                break;
            case 3:
                System.out.println("para automóviles ultracompactos");
                break;
            case 4:
                System.out.println("para automóvil familiar");
                break;
            case 5:
                System.out.println("para vehículo de lujo");
                break;
            case 6:
                System.out.println("automóvil deportivo");
                break;
            case 7:
                System.out.println("Descapotable");
                break;
            case 8:
                System.out.println("Todoterreno");
            default:
                System.out.println("Valor incorrecto");

        }
    }
}
