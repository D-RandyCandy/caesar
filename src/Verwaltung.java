import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caesar caesar;
    public static void main(String[] args){
        new Verwaltung();


    }
    public Verwaltung() {
        caesar=new Caesar();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Verschlüsseln ");
            System.out.println("[2] Entschlüsseln");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Welches Wort soll Verschlüsselt werden?");
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
