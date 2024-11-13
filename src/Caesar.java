public class Caesar {
    private String gt;
    private String kt;
    private int s;



    public void verschlüsseln(){
        for (int i = 0; i < Kt.length()-1; i++) {
            int w = this.getASCII(Kt.charAt(i));
            Gt = Gt + this.getChar(pWert w + s);
        }
    }
    public void entschlüsseln(){
        for (int i = 0; i < Kt.length()-1; i++) {
            int w = this.getASCII(Kt.charAt(i));
            Kt = Kt + this.getChar(pWert s - w);


    }
    private int getASCII (char pWert){
        return (int) pWert;

    }
    private char getChar (int pWert){
        return (char) pWert;

    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getKt() {
        return kt;
    }

    public void setKt(String kt) {
        this.kt = kt;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}

















}
