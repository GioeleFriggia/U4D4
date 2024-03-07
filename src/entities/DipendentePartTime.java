// DipendentePartTime.java

// Classe DipendentePartTime che estende Dipendente
public class DipendentePartTime extends Dipendente {
    private double oreLavorate;
    private double salarioOrario;

    public DipendentePartTime(String matricola, double stipendio, String dipartimento, double oreLavorate, double salarioOrario) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
        this.salarioOrario = salarioOrario;
    }

    // Implementazione del metodo per calcolare lo stipendio
    public double calculateSalary() {
        return oreLavorate * salarioOrario;
    }
}
