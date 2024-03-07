// Dirigente.java

// Classe Dirigente che estende Dipendente
public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendio, String dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    // Implementazione del metodo per calcolare lo stipendio
    public double calculateSalary() {
        return getStipendio() + bonus;
    }
}
