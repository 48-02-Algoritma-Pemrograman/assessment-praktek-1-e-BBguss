Import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
    double tunjangan =0; 
    int jumlahAggota; 
    double tunjanganPerjiwa = 100000;
    int sisaAnggota=0;
    Scanner input= new Scanner(System.in);

    jumlahAggota=0;
    System.out.println("Jumlah Anggota Keluarga: "+ jumlahAggota);
    jumlahAggota= input.nextInt();

    if (jumlahAggota <= 3) {
        tunjangan = jumlahAggota * tunjanganPerjiwa;
    }
    else if (jumlahAggota > 3) {
        sisaAnggota =jumlahAggota -= 3 ;
        tunjangan= (sisaAnggota*50000)+(tunjanganPerjiwa*3);
    }
    System.out.println("Jumlah Anggota Keluarga: ");
    System.out.println("Besar tunjangan Kesehatan: "+ tunjangan);
    }
}
