package com.uniyaz;

import java.util.Scanner;

public class MenuIslemleriIcinMetotlar {
    public void girilenCumleyiTerstenYaz() {

        System.out.print("Tersten yazılmasını istediğiniz cümleyi yazınız..\n");
        Scanner scannerOkunanCumle = new Scanner(System.in);
        String girilenCumle = scannerOkunanCumle.nextLine();
        for (int i = girilenCumle.length() - 1; i >= 0; i--) {
            System.out.print(girilenCumle.charAt(i));
        }

    }

    public void girilenRakamdanYıldızOlustur() {

        System.out.print("Kaç yıldız oluşturulmak istiyorsanız rakamı girin..\n");
        Scanner scannerOkunanRakam = new Scanner(System.in);
        int girilenRakam = scannerOkunanRakam.nextInt();

        int i,j;

        for (j = 1; j <= girilenRakam-1; j++) {
            System.out.print("*\t");
        }
        for (i = 1; i <= girilenRakam; i++)

        {

            System.out.print("*\n\n");
        }

    }
    public void cumledenParcaAl() {

        System.out.print("Parça alınacak cümleyi giriniz..\n");
        Scanner scannerOkunanCumle = new Scanner(System.in);
        String girilenCumle = scannerOkunanCumle.nextLine();

        System.out.print("İlk alınacak değer..\n");
        Scanner scannerOkunanIlkDeger = new Scanner(System.in);
        int alınacakIlkDeger = scannerOkunanIlkDeger.nextInt();

        System.out.print("Son alınacak değer..\n");
        Scanner scannerOkunanSonDeger = new Scanner(System.in);
        int alınacakSonDeger = scannerOkunanSonDeger.nextInt();

        alınacakIlkDeger=alınacakIlkDeger-1;
        alınacakSonDeger=alınacakSonDeger;

        girilenCumle.substring(alınacakIlkDeger, alınacakSonDeger);
        System.out.print(girilenCumle.substring(alınacakIlkDeger, alınacakSonDeger)+"\n");

    }
    public void girilenRakamaKadarOlanTekSayıBul() {

        System.out.print("Hangi sayıya kadar olan tek sayıları yazdırmak istiyorsunuz? Sayıyı giriniz..\n");
        Scanner scannerOkunanSayi = new Scanner(System.in);
        int girilensayi = scannerOkunanSayi.nextInt();

        for (int i = 0; i <= girilensayi; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " \t");

            }
        }
        System.out.println("\n\n");

    }
    public void girilenRakamaKadarOlanCiftSayıBul() {

        System.out.print("Hangi sayıya kadar olan çift sayıları yazdırmak istiyorsunuz? Sayıyı giriniz..\n");
        Scanner scannerOkunanSayi = new Scanner(System.in);
        int girilensayi = scannerOkunanSayi.nextInt();

        for (int i = 0; i <= girilensayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " \t");

            }
        }
        System.out.println("\n\n");

    }
}
