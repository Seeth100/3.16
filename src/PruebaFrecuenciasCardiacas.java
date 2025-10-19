import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int anio = entrada.nextInt();


        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);



        System.out.println("\n****INFORMACIÓN DE LA PERSONA****");
        System.out.printf("Nombre: %s %s%n", persona.getPrimerNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %02d/%02d/%d%n", persona.getDiaNacimiento(), persona.getMesNacimiento(), persona.getAnioNacimiento());

        System.out.println("\n****RESULTADOS****");
        System.out.printf("Edad: %d años%n", persona.calcularEdad());
        System.out.printf("Frecuencia cardíaca máxima: %d pulsaciones por minuto%n", persona.calcularFrecuenciaMaxima());
        System.out.printf("Rango de frecuencia cardíaca esperada: %s%n", persona.calcularFrecuenciaEsperada());
    }
}
