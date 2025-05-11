/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazgraficajavaxswing;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;



public class Ventana extends JFrame {
    public Ventana() throws HeadlessException {
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
    }
}

