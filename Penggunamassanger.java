import Model.DataMessanger;
import java.util.Scanner;

public class Penggunamassanger {
    public static void main(String[] args)  {
        String Nama;
        String Email ;
        String Password;
        Scanner myinput = new Scanner(System.in);
        System.out.println("Masukan Nama");
        Nama = myinput.nextLine();
        System.out.println(Nama);
        System.out.println("Masukan Email");
        Email = myinput.nextLine();
        System.out.println(Email);
        System.out.println("Masukan Password");
        Password = myinput.nextLine();


        if(Password.equals("170901")) {
            Penggunamassanger Rizki = new Penggunamassanger();
            char pilihan = 0;
            do {
                System.out.println();
                System.out.println("WELCOME TO MESSANGER");
                System.out.println("");
                System.out.println("MENU UTAMA ");
                System.out.println("1.Kirim Pesan");
                System.out.println("2.Terima Pesan");
                System.out.println("3.Keluar");
                System.out.println("=======================================");
                System.out.println("Pilihan Anda = ");
                pilihan = myinput.next().charAt(0);
                System.out.println();
                switch (pilihan) {
                    case '1' ->{
                        DataMessanger p = new DataMessanger();
                        p.KirimPesan();
                        break;
                    }
                    case '2' -> {
                        DataMessanger p = new DataMessanger("kiki","123@gmail.com","Hallo!");
                        p.TerimaPesan();
                        break;
                    }
                    case '3'->{
                        System.exit(3);
                    }
                    default ->{

                    }
                }
            }  while (pilihan!='0');
        }
    }




}
