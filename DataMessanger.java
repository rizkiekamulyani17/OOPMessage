package Model;

import java.util.Scanner;

public class DataMessanger {
    private String Pengirim;
    private String Penerima;
    private String Isipesan;

    public DataMessanger(String Pengirim,String Penerima, String Isipesan) {
        this.Pengirim =Pengirim;
        this.Penerima = Penerima;
        this.Isipesan = Isipesan;
    }
    public DataMessanger() {

    }

    public void KirimPesan() {

        Scanner input = new Scanner(System.in);
        System.out.println("");

        System.out.println("Masukan Penerima ");
        String penerima = input.nextLine();
        System.out.println(penerima);

        System.out.println("Masukan Pengirim ");
        String pengirim = input.nextLine();
        System.out.println(pengirim);
        System.out.println("Masukan Isipesan ");
        String isipesan = input.nextLine();
        System.out.println(isipesan);

        System.out.println("Penerima " + penerima);
        System.out.println("Pengirim" + pengirim);
        System.out.println("Isi Pesan " + isipesan);

    }
    public void TerimaPesan() {
        System.out.println("Pesan Dari : "+ this.Pengirim+"\n"+
                "Untuk : "+ this.Penerima+"\n"+
                "Isi Pesan   : "+ this.Isipesan+"\n");

    }
}

