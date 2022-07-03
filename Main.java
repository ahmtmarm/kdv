import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz : ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran ;
        System.out.println(kdvTutar);
        double toplamTutar = tutar + kdvTutar;
        System.out.println(toplamTutar);


    }
}


