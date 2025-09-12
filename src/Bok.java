import static javax.swing.JOptionPane.*;

public class Bok {
    private String tittel;
    private String pris;
    private String forfatter;
    private String iSBN;

    public Bok(String tittel, String pris, String forfatter, String iSBN) {
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.iSBN = iSBN;
    }

    public void setBokInfo(String tittel, String pris, String forfatter, String iSBN) {
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.iSBN = iSBN;
    }

    public void printBokInfoKonsoll() {
        System.out.println("\nTittel: " + this.tittel);
        System.out.println("Pris: " + this.pris + "kr");
        System.out.println("Forfatter: " + this.forfatter);
        System.out.println("iSBN-nummer: " + this.iSBN);
    }

    public void printBokInfoMelding() {
        showMessageDialog(null, "\nTittel: " + this.tittel + "\n" + "Pris: " + this.pris + "kr"
                + "\n" + "Forfatter: " + this.forfatter + "\n" + "iSBN-nummer: " + this.iSBN);
    }
}