import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int tunjanganTotal =0; 
    int jumlahAggota; 
    int tunjanganPerjiwa = 100000;
    int sisaAnggota=0;
    int tunjanganSisaAnggota =0; 
    
    System.out.println("Banyaknya Jumlah Anggota Keluarga");
    jumlahAggota = input.nextInt();
    
    
    if (jumlahAggota <=3) {
        tunjanganTotal= jumlahAggota* tunjanganPerjiwa;
    }
    else if (jumlahAggota >= 3) {
        sisaAnggota  = jumlahAggota -3;
        tunjanganSisaAnggota = (sisaAnggota *50000);
        tunjanganTotal = tunjanganPerjiwa*jumlahAggota - tunjanganSisaAnggota;
    }
    System.out.println(jumlahAnggota);
    System.out.println(tunjanganTotal);
    }
}
