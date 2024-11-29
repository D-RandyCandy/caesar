public class Vigenere {

    private String gt; //Geheimtext
    private String kt; // Klartext
    private String schlüssel; //Schlüssel für die Verschlüsselung



    public Vigenere(){
        kt=""; //Entleert Klartext
        schlüssel=""; //Entleert Schlüsselwort
        gt=""; //Entleert Geheimtext
    }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void verschlÜsseln(){
        for (int i = 0; i < kt.length(); i++) {     // Durchläuft die ganze Zeichenkette
            int d = this.buchstabenZuZahlen(kt.charAt(i));
            int j = this.buchstabenZuZahlen(schlüssel.charAt(i));
            gt = gt + this.zahlenZuBuchstaben((char) (d+j));
        }
    }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void entschlusseln() {
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
    public String getgt(){
        return gt;
    }
    public void setgt(String pGt) {

    }
    public String getkt(){

        return kt;
    }
    public void setkt(String pKt){

    }
    public String getschluessel(){
        return schlüssel;
    }
    public void setschluessel(String pSchluessel){

    }







}
