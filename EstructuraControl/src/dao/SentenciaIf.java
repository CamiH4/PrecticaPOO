/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 * Modelo - Controlador - Vista
 * Data
 * Access
 * Object
 * @author jadg1
 */
public class SentenciaIf {
    
    public String evaluarPosNeg(int num){
        if (num > 0) return "El número es positivo";
        else if(num < 0) return "El número es negativo";
        else return "El número es neutro";
    }
    
    public boolean evaluarNumPosMult3(int num){
        return num>0 && num % 3 ==0;
    }
    
}
