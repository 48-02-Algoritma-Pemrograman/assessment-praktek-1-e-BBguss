public class Nomor1{
    public static void main(String[] args){
    int tunjangan =0, jumlahAggota = 0; 
    int tunjanganPerjiwa = 100000;
    int sisaAnggota=0;
    Scanner input= new Scanner(System.in);


    System.out.println("Jumlah Anggota Keluarga: "+ jumlahAggota);
    jumlahAggota= input.nextInt();

    if (jumlahAggota == 3) {
        tunjangan = jumlahAggota * tunjanganPerjiwa;
    }
    else if (jumlahAggota >= 3) {
        tunjangan = (jumlahAggota * tunjanganPerjiwa)+(sisaAnggota*500000);   
    }
    else {
        tunjangan = jumlahAggota*tunjanganPerjiwa;
    }
    System.out.println("Jumlah Anggota Keluarga: "+ jumlahAggota);
    System.out.println("Besar tunjangan Kesehatan: "+ tunjangan);
    }
}
