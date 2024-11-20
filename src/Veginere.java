public class Vigenere {

    private String Kt; // Klartext: Der Text, den wir verschlüsseln oder entschlüsseln möchten
    private String Gt; // Geheimtext: Der verschlüsselte Text (Wird nach der Verschlüsselung gespeichert)
    private String S;  // Schlüssel: Der Schlüssel, der für die Verschlüsselung verwendet wird

    // Konstruktor: Setzt die Variablen auf leere Strings
    public Vigenere() {
        Kt = ""; // Klartext
        Gt = ""; // Geheimtext
        S = "";  // Schlüssel
    }

    // Methode zur Verschlüsselung: Wandelt den Klartext (Kt) in Geheimtext (Gt) um
    public void verschluesseln() {
        Gt = ""; // Leeren Geheimtext zu Beginn
        for (int i = 0; i < Kt.length(); i++) { // Gehe jeden Buchstaben im Klartext durch
            char textChar = Kt.charAt(i); // Hole den aktuellen Buchstaben

            // Wenn der Buchstabe ein Buchstabe (A-Z oder a-z) ist, verschlüsseln
            if (Character.isLetter(textChar)) {
                int h = this.buchstabenzuZahlen(textChar); // Klartextzeichen in Zahl umwandeln (z.B. A -> 0, B -> 1, ...)
                int j = this.buchstabenzuZahlen(S.charAt(i % S.length())); // Schlüsselzeichen in Zahl umwandeln (benutze das i-te Zeichen des Schlüssels)
                // Berechne den neuen Buchstaben (verschlüsselt) und hänge ihn an den Geheimtext
                Gt = Gt + this.zahlenZuBuchstaben((h + j) % 26); // Modulo 26, um sicherzustellen, dass der Wert im Bereich 0-25 bleibt
            } else {
                // Wenn es kein Buchstabe ist, bleibt es unverändert (z.B. Leerzeichen oder Sonderzeichen)
                Gt = Gt + textChar;
            }
        }
    }

    // Methode zur Entschlüsselung: Wandelt den Geheimtext (Gt) zurück in den Klartext (Kt)
    public void entschluesseln() {
        Kt = ""; // Leeren Klartext zu Beginn
        for (int i = 0; i < Gt.length(); i++) { // Gehe jeden Buchstaben im Geheimtext durch
            char cipherChar = Gt.charAt(i); // Hole den aktuellen verschlüsselten Buchstaben

            // Wenn der Buchstabe ein Buchstabe (A-Z oder a-z) ist, entschlüsseln
            if (Character.isLetter(cipherChar)) {
                int h = this.buchstabenzuZahlen(cipherChar); // Geheimtextzeichen in Zahl umwandeln
                int j = this.buchstabenzuZahlen(S.charAt(i % S.length())); // Schlüsselzeichen in Zahl umwandeln
                // Berechne den neuen Buchstaben (entschlüsselt) und hänge ihn an den Klartext
                Kt = Kt + this.zahlenZuBuchstaben((h - j + 26) % 26); // +26, um negative Ergebnisse zu vermeiden (falls h kleiner als j ist)
            } else {
                // Wenn es kein Buchstabe ist, bleibt es unverändert (z.B. Leerzeichen oder Sonderzeichen)
                Kt = Kt + cipherChar;
            }
        }
    }

    // Methode zur Umwandlung von Zahlen in Buchstaben: Zahl (0-25) wird in einen Buchstaben umgewandelt
    public char zahlenZuBuchstaben(int pWert) {
        return (char) ('A' + pWert); // Wandelt 0-25 in 'A'-'Z' um
    }

    // Methode zur Umwandlung von Buchstaben in Zahlen: Buchstabe wird in Zahl (0-25) umgewandelt
    public int buchstabenzuZahlen(char pWert) {
        if (Character.isLowerCase(pWert)) {
            return pWert - 'a'; // Wenn es ein Kleinbuchstabe ist (a-z), dann 'a' wird zu 0
        } else {
            return pWert - 'A'; // Wenn es ein Großbuchstabe ist (A-Z), dann 'A' wird zu 0
        }
    }

    // Setter und Getter für Klartext (Kt)
    public void setKt(String pWert) {
        this.Kt = pWert;
    }

    public String getKt() {
        return Kt;
    }

    // Setter und Getter für Schlüssel (S)
    public String getS() {
        return S;
    }

    public void setS(String pWert) {
        this.S = pWert;
    }

    // Setter und Getter für Geheimtext (Gt)
    public String getGt() {
        return Gt;
    }

    public void setGt(String pWert) {
        this.Gt = pWert;
    }

}
