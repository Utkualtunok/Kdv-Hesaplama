import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz : ");
        tutar = input.nextDouble();
        if (tutar <= 1000){
            kdvTutar = tutar * 0.18;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("Alınan KDV : " + kdvTutar);
            System.out.println("KDV'li Ücret : " + kdvliTutar);
        }
        else {
            kdvTutar = tutar * 0.08;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("Alınan KDV : " + kdvTutar);
            System.out.println("KDV'li Ücret : " + kdvliTutar);
        }
        }
    }
