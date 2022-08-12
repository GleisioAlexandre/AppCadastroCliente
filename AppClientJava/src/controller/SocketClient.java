/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import model.Conexao;

/**
 *
 * @author jucaf
 */
public class SocketClient {
 
   
   
    public void Cliente(String servidor, int ip){
      
        Conexao cx = new Conexao();
        cx.setIp(servidor);
        cx.setPorta(ip);
               
        System.out.println("Servidor: " + cx.getIp() + "\n" + "Porta: " + cx.getPorta());
        try {
            Socket sk = new Socket(cx.getIp(), cx.getPorta());
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            dos.writeUTF("(&A)");
            dos.flush();
            sk.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
}

