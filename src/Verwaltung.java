import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;
    public static void main(String[] args){
        new Verwaltung();


    }
    public Verwaltung() {
        caesar=new Caesar();
        viginere=new Viginere();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Caesar Verschlüsseln ");
            System.out.println("[2] Caesar Entschlüsseln");
            System.out.println("[0] Beenden");
            System.out.println("[3] Viginere Entschlüsseln");
            System.out.println("[4] Viginere Verschlüsseln");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Welches Wort soll in Caesar Verschlüsselt werden?");
                String optionString = scanner.nextLine();
                caesar.setKt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                caesar.setS(option);
                caesar.verschlüsseln();
                System.out.println("Das verschlüsselte Wort ist " + caesar.getGt());
            } else if (option == 2) {
                caesar.verschlüsseln();
                System.out.println("Das entschlüsselte wort ist " + caesar.getKt());


            } else if (option == 0) {
                break;
            }
            System.out.println();
        }


    }
}
