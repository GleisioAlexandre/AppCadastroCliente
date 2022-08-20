/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GleisioAlexandre
 */
public class ClassSocket {
    
    private String servidor;
    private int porta;

    public ClassSocket() {
    }

    public ClassSocket(String servidor, int porta) {
        this.servidor = servidor;
        this.porta = porta;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    
}
