package HelfMethoden;

import java.util.Scanner;

//Klasse für input integer Zahl
public class InputZahl {
    int ZwVar;

    public int AnzahlTest(String Text) {
        try {
            System.out.println(Text);
            Scanner scan = new Scanner(System.in);
            ZwVar = scan.nextInt();
            scan.close();
            return ZwVar;
        } catch (Exception e) {
            System.out.println("Fehler bei Eingabe des AnzahlTest!");
            return -1;
        }
    }
}
