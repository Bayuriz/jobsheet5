/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Windows 10
 */
public class NullPointerException {
    public static void main(String[] args){
        String name = "Bayu";
        // pada atribut name ganti menjadi : String name = null;
        // Apa yang akan terjadi?
        System.out.print(" Length of the string " + name.length());
    }
}
