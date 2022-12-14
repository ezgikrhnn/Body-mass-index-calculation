import java.net.SocketTimeoutException;
import java.util.Scanner;

// DERS28 - ODEV SORU COZUMU: 


// soru1: kullanıcıdan aldıgınız degerlere gore vucut kitle endeksini hesaplayınız:
// vucut kitle endeksi= kilo / boy/100 karesi
public class ders28sorucozumu {
    public static void main(String[] args) {
        
        //COZUM1:
        int boy=0;
        double kilo=0;
        Scanner tara = new Scanner(System.in);

        System.out.println("vucut kitle endeks programına hosgeldiniz");
        
        System.out.println("lutfen boyunuzu cm cinsinden giriniz: ");
        boy = tara.nextInt();

        System.out.println("lutfen kilonuzu kg cinsinden giriniz: ");
        kilo = tara.nextDouble();

        double endeks = 0;
        double cmToMetre = (double) boy/100.0;
        double boyunKaresi = Math.pow(cmToMetre,2);

        endeks = kilo / boyunKaresi;

        System.out.println("bulunan endeks degeri: " +endeks);
        
        if(endeks <15){
            System.out.println("Cok ciddi derecede dusuk kilolu");
        }
        else if(endeks > 15 && endeks <= 16){
            System.out.println("Ciddi derecede dusuk kilolu");
        }
        else if(endeks > 16 && endeks <=18.5){
            System.out.println("dusuk klolu");
        }
        else if(endeks > 18.5 && endeks <=25){
            System.out.println("Normal saglıklı kilolu");
        }
        else if(endeks >25 && endeks <=30){
            System.out.println("Fazla kilolu");
        }
        else if(endeks >30 && endeks <=35){
            System.out.println("1. dereceden (hafif) obez");
        }
        else if(endeks > 35 && endeks <=45){
            System.out.println("2. dereceden ciddi obez");
        }
        else{
            System.out.println("3. dereceden cok ciddi obez");
        }

    }
    
}
