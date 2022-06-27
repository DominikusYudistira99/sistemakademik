/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemakademik;

/**
 *
 * @author yudis
 */
public class Model {
    class User {
        String nama;
        String alamat;
        String telepon;
        String ttl;

        public User(String nama, String alamat, String telepon, String ttl) {
            this.nama = nama;
            this.alamat = alamat;
            this.telepon = telepon;
            this.ttl = ttl;
        }
    }
    class Mahasiswa extends User {
        String nim;
        String jurusan;

        public Mahasiswa(String nim, String jurusan, String nama, String alamat, String telepon, String ttl) {
            super(nama, alamat, telepon, ttl);
            this.nim = nim;
            this.jurusan = jurusan;
        }
        
        
    }
    class Staff extends User {
        String nik;

        public Staff(String nik, String nama, String alamat, String telepon, String ttl) {
            super(nama, alamat, telepon, ttl);
            this.nik = nik;
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
