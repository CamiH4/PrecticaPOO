/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jadg1
 */
public class SentenciaSwitch {
    
    public void evaluarNum(int num, JPanel frm){
        switch(num){
            case 1 -> frm.setBackground(Color.red);
            case 2 -> frm.setBackground(Color.blue);
            case 3 -> frm.setBackground(Color.yellow);
            default -> frm.setBackground(Color.LIGHT_GRAY);
        }
               
    }
    
}
