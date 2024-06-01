package views;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Test {
    
    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
         new AdminDashboard().setVisible(true);
    }
} 
