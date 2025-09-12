import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String inputTittel = showInputDialog("Hva er tittelen på boken?");
        String inputPris = showInputDialog("Hva er prisen på boken?");
        String inputForfatter = showInputDialog("Hvem er forfatteren til boken?");
        String inputiSBN = showInputDialog("Hva er iSBN-nummeret til boken?");
        Bok bok1 = new Bok(inputTittel, inputPris, inputForfatter, inputiSBN);
        bok1.printBokInfoKonsoll();
        bok1.printBokInfoMelding();
    }
}