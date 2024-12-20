/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author USER
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bk = new Bank(100000);
        bk.getSaldo();
        bk.simpanUang(500000);
        bk.ambilUang(150000);
    }
}
