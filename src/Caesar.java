public class Caesar {
    private String Gt;
    private String Kt;
    private int S;



    public void verschlüsseln(){
        for (int i = 0; i < Kt.length(); i++) {
            int W = this.getASCII(Kt.charAt(i));
            Gt = Gt + this.getChar( W + S);
        }
    }
    public void entschlüsseln(){
        for (int i = 0; i < Kt.length(); i++) {
            int W = this.getASCII(Kt.charAt(i));
            Kt = Kt + this.getChar( W - S);


    }
    private int getASCII(char pWert){
        return (int) pWert;

    }
    private char getChar (int pWert){
        return (char) pWert;

    }

    public String getGt() {
        return Gt;
    }

    public void setGt(String Gt) {
        this.Gt = Gt;
    }

    public String getKt() {
        return Kt;
    }

    public void setKt(String Kt) {
        this.Kt = Kt;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        this.s = s;
    }
}

















}
