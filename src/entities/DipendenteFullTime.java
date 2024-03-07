// DipendenteFullTime.java

// Classe DipendenteFullTime che estende Dipendente
public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    // Implementazione del metodo per calcolare lo stipendio
    public double calculateSalary() {
        return getStipendio();
    }
}
