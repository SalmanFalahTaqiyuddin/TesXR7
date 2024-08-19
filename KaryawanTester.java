//Driver Class
public class KaryawanTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Karyawan a = new Karyawan(1, "Joni", "BK", "Bekasi");
        Karyawan b = new Karyawan(2, "Aldi", "Kurikulum", "Tangerang");
        Karyawan c = new Karyawan(3, "Putri", "TU", "Bali");
        Karyawan d = new Karyawan(4, "Icha", "Kesiswaan", "Jakarta");
        Karyawan e = new Karyawan(5, "Budi", "TU", "Tulungagung");

        a.print();
        b.print();
        c.print();
        d.print();
        e.print();


    }
}