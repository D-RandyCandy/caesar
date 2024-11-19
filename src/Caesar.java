public class Caesar {
    // Ein privates Feld, das den verschlüsselten Text speichert
    private String Gt;
    // Ein privates Feld, das den Klartext (den zu verschlüsselnden oder entschlüsselnden Text) speichert
    private String Kt;
    // Ein privates Feld, das den Schlüssel (die Verschiebung der Buchstaben) speichert
    private int S;

    // Methode zum Verschlüsseln des Textes
    public void verschlüsseln(){
        // Schleife durch jedes Zeichen im Klartext (Kt)
        for (int i = 0; i < Kt.length(); i++) {
            // Hole den ASCII-Wert des aktuellen Zeichens
            int W = this.getASCII(Kt.charAt(i));
            // Verschiebe den ASCII-Wert um den Wert von S und füge das verschlüsselte Zeichen zum verschlüsselten Text (Gt) hinzu
            Gt = Gt + this.getChar(W + S);
        }
    }

    // Hilfsmethode, um den ASCII-Wert eines Zeichens zu erhalten
    private int getASCII(char pWert) {
        return (int) pWert;  // Gibt den ASCII-Wert des Zeichens zurück
    }

    // Methode zum Entschlüsseln des Textes
    public void entschlüsseln() {
        // Schleife durch jedes Zeichen im verschlüsselten Text (Kt)
        for (int i = 0; i < Kt.length(); i++) {
            // Hole den ASCII-Wert des aktuellen Zeichens
            int W = this.getASCII(Kt.charAt(i));
            // Verschiebe den ASCII-Wert um den Wert von S in die entgegengesetzte Richtung (d.h. -S) und füge das entschlüsselte Zeichen zum Klartext (Kt) hinzu
            Kt = Kt + this.getChar(W - S);
        }
    }

    // Hilfsmethode, um ein Zeichen aus einem ASCII-Wert zu erzeugen
    private char getChar(int pWert) {
        return (char) pWert;  // Wandelt den ASCII-Wert zurück in ein Zeichen um
    }

    // Getter-Methode für Gt (den verschlüsselten Text)
    public String getGt() {
        return Gt;
    }

    // Setter-Methode für Gt (den verschlüsselten Text)
    public void setGt(String Gt) {
        this.Gt = Gt;
    }

    // Getter-Methode für Kt (den Klartext)
    public String getKt() {
        return Kt;
    }

    // Setter-Methode für Kt (den Klartext)
    public void setKt(String Kt) {
        this.Kt = Kt;
    }

    // Getter-Methode für S (den Schlüssel)
    public int getS() {
        return S;
    }

    // Setter-Methode für S (den Schlüssel)
    public void setS(int S) {
        this.S = S;
    }
}


