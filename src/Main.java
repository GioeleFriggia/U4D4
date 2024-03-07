// Main.java

public class Main {
    public static void main(String[] args) {
        // Creazione di diversi tipi di dipendenti
        Dipendente dipendente1 = new DipendenteFullTime("001", 2000.00, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendenteFullTime("002", 2500.00, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new DipendentePartTime("003", 15.00, Dipartimento.VENDITE, 20, 15.00);
        Dipendente dipendente4 = new Dirigente("004", 5000.00, Dipartimento.AMMINISTRAZIONE, 1000.00);

        // Creazione di un array di Dipendenti
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3, dipendente4};

        // Calcolando gli stipendi totali utilizzando il polimorfismo
        double stipendiTotali = 0;
        for (Dipendente dipendente : dipendenti) {
            stipendiTotali += dipendente.getStipendio();
        }

        // Stampando gli stipendi totali
        System.out.println("Stipendi totali: " + stipendiTotali + " €");
    }
}
