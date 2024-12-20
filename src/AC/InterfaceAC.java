/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AC;

/**
 *
 * @author USER
 */
public interface InterfaceAC {
    public static final int AC_IS_OFF = 0;
    public static final int AC_IS_0N = 1;
    public static final int AC_IS_H0T = 0;
    public static final int AC_IS_COLD = 1;
    
   public abstract void off();
   public abstract void on();
   public abstract void hot();
   public abstract void cold();
}
