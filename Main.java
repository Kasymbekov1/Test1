import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Na ulice pogoda 10 C");
        int temperatur = scanner.nextInt();
        if (temperatur >= 30) {
            System.out.println("Ochen` jarko");
        } else if (temperatur >= 20) {
            System.out.println("Teplo");
        } else if (temperatur >= 10) {
            System.out.println("Prohladno");
        } else if (temperatur >= 0) {
            System.out.println("Holodno");
        } else {
            System.out.println("Moroz");
        }
        

        scanner.close();
    }
}