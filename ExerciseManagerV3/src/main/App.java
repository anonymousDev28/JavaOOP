/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import controller.LoginController;
import java.io.IOException;
import view.LoginView;

/**
 *
 * @author Tommy
 */
public class App {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel">
        try {
//                FlatIntelliJLaf.setup();
            FlatLightFlatIJTheme.setup();
//                FlatArcIJTheme.setup();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>
        LoginView view = new LoginView();
        LoginController controller = new LoginController(view);
        controller.showLoginView();
    }

}
