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
                System.out.println("Welches Wort soll in Caesar verschlüsselt werden?");
                String optionString = scanner.nextLine();
                caesar.setKt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                caesar.setS(option);
                caesar.Verschlüsseln();
                System.out.println("Das verschlüsselte Wort ist " + caesar.getGt());
            }
            else if (option == 2) {
                System.out.println("Welches Wort soll in Caesar Entschlüsselt werden?");
                String optionString = scanner.nextLine();
                caesar.setGt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                caesar.setS(option);
                caesar.Entschlüsseln();
                System.out.println("Das entschlüsselte Wort ist " + caesar.getKt());
            }
            else if (option == 3) {
                System.out.println("Welches Wort soll in Viginere entschlüsselt werden?");
                String optionString = scanner.nextLine();
                viginere.setGt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                viginere.setS(option);
                viginere.Entschlüsseln();
                System.out.println("Das entschlüsselte Wort ist " + viginere.getKt());

            }
            else if (option == 4) {
                System.out.println("Welches Wort soll in Viginere verschlüsselt werden?");
                String optionString = scanner.nextLine();
                viginere.setKt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                viginere.setS(option);
                viginere.Entschlüsseln();
                System.out.println("Das verschlüsselte Wort ist " + viginere.getGt());

            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }


    }
}
