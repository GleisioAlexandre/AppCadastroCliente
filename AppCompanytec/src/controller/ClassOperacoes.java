/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import model.ClassSocket;

/**
 *
 * @author jucaf
 */
public class ClassOperacoes {

    public void Eviar(String servidor, int porta, String dados){
    
        ClassSocket csk = new ClassSocket(servidor, porta);
        
        System.out.println(csk.getServidor() + csk.getPorta());
        try {
            Socket sk = new Socket(csk.getServidor(), csk.getPorta());
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            dos.writeUTF(dados);
            dos.flush();
            dos.close();
            sk.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao Conectar."
                    + " \n Verifique as configurações do servidor e tente novamente!","Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
