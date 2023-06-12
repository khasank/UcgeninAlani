package Giris;

import java.util.Scanner;

public class UcgeninAlaniniHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz.
        double aKenari , bKenari , cKenari , ucgeninAlani , u ; // u = kenarlar toplamının yarısı .

        //Scanner sınıfımızı tanımlıyoruz.
        Scanner giris = new Scanner(System.in) ;

        // Kullanıcıdan kenarları alıyoruz.
        System.out.print(" A Kenarın uzunluğunu Giriniz : ");
        aKenari = giris.nextDouble() ;
        System.out.print(" B Kenarın uzunluğunu Giriniz : ");
        bKenari = giris.nextDouble() ;
        System.out.print(" C Kenarın uzunluğunu Giriniz : ");
        cKenari = giris.nextDouble() ;

        // Hesapalama işlemini yapıyoruz. u = kenarlar toplamının yarısı .
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        u = (aKenari+bKenari+cKenari)/2 ;
        ucgeninAlani = Math.sqrt (u * ( u - aKenari) * (u - bKenari) * ( u - cKenari)) ;

        // Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println(" Üçgenin Alanı : " + ucgeninAlani);

    }
}
