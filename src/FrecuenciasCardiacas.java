import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;


    public FrecuenciasCardiacas(String primerNombre, String apellido, int mes, int dia, int anio) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mes;
        this.diaNacimiento = dia;
        this.anioNacimiento = anio;
    }


    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }


    public int calcularEdad() {
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }


    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }


    public String calcularFrecuenciaEsperada() {
        int maxima = calcularFrecuenciaMaxima();
        double limiteInferior = maxima * 0.50;
        double limiteSuperior = maxima * 0.85;
        return String.format("%.0f - %.0f pulsaciones por minuto", limiteInferior, limiteSuperior);
    }
}
