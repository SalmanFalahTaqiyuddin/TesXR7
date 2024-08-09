//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Counstructor
        Siswa juna = new Siswa();
        Siswa ary = new Siswa();
        Siswa aryad = new Siswa();
        Siswa avel  = new Siswa();
        Siswa aver = new Siswa();

         juna.nama = "Arjuna";
         ary.nama = "Arya";
         aryad.nama = "Aryadani";
         avel.nama = "Aveline";
         aver.nama = "Averil";

         juna.id = 1;
         ary.id = 2;
         aryad.id = 3;
         avel.id = 4;
         aver.id = 5;

         juna.ipk = 85;
         ary.ipk = 92;
         aryad.ipk = 90;
         avel.ipk = 88;
         aver.ipk = 82;
        
         
         
         System.out.println("Nama : " + juna.nama);
         System.out.println("ID : " + juna.id);
         System.out.println("IPK : " + juna.ipk);

         System.out.println("Nama : " + ary.nama);
         System.out.println("ID : " + ary.id);
         System.out.println("IPK : " + ary.ipk);

         System.out.println("Nama : " + aryad.nama);
         System.out.println("ID : " + aryad.id);
         System.out.println("IPK : " + aryad.ipk);

         System.out.println("Nama : " + avel.nama);
         System.out.println("ID : " + avel.id);
         System.out.println("IPK : " + avel.ipk);

         System.out.println("Nama : " + aver.nama);
         System.out.println("ID : " + aver.id);
         System.out.println("IPK : " + aver.ipk);
         




    }   
}
