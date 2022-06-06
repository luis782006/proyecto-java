/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LUIS-PC
 */
public class ValidacionNumeros {
  
    public ValidacionNumeros(JTextField txt) {

        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                
                if (Character.isLetter(c)) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
                    e.consume();
                }

            }

        });

    }
    
}
