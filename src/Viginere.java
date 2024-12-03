public abstract class Kryptomat{

}
public class Viginere extends Kryptomat {

    private String gt; //Geheimtext
    private String kt; // Klartext
    private String schlüssel; //Schlüssel für die Verschlüsselung



    public Viginere(){
        kt=""; //Entleert Klartext
        schlüssel=""; //Entleert Schlüsselwort
        kt=""; //Entleert Geheimtext
    }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void Verschlüsseln(){
        for (int i = 0; i < kt.length(); i++) {     // Durchläuft die ganze Zeichenkette
            int d = this.buchstabenZuZahlen(kt.charAt(i));
            int j = this.buchstabenZuZahlen(schlüssel.charAt(i));
            gt = gt + this.zahlenZuBuchstaben((char) (d+j));
        }
    }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void Entschlusseln() {
        for (int i = 0; i < gt.length(); i++) {
            int x = this.buchstabenZuZahlen(gt.charAt(i));
            int m = this.buchstabenZuZahlen(schlüssel.charAt(i));
            kt = kt + this.zahlenZuBuchstaben(x - m);
        }
    }
    //Wandelt Buchstaben in Zahlen um.
    private char zahlenZuBuchstaben(int pWert){
        return (char) pWert;
    }
    //Wandelt Zahlen in Buchstaben.
    private int buchstabenZuZahlen(char pWert) {
        return (int) pWert;
    }
    public String getGt(){
        return gt;
    }
    public void setGt(String pGt) {

    }
    public String getKt(){
        return gt;
    }
    public void setKt(String pKt){

    }
    public String getSchlüssel(){
        return schlüssel;
    }
    public void setSchlüssel(String pSchlüssel){

    }







}
