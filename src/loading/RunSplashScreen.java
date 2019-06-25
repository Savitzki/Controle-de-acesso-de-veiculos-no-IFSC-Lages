package loading;

import view.Tela_menu;

public class RunSplashScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        splashView Splash = new splashView();
        Splash.setVisible(true);
        Splash.setLocationRelativeTo(null);
        {
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(40);
                    Splash.LoadingNumber.setText(Integer.toString(i) + "%");
                    Splash.LoadingBar.setValue(i);
                    if(i==100){
                        java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Tela_menu dialog = new Tela_menu(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                }
            });
                    }
                    
                }
            } catch (InterruptedException ex) {
            }
            Splash.dispose();
        }
    }
}
