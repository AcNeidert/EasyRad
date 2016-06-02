/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyrad;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Usuario
 */
public class EasyRad {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        Main m = new Main();
        m.setVisible(true);
        m.showPage(new URL("FormBuilder/index.hml"));
    }
    
}
