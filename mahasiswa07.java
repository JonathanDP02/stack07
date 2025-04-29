public class mahasiswa07 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    mahasiswa07(String nm, String ni, String kls){
        this.nama = nm;
        this.nim = ni;
        this.kelas = kls;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }

    
}
