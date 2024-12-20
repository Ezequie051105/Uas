/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author USER
 */
public class AC implements InterfaceAC {

    int statusAC;
    int statusTemperature;

    public void on() {

        if (statusAC == AC_IS_OFF) {

            statusAC = AC_IS_0N;

            System.out.println("ON AC! --> AC ON");

        } else {

            System.out.println("ON AC! --> AC IS ON");
        }

    }

    public void off() {

        if (statusAC == AC_IS_0N) {

            statusAC = AC_IS_OFF;

            System.out.println("OFF AC! --> AC OFF");

        } else {

            System.out.println("OFF AC! --> AC IS OFF");

        }  
    }

    public void hot() {

        if (statusTemperature == AC_IS_COLD) {

            statusTemperature = AC_IS_H0T;

            System.out.println("OFF Hot! --> AC Hot");

        } else {

            System.out.println("OFF Hot! --> AC IS Hot");

        }

    }

    public void cold() {

        if (statusTemperature == AC_IS_H0T) {

            statusTemperature = AC_IS_COLD;

            System.out.println("OFF Cold! --> AC Cold");

        } else {

            System.out.println("OFF Cold! --> AC IS Cold");

        }

    }
}
