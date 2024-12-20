/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author USER
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();
        int a = 10;
        int b = 3;
        int c = 10;
        System.out.println("Hasil Pertambahan Tiga : "+mtk.pertambahanTiga(a, b , c));
        System.out.println("Hasil Pertambahan : "+mtk.pertambahan(a, b));
        System.out.println("Hasil Perkalian: "+mtk.perkalian(a, b));
        System.out.println("Hasil modulus : "+mtk.modulus(a, b));
    }
}
