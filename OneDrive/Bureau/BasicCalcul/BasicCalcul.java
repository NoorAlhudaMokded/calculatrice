import java.util.Scanner;

public class calculatrice {
    int x;
    int y;

    calculatrice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int addition(int a, int b) {
        return a + b;
    }

    int soustraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    float division(int a, int b) {
        if (b != 0) {
            return (float) a / b;
        } else {
            System.out.println("Erreur : Division par zéro !");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int a;
        int b;
        String choix;

        System.out.print("Donner a : ");
        a = sa.nextInt();
        System.out.print("Donner b : ");
        b = sa.nextInt();
        calculatrice c = new calculatrice(a, b);
        sa.nextLine(); 

        System.out.print("Donner choix de l'opération : ");
        choix = sa.nextLine();

        if (choix.equals("add")) {
            System.out.println("La somme : " + c.addition(a, b));
        } else if (choix.equals("soustraction")) {
            System.out.println("La soustraction : " + c.soustraction(a, b));
        } else if (choix.equals("multi")) {
            System.out.println("La multiplication : " + c.multiplication(a, b));
        } else if (choix.equals("division")) {
            System.out.println("La division : " + c.division(a, b));
        } else {
            System.out.println("Opération non reconnue");
        }
        
        sa.close();
    }
}
