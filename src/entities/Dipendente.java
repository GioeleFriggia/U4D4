// Dipendente.java

// Definizione dell'interfaccia Dipartimento
interface Dipartimento {
    String PRODUZIONE = "PRODUZIONE";
    String AMMINISTRAZIONE = "AMMINISTRAZIONE";
    String VENDITE = "VENDITE";
}

// Classe astratta Dipendente
public abstract class Dipendente implements Dipartimento {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    // Costruttore
    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Metodo getter per la matricola
    public String getMatricola() {
        return matricola;
    }

    // Metodo getter per lo stipendio
    public double getStipendio() {
        return stipendio;
    }

    // Metodo getter per il dipartimento
    public String getDipartimento() {
        return dipartimento;
    }

    // Metodo setter per il dipartimento
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto per calcolare lo stipendio
    public abstract double calculateSalary();
}
