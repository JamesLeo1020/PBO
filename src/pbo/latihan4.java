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
public class latihan4 {

    public static void main(String[] args) {
        latihan4 motor = new latihan4();
        latihan4.SetMerk("");
        latihan4.SetNama("");
    }

    private static void SetMerk(String merk) {
        merk = "honda";
        System.out.println("Merk motor adalah: " + merk);
    }

    private static void SetNama(String nama) {
        nama = "beat";
        System.out.println("Merk motor adalah: " + nama);
    }
}
