import static javax.swing.JOptionPane.showMessageDialog;

public class Person {
    String navn;
    String adresse;
    String telefonnr;
    String fødselsår;

    public Person(String navn, String adresse, String telefonnr, String fødselsår) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.fødselsår = fødselsår;
    }

    public int personAlder() {
        int intFødselsår = Integer.parseInt(this.fødselsår);
        return 2025 - intFødselsår;
    }
}
