import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan angka pertama: ");
                double angka1;
                try {
                    angka1 = scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    throw new IllegalArgumentException("Input yang Anda masukan tidak valid.");
                }

                System.out.print("Masukkan angka kedua: ");
                double angka2;
                try {
                    angka2 = scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    throw new IllegalArgumentException("Input yang Anda masukan tidak valid.");
                }

                System.out.print("Masukkan operator matematika (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double hasil;

                switch (operator) {
                    case '+':
                        hasil = angka1 + angka2;
                        break;
                    case '-':
                        hasil = angka1 - angka2;
                        break;
                    case '*':
                        hasil = angka1 * angka2;
                        break;
                    case '/':
                        if (angka2 == 0) {
                            throw new ArithmeticException("Tidak dapat melakukan pembagian dengan 0\n");
                        }
                        hasil = angka1 / angka2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operator yang Anda masukkan tidak valid\n");

                }

                System.out.println("Hasil: " + hasil);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Maaf, " + e.getMessage());
            }

            scanner.nextLine();
        }
    }
}