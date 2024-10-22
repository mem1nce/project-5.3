import java.util.Scanner;

public class Main {

    // Özyinelemeli asal kontrol metodu
    public static boolean asalMi(int sayi, int i) {
        // 1 ve 0 asal sayı değildir
        if (sayi <= 1) {
            return false;
        }
        // 2 asal sayıdır
        if (sayi == 2) {
            return true;
        }
        // i, sayının kareköküne kadar olan sayılarla kontrol
        if (i * i > sayi) {
            return true; // Eğer i sayının kareköküne kadar ulaştıysa asal
        }
        // Eğer sayi i'ye tam bölünüyorsa asal değildir
        if (sayi % i == 0) {
            return false;
        }
        // Bir sonraki sayıyı kontrol etmek için özyineleme
        return asalMi(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt(); // Kullanıcıdan sayıyı al

        // Asallığı kontrol et, başlangıçta i=2'den başla
        boolean asal = asalMi(sayi, 2);

        // Sonucu yazdır
        if (asal) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

        // Scanner'ı kapat
        input.close();
    }
}
