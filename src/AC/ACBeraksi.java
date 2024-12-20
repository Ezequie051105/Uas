/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author USER
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC ac = new AC();
        System.out.println("Status ac now : Off");
        ac.on();
        ac.off();
        ac.off();
        System.out.println("Status temperatur ac : Hot");
        ac.cold();
        ac.hot();
        ac.cold();
        ac.cold();
    }
}
