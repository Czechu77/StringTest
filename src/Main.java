import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//substring concat
public class Main {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String str = skaner.nextLine();

                if (str.length() < 2) {
                    System.out.println("Wyraz który podajesz musi musi mieć co najmniej 2 znaki.");
                } else {

                    int srodek = str.length() / 2;
                    String srodkoweLitery = str.substring(srodek - 1, srodek + 1);


                    String nowyWyraz = srodkoweLitery + str.substring(0, srodek - 1) + str.substring(srodek + 1);

                    System.out.println("Twój nowy wyraz to: " + nowyWyraz);


            }
        }

    }









//Napisz kod w javie który wyciąga 2 literki ze środka wyrazu i umieszcza je na jego początku
