/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esamsat;

import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author yudis
 */
public class Loginesamsat {

    public static void main(String[] args) {
        JFrame login = new JFrame();
        JTextField isianemail, isianpassword;
        isianemail = new JTextField("Masukkan email");
        isianemail.setBounds(50, 100, 200, 30);
        isianpassword = new JTextField(" Masukkan Password");
        isianpassword.setBounds(50, 100, 200, 30);
        login.add(isianemail);login.add(isianpassword);
        login.setSize(400, 400);
        login.setLayout(null);
        login.setVisible(true);
    }

}
