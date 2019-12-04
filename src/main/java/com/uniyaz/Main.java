package com.uniyaz;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        MenuIslemleriIcinMetotlar menuIslemleriMetotlar=new MenuIslemleriIcinMetotlar();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*********************MENÜ*********************");
            System.out.println("\n");
            System.out.println("1-Yazılan Cümleyi Tersten Yazma");
            System.out.println("2-Rakamlarla Yıldızlar");
            System.out.println("3-Cümleden Parça Alma");
            System.out.println("4-Girilen Sayıya Kadar Olan Tek Sayılar");
            System.out.println("5-Girilen Sayıya Kadar Olan Çift Sayılar");
            System.out.println("\nHangi İşlemi yapmak istiyorsunuz?");

            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("\n******************YAZILAN CÜMLEYİ TERSTEN YAZMA******************");
                System.out.println("\n");
                scanner.nextLine();
                menuIslemleriMetotlar.girilenCumleyiTerstenYaz();

            } else if (secim == 2) {
                System.out.println("\n*********************RAKAMLARLA YILDIZLAR*********************");
                System.out.println("\n");

                menuIslemleriMetotlar.girilenRakamdanYıldızOlustur();

            } else if (secim == 3) {
                System.out.println("\n******************CÜMLEDEN PARÇA ALMA******************");
                System.out.println("\n");

                menuIslemleriMetotlar.cumledenParcaAl();

            } else if (secim == 4) {
                System.out.println("\n************GİRİLEN SAYIYA KADAR OLAN TEK SAYILAR************");
                System.out.println("\n");

                menuIslemleriMetotlar.girilenRakamaKadarOlanTekSayıBul();

            } else if (secim == 5) {
                System.out.println("\n************GİRİLEN SAYIYA KADAR OLAN ÇİFT SAYILAR************");
                System.out.println("\n");

                menuIslemleriMetotlar.girilenRakamaKadarOlanCiftSayıBul();
            }
        }

    }
    }
