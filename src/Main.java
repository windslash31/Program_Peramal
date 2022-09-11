import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //scanner dan deklarasi
        Scanner input = new Scanner(System.in);
        String u,pasangan;
        int uu,up;

        //Greetings
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        //Menerima input nama dari user
        System.out.println("Data Anda : ");
        System.out.println("♥♥♥♥♥♥♥♥");

        System.out.print("Masukkan Nama Anda : ");
        u = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        uu = input.nextInt();
        System.out.println();

        //menerima input pasangan dari user
        System.out.println("DATA PASANGAN ANDA : ");
        System.out.println("♥♥♥♥♥♥♥♥");
        input.nextLine();
        System.out.println();
        System.out.print("Masukkan Nama Pasangan Anda : ");
        pasangan = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        up = input.nextInt();
        System.out.println();

        System.out.printf("%s [%d] tahun\n",u,uu);
        System.out.println("");
        System.out.println("     $$$$         $$$$\n" +
                "   $$$$$$$$     $$$$$$$$\n" +
                " $$$$$$$$$$$$ $$$$$$$$$$$$\n" +
                "$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                " $$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "  $$$$$$$$$$$$$$$$$$$$$$$\n" +
                "    $$$$$$$$$$$$$$$$$$$\n" +
                "       $$$$$$$$$$$$$\n" +
                "         $$$$$$$\n" +
                "           $$$\n" +
                "            $");
        System.out.println("");
        System.out.printf("%s [%d] tahun\n",pasangan,up);
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        try{System.in.read();}
        catch(Exception e){}
        Random r = new Random();
        int randInt = r.nextInt(100-50) + 50;
        double N = (double)randInt / 1.1;
        System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f %%",N);
        System.out.println("");
        System.out.println("");
        System.out.println("Terima Kasih karena anda telah menggunakan jasa ramalan kami.. ^^");

    }
}