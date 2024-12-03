// Die abstrakte Klasse Kryptomat wird erzeugt
public abstract class Kryptomat {
    // Zwei geschützte String-Variablen für Verschlüsselungs- und Entschlüsselungstexte verwendet erzeugt.
    protected String Gt;  // "Geheimtext"
    protected String Kt;  //  "Klartext"

    // Der Konstruktor der abstrakten Klasse. Er wird von den Unterklassen aufgerufen.
    public Kryptomat() {
        // Der Konstruktor ist leer, weil dies eine abstrakte Klasse ist und keine Instanzen direkt erstellt werden.
    }

    // Abstrakte Methode zum Verschlüsseln. Jede Unterklasse muss diese Methode implementieren.
    public abstract void Verschlüsseln();

    // Abstrakte Methode zum Entschlüsseln. Jede Unterklasse muss diese Methode implementieren.
    public abstract void Entschlüsseln();

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
        return Gt;
    }

    // Setter-Methode für den geheimen Text (gt).
    public void setGt(String pGt) {
        Gt = pGt;
    }

    // Getter-Methode für den Klartext (kt).
    public String getKt() {
        return Kt;
    }

    // Setter-Methode für den Klartext (kt).
    public void setKt(String pKt) {
        Kt = pKt;
    }
}
