import static javax.swing.JOptionPane.showMessageDialog;

public class Ticket {
    private String name;
    private String personNr;
    private String destination;

    public Ticket(String name, String personNr, String destination) {
        if(personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
            this.destination = destination;
        }
        else {
            System.out.println("Advarsel: Ugyldig personnummer, kunne ikke opprette billett");
        }
    }

    public void editTicketInfo(String name, String personNr, String destination) {
        if(personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
            this.destination = destination;
        }
        else {
            System.out.println("Advarsel: Ugyldig personnummer, kunne ikke endre billett");
        }
    }

    private String getMaskedPersonNr() {
        String personNrWithoutLastDigits = this.personNr.substring(0, 6);
        String maskedPersonNr = personNrWithoutLastDigits + "*****";
        return maskedPersonNr;
    }

    public void printTicketInfoConsole() {
        System.out.println("\nNavn: " + this.name);
        System.out.println("PersonNr: " + getMaskedPersonNr());
        System.out.println("Destinasjon: " + this.destination);
    }

    public void printTicketInfoMessage() {
        showMessageDialog(null, "\nNavn: " + this.name + "\n" + "PersonNr: " + getMaskedPersonNr()
                + "\n" + "Destinasjon: " + this.destination);
    }
}
