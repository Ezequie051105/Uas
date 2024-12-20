package Bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Bank {
    int saldo;
    
    public Bank(int saldo){
        this.saldo = saldo;
    }
    void getSaldo(){
        System.out.println("Selamat datang");
        System.out.println("Saldo saat ini : " + saldo);
    }
    
    void simpanUang(int simpan){
        saldo += simpan;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : " + saldo);
    }
    void ambilUang(int ambil){
        saldo -= ambil;
        System.out.println("Simpan uang : " + ambil);
        System.out.println("Saldo saat ini : " + saldo);
    }
    
    
}
