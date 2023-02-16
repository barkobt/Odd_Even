import java.util.Scanner;
/*
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
tek sayıları toplayıp ekrana basan programı yazıyoruz.


 */

public class Odd_Sum {
    public static void main(String[] args) {
        /*


        int sum = 0;
        boolean value = true;

        while (value) {
            System.out.println("Bir değer giriniz:");
            Scanner input = new Scanner(System.in);
            int enter = input.nextInt();
            if (enter<0) {
                value = false;
            } else {
                if (enter % 2 != 0) {
                    sum += enter;
                }
            }
        }
        System.out.println("Tek sayıların toplamı:" +sum);
*/
        /*
        int entry;
        int sum = 0;
        boolean value = false;


        do {
            System.out.println("Bir sayı giriniz:");
            Scanner input = new Scanner(System.in);
            entry = input.nextInt();
            if (entry % 2 == 1 && entry>0) {
                sum += entry;

            }


        } while (entry>0);
        System.out.println("Toplam:"+sum);

        Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
        int sum = 0;
        int entry;
        do {
            System.out.println("Bir sayı giriniz:");
            Scanner input = new Scanner(System.in);
            entry = input.nextInt();
            if (entry % 4 == 0 || entry % 2 == 0) {
                sum += entry;
            }
        } while (entry % 2 == 0);
        System.out.println("Toplam:" + sum);


    }

}
