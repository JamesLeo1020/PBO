/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author USER
 */
public class datadiri {
       public static void main(String[] args) {
       datadiri data = new datadiri();
               data.Nama("");
               data.Nis(0);
               data.TL("");
               data.Tl(0);
               data.Alamat("");
               data.Motto("");
    }
    /*private void Nama(String nama){
       nama = "James Leo";
        System.out.println("NAMA: "+ nama);
    }*/
    private void Nis(int nis){
        nis = (23618);
        System.out.println("NIS: "+nis);
    }
     private void TL(String tl){
        tl = "DI RUMAH SAKIT IBU DAN ANAK";
        System.out.println("TEMPAT LAHIR: "+tl);
     }
      private void Tl(int tanggal){
        tanggal = (10);
        System.out.println("TANGGAL LAHIR: "+tanggal);
      }
       private void Alamat(String alamat) {
       alamat = "DI PINGGIR JALAN YANG JELAS";
        System.out.println("ALAMAT: "+alamat);
     }
        private void Motto(String motto){
        motto = "SEBELUM JANUR KUNING MELENGKUNG, MASIH BISA DI TIKUNG";
        System.out.println("MOTTO: "+motto);
     }

    private void Nama(String nama) {
        nama = "James Leo";
        System.out.println("NAMA: "+ nama);
    }
}
