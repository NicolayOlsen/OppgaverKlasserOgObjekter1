import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        // Ticket Oppgaver
        String inputName = showInputDialog("Navn?");
        String inputPersonNr = showInputDialog("PersonNr?");
        String inputDestination = showInputDialog("Destinasjon?");
        Ticket ticket1 = new Ticket(inputName, inputPersonNr, inputDestination);
        ticket1.printTicketInfoConsole();
        ticket1.printTicketInfoMessage();

        // Oppgave 1 og 2
        /* String inputTittel = showInputDialog("Hva er tittelen på boken?");
        String inputPris = showInputDialog("Hva er prisen på boken?");
        String inputForfatter = showInputDialog("Hvem er forfatteren til boken?");
        String inputiSBN = showInputDialog("Hva er iSBN-nummeret til boken?");
        Bok bok1 = new Bok(inputTittel, inputPris, inputForfatter, inputiSBN);
        bok1.printBokInfoKonsoll();
        bok1.printBokInfoMelding(); */

        // Oppgave 3 og 4
        /* String inputNavn = showInputDialog("Hva er navnet ditt?");
        String inputAdresse = showInputDialog("Hva er adressen din?");
        String inputTelefonnr = showInputDialog("Hva er telefonnummeret ditt?");
        String inputFødselsår = showInputDialog("Hvem år er du født?");
        Person person1 = new Person(inputNavn, inputAdresse, inputTelefonnr, inputFødselsår);
        int alder = person1.personAlder();
        showMessageDialog(null, person1.navn + " med adresse " + person1.adresse + " med telefonnummer "
                + person1.telefonnr + " er " + alder + " år.");
        showMessageDialog(null, "\nNavn: " + person1.navn + "\n" + "Adresse: " + person1.adresse
                + "\n" + "Telefonnr: " + person1.telefonnr + "\n" + "Alder: " + alder); */

        // Oppgave 5
        /* String inputTall1 = showInputDialog("Skriv et desimaltall");
        String inputTall2 = showInputDialog("Skriv et desimaltall");
        double tall1 = Double.parseDouble(inputTall1);
        double tall2 = Double.parseDouble(inputTall2);
        double addisjon = Kalkulator.Addere(tall1, tall2);
        double subtraksjon = Kalkulator.Subtrahere(tall1, tall2);
        double multiplikasjon = Kalkulator.Multiplisere(tall1, tall2);
        double divisjon = Kalkulator.Dividere(tall1, tall2);
        showMessageDialog(null, "\nAddisjon: " + addisjon + "\n" + "Subtraksjon: " + subtraksjon
                + "\n" + "Multiplikasjon: " + multiplikasjon + "\n" + "Divisjon: " + divisjon); */
    }
}