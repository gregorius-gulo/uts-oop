package pegawai;

public class Pegawai {
    String nama, nip, jeniskelamin, alamat, jabatan, ttl;
    int umur;
    
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        
        pegawai1.nama="Gregorius Gulo";
        pegawai1.nip="200406170001";
        pegawai1.jeniskelamin="Laki-laki";
        pegawai1.alamat="Jl. Medan Merdeka";
        pegawai1.jabatan="Manajer";
        pegawai1.ttl="Lolohosi, 17 Juni 2004";
        pegawai1.umur=19;
        
        System.out.println("Nama: " + pegawai1.nama);
        System.out.println("Nip: " + pegawai1.nip);
        System.out.println("Jenis Kelamin: " + pegawai1.jeniskelamin);
        System.out.println("Alamat: " + pegawai1.alamat);
        System.out.println("Jabatan: " + pegawai1.jabatan);
        System.out.println("Tempat, tanggal lahir: " + pegawai1.ttl);
        System.out.println("Umur: " + pegawai1.umur);
    }
}
