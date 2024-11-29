// Die abstrakte Klasse Kryptomat wird erzeugt
public abstract class Kryptomat {
    // Zwei geschützte String-Variablen für Verschlüsselungs- und Entschlüsselungstexte verwendet erzeugt.
    protected String gt;  // "Geheimtext"
    protected String kt;  //  "Klartext"

    // Der Konstruktor der abstrakten Klasse. Er wird von den Unterklassen aufgerufen.
    public Kryptomat() {
        // Der Konstruktor ist leer, weil dies eine abstrakte Klasse ist und keine Instanzen direkt erstellt werden.
    }

    // Abstrakte Methode zum Verschlüsseln. Jede Unterklasse muss diese Methode implementieren.
    public abstract void verschlüsseln();

    // Abstrakte Methode zum Entschlüsseln. Jede Unterklasse muss diese Methode implementieren.
    public abstract void entschlüsseln();

    // Eine Hilfsmethode, die einen gegebenen Wert (Integer) in das entsprechende Zeichen (char) umwandelt.
    protected char getChar(int pWert) {
        return (char) pWert; // Der Wert wird in ein Zeichen umgewandelt.
    }

    // Eine Hilfsmethode, die das ASCII-Wert eines Zeichens zurückgibt.
    protected int getASCII(char pWert) {
        return pWert; // Der ASCII-Wert eines Zeichens ist der numerische Wert des Zeichens.
    }

    // Getter-Methode für den geheimen Text (gt).
    public String getGt() {
        return gt;
    }

    // Setter-Methode für den geheimen Text (gt).
    public void setGt(String pGt) {
        gt = pGt;
    }

    // Getter-Methode für den Klartext (kt).
    public String getKt() {
        return kt;
    }

    // Setter-Methode für den Klartext (kt).
    public void setKt(String pKt) {
        kt = pKt;
    }
}
