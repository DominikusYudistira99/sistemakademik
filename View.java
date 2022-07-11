/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esamsat;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author yudis
 */
public class View {
    public static void main(String[] args) {

        
        JFrame mainMenu = new JFrame();

        JButton urutanSatu = new JButton("Login Pengguna");
        urutanSatu.setBounds(130, 100, 200, 30);

        JButton urutanDua = new JButton("Registrasi Pengguna Baru");
        urutanDua.setBounds(130, 150, 200, 30);

        JButton urutanTiga = new JButton("Lihat Data Pengguna Berdasarkan Kategori Dipilih");
        urutanTiga.setBounds(130, 200, 500, 30);

        mainMenu.add(urutanSatu);
        mainMenu.add(urutanDua);
        mainMenu.add(urutanTiga);

        mainMenu.setSize(400, 500);
        mainMenu.setLayout(null);
        mainMenu.setVisible(true);
    }
    
}
